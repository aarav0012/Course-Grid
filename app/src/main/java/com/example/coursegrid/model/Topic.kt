package com.example.coursegrid.model

import androidx.annotation.DrawableRes
import androidx.annotation.IntegerRes
import androidx.annotation.StringRes

data class Topic(
    @StringRes val stringResourceId: Int,
    @IntegerRes val courseNumber: Int,
    @DrawableRes val imageResourceId: Int
)
