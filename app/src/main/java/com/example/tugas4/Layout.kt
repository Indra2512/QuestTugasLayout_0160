package com.example.tugas4

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.ui.graphics.Color

data class UserData(
    @StringRes val nama: int,
    @StringRes val detail1: int,
    @StringRes val detail2: int? = null,
    val backgroundColor: Color,
    val textColor1: Color,
    val textColor2: Color,
    @DrawableRes val logoRes: int
)

