package com.example.myapplication.util

import android.app.Activity
import android.widget.ImageView
import androidx.annotation.ColorRes
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.core.content.ContextCompat
import com.bumptech.glide.Glide

fun String.changeUpperCase() = this.uppercase()

fun Activity.color(@ColorRes color: Int) = ContextCompat.getColor(this, color)

fun Any?.isNull() = this == null

fun ImageView.load(image: Int) {
    Glide.with(context).load(image).centerCrop()
        .into(this)
}




