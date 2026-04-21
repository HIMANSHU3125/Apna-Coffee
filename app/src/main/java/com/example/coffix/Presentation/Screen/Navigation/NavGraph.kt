package com.example.coffix.Presentation.Screen.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.example.coffix.Presentation.Screen.CartScreen.CartScreen
import com.example.coffix.Presentation.Screen.DetailScreen.DetailScreen
import com.example.coffix.Presentation.Screen.Favourites.FavouritesScreen
import com.example.coffix.Presentation.Screen.HomeScreen.HomeScreen
import com.example.coffix.Presentation.Screen.HomeScreen.WelcomeScreen
import com.example.coffix.Presentation.Screen.Profile.ProfileScreen


@Composable
fun NavGraph() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Routes.WelcomeScreen
    ) {
        composable<Routes.WelcomeScreen> {
            WelcomeScreen(navController)
        }

        composable<Routes.HomeScreen> {
            HomeScreen(navController)
        }

        composable<Routes.DetailScreen> { backStackEntry ->
            val args = backStackEntry.toRoute<Routes.DetailScreen>()
            DetailScreen(
                navController = navController,
                productId = args.productId
            )

        }
        composable <Routes.CartScreen>{
            CartScreen(navController)
        }

        composable <Routes.FavouritesScreen>{
            FavouritesScreen(navController)
        }

        composable <Routes.ProfileScreen>{
            ProfileScreen(navController)
        }
    }
}