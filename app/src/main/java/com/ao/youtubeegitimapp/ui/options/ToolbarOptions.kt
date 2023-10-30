package com.ao.youtubeegitimapp.ui.options

import android.content.Context
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.ao.youtubeegitimapp.data.models.ToolbarCategoriesModel
import com.ao.youtubeegitimapp.databinding.FragmentHomeBinding
import com.ao.youtubeegitimapp.ui.adapter.ToolbarCategoriesCardAdapter

class ToolbarOptions(var context: Context, var binding: FragmentHomeBinding) {
    fun load() {
        val list: ArrayList<ToolbarCategoriesModel> = ArrayList()
        list.add(ToolbarCategoriesModel("Tümü", true))
        list.add(ToolbarCategoriesModel("Oyun", false))
        list.add(ToolbarCategoriesModel("Mix'ler", false))
        list.add(ToolbarCategoriesModel("Turizm", false))
        list.add(ToolbarCategoriesModel("Canlı", false))
        list.add(ToolbarCategoriesModel("Yemek pişirme programaları", false))
        list.add(ToolbarCategoriesModel("Futbol", false))
        list.add(ToolbarCategoriesModel("Son yüklenenler", false))
        list.add(ToolbarCategoriesModel("Yeni öneriler", false))
        binding.homeToolbarRef.categoriesRecyclerView.layoutManager =
            StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.HORIZONTAL)
        binding.homeToolbarRef.categoriesRecyclerView.adapter =
            ToolbarCategoriesCardAdapter(context, list)
    }
}