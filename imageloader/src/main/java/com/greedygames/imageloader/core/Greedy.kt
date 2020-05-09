package com.greedygames.imageloader.core

import android.content.Context
import android.graphics.Bitmap
import android.widget.ImageView
import com.greedygames.imageloader.asyctasks.DownloadImageTask
import com.greedygames.imageloader.asyctasks.DownloadTask
import com.greedygames.imageloader.cache.CacheRepository
import com.greedygames.imageloader.cache.Config
import java.util.concurrent.Executors
import java.util.concurrent.Future


class Greedy private constructor(context: Context, cacheSize: Int) {
    private val cache = CacheRepository(context, cacheSize)
    private val executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors())
    private val mRunningDownloadList:HashMap<String, Future<Bitmap?>> = hashMapOf()

    // This method display image in cache other wise calling the url
    fun displayImage(url: String, imageview: ImageView, placeholder: Int) {
        var bitmap = cache.get(url)
        bitmap?.let {
            imageview.setImageBitmap(it)
            return
        }
            ?: run {
                imageview.tag = url
                if (placeholder != null)
                    imageview.setImageResource(placeholder)
                addDownloadImageTask( url, DownloadImageTask(url , imageview , cache)) }

    }


    fun addDownloadImageTask(url: String,downloadTask: DownloadTask<Bitmap?>) {
        mRunningDownloadList.put(url,executorService.submit(downloadTask))
    }


    fun clearcache() {
        cache.clear()  //clearing memory and disk cache
    }

    fun cancelTask(url: String){
        synchronized(this){
            mRunningDownloadList.forEach {
                if (it.key == url &&  !it.value.isDone)
                    it.value.cancel(true)
            }
        }
    }

    fun  cancelAll() { //canceling all the task
        synchronized (this) {
            mRunningDownloadList.forEach{
                if ( !it.value.isDone)
                    it.value.cancel(true)
            }
            mRunningDownloadList.clear()
        }
    }

//Making this class as a singleton class
    companion object {
        private val INSTANCE: Greedy? = null
        @Synchronized
        fun getInstance(context: Context, cacheSize: Int = Config.defaultCacheSize): Greedy {
            return INSTANCE?.let { return INSTANCE }
                ?: run {
                    return Greedy(context, cacheSize)
                }
        }
    }
}