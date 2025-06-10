package com.exemplo.topcursosapp.ui.theme

import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val LightColors = lightColorScheme(
    primary = VerdeReal,
    onPrimary = Color.White,
    secondary = VerdeAcqua,
    onSecondary = PretoForte,
    surface = CinzaClaro,
    onSurface = PretoForte,
    background = VerdeMusgo,
    onBackground = Color.White
)

@Composable
fun TopCursosAppTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = LightColors,
        typography = Typography,
        content = content
    )
}