package com.tabraiz.mvvmwithfragment.data.repository

import com.tabraiz.mvvmwithfragment.data.api.PostsApi
import com.tabraiz.mvvmwithfragment.data.api.PostsApi.BASE_URL

class PostsRepository {

    suspend fun getPosts(number: Int = 10) = PostsApi.postsService.getPosts(number)

    /** Get the subscribers count for the single author
     * @param blogUrl Obtained from the [Author] object that gets concatenated with the base url
     * */
    suspend fun getSubscribersCount(blogUrl: String) = PostsApi.postsService.getSubscribersCount(BASE_URL + blogUrl)
}