package com.example.android_aplikacija_za_praksu.repository

import com.example.android_aplikacija_za_praksu.models.Photo

interface Repository {
    suspend fun login(username: String, pasword: String): Result<Unit>
    suspend fun registerUser(fullName: String, username: String, password: String): Result<Unit>
}