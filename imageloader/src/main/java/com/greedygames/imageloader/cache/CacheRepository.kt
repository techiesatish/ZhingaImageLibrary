package com.greedygames.imageloader.cache

import android.content.Context
import android.graphics.Bitmap
import com.imageloadinglib.cache.MemoryCache

class CacheRepository (context: Context , newMaxSize: Int ): ImageCache {

    val diskCache = DiskCache.getInstance(context)
    val memoryCache = MemoryCache(newMaxSize)


    override fun put(url: String, bitmap: Bitmap) {  //putting the image into memory and disk cache from url
        memoryCache.put(url,bitmap)
        diskCache.put(url,bitmap)
    }

    override fun get(url: String): Bitmap? {//retriving the image
        return memoryCache.get(url)?:diskCache.get(url)
    }

    override fun clear() { //clearing all the memory and disk
        memoryCache.clear()
        diskCache.clear()
    }
}