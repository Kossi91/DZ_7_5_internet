package com.example.dz_7_5_internet.data.remote.api


import com.example.dz_7_5_internet.data.models.Photo
import retrofit2.Call
import retrofit2.http.GET


interface PostsApiService {

    @GET("albums/1/photos")
    fun getPhoto(): Call<List<Photo>>
}