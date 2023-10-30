package com.ao.youtubeegitimapp.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import com.ao.youtubeegitimapp.databinding.FragmentHomeBinding
import com.ao.youtubeegitimapp.ui.options.ShortOptions
import com.ao.youtubeegitimapp.ui.options.ToolbarOptions
import com.ao.youtubeegitimapp.ui.options.VideoOptions

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        ToolbarOptions(requireContext(), binding).load()
        ShortOptions(requireContext(), binding).load()
        VideoOptions(requireContext(), binding).load()
        val shortRcView = binding.shortRecyclerView
        val videoRcView = binding.videosRecyclerView
        shortRcView.setHasFixedSize(false);
        shortRcView.setNestedScrollingEnabled(false);
        videoRcView.setHasFixedSize(false);
        videoRcView.setNestedScrollingEnabled(false);
        return binding.root
    }
}