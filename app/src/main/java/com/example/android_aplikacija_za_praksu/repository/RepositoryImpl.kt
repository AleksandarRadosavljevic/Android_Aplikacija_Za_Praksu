package com.example.android_aplikacija_za_praksu.repository

import com.example.android_aplikacija_za_praksu.RemoteDataSource.FirestoreRemoteDataSource
import com.example.android_aplikacija_za_praksu.RemoteDataSource.RemoteDataSource
import com.example.android_aplikacija_za_praksu.models.Photo
import com.example.retrofitphotos.RetrofitManager
import okhttp3.MediaType
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.net.UnknownHostException

class RepositoryImpl: Repository {

    val remoteDataSource: RemoteDataSource = FirestoreRemoteDataSource()

    override suspend fun login(username: String, pasword: String): Result<Unit> {
        return Result.success(Unit)
    }

    override suspend fun registerUser(fullName: String, username: String, password: String): Result<Unit> {
        return remoteDataSource.registerUser(fullName, username, password)
    }

}

