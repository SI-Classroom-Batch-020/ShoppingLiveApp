package com.example.myshop.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.myshop.ui.components.HabitTracker

@Composable
fun HabitTrackerScreen(modifier: Modifier = Modifier) {


    Surface(
        modifier = modifier.fillMaxSize()
    ) {

        Column() {
            HabitTracker(
                title = "Wasser trinken",
                interval = "Heute",
                color = Color(red = 82, green = 82, blue = 255, alpha = 186),

                )

            HabitTracker(
                title = "Früh aufstehen",
                interval = "Diese Woche",
                color = Color.Yellow,
                target = 5,
            )

            HabitTracker(
                title = "Stunden ferngesehen",
                interval = "Heute",
                color = Color.LightGray,
                target = 2,
            )
        }

    }


}


@Preview
@Composable
private fun ShoppingScreenPreview() {

    HabitTrackerScreen()


}