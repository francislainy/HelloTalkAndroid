package com.francislainy.hellotalk.navigation

import HomeScreen
import android.util.Log
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.francislainy.hellotalk.MockData
import com.francislainy.hellotalk.components.ActorScreen
import com.francislainy.hellotalk.components.DetailScreen
import com.francislainy.hellotalk.components.screen.user.UserDetailScreen
import com.francislainy.hellotalk.components.screen.user.UserScreen

@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screens.Home.route
    )
    {
        composable(route = Screens.Home.route) {
            HomeScreen(navController)
            Log.d("NavHost", "FirstRun")
        }
        composable(route = Screens.Actors.route) {
            ActorScreen(navController)
        }
        composable(route = Screens.User.route) {
            UserScreen(navController)
        }

        composable(
            route = Screens.UserDetail.route,
            arguments = listOf(navArgument("movieId") { type = NavType.IntType })
        ) { navBackStackEntry ->
            val id = navBackStackEntry.arguments?.getInt("movieId")
            val newsData = MockData.getNews(id)
            UserDetailScreen(
                navController, newsData
            )
            Log.d("NavHost", "Second")
        }

        composable(
            route = Screens.Detail.route,
            arguments = listOf(navArgument("movieId") { type = NavType.IntType })
        ) { navBackStackEntry ->
            val id = navBackStackEntry.arguments?.getInt("movieId")
            val newsData = MockData.getNews(id)
            DetailScreen(
                navController, newsData
            )
            Log.d("NavHost", "Second")
        }
    }
}
