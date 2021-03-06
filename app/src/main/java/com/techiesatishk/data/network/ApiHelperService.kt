package com.techiesatishk.data.network

import com.techiesatishk.data.model.ApiImage
import kotlinx.coroutines.Deferred
import retrofit2.Response
import retrofit2.http.GET

interface ApiHelperService {

    @GET("r/images/hot.json")
     fun getImages(): Deferred<Response<ApiImage>>



}