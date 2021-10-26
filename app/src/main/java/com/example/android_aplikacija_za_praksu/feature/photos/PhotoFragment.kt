package com.example.android_aplikacija_za_praksu.feature.photos

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.android_aplikacija_za_praksu.databinding.WeatherFragmentBinding
import com.example.android_aplikacija_za_praksu.feature.photos.adapter.PhotoAdapter

class PhotoFragment : Fragment() {

    lateinit var viewModel: PhotoViewModel
    lateinit var viewBinding: WeatherFragmentBinding

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        viewBinding= WeatherFragmentBinding.inflate(layoutInflater)
        return viewBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this).get(PhotoViewModel::class.java)

    }

    override fun onStart() {
        super.onStart()
        observeLiveData()
        viewModel.getPhotos()
    }

    override fun onStop() {
        super.onStop()
        viewModel.photos.removeObservers(viewLifecycleOwner)
    }

    fun observeLiveData() {
        viewModel.photos.observe(viewLifecycleOwner) {
            viewBinding.recycleView.adapter = PhotoAdapter(it)


        }
    }
}