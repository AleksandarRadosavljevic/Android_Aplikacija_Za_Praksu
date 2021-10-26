package com.example.android_aplikacija_za_praksu.feature.photos

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.android_aplikacija_za_praksu.models.Photo
import com.example.retrofitphotos.RetrofitManager
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class PhotoViewModel : ViewModel() {

    val photos: MutableLiveData<List<Photo>> = MutableLiveData()

    fun getPhotos() {
        RetrofitManager.getInstance().services.getPhotos().enqueue(object: Callback<List<Photo>> {
            override fun onResponse(call: Call<List<Photo>>, response: Response<List<Photo>>) {
                    if (response.isSuccessful) {
                        photos.value = response.body()
                    }
            }

            override fun onFailure(call: Call<List<Photo>>, t: Throwable) {

            }
        })
    }
}