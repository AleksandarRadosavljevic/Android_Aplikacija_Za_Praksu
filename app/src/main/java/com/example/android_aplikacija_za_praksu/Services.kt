package com.example.android_aplikacija_za_praksu

import com.example.android_aplikacija_za_praksu.models.Photo
import retrofit2.Call
import retrofit2.http.GET

interface Services {
    @GET("/photos")
    fun getPhotos(): Call<List<Photo>>
}