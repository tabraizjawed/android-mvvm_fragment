package com.tabraiz.mvvmwithfragment.ui.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.tabraiz.mvvmwithfragment.ui.post.PostsViewModel
import com.tabraiz.mvvmwithfragment.data.repository.PostsRepository

/**
 * Factory class to store the ViewModel references so as they are not recreating every time.
 * */
class ViewModelFactory(private val repository: PostsRepository) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(PostsViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return PostsViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel")
    }
}