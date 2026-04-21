package com.example.coffix.Presentation.Screen.CartScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Remove
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.coffix.Model.Product
import com.example.coffix.R
import com.example.coffix.ui.theme.LightGray

@Composable

fun CartItemCard(product: Product) {

    var quantity by remember { mutableStateOf(1) }

    Card(
        modifier = Modifier.fillMaxWidth().padding(6.dp),
        colors = CardDefaults.cardColors(
            containerColor = LightGray
        )
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {

            Image(
                painter = painterResource(product.image),
                contentDescription = "image",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(80.dp)
                    .clip(RoundedCornerShape(20.dp))
            )

            Spacer(modifier = Modifier.width(8.dp))

            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = product.name,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = product.description,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.DarkGray
                )
            }

            Row(verticalAlignment = Alignment.CenterVertically) {
                IconButton(onClick = {quantity--},
                    enabled = quantity>1) {
                    Icon(
                        imageVector = Icons.Filled.Remove,
                        contentDescription = "Decrease"
                    )
                }
                Text(
                    text = quantity.toString() ,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )
                IconButton(onClick = {quantity++}) {
                    Icon(
                        imageVector = Icons.Filled.Add,
                        contentDescription = "Increase"
                    )
                }
            }
        }
    }
}