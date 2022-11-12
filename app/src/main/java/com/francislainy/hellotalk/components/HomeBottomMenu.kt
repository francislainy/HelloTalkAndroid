package com.francislainy.hellotalk.components

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.francislainy.hellotalk.model.BottomMenuData.*
import com.francislainy.hellotalk.navigation.Screens
import com.francislainy.hellotalk.ui.theme.PrimaryColor
import com.francislainy.hellotalk.ui.theme.TextIcons

@Composable
fun HomeBottomMenu(navController: NavController) {
    val items = listOf(Movies, Actors, Locations, Rooms, Settings)

    BottomNavigation(backgroundColor = PrimaryColor, contentColor = TextIcons) {
        items.forEach {
            BottomNavigationItem(
                label = { Text(text = it.title) },
                alwaysShowLabel = true,
                selected = false,
                onClick = {

                    when (it.title) {
                        "HelloTalk" -> navController.navigate(Screens.Home.route) //todo: add correct screens
                        "Moments" -> navController.navigate(Screens.Actors.route)
                        "Me" -> navController.navigate(Screens.User.route)
                        else -> navController.navigate("detail_screen/5")
                    }

                },
                icon = {
                    Icon(imageVector = it.icon, contentDescription = it.title)
                }

            )
        }
    }

}