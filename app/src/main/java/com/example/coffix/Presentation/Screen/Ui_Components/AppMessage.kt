package com.example.coffix.Presentation.Screen.Ui_Components

import androidx.compose.material3.AlertDialog
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable

@Composable
fun AppMessage(
    show: Boolean,
    title: String,
    message: String,
    onDismiss:()-> Unit
){

    if(show){
        AlertDialog(
            onDismissRequest = onDismiss,
            title={
                Text(text = title)
            },
            text={Text(text = message)},
            confirmButton = { TextButton(onClick = onDismiss){ Text("ok")} }
        )
    }

}