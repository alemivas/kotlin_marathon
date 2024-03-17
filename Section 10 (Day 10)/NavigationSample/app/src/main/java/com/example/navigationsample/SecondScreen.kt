package com.example.navigationsample

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SecondScreen(name: String, /*age: String, */navigationToFirstScreen:(String) -> Unit/*, navigationToThirdScreen:() -> Unit*/){

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Second screen", fontSize = 24.sp)
        Text("Welcome $name", fontSize = 24.sp)
//        Text("Age $age", fontSize = 24.sp)

        Button(onClick = {
            navigationToFirstScreen(name/*, age*/)
        }) {
            Text("Go to 1 screen")
        }

//        Button(onClick = {
//            navigationToThirdScreen(name)
//        }) {
//            Text("Go to 3 screen")
//        }
    }
}

@Preview(showBackground = true)
@Composable
fun SecondPreview(){
    SecondScreen("Denis", /*"18", */{}/*, {}*/)
}


