package com.example.socialmedia.ui.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.socialmedia.R
import com.example.socialmedia.data.domain.HomeItem
import com.example.socialmedia.data.domain.Post
import com.example.socialmedia.data.domain.Story
import com.example.socialmedia.data.domain.enums.HomeItemType
import com.example.socialmedia.databinding.ItemNewPostBinding
import com.example.socialmedia.databinding.ItemPostBinding
import com.example.socialmedia.databinding.ItemStoriesBinding
import com.example.socialmedia.databinding.ListStoriesBinding
import com.example.socialmedia.ui.stories.StoriesAdapter
import com.google.android.material.transition.Hold

class HomeAdapter(private val items: List<HomeItem<Any>>) :
    RecyclerView.Adapter<HomeAdapter.HomeViewHolder>() {

    abstract class HomeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
    class NewPostViewHolder(itemView: View) : HomeViewHolder(itemView) {
        val binding = ItemNewPostBinding.bind(itemView)
    }

    class PostsViewHolder(itemView: View) : HomeViewHolder(itemView) {
        val binding = ItemPostBinding.bind(itemView)
    }

    class StoriesViewHolder(itemView: View) : HomeViewHolder(itemView) {
        val binding = ListStoriesBinding.bind(itemView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        return when(viewType){
            ITEM_STORIES -> {
                val view = LayoutInflater.from(parent.context).inflate(R.layout.list_stories, parent , false)
                StoriesViewHolder(view)
            }
            ITEM_NEW_POST -> {
                val view = LayoutInflater.from(parent.context).inflate(R.layout.item_new_post, parent , false)
                NewPostViewHolder(view)
            }
            ITEM_POSTS -> {
                val view = LayoutInflater.from(parent.context).inflate(R.layout.item_post, parent , false)
                PostsViewHolder(view)
            }
            else -> throw Exception("UNKNOWN VIEW TYPE")
        }
    }

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
        when(holder){
            is StoriesViewHolder -> {
                bindStories(holder , position)
            }
            is NewPostViewHolder -> {
                bindNewPost(holder,position)
            }
            is PostsViewHolder -> {
                bindPosts(holder,position)
            }
        }
    }

    private fun bindStories(holder: StoriesViewHolder, position: Int) {
        val stories = items[position].item as List<Story>
        val adapter = StoriesAdapter(stories)
        holder.binding.recListStories.adapter = adapter
    }
    private fun bindNewPost(holder: NewPostViewHolder, position: Int) {
        val current = items[position].item as String
        holder.binding.apply {
            textInputNewPost.hint = current
        }
    }
    private fun bindPosts(holder : PostsViewHolder, position: Int) {
        val current = items[position].item as Post
        holder.binding.apply {
            Glide.with(this.root.context).load(current.profileImageUrl).into(imageProfile)
            Glide.with(this.root.context).load(current.postImageUrl).into(coverImage)
            name.text = current.username
            year.text = current.date
        }
    }

    override fun getItemViewType(position: Int): Int {
        return when(items[position].type){
            HomeItemType.TYPE_STORES -> ITEM_STORIES
            HomeItemType.TYPE_POST -> ITEM_POSTS
            HomeItemType.TYPE_NEW_POST -> ITEM_NEW_POST
        }
    }

    companion object {
        const val ITEM_NEW_POST = 1
        const val ITEM_STORIES = 2
        const val ITEM_POSTS = 3
    }
}