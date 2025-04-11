package com.nyokabi.harakamall.ui.screens.form1

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.nyokabi.harakamall.R
import com.nyokabi.harakamall.ui.theme.dblue
import com.nyokabi.harakamall.ui.theme.neworange
import com.nyokabi.harakamall.ui.theme.neworange1
import com.nyokabi.harakamall.ui.theme.newwhite

@Composable
fun Form1Screen(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize().verticalScroll(rememberScrollState()).background(dblue),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {

        Spacer(modifier = Modifier.height(40.dp))

         Row {
             Image(
                 painter = painterResource(R.drawable.img),
                 contentDescription = "home",
                 modifier = Modifier
                     .width(50.dp)
                     .height(50.dp),

                 contentScale = ContentScale.FillWidth
             )
             Spacer(modifier = Modifier.width(10.dp))


             Text(text = "Logo App",
                 fontSize = 30.sp,
                 color = Color.White
             )
         }

        Spacer(modifier = Modifier.height(20.dp))


        Image(
            painter = painterResource(R.drawable.img_4),
            contentDescription = "home",
            modifier = Modifier.size(200.dp)
        )



        Spacer(modifier = Modifier.height(100.dp))


        // box
        Box() {
       Column (
          horizontalAlignment = Alignment.CenterHorizontally,
          verticalArrangement = Arrangement.Center,
){
           //card
           Card(
               modifier = Modifier.fillMaxWidth().height(500.dp),

               shape = RoundedCornerShape(topStart = 30.dp, topEnd = 30.dp),
               colors = CardDefaults.cardColors(newwhite)

           ) {

               Text(text = "The Most Worth ",
                   fontSize = 30.sp,
                   color = Color.Red
               )
               Text(text = "Grocery App ",
                   fontSize = 30.sp,
                   color = Color.Red
               )
           }
       }


        }
    }
}
@Preview(showBackground = true)
@Composable
fun Form1ScreenPreview() {
    Form1Screen(rememberNavController())
        }