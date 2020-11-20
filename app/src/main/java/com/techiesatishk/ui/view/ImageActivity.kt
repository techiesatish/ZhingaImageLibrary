package com.techiesatishk.ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.techiesatishk.R
import com.techiesatishk.imageloader.core.Zhinga
import com.techiesatishk.utils.AppConstants
import kotlinx.android.synthetic.main.activity_image.*

class ImageActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image)
        val url = intent.getStringExtra(AppConstants.IMAGE_URL.value)
        val mGreedyImageLaoder = Zhinga.getInstance(this) //Here we are initialising this library
        mGreedyImageLaoder.displayImage(url, img_fullscreen,R.drawable.ic_launcher_background)


    }
}
