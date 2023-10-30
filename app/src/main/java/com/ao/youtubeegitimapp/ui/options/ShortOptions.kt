package com.ao.youtubeegitimapp.ui.options

import android.content.Context
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.ao.youtubeegitimapp.R
import com.ao.youtubeegitimapp.data.models.ShortModel
import com.ao.youtubeegitimapp.databinding.FragmentHomeBinding
import com.ao.youtubeegitimapp.ui.adapter.ShortCardAdapter

class ShortOptions(var context: Context, var binding: FragmentHomeBinding) {
    fun load() {
        val list: ArrayList<ShortModel> = ArrayList()
        list.add(ShortModel("Arya's revenge ㈫", R.drawable.short_image, "2 Mn görüntüleme"))
        list.add(ShortModel("Gama Of Thrones", R.drawable.short_image, "1.5 Mn görüntüleme"))
        list.add(ShortModel("Konuşanlar 5. Bölüm Komik adam sahnesi", R.drawable.short_image, "500 Bin görüntüleme"))
        list.add(ShortModel("29 Ekim Solo Türk Kutlamaları 🇹🇷 🇹🇷 🇹🇷", R.drawable.short_image, "12.4 Mn görüntüleme"))
        list.add(ShortModel("Orhan kabul et ya da lan dık 🤣 #shorts #cokguzelhareketlerbunlar2", R.drawable.short_image, "4 Mn görüntüleme"))

        binding.shortRecyclerView.layoutManager =
            StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.HORIZONTAL)
        binding.shortRecyclerView.adapter =
            ShortCardAdapter(context, list)
    }
}