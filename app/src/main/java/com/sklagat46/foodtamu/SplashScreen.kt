package com.sklagat46.foodtamu

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.view.ViewCompat.setBackground
import com.sklagat46.foodtamu.ui.theme.FoodTamuTheme

class SplashScreen : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FoodTamuTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxWidth(),
                    color = MaterialTheme.colors.background
                ) {
                    SetBackground()
                }
            }
        }
    }
}

@Composable
fun Greeting2(name: String) {
    Text(text = "Hello $name!")
}

@Composable
fun SetBackground(){
    Image(
        painter = painterResource(id = R.drawable.splash_screen__3_),
        contentDescription = null,
        modifier = Modifier
            .fillMaxSize()
    )
}



@Preview(showBackground = true)
@Composable
fun DefaultPreview2() {
    FoodTamuTheme {
        SetBackground()
    }
}