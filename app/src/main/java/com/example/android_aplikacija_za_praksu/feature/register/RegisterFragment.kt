package com.example.android_aplikacija_za_praksu.feature.register

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.android_aplikacija_za_praksu.R
import com.example.android_aplikacija_za_praksu.databinding.LoginFragmentBinding
import com.example.android_aplikacija_za_praksu.databinding.RegisterFragmentBinding
import com.example.android_aplikacija_za_praksu.feature.login.LoginFragmentDirections
import com.example.android_aplikacija_za_praksu.feature.login.LoginViewModel

class RegisterFragment : Fragment() {

    lateinit var viewModel: RegisterViewModel
    lateinit var viewBinding: RegisterFragmentBinding

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View {
        viewBinding= RegisterFragmentBinding.inflate(layoutInflater)
        return viewBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this).get(RegisterViewModel::class.java)
        observeLiveData()
        viewBinding.buttonRegister.setOnClickListener {
            viewModel.registerUser(viewBinding.editTextIme.text.toString(), viewBinding.editTextUser.text.toString(), viewBinding.editTextPassword.text.toString())
        }
    }



    fun observeLiveData() {
        viewModel.isRegistered.observe(viewLifecycleOwner){
            findNavController().navigateUp()
        }

    }

}