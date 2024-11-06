package com.example.socialmedia.ui.home


import android.view.LayoutInflater
import com.example.socialmedia.data.DataManager
import com.example.socialmedia.data.domain.HomeItem
import com.example.socialmedia.data.domain.enums.HomeItemType
import com.example.socialmedia.databinding.FragmentHomeBinding
import com.example.socialmedia.ui.base.BaseFragment
import com.example.socialmedia.util.toHomeItem


class HomeFragment() : BaseFragment<FragmentHomeBinding>() {
    override var bindingLayoutInflater: (LayoutInflater) -> FragmentHomeBinding =
        FragmentHomeBinding::inflate

    override fun setup() {
        val itemList: MutableList<HomeItem<Any>> = mutableListOf()
        itemList.add(HomeItem(DataManager.getStories(), HomeItemType.TYPE_STORES))
        itemList.add(HomeItem("Update You state", HomeItemType.TYPE_NEW_POST))
        itemList.addAll(
            DataManager.getPosts().map { it.toHomeItem() }
        )

        val adapter = HomeAdapter(itemList)
        binding.recHome.adapter = adapter
    }
}