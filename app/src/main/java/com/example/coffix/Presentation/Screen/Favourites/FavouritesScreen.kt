package com.example.coffix.Presentation.Screen.Favourites

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.coffix.Model.Product
import com.example.coffix.Presentation.Screen.Ui_Components.BottomNavBar
import com.example.coffix.R

@Composable
fun FavouritesScreen(navController: NavController) {

    var favouriteItems by remember {
        mutableStateOf(
            listOf(
                Product(id = 1, name = "Expresso", description = "Strong And rich", price = 100.99, image = R.drawable.coffee_1),
                Product(id = 2, name = "Royal", description = "Strong And rich", price = 125.99, image = R.drawable.coffee_5),
                Product(id = 3, name = "Himanshu Fav", description = "Good And rich", price = 200.99, image = R.drawable.coffee_4),
            )
        )
    }

    Scaffold(
        topBar ={ FavItemTopAppBAr()},
        bottomBar = { BottomNavBar(navController=navController, "Favourites") }
    ) {innerPadding->
        LazyColumn(modifier = Modifier.fillMaxSize()
            .padding(16.dp)
            .padding(innerPadding)){

            item {
                favouriteItems.forEach {product->
                    FavouriteItemCard(product,

                        onRemove={favouriteItems=favouriteItems-product}
                    )



                }
            }

        }

    }


}

