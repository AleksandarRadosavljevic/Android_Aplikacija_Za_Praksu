package com.example.android_aplikacija_za_praksu.RemoteDataSource

import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class FirestoreRemoteDataSource: RemoteDataSource {

    val db = Firebase.firestore

    override suspend fun registerUser(name: String, username: String, password: String): Result<Unit> {
        val user = hashMapOf(
            "Name" to name,
            "User" to username,
            "Password" to password
        )
        db.collection("users").add(user)

       return Result.success(Unit)
    }
}