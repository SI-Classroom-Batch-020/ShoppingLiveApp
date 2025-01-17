package com.example.myshop.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun HabitTracker(
    title: String,
    interval: String,
    color: Color,
    target: Int? = null,
    modifier: Modifier = Modifier,
) {

//    var counter : Int = 0
    var counter : Int by remember { mutableIntStateOf(0) }


    Card(
        modifier = modifier.padding(4.dp),
        colors = CardDefaults.cardColors().copy(containerColor = color)
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                modifier = Modifier.padding(2.dp),
                text = title,
                fontSize = 20.sp
            )
            Text(interval + " $counter Mal")
            Row() {
                Button(
                    modifier = Modifier
                        .size(100.dp)
                        .padding(2.dp),
                    shape = RectangleShape,
                    onClick = {
                        counter--
                    },
                    colors = ButtonDefaults.buttonColors().copy(containerColor = Color.Red)
                ) {
                    Text("-")
                }

                Button(
                    modifier = Modifier
                        .size(100.dp)
                        .padding(2.dp),
                    shape = RectangleShape,
                    onClick = {
                        counter++
                    },
                    colors = ButtonDefaults.buttonColors().copy(containerColor = Color.Green)
                ) {
                    Text("+")
                }
            }

            if (target != null) {
                Text("$interval $target Mal")
            }
        }
    }
}

@Preview
@Composable
private fun HabitTrackerPreview() {

    Surface(modifier = Modifier.fillMaxSize()) {
        HabitTracker(
            title = "Wasser trinken",
            interval = "Heute",
            color = Color(red = 82, green = 82, blue = 255, alpha = 186),
            target = 5
        )
    }

}