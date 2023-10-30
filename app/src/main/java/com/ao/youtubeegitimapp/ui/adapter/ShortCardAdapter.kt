package com.ao.youtubeegitimapp.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.recyclerview.widget.RecyclerView
import com.ao.youtubeegitimapp.data.models.ShortModel
import com.ao.youtubeegitimapp.databinding.ShortCardBinding

class ShortCardAdapter(var context: Context, var shortList: List<ShortModel>) : RecyclerView.Adapter<ShortCardAdapter.ShortCardAdapter>() {
    inner class ShortCardAdapter(var design: ShortCardBinding) : RecyclerView.ViewHolder(design.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShortCardAdapter {
        val design = ShortCardBinding.inflate(LayoutInflater.from(context), parent, false)
        return ShortCardAdapter(design)
    }

    override fun onBindViewHolder(holder: ShortCardAdapter, position: Int) {
        val item = shortList[position]
        val design = holder.design
        val layoutParams = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.WRAP_CONTENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
        )
        layoutParams.setMargins(0, 0, 32, 0)
        if (position != shortList.size - 1) {
            design.shortCardLinearLayout.layoutParams = layoutParams
        }
        design.shortImageView.setImageResource(item.image)
        design.shortTitleTextView.text = item.name
        design.showingCountTextView.text = item.showCount.toString()
    }

    override fun getItemCount(): Int {
        return shortList.size
    }
}