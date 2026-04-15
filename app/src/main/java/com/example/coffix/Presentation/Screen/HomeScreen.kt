package com.example.coffix.Presentation.Screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.coffix.Model.Product
import com.example.coffix.R
import com.example.coffix.Presentation.Screen.Ui_Components.BottomNavBar
import com.example.coffix.Presentation.Screen.Ui_Components.SearchBar

@Composable

fun HomeScreen(navController: NavHostController) {

    val location="Panchkroshi Sarnath Varanasi"
    Scaffold(
        bottomBar = { BottomNavBar() }
    ) { innerPadding ->
        Box(
            modifier = Modifier
                .padding(innerPadding) //
                .fillMaxWidth()
                .fillMaxHeight(1f / 3f)
                .background(
                    brush = Brush.linearGradient(
                        colors = listOf(
                            Color(0xFF303030),
                            Color(0xFF1F1F1F),
                            Color(0xFF121212)
                        )
                    )
                )
        )

        Column(modifier=Modifier.padding(10.dp).padding(innerPadding)) {
            Text(text = "Location",
                color = Color.Gray,
                fontSize = 16.sp)

            Spacer(modifier = Modifier.height(4.dp))

            Row(
                verticalAlignment =  Alignment.CenterVertically
            ) {
                Text(location,
                    color = Color.White,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 16.sp)
                Icon(imageVector = Icons.Default.KeyboardArrowDown,
                    contentDescription = "Change Location",
                    tint = Color.White,

                )


            }

            Spacer(modifier = Modifier.height(30.dp))

            SearchBar()

            Spacer(modifier = Modifier.height(40.dp))

            Image(painter = painterResource(R.drawable.banner_1),
                contentDescription = "banner",
                )

            Spacer(modifier = Modifier.height(2.dp))

            HomeScreenCategories()

            val products=listOf(
                Product(id=1, name = "Expresso", description = "Strong And rich", price = 100.99, image = R.drawable.coffee_1),
                Product(id=2, name = "Expresso", description = "Strong And rich", price = 125.99, image = R.drawable.coffee_2),
                Product(id=3, name = "Expresso", description = "Strong And rich", price = 200.99, image = R.drawable.coffee_2),
                Product(id=4, name = "Expresso", description = "Strong And rich", price = 150.99, image = R.drawable.coffee_3),
                Product(id=5, name = "Expresso", description = "Strong And rich", price = 165.99, image = R.drawable.coffee_4),
                Product(id=6, name = "Expresso", description = "Strong And rich", price = 300.99, image = R.drawable.coffee_5),
            )

            ProductGrid(products=products,navController)

        }
    }
}