package com.example.dndaichatgroup.components

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp


@Composable
fun registration_page(){

    val context = LocalContext.current
    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var confirm_password by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }


    Box(
        modifier = Modifier.fillMaxSize()
    ){

        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment =  Alignment.CenterHorizontally
        ) {
            Text(text = "Welcome to The Digital DM")

//            Usernames
            OutlinedTextField(value = username, onValueChange = {
                username = it
            }, label = {
                Text(text = "Username")
            })

            Spacer(modifier = Modifier.height(10.dp))

//            Email
            OutlinedTextField(value = email, onValueChange = {
                email = it
            }, label = {
                Text(text = "email")
            })

            Spacer(modifier = Modifier.height(10.dp))

//            Password
            OutlinedTextField(value = password, onValueChange = {
                password = it
            }, label = {
                Text(text = "password")
            })


            Spacer(modifier = Modifier.height(10.dp))

//            Confirm_password
            OutlinedTextField(value = confirm_password, onValueChange = {
                confirm_password = it
            }, label = {
                Text(text = "confirm_password")
            })

            Spacer(modifier = Modifier.height(10.dp))


            Button(
                modifier = Modifier,
                onClick = {
                    if (username.isEmpty() || password.isEmpty() || confirm_password.isEmpty() || email.isEmpty())
                    {
                        Toast.makeText(context, "Please fill in all fields", Toast.LENGTH_SHORT).show()
                        return@Button
                    }
                    if (password != confirm_password)
                    {
                        Toast.makeText(context, "Passwords do not match", Toast.LENGTH_SHORT).show()
                        return@Button
                    }

                    Toast.makeText(context, "Registration successful", Toast.LENGTH_SHORT).show()

                }
            ) {
                Text("Omina")
            }

        }

    }
}