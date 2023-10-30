package com.ao.youtubeegitimapp.ui.adapter

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.core.view.marginLeft
import androidx.recyclerview.widget.RecyclerView
import com.ao.youtubeegitimapp.R
import com.ao.youtubeegitimapp.data.models.ToolbarCategoriesModel
import com.ao.youtubeegitimapp.databinding.ToolbarCategoriesCardBinding

class ToolbarCategoriesCardAdapter(
    var context: Context, var categoriesList: List<ToolbarCategoriesModel>
) : RecyclerView.Adapter<ToolbarCategoriesCardAdapter.ToolbarCardAdapter>() {

    inner class ToolbarCardAdapter(var design: ToolbarCategoriesCardBinding) :
        RecyclerView.ViewHolder(design.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ToolbarCardAdapter {
        val design =
            ToolbarCategoriesCardBinding.inflate(LayoutInflater.from(context), parent, false)
        return ToolbarCardAdapter(design)
    }

    override fun onBindViewHolder(holder: ToolbarCardAdapter, position: Int) {
        val item = categoriesList[position]
        val design = holder.design
        val layoutParams = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.WRAP_CONTENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
        )
        layoutParams.setMargins(0, 0, 16, 0)
        if (position != categoriesList.size - 1) {
            design.toolbarCategoriesCardLayout.layoutParams = layoutParams
        }
        design.toolbarCategoriesCardText.text = item.name
        if (item.isSelect) {
            design.toolbarCategoriesCardView.setCardBackgroundColor(Color.BLACK)
            design.toolbarCategoriesCardText.setTextColor(Color.WHITE)
        } else {
            design.toolbarCategoriesCardView.setCardBackgroundColor(context.getColor(R.color.lightGrey))
            design.toolbarCategoriesCardText.setTextColor(Color.BLACK)
        }
        design.toolbarCategoriesCardView.setOnClickListener {
            for (i in categoriesList.indices) {
                categoriesList[i].isSelect = false
            }
            categoriesList[position].isSelect = true
            notifyDataSetChanged()
        }
    }

    override fun getItemCount(): Int {
        return categoriesList.size
    }
}