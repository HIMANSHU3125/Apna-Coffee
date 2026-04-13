package com.example.coffix.Screen.Ui_Components

import androidx.compose.foundation.layout.height
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.coffix.R

@Composable
fun BottomNavBar(){

    val navItems = listOf(
        NavItem("Home", R.drawable.regular_outline_home),
        NavItem("Cart", R.drawable.regular_outline_bag),
        NavItem("Favourites", R.drawable.regular_outline_heart),
        NavItem("Profile", R.drawable.outline_account_circle_24)
    )

    var selectedIndex by remember { mutableStateOf(0) }

    NavigationBar(
        containerColor = MaterialTheme.colorScheme.surface,
        modifier = Modifier.height(80.dp)
    ) {
        navItems.forEachIndexed { index, item ->

            NavigationBarItem(
                selected = selectedIndex == index,
                onClick = {},

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
    val icon: Int
)