package com.example.coffix.Presentation.Screen.HomeScreen

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.coffix.Model.Product
import com.example.coffix.Presentation.Screen.Ui_Components.ProductCard

@Composable
fun ProductGrid(products: List<Product>, navHostController: NavHostController) {

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp)
    ) {
        items(products.chunked(2)) { rowItems ->
            Row(modifier = Modifier.fillMaxWidth()) {

                ProductCard(
                    product = rowItems[0],          // ✅ first item
                    modifier = Modifier.weight(1f),
                    navController = navHostController // ✅ nav passed
                )

                if (rowItems.size == 2) {
                    ProductCard(
                        product = rowItems[1],          // ✅ second item (was [0])
                        modifier = Modifier.weight(1f),
                        navController = navHostController
                    )
                } else {
                    Spacer(modifier = Modifier.weight(1f))
                }
            }
        }
    }
}