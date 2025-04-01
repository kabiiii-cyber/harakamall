package com.nyokabi.harakamall.ui.screens.Home

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun HomeScreen(){

Column (){
    Text(
        text = "HarakaMall"
    )
    Text(
        text = "Welcome to my app"
    )
}



}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(){

HomeScreen()

}