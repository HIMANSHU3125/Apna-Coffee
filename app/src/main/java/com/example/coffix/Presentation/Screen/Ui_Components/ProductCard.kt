package com.example.coffix.Presentation.Screen.Ui_Components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MaterialTheme.typography
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.coffix.Model.Product
import com.example.coffix.Presentation.Screen.Navigation.Routes
import com.example.coffix.R
import com.example.coffix.ui.theme.IvoryWhite
import com.example.coffix.ui.theme.LightBrown
import com.example.coffix.ui.theme.LightGray

@Composable

fun ProductCard(product: Product, modifier: Modifier, navController: NavController){

    Card(modifier = modifier
            .fillMaxWidth()
        .clickable{navController.navigate(Routes.DetailScreen(product.id))}
            .padding(8.dp), shape = RoundedCornerShape(8.dp),
            colors = CardDefaults.cardColors(
            containerColor = IvoryWhite),
        elevation = CardDefaults.cardElevation(10.dp))
    {
        Box(modifier = Modifier.fillMaxWidth()
            .height(160.dp)){
            Column(
                modifier = Modifier.padding(8.dp)
            ) {

                Image(painter = painterResource(R.drawable.coffee_1),
                    contentDescription = "coffe image",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxWidth().clip(RoundedCornerShape(24.dp)))
            }
            Box(
                modifier= Modifier.align(Alignment.TopEnd )
                    .padding(4.dp)
                    .background(
                        color = LightGray.copy(alpha = 0.6f),
                        shape = RoundedCornerShape(8.dp)
                    )
            ){
                Icon(painter = painterResource(R.drawable.regular_outline_heart),
                    contentDescription = "add fav",
                    tint = LightBrown,
                    modifier= Modifier.size(24.dp))
            }

        }
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = product.name,
            style = typography.titleMedium.copy(
                color = Color.Black,
                fontWeight = FontWeight.SemiBold
            ),

         )

        Spacer(modifier = Modifier.height(4.dp))



        Text(text = product.description,
            style = typography.bodyMedium.copy(
                color = Color.Gray
            ),
            maxLines = 1,
            overflow = TextOverflow.Ellipsis

            )
        Spacer(modifier = Modifier.height(16.dp))

        Row(modifier = Modifier.fillMaxWidth().padding(8.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
            ) {
            Text(text="$ ${product.price}",
                style=typography.titleMedium.copy(
                    fontWeight = FontWeight.SemiBold,
                    color = LightBrown
                ))

            IconButton(onClick = {},
                modifier = Modifier.background(
                    color = LightBrown,
                    shape =RoundedCornerShape(10.dp)
                )
                ) {
                Icon(imageVector = Icons.Default.Add, contentDescription = null)
            }


        }


    }


}