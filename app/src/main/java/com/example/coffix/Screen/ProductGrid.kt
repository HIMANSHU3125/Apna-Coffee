package com.example.coffix.Screen

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.coffix.Model.Product
import com.example.coffix.Screen.Ui_Components.ProductCard

@Composable
fun ProductGrid(products: List<Product>){

    LazyColumn(modifier = Modifier.fillMaxSize()
        .padding(8.dp)) {
            items( products.chunked(2)){rowItems->
                ProductCard(
                    product=rowItems[0],
                    modifier= Modifier.weight(1f)
                )

            }

    }
}