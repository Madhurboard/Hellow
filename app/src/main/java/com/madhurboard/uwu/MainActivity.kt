package com.madhurboard.uwu

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.madhurboard.uwu.ui.theme.GreenA
import com.madhurboard.uwu.ui.theme.Purple1
import com.madhurboard.uwu.ui.theme.UwUTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UwUTheme {
                MyScreen()
            }
        }
    }
}

@Composable
fun MyScreen(
){
    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ){
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(26.dp)
                .height(200.dp),
            backgroundColor = Purple1,
            elevation = 10.dp,
            shape = RoundedCornerShape(30.dp)
        ){
            Column {
                Myrow1()
                Myrow2()
            }
        }

    }
}
@Composable
fun Myrow1(){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ){
        Text(
            text = "Madhur's \nAndroid",
            fontSize = 25.sp,
            color = Color.White,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.padding(20.dp))
        Image(painter = painterResource(id = R.drawable.gdsc_logo), contentDescription ="GDSC logo")

    }
}
@Composable
fun Myrow2(){
    Row(
        modifier = Modifier
            .fillMaxWidth()
    ){
        Image(painter = painterResource(id = R.drawable.android_logo), contentDescription ="Android logo")
        Spacer(modifier = Modifier.padding(20.dp))
        Column(
            verticalArrangement = Arrangement.Bottom
        ) {
            Text(

                text = "madhurpatil73@gmail.com\nAndroid Compose Camp\n2024",
                textAlign = TextAlign.Right,
                fontSize = 10.sp,
                color = Color.Black,
                fontWeight = FontWeight.Bold,
            )
        }
    }
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    UwUTheme {
        MyScreen()
    }
}