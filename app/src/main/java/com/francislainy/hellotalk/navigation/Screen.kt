package com.francislainy.hellotalk.navigation

sealed class Screens(val route: String) {
    object Home: Screens("home_screen")
    object Actors: Screens("actors_screen")
    object User: Screens("user_screen")
    object UserDetail: Screens("user_detail_screen/{movieId}")
    object Detail: Screens("detail_screen/{movieId}")
}