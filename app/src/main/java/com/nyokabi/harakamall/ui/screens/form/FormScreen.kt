package com.nyokabi.harakamall.ui.screens.form

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.navigation.ROUT_DASHBOARD
import com.nyokabi.harakamall.R
import com.nyokabi.harakamall.ui.theme.neworange

@Composable
fun FormScreen(navController: NavController){
    Column (
        modifier = Modifier
            .fillMaxSize().paint(painter = painterResource(R.drawable.ic_launcher_background), contentScale = ContentScale.FillBounds),


        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
        ){


        Image(
            painter = painterResource(R.drawable.product),
            contentDescription = "home",
            modifier = Modifier.size(200.dp)
        )


        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Create An Account",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(20.dp))

        //Variable
        var fullname by remember { mutableStateOf("") }
        var username by remember { mutableStateOf("") }
        var  email by remember { mutableStateOf("") }
        var  password by remember { mutableStateOf("") }
        var  confirmpassword by remember { mutableStateOf("") }

        //fullname
        OutlinedTextField(
            value = fullname,
            onValueChange = {fullname = it},
            modifier = Modifier.fillMaxWidth().padding(20.dp, end = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "", tint = neworange)},
            label = { Text(text = "FullName") },
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = neworange,
                focusedLabelColor = neworange,
                unfocusedBorderColor = Color.Black
            ),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )
        //end
        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField(
            value = username,
            onValueChange = {username = it},
            modifier = Modifier.fillMaxWidth().padding(20.dp, end = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Face, contentDescription = "", tint = neworange)},
            label = { Text(text = "Username") },
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = neworange,
                focusedLabelColor = neworange,
                unfocusedBorderColor = Color.Black
            ),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )
        //end
        Spacer(modifier = Modifier.height(10.dp))

        //email
        OutlinedTextField(
            value = email,
            onValueChange =  {email = it},
            modifier = Modifier.fillMaxWidth().padding(20.dp, end = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "", tint = neworange)},
            label = { Text(text = "Email") },
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = neworange,
                focusedLabelColor = neworange,
                unfocusedBorderColor = Color.Black
            ),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
        )
        //end
        Spacer(modifier = Modifier.height(10.dp))

        //password
        OutlinedTextField(
            value = password,
            onValueChange =  {password = it},
            modifier = Modifier.fillMaxWidth().padding(20.dp, end = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "", tint = neworange)},
            label = { Text(text = "password") },
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = neworange,
                focusedLabelColor = neworange,
                unfocusedBorderColor = Color.Black
            ),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            visualTransformation = PasswordVisualTransformation()
        )
        //end
        Spacer(modifier = Modifier.height(10.dp))

        //confirmpassword
        OutlinedTextField(
            value = confirmpassword,
            onValueChange =  {confirmpassword = it},
            modifier = Modifier.fillMaxWidth().padding(20.dp, end = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "", tint = neworange)},
            label = { Text(text = "Confirmpassword") },
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = neworange,
                focusedLabelColor = neworange,
                unfocusedBorderColor = Color.Black
            ),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            visualTransformation = PasswordVisualTransformation()
        )
        //end
        Spacer(modifier = Modifier.height(10.dp))

        Button(onClick = {

        },
            colors = ButtonDefaults.buttonColors(neworange),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.fillMaxWidth().padding(start =20.dp, end = 20.dp)

        ) {
            Text( text = "Register")
        }


    }

}

@Preview(showBackground = true)
@Composable
fun FormScreenPreview(){
    FormScreen(rememberNavController())
}