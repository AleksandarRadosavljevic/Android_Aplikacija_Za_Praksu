package com.example.android_aplikacija_za_praksu.feature.photos.adapter.holder

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.android_aplikacija_za_praksu.databinding.RvElementBinding
import com.example.android_aplikacija_za_praksu.models.Photo

class PhotoHolder(item: View):RecyclerView.ViewHolder(item) {

    val binding = RvElementBinding.bind(item)

    fun setData(photo: Photo){
        binding.textViewTitleValue.text = photo.title
        binding.textViewIdValue.text = photo.id.toString()
        binding.textViewAlbumIdValue.text = photo.albumId.toString()
    }
}