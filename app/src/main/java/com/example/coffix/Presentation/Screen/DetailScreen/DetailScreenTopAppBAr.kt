package com.example.coffix.Presentation.Screen.DetailScreen

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.coffix.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable

fun DetailScreenTopAppBar() {


    TopAppBar(
        title = { Text("Detail",
            modifier=Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold) },
        actions = {
            Icon(
                painter = painterResource(R.drawable.regular_outline_heart),
                contentDescription = "Add fav",
                modifier = Modifier.padding(8.dp)
            )
        },

    )
}


