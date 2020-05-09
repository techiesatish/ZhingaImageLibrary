package com.greedygames.utils

import android.content.Context
import android.content.Intent
import com.greedygames.ui.view.ImageActivity


class AppNavigator {
    companion object {

        fun navigateToFullImageScreen(context: Context,imageurl:String) {
            val intent = Intent(context, ImageActivity::class.java)
            intent.putExtra(AppConstants.IMAGE_URL.value,imageurl)
            context.startActivity(intent)
        }


    }
}