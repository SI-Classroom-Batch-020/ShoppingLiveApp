package com.example.myshop

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myshop.ui.screens.HabitTrackerScreen
import com.example.myshop.ui.screens.ShoppingScreen
import com.example.myshop.ui.theme.MyShopTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyShopTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                    ShoppingScreen(modifier = Modifier.padding(innerPadding))

                }
            }
        }
    }
}

