package com.example.dndaichatgroup.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext

private val DarkColorScheme = darkColorScheme(
    primary = CrimsonRed,
    onPrimary = Color.White,
    primaryContainer = Color(0xFF7F1D1D),

    secondary = DarkGold,
    onSecondary = Color.Black,
    secondaryContainer = Color(0xFF4E3B00),

    background = BackgroundDark,
    onBackground = Color.White,

    surface = SurfaceDark,
    onSurface = OnDark,

    tertiary = EmeraldGreen,
    onTertiary = Color.White,

    error = FieryOrange,
    onError = Color.Black
)

@Composable
fun DnDAIChatGroupTheme(
    useDarkTheme: Boolean = true,
    content: @Composable () -> Unit
) {
    val colors = DarkColorScheme

    MaterialTheme(
        colorScheme = colors,
        typography = Typography,
        content = content
    )
}