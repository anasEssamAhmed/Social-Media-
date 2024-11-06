package com.example.socialmedia.util

import com.example.socialmedia.data.domain.HomeItem
import com.example.socialmedia.data.domain.Post
import com.example.socialmedia.data.domain.enums.HomeItemType

fun Post.toHomeItem() : HomeItem<Any> {
    return HomeItem(this , HomeItemType.TYPE_POST)
}