package com.ao.youtubeegitimapp.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ao.youtubeegitimapp.data.models.VideoModel
import com.ao.youtubeegitimapp.databinding.VideoCardBinding

class VideoCardAdapter(var context: Context, var videoList: List<VideoModel>) : RecyclerView.Adapter<VideoCardAdapter.VideoCardAdapter>() {
    inner  class VideoCardAdapter(var design: VideoCardBinding) : RecyclerView.ViewHolder(design.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VideoCardAdapter {
        val design = VideoCardBinding.inflate(LayoutInflater.from(context), parent, false)
        return VideoCardAdapter(design)
    }

    override fun getItemCount(): Int {
        return videoList.size
    }

    override fun onBindViewHolder(holder: VideoCardAdapter, position: Int) {
        val item = videoList[position]
        val design = holder.design

        design.imageView.setImageResource(item.videoImage)
        design.videoTime.text = item.time
        design.videoTitle.text = item.name
        design.userImage.setImageResource(item.image)
        design.videoUserInfo.text = item.info
    }


}