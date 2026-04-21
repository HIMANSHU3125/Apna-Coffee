package com.example.coffix.Presentation.Screen.Ui_Components

import androidx.compose.foundation.layout.height
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.coffix.Presentation.Screen.Navigation.Routes
import com.example.coffix.R

@Composable
fun BottomNavBar(navController: NavController,route: String){

    val navItems = listOf(
        NavItem("Home", R.drawable.regular_outline_home,Routes.HomeScreen),
        NavItem("Cart", R.drawable.regular_outline_bag, Routes.CartScreen),
        NavItem("Favourites", R.drawable.regular_outline_heart, Routes.FavouritesScreen),
        NavItem("Profile", R.drawable.outline_account_circle_24,Routes.ProfileScreen)
    )

    var selectedIndex by remember { mutableStateOf(0) }

    NavigationBar(
        containerColor = MaterialTheme.colorScheme.surface,
        modifier = Modifier.height(80.dp)
    ) {
        navItems.forEachIndexed { index, item ->

            NavigationBarItem(
                selected = item.title==route,

                onClick = {
                    navController.navigate(item.route){
                        popUpTo(navController.graph.startDestinationId){
                            saveState=true
                        }
                        launchSingleTop=true
                        restoreState=true
                    }




                },

                icon = {
                    Icon(
                        painter = painterResource(id = item.icon),
                        contentDescription = item.title
                    )
                }
            )
        }
    }
}

data class NavItem(
    val title: String,
    val icon: Int,
    val route: Routes
)