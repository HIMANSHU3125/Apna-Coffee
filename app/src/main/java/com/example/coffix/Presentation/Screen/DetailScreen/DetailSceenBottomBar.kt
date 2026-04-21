package com.example.coffix.Presentation.Screen.DetailScreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.coffix.Presentation.Screen.Ui_Components.AppMessage
import com.example.coffix.ui.theme.LightBrown

@Composable
@Preview(showBackground = true)
fun DetailScreenBottomBar() {

    var showcartDialog by remember { mutableStateOf(false ) }

    BottomAppBar(
        containerColor = Color.Transparent
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column {
                Text(
                    text = "Price",
                    fontSize = 16.sp,
                    fontWeight =    FontWeight.SemiBold
                )

                Spacer(modifier = Modifier.height(6.dp))

                Text(
                    text = "₹104",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.SemiBold
                )
            }

            Button(
                onClick = {
                    showcartDialog=true
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = LightBrown
                ),
                modifier = Modifier.height(56.dp),
                shape = RoundedCornerShape(20.dp)
            ) {
                Text(text = "Add to Cart",
                    fontWeight = FontWeight.Bold,
                    fontSize = 24.sp)
            }

            AppMessage(
                show = showcartDialog,
                title = "Add to Card",
                message = "Item has been added to your cart",
                onDismiss = {
                    showcartDialog=false
                },
            )
        }
    }
}