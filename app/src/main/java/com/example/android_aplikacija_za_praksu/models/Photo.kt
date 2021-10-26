package com.example.android_aplikacija_za_praksu.models

import com.google.gson.annotations.SerializedName

class Photo (
  @SerializedName("albumId")
  val albumId:Int,
  @SerializedName("id")
  val id:Int,
  @SerializedName("title")
  val title:String,
  @SerializedName("url")
  val url:String,
  @SerializedName("thumbnaiUrl")
  val thumbnaiUrl:String

)

