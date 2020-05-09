package com.greedygames.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.greedygames.data.model.ApiImage
import com.greedygames.data.network.RetrofitBuilder
import com.greedygames.utils.Resource
import khalid.com.newssearcherv4.repositories.ImageRepo
import kotlinx.coroutines.*

class MainViewModel() :ViewModel(){
    val imageListLiveData = MutableLiveData<Resource<List<ApiImage.Data.Children>>>()

    init {
        getImages()
    }

    fun getImages() { //getting imaages by this method
        viewModelScope.launch {
            imageListLiveData.postValue(Resource.loading(null))  //loading
            try {
                val latestNews = ImageRepo(RetrofitBuilder.apiService).getImageList()
                imageListLiveData.postValue(Resource.success(latestNews)) //success
            }catch (e: Exception){
                imageListLiveData.postValue(Resource.error(e.localizedMessage, null)) //error
            }
        }
    }



    fun getImagesList(): LiveData<Resource<List<ApiImage.Data.Children>>> {
        return imageListLiveData
    }

}