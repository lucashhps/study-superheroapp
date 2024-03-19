package com.example.superheroapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.superheroapp.R

data class Hero(
    @StringRes val nameResource : Int,
    @StringRes val descriptionResource : Int,
    @DrawableRes val imageResource : Int
)

object HeroesRepository {
    val heroes = listOf(
        Hero(
            nameResource = R.string.hero1,
            descriptionResource = R.string.description1,
            imageResource = R.drawable.android_superhero1
        ),
        Hero(
            nameResource = R.string.hero2,
            descriptionResource = R.string.description2,
            imageResource = R.drawable.android_superhero2
        ),
        Hero(
            nameResource = R.string.hero3,
            descriptionResource = R.string.description3,
            imageResource = R.drawable.android_superhero3
        ),
        Hero(
            nameResource = R.string.hero4,
            descriptionResource = R.string.description4,
            imageResource = R.drawable.android_superhero4
        ),
        Hero(
            nameResource = R.string.hero5,
            descriptionResource = R.string.description5,
            imageResource = R.drawable.android_superhero5
        ),
        Hero(
            nameResource = R.string.hero6,
            descriptionResource = R.string.description6,
            imageResource = R.drawable.android_superhero6
        ),
    )
}
