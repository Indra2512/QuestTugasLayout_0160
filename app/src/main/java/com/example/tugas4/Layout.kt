package com.example.tugas4

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

//mendefinisikan warna
val CardBg1 = Color(0xFF524E38)
val CardBg2 = Color(0xFF784CD6)
val CardBg3 = Color(0xFF0000FF)
val CardBg4 = Color(0xFF006400)
val YellowText = Color(0xFFFFD700)
val CyanText = Color(0xFF00FFFF)

data class UserData(
    @StringRes val nama: Int,
    @StringRes val detail1: Int,
    @StringRes val detail2: Int? = null,
    val backgroundColor: Color,
    val textColor1: Color,
    val textColor2: Color,
    @DrawableRes val logoRes: Int
)

@Composable
fun ReusableUserCard(data: UserData) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 6.dp),
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(containerColor = data.backgroundColor)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            // Logo bagian kiri
            Image(
                painter = painterResource(id = data.logoRes),
                contentDescription = null,
                modifier = Modifier.size(50.dp)
            )

            // Informasi Teks di Tengah
            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(horizontal = 12.dp),
                horizontalAlignment = Alignment.Start
            ) {
                Text(
                    text = stringResource(id = data.nama),
                    color = Color.White,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )

                Text(
                    text = stringResource(id = data.detail1),
                    color = data.textColor1,
                    fontSize = 12.sp
                )

                if (data.detail2 != null) {
                    Text(
                        text = stringResource(id = data.detail2),
                        color = data.textColor2,
                        fontSize = 12.sp
                    )
                }
            }

            //Logo bagian kanan
            Image(
                painter = painterResource(id = data.logoRes),
                contentDescription = null,
                modifier = Modifier.size(50.dp)
            )
        }
    }

    @Composable
    fun MainScreen() {
        val listData = listOf(
            UserData(
                nama = R.string.nama_1,
                detail1 = R.string.no_1,
                backgroundColor = CardBg1,
                textColor1 = YellowText,
                textColor2 = YellowText,
                logoRes = R.drawable.umylogo
            ),
        )
    }
}

