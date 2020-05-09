package com.greedygames.imageloader.asyctasks

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Handler
import android.os.Looper
import android.widget.ImageView
import com.greedygames.imageloader.cache.CacheRepository
import java.net.HttpURLConnection
import java.net.URL

class DownloadImageTask(private val url: String, private val imageView: ImageView, private val cache: CacheRepository) : DownloadTask<Bitmap?>() {

    //TODO have to use Coroutines in future
    override fun download(url: String): Bitmap? {  //Downloading the image
        var bitmap: Bitmap? = null
        try {
            val url = URL(url)
            val conn: HttpURLConnection = url.openConnection() as HttpURLConnection
            bitmap = BitmapFactory.decodeStream(conn.inputStream)
            conn.disconnect()
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return bitmap
    }


    private val uiHandler = Handler(Looper.getMainLooper())

    override fun call(): Bitmap? {
        val bitmap = download(url)
        bitmap?.let {
            if (imageView.tag == url) {
                updateImageView(imageView, it)
            }
            cache.put(url, it)
        }
        return bitmap
    }

    //Updating the image into imageview
    fun updateImageView(imageview: ImageView, bitmap: Bitmap) {
        uiHandler.post {
            imageview.setImageBitmap(bitmap)
        }
    }


}

