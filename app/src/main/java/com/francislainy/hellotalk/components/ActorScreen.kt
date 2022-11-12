package com.francislainy.hellotalk.components

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun ActorScreen(navController: NavController) {
    Scaffold(
        topBar = { HomeAppBar() },
        bottomBar = {
            HomeBottomMenu(navController)
        }
    ) {
        ActorList(it, navController)
    }
}
