package com.example.android_aplikacija_za_praksu.RemoteDataSource

interface RemoteDataSource {
    suspend fun registerUser(name: String, username: String, password: String): Result<Unit>
}