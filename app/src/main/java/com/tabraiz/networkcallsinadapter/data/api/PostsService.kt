package com.tabraiz.mvvmwithfragment.data.api

import com.tabraiz.mvvmwithfragment.data.model.response.PostsResponse
import com.tabraiz.mvvmwithfragment.data.model.response.SubscribersCountResponse
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.http.Url

interface PostsService {

    // Using different url from the original due to confidentiality
    @GET("discover.wordpress.com/posts")
    suspend fun getPosts(@Query("number") number: Int): PostsResponse

    @GET
    suspend fun getSubscribersCount(@Url url: String): SubscribersCountResponse
}