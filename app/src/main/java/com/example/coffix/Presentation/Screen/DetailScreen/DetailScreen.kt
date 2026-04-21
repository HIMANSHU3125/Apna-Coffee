package com.example.coffix.Presentation.Screen.DetailScreen

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.example.coffix.Model.Product
import com.example.coffix.R

@Composable
fun DetailScreen(productId: Int, navController: NavHostController) {

    val products = listOf(
        Product(id = 1, name = "Espresso", description = "Strong And Rich", price = 100.99, image = R.drawable.coffee_1),
        Product(id = 2, name = "Espresso", description = "Strong And Rich", price = 125.99, image = R.drawable.coffee_2),
        Product(id = 3, name = "Espresso", description = "Strong And Rich", price = 200.99, image = R.drawable.coffee_2),
        Product(id = 4, name = "Espresso", description = "Strong And Rich", price = 150.99, image = R.drawable.coffee_3),
        Product(id = 5, name = "Espresso", description = "Strong And Rich", price = 165.99, image = R.drawable.coffee_4),
        Product(id = 6, name = "Espresso", description = "Strong And Rich", price = 300.99, image = R.drawable.coffee_5),
    )

    val selectedProduct = products.find { it.id == productId}?:return

    Scaffold(
        topBar = { DetailScreenTopAppBar() },
        bottomBar = { DetailScreenBottomBar() }
    ) { innerPadding ->
        LazyColumn(
            contentPadding = innerPadding  //  prevents overlap with bars
        ) {
            item {
                ProductDetailContent(
                    product = selectedProduct,
                    innerPadding = innerPadding
                )
          }
        }
    }
}