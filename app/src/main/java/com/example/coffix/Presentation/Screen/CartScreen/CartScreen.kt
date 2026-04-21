package com.example.coffix.Presentation.Screen.CartScreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.coffix.Model.Product
import com.example.coffix.Presentation.Screen.Ui_Components.BottomNavBar
import com.example.coffix.R
import com.example.coffix.ui.theme.LightBrown

@Composable
fun CartScreen(navController: NavHostController) {
    val cardproduct = listOf(
        Product(id = 1, name = "Expresso", description = "Strong And rich", price = 100.99, image = R.drawable.coffee_1),
        Product(id = 2, name = "royal", description = "Strong And rich", price = 125.99, image = R.drawable.coffee_5),
        Product(id = 3, name = "himanshu fav", description = "good And rich", price = 200.99, image = R.drawable.coffee_4),
    )

    var amount by remember { mutableStateOf(145.0) }
    var fees by remember { mutableStateOf(30.0) }
    val totalAmount by remember { derivedStateOf { amount + fees } }

    Scaffold(
        topBar = { cartScreenTopAppBar(navController) },
        bottomBar = { BottomNavBar(navController=navController,"Cart") }
    ) { innerPadding ->

        LazyColumn(
            modifier = Modifier
                .padding(innerPadding)
                .padding(16.dp)
        ) {

            item {

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "Deliver",
                        fontSize = 30.sp,
                        color = LightBrown,
                        fontWeight = FontWeight.Bold
                    )
                }

                cardproduct.forEach { product ->
                    CartItemCard(product)
                }

                Spacer(modifier = Modifier.height(16.dp))

                Text(
                    text = "Payment Summary",
                    style = MaterialTheme.typography.titleMedium.copy(
                        fontWeight = FontWeight.Bold,
                        fontSize = 22.sp
                    )
                )

                Spacer(modifier = Modifier.height(16.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(text = "Price", fontSize = 20.sp)
                    Text(text = "Rs $amount", fontSize = 20.sp)
                }

                Spacer(modifier = Modifier.height(8.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(text = "Discount", fontSize = 20.sp)
                    Text(text = "Rs $fees", fontSize = 20.sp)
                }

                Spacer(modifier = Modifier.height(16.dp))


                paymentModeSelect(totalAmount)



            }
        }
    }
}