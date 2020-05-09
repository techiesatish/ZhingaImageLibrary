package com.greedygames.ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.greedygames.R
import com.greedygames.imageloader.core.Greedy
import com.greedygames.utils.AppConstants
import kotlinx.android.synthetic.main.activity_image.*

class ImageActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image)
        val url = intent.getStringExtra(AppConstants.IMAGE_URL.value)
        val mGreedyImageLaoder = Greedy.getInstance(this) //Here we are initialising this library
        mGreedyImageLaoder.displayImage(url, img_fullscreen,R.drawable.ic_launcher_background)


    }
}
