package com.example.retrofitphotos

import com.example.android_aplikacija_za_praksu.Services
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitManager {
    val retrofitClient: Retrofit=Retrofit.Builder()
            .baseUrl("https://jsonplaceholder.typicode.com/")
            .addConverterFactory(GsonConverterFactory.create()).build()

    val services by lazy {
        retrofitClient.create(Services::class.java)
    }
    companion object{
        fun getInstance()=RetrofitManager()
    }
}