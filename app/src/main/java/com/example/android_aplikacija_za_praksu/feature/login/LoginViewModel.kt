package com.example.android_aplikacija_za_praksu.feature.login

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.android_aplikacija_za_praksu.repository.Repository
import com.example.android_aplikacija_za_praksu.repository.RepositoryImpl
import kotlinx.coroutines.launch

class LoginViewModel : ViewModel() {
    val repository: Repository = RepositoryImpl()
    val loggedIn: MutableLiveData<Boolean> = MutableLiveData()


    fun login(username: String, password: String) {
        viewModelScope.launch {
            repository.login(username, password).onSuccess {
                loggedIn.value = true
            }
        }
    }
}