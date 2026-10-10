package com.example.tugas4

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

data class UserData(
    @StringRes val nama: int,
    @StringRes val detail1: int,
    @StringRes val detail2: int? = null,
    val backgroundColor: Color,
    val textColor1: Color,
    val textColor2: Color,
    @DrawableRes val logoRes: int
)

@Composable
fun ReusableUserCard(data: UserData) {

}

