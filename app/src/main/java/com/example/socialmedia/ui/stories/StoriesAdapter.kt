package com.example.socialmedia.ui.stories

import android.content.res.ColorStateList
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.socialmedia.R
import com.example.socialmedia.data.domain.Story
import com.example.socialmedia.databinding.AddStoryBinding
import com.example.socialmedia.databinding.ItemStoriesBinding

class StoriesAdapter(private val listStories: List<Story>) :
    RecyclerView.Adapter<StoriesAdapter.HomeViewHolder>() {
    abstract class HomeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    class AddStoryViewHolder(itemView: View) : HomeViewHolder(itemView) {
        val binding = AddStoryBinding.bind(itemView)
    }

    class StoriesViewHolder(itemView: View) : HomeViewHolder(itemView) {
        val binding = ItemStoriesBinding.bind(itemView)
    }

    override fun getItemViewType(position: Int): Int {
        return when (position) {
            0 -> {
                ADD_STORY
            }

            else -> {
                STORIES
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        return when (viewType) {
            ADD_STORY -> {
                val view =
                    LayoutInflater.from(parent.context).inflate(R.layout.add_story, parent, false)
                AddStoryViewHolder(view)
            }

            STORIES -> {
                val view = LayoutInflater.from(parent.context)
                    .inflate(R.layout.item_stories, parent, false)
                StoriesViewHolder(view)
            }
            else -> throw Exception("There is no view")
        }
    }

    override fun getItemCount() = listStories.size


    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
        val current = listStories[position]
        when (holder) {
            is AddStoryViewHolder -> {

            }
            is StoriesViewHolder -> {
                holder.binding.apply {
                    Glide.with(this.root.context).load(current.image).into(imageProfileStories)
                    if (!current.isRead){
                        holder.binding.circleRoundCover.setCardBackgroundColor(ContextCompat.getColor(this.root.context , R.color.ColorStory))
                    }else {
                        holder.binding.circleRoundCover.setCardBackgroundColor(ContextCompat.getColor(this.root.context , R.color.ColorStory_read))
                    }
                }

            }
        }
    }


    companion object {
        const val ADD_STORY = 1
        const val STORIES = 5
    }
}