package com.example.coffix.Screen

import androidx.annotation.ColorRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.coffix.R
import com.example.coffix.ui.theme.LightBrown

@Composable
fun WelcomeScreen(){
    Box(modifier = Modifier.fillMaxSize().background(Color.Black)){
        Image(painter = painterResource(R.drawable.image_splash), contentDescription = null)

        Column(modifier = Modifier.fillMaxSize().padding(vertical = 50.dp, horizontal = 24.dp ),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Bottom) {

            Text(
                text = "Fall in Love With Coffe in Blissful Delight",
                fontWeight = FontWeight.Bold,
                color = Color.White,
                fontSize = 28.sp,
                textAlign = TextAlign.Center

            )

            Spacer(modifier = Modifier.height(16.dp))
            Text(text = "Welcome to our Coffix a coffe corner where every cup is delight for you ",
                fontSize = 12.sp,
                color = Color.LightGray,
                textAlign = TextAlign.Center)

            Spacer(modifier = Modifier.height(20.dp))
            Button(onClick = {},
                modifier = Modifier.fillMaxWidth().padding(14.dp).height(50.dp),
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(containerColor = LightBrown)) {
                        Text(text = "Get Started", fontWeight = FontWeight.Bold)
            }
        }
    }
}

@Composable
@Preview(showSystemUi = true)
fun PreviewHome(){
    WelcomeScreen()
}