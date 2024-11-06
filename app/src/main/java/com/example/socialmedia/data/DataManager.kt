package com.example.socialmedia.data

import com.example.socialmedia.data.domain.Post
import com.example.socialmedia.data.domain.Story

object DataManager {
    fun getStories(): List<Story> = listOf(
        Story(
            false,
            "https://images.pexels.com/photos/415829/pexels-photo-415829.jpeg?auto=compress&cs=tinysrgb&w=600"
        ),
        Story(
            false,
            "https://images.pexels.com/photos/415829/pexels-photo-415829.jpeg?auto=compress&cs=tinysrgb&w=600"
        ),
        Story(
            true,
            "https://images.pexels.com/photos/1043471/pexels-photo-1043471.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1"
        ),
        Story(
            true,
            "https://images.pexels.com/photos/1040881/pexels-photo-1040881.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1"
        ),
        Story(
            true,
            "https://images.pexels.com/photos/1499327/pexels-photo-1499327.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1"
        ),
        Story(
            false,
            "https://images.pexels.com/photos/580012/pexels-photo-580012.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1"
        ),
        Story(
            false,
            "https://images.pexels.com/photos/1704488/pexels-photo-1704488.jpeg?cs=srgb&dl=pexels-suliman-sallehi-1704488.jpg&fm=jpg"
        ),
        Story(
            true,
            "https://wallpapers.com/images/featured/cool-profile-picture-87h46gcobjl5e4xu.jpg"
        ),
        Story(
            false,
            "https://images.pexels.com/photos/3792581/pexels-photo-3792581.jpeg?cs=srgb&dl=pexels-matheus-bertelli-3792581.jpg&fm=jpg"
        ),
        Story(
            true,
            "https://e1.pxfuel.com/desktop-wallpaper/903/679/desktop-wallpaper-97-aesthetic-best-profile-pic-for-instagram-for-boy-instagram-dp-boys.jpg"
        ),
        Story(
            true,
            "https://png.pngtree.com/thumb_back/fh260/background/20230612/pngtree-man-is-wearing-glasses-in-silhouette-on-a-dark-background-image_2886069.jpg"
        ),
        )

    fun getPosts(): List<Post> = listOf(
        Post(
            "Anas Ahmed",
            "20/4/2024",
            "https://images.pexels.com/photos/1462980/pexels-photo-1462980.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1",
            "https://media.sproutsocial.com/uploads/2017/01/Instagram-Post-Ideas.png"
        ),
        Post(
            "Mohamed Ahmed",
            "05/05/2002",
            "https://images.pexels.com/photos/580012/pexels-photo-580012.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1",
            "https://media.sproutsocial.com/uploads/2022/04/Best-times-to-post-2022_BTTP-Social-Media.jpg"
        ),
        Post(
            "Khaled Ahmed",
            "01/04/2004",
            "https://images.pexels.com/photos/1040881/pexels-photo-1040881.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1",
            "https://blog.hubspot.com/hs-fs/hubfs/best-time-to-post-on-instagram-3.jpg?width=595&height=400&name=best-time-to-post-on-instagram-3.jpg"
        ),
        Post(
            "Ashref Ahmed",
            "17/01/2004",
            "https://images.pexels.com/photos/1043471/pexels-photo-1043471.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1",
            "https://images.unsplash.com/photo-1521575107034-e0fa0b594529?q=80&w=1000&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8cG9zdHxlbnwwfHwwfHx8MA%3D%3D"
        ),
        Post(
            "Khaled Ahmed",
            "01/04/2004",
            "https://images.pexels.com/photos/1040881/pexels-photo-1040881.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1",
            "https://blog.hubspot.com/hs-fs/hubfs/best-time-to-post-on-instagram-3.jpg?width=595&height=400&name=best-time-to-post-on-instagram-3.jpg"
        ),
        Post(
            "Anas Ahmed",
            "20/4/2024",
            "https://images.pexels.com/photos/1462980/pexels-photo-1462980.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1",
            "https://media.sproutsocial.com/uploads/2017/01/Instagram-Post-Ideas.png"
        ),
        Post(
            "Mohamed Ahmed",
            "05/05/2002",
            "https://images.pexels.com/photos/580012/pexels-photo-580012.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1",
            "https://media.sproutsocial.com/uploads/2022/04/Best-times-to-post-2022_BTTP-Social-Media.jpg"
        ),
    )
}