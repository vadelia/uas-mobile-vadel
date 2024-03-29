package com.project.`uas-vadel`

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Video(
    val photo: Int,
    val name: String,
    val description: String,
    val videoId:Int
) : Parcelable