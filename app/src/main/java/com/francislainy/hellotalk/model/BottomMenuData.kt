package com.francislainy.hellotalk.model

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomMenuData(
    val icon: ImageVector,
    val title: String
) {
    object Movies : BottomMenuData(icon = Icons.Outlined.Home, "HelloTalk")
    object Actors : BottomMenuData(icon = Icons.Outlined.List, "Moments")
    object Locations : BottomMenuData(icon = Icons.Outlined.Person, "Connect")
    object Rooms : BottomMenuData(icon = Icons.Outlined.Lock, "Live")
    object Settings : BottomMenuData(icon = Icons.Outlined.Face, "Me")
}