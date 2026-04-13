package com.example.coffix.Screen

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.coffix.Screen.Ui_Components.CategoryChip

@Composable
fun HomeScreenCategories() {

    val categories = listOf("All coffee", "Macchiato", "Latte", "Americano", "Snacks", "Desserts")

    var selectedCategory by remember { mutableStateOf(categories.first()) }

    LazyRow(
        modifier = Modifier.padding(12.dp)
    ) {
        items(categories) { category ->
            CategoryChip(
                text = category,
                isSelected = category == selectedCategory,
                onSelected = {selectedCategory=category}
            )
        }
    }
}