package com.example.coffix.Presentation.Screen.CartScreen

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.coffix.R
import com.example.coffix.ui.theme.LightBrown

@Composable
fun paymentModeSelect(totalAmount: Double){

    var expanded by remember { mutableStateOf(false  ) }

    var selectedMode by remember { mutableStateOf("Online") }

    val paymentModes=listOf("Online","Cash")

    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 6.dp)
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {

            // Payment Row
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        painter = painterResource(if(selectedMode=="Online") R.drawable.mobile_banking
                        else R.drawable.wallet),
                        contentDescription = "Payment mode",
                        modifier = Modifier.size(30.dp),
                        tint = LightBrown
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Column {
                        Text(
                            text = selectedMode,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.SemiBold
                        )
                        Text(
                            text = "Rs $totalAmount",
                            fontSize = 16.sp,
                            color = Color.Gray
                        )
                    }
                }
                Icon(
                    painter = painterResource(R.drawable.regular_outline_arrow_down),
                    contentDescription = "arrow down",
                    tint = LightBrown,
                    modifier = Modifier.clickable{
                        expanded=true
                    }

                )


            }
            DropdownMenu(expanded = expanded,
                onDismissRequest = {expanded=false}
                ) {
                paymentModes.forEach { mode->
                    DropdownMenuItem(
                        text = {
                            Text(text=mode,
                                style= MaterialTheme.typography.bodyLarge)
                        },
                        onClick = {
                            selectedMode=mode
                            expanded=false

                        },
                        leadingIcon = {
                            Icon(painter=painterResource(
                                if(mode=="Online") R.drawable.mobile_banking
                                else    R.drawable.wallet
                            ), contentDescription = null,
                                tint = LightBrown,
                                modifier = Modifier.size(24.dp))
                        }

                    )

                }


            }


            Spacer(modifier = Modifier.height(16.dp))

            // Divider line
            HorizontalDivider(
                color = Color.LightGray,
                thickness = 1.dp
            )

            Spacer(modifier = Modifier.height(16.dp))

            // Total + Place Order Row
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column {
                    Text(
                        text = "Total",
                        fontSize = 14.sp,
                        color = Color.Gray
                    )
                    Text(
                        text = "Rs $totalAmount",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        color = LightBrown
                    )
                }


                Button(
                    onClick = {  },
                    shape = RoundedCornerShape(12.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = LightBrown,
                        contentColor = Color.White
                    ),
                    modifier = Modifier
                        .height(50.dp)
                        .width(160.dp)
                ) {
                    Text(
                        text = "Place Order",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }
    }

}