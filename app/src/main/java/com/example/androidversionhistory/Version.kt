package com.example.androidversionhistory

import androidx.annotation.DrawableRes

data class Version (
    @DrawableRes
    val imageResource: Int,
    val name: String,
    val versionNumbers: String,
    val initialStableReleaseDate: String,
    val securityFixes: String,
    val apiLevel: String
)