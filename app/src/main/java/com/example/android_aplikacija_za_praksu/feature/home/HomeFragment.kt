package com.example.android_aplikacija_za_praksu.feature.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.android_aplikacija_za_praksu.databinding.HomeFragmentBinding

class HomeFragment : Fragment() {

    lateinit var viewModel: HomeViewModel
    lateinit var viewBinding: HomeFragmentBinding

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View {
        viewBinding= HomeFragmentBinding.inflate(layoutInflater)
        return viewBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this).get(HomeViewModel::class.java)
        viewBinding.buttonPhoto.setOnClickListener {
            findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToWeatherFragment())
        }
    }

}