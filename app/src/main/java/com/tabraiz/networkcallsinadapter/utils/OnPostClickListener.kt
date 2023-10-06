package com.tabraiz.mvvmwithfragment.utils

import com.tabraiz.mvvmwithfragment.data.model.Post

interface OnPostClickListener {

    fun onPostClicked(post: Post)
}