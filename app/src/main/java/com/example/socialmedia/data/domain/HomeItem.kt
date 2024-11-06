package com.example.socialmedia.data.domain

import com.example.socialmedia.data.domain.enums.HomeItemType

data class HomeItem<T>(
    val item : T,
    val type : HomeItemType
)
