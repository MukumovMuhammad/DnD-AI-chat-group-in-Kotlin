package com.example.dndaichatgroup.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

@Composable
fun registration_page(){

    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var confirm_password by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }


    Box(
        modifier = Modifier.fillMaxSize()
    ){

        Column {
            Text(text = "Welcome to The Digital DM")

            OutlinedTextField(value = username, onValueChange = {
                username = it
            }, label = {
                Text(text = "Username")
            })

        }

    }
}