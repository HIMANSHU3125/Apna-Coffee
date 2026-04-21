package com.example.coffix

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.coffix.Presentation.Screen.Navigation.NavGraph
import com.example.coffix.ui.theme.CoffixTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CoffixTheme {
                NavGraph()

            }
        }
    }
}


