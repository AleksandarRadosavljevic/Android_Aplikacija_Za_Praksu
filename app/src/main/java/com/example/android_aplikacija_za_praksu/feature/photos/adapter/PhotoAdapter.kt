package com.example.android_aplikacija_za_praksu.feature.photos.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.android_aplikacija_za_praksu.R
import com.example.android_aplikacija_za_praksu.feature.photos.adapter.holder.PhotoHolder
import com.example.android_aplikacija_za_praksu.models.Photo

class PhotoAdapter(val lista:List<Photo>):RecyclerView.Adapter<PhotoHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhotoHolder {
        return PhotoHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.rv_element, parent, false)
        )
    }

    override fun onBindViewHolder(holder: PhotoHolder, position: Int) {
        holder.setData(lista[position])
    }

    override fun getItemCount(): Int {
        return lista.size
    }
}