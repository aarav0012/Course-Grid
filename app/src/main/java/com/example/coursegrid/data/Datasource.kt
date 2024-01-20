package com.example.coursegrid.data

import com.example.coursegrid.R
import com.example.coursegrid.model.Topic

object DataSource {
    val topics = listOf(
        Topic(R.string.architecture, R.integer.architecture, R.drawable.architecture),
        Topic(R.string.crafts, R.integer.craft, R.drawable.crafts),
        Topic(R.string.business, R.integer.business, R.drawable.business),
        Topic(R.string.culinary, R.integer.culinary, R.drawable.culinary),
        Topic(R.string.design, R.integer.design, R.drawable.design),
        Topic(R.string.fashion, R.integer.fashion, R.drawable.fashion),
        Topic(R.string.film, R.integer.film, R.drawable.film),
        Topic(R.string.gaming, R.integer.gaming, R.drawable.gaming),
        Topic(R.string.drawing, R.integer.drawing, R.drawable.drawing),
        Topic(R.string.lifestyle, R.integer.lifestyle, R.drawable.lifestyle),
        Topic(R.string.music, R.integer.music, R.drawable.music),
        Topic(R.string.painting, R.integer.painting, R.drawable.painting),
        Topic(R.string.photography, R.integer.photography, R.drawable.photography),
        Topic(R.string.tech, R.integer.tech, R.drawable.tech)
    )
}
