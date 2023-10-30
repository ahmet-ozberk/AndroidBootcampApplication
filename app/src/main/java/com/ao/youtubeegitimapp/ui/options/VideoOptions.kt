package com.ao.youtubeegitimapp.ui.options

import android.content.Context
import androidx.recyclerview.widget.LinearLayoutManager
import com.ao.youtubeegitimapp.R
import com.ao.youtubeegitimapp.data.models.VideoModel
import com.ao.youtubeegitimapp.databinding.FragmentHomeBinding
import com.ao.youtubeegitimapp.ui.adapter.VideoCardAdapter

class VideoOptions(var context: Context, var binding: FragmentHomeBinding) {
    fun load(){
        val list:ArrayList<VideoModel> = ArrayList()
        list.add(VideoModel(R.drawable.youtuber_image, "Backend developer yol haritası", "AhmetOzberk * 2,1 B görüntüleme * 2 ay önce","38:53",R.drawable.video_image))
        list.add(VideoModel(R.drawable.youtuber_image, "Random title", "John * 2,1 B görüntüleme * 1 yıl önce","12:23",R.drawable.video_image))
        list.add(VideoModel(R.drawable.youtuber_image, "Konuşanlar 153. Bölüm", "Konuşanlar * 4 Mn görüntüleme * 6 gün önce","1:04:34",R.drawable.video_image))
        list.add(VideoModel(R.drawable.youtuber_image, "Leyla ile Mecnun 4. Bölüm Full Hd", "Leyla ile Mecnun * 800 B görüntüleme * 8 yıl önce","2:38:53",R.drawable.video_image))
        binding.videosRecyclerView.adapter = VideoCardAdapter(context,list)
        binding.videosRecyclerView.layoutManager = LinearLayoutManager(context)
    }
}