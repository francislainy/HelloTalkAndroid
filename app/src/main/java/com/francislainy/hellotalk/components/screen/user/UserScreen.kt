package com.francislainy.hellotalk.components.screen.user

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.francislainy.hellotalk.components.HomeAppBar
import com.francislainy.hellotalk.components.HomeBottomMenu

@Composable
fun UserScreen(navController: NavController) {
    Scaffold(
        topBar = { HomeAppBar() },
        bottomBar = {
            HomeBottomMenu(navController)
        }
    ) {
        Text(text = "click here", Modifier
            .fillMaxWidth()
            .clickable {
                navController.navigate("user_detail_screen/1")
            })
    }
}
