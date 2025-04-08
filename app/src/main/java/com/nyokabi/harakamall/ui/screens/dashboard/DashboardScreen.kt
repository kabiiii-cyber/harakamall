package com.nyokabi.harakamall.ui.screens.dashboard

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
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.nyokabi.harakamall.R
import com.nyokabi.harakamall.ui.theme.neworange
import com.nyokabi.harakamall.ui.theme.neworange1
import com.nyokabi.harakamall.ui.theme.newwblack

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DashboardScreen(navController: NavController){

    Column(
        modifier = Modifier.fillMaxSize().background(neworange)
    ) {
      // box
       Box (){

           //card
           Card(
               modifier = Modifier.fillMaxWidth().height(300.dp),
               shape = RoundedCornerShape(bottomStart = 60.dp, bottomEnd = 60.dp),
               colors = CardDefaults.cardColors(neworange1)

           ) {

               TopAppBar(
                   title = { Text(text = "Dashboard Section") },
                   navigationIcon = {
                       IconButton(onClick = {}) {
                           Icon(imageVector = Icons.Default.Menu, contentDescription = "")
                       }
                   }
               )

           }
           //end of card


           Card( modifier = Modifier
               .fillMaxWidth()
               .height(180.dp)
               .align(alignment = Alignment.BottomCenter)
               .padding(start = 20.dp, end = 20.dp)
               .offset(y =90.dp),
               colors = CardDefaults.cardColors(newwblack)
           ) {
               //content of card
             
           }

       }
     //end of box


        Spacer(modifier = Modifier.width(20.dp))


        //Row

        Row (modifier = Modifier.padding(start =20.dp)){

            //card
                       Card (
                           modifier = Modifier.width(150.dp).height(180.dp),
                           elevation = CardDefaults.cardElevation()
                       ){
                           Column (
                               modifier = Modifier.fillMaxSize(),
                               horizontalAlignment = Alignment.CenterHorizontally,
                               verticalArrangement = Arrangement.Center
                           ){

                             Image(
                                       painter = painterResource(R.drawable.kk),
                                       contentDescription = "home",
                                       modifier = Modifier.size(100.dp)
                                   )
                                                Text(text = "HOME", fontSize =15.sp )
                           }
                       }
            //end of card1


            Spacer(modifier = Modifier.width(20.dp))







            //card2
                            Card (                                                            
                                modifier = Modifier.width(150.dp).height(180.dp),             
                                elevation = CardDefaults.cardElevation()                      
                            ){                                                                
                                Column (                                                      
                                    modifier = Modifier.fillMaxSize(),                        
                                    horizontalAlignment = Alignment.CenterHorizontally,       
                                    verticalArrangement = Arrangement.Center                  
                                ){                                                            
                                                                                              
                                  Image(                                                      
                                            painter = painterResource(R.drawable.aabout),
                                            contentDescription = "about",
                                            modifier = Modifier.size(100.dp)                  
                                        )                                                     
                                                     Text(text = "ABOUT", fontSize =15.sp )
                                }                                                             
                            }                                                                 
                 //end of card2

                              }
                   //end of row



        Spacer(modifier = Modifier.height(20.dp))


        //row2




        Row (modifier = Modifier.padding(start =20.dp)){

            //card3
            Card (
                modifier = Modifier.width(150.dp).height(180.dp),
                elevation = CardDefaults.cardElevation()
            ){
                Column (
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ){

                    Image(
                        painter = painterResource(R.drawable.contacts),
                        contentDescription = "contacts",
                        modifier = Modifier.size(100.dp)
                    )
                    Text(text = "CONTACTS", fontSize =15.sp )
                }
            }
            //end of card3



            Spacer(modifier = Modifier.width(20.dp))






            //card4
            Card (
                modifier = Modifier.width(150.dp).height(180.dp),
                elevation = CardDefaults.cardElevation()
            ){
                Column (
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ){

                    Image(
                        painter = painterResource(R.drawable.about),
                        contentDescription = "product",
                        modifier = Modifier.size(100.dp)
                    )
                    Text(text = "PRODUCT", fontSize =15.sp )
                }
            }
            //end of card4

        }


        //end of row2


            









      


























    }



}

@Preview(showBackground = true)
@Composable
fun DashboardScreenPreview(){
    DashboardScreen(rememberNavController())
}