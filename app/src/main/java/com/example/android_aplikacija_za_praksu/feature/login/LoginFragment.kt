package com.example.android_aplikacija_za_praksu.feature.login

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.android_aplikacija_za_praksu.databinding.LoginFragmentBinding

class LoginFragment : Fragment() {

    lateinit var viewModel: LoginViewModel
    lateinit var viewBinding: LoginFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        viewBinding= LoginFragmentBinding.inflate(layoutInflater)
        return viewBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this).get(LoginViewModel::class.java)
        viewBinding.buttonRegisterLogin.setOnClickListener {
            findNavController().navigate(LoginFragmentDirections.actionLoginFragmentToRegisterFragment())
        }
        viewBinding.loginButton.setOnClickListener {
            viewModel.login(viewBinding.editTextUsernameValue.text.toString(), viewBinding.editTextPasswordValue.text.toString())
        }
    }

    override fun onStart() {
        super.onStart()
        observeLiveData()
    }

    override fun onStop() {
        super.onStop()
        viewModel.loggedIn.removeObservers(viewLifecycleOwner)
    }

    fun observeLiveData() {
        viewModel.loggedIn.observe(viewLifecycleOwner) {
            if(it) {
                findNavController().navigate(LoginFragmentDirections.actionLoginFragmentToHomeFragment())
            }
        }
    }

}