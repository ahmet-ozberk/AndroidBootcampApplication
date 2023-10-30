package com.ao.youtubeegitimapp.data.models

import java.io.Serializable

data class VideoModel(var image: Int, var name: String, var info: String, var time: String, var videoImage: Int) : Serializable {}