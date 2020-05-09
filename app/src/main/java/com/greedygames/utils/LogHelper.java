package com.greedygames.utils;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.greedygames.BuildConfig;


public class LogHelper {
  public static void d(String tag,String message){
    if(BuildConfig.DEBUG){
      Log.d(tag, message);
    }

  }
  public static void e(String tag,String message){
    if(BuildConfig.DEBUG){
      Log.e(tag, message);
    }

  }
  public static void i(String tag,String message){
    if(BuildConfig.DEBUG){
      Log.i(tag, message);
    }

  }
  public static void w(String tag,String message){
    if(BuildConfig.DEBUG){
      Log.w(tag, message);
    }

  }

  public static void e(String tag, String message, Exception exception) {
    if(BuildConfig.DEBUG){
      Log.e(tag, message, exception);
    }

  }

  public static void d(String tag, String message, Exception exception) {
    if(BuildConfig.DEBUG){
      Log.d(tag, message, exception);
    }
  }

  public static void showToast(Context mContext, String message) {
    Toast.makeText(mContext, message, Toast.LENGTH_SHORT).show();

  }

}
