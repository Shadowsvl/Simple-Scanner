package com.heka.simplescanner.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.heka.simplescanner.R

val SarabunFamily = FontFamily(
    Font(resId = R.font.sarabun_light, weight = FontWeight.Light),
    Font(resId = R.font.sarabun, weight = FontWeight.Normal),
    Font(resId = R.font.sarabun_medium, weight = FontWeight.Medium),
    Font(resId = R.font.sarabun_semibold, weight = FontWeight.SemiBold),
    Font(resId = R.font.sarabun_bold, weight = FontWeight.Bold)
)

val Typography = Typography(
    defaultFontFamily = SarabunFamily,
    body1 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    )
)