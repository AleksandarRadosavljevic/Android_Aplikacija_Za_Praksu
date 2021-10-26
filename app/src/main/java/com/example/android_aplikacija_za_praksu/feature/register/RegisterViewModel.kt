package com.example.android_aplikacija_za_praksu.feature.register

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.navigation.NavController
import androidx.navigation.compose.navArgument
import com.example.android_aplikacija_za_praksu.repository.RepositoryImpl
import kotlinx.coroutines.launch

class RegisterViewModel() : ViewModel() {
    val repository = RepositoryImpl()
    val isRegistered: MutableLiveData<Boolean> = MutableLiveData()


    fun registerUser(fullName:String, username: String, password: String) {
        viewModelScope.launch {
            repository.registerUser(fullName, username, password).onSuccess {
                isRegistered.value = true
            }
        }
    }
}