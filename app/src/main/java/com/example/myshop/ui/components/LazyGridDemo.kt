package com.example.myshop.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.itemsIndexed
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LazyGridDemo(modifier: Modifier = Modifier) {

    val colors = listOf(
        Color.DarkGray, Color.LightGray, Color.Gray,
        Color.DarkGray, Color.LightGray, Color.Gray,
        Color.DarkGray, Color.LightGray, Color.Gray,
        Color.DarkGray, Color.LightGray, Color.Gray,
        Color.DarkGray, Color.LightGray, Color.Gray,
        Color.DarkGray, Color.LightGray, Color.Gray,
        Color.DarkGray, Color.LightGray, Color.Gray,
        Color.DarkGray, Color.LightGray, Color.Gray,
        Color.DarkGray, Color.LightGray, Color.Gray,
        Color.DarkGray, Color.LightGray, Color.Gray,
        Color.DarkGray, Color.LightGray, Color.Gray,
        Color.DarkGray, Color.LightGray, Color.Gray,
        Color.DarkGray, Color.LightGray, Color.Gray,
        Color.DarkGray, Color.LightGray, Color.Gray,
        Color.DarkGray, Color.LightGray, Color.Gray,
        Color.DarkGray, Color.LightGray, Color.Gray,
        Color.DarkGray, Color.LightGray, Color.Gray,
        Color.DarkGray, Color.LightGray, Color.Gray,
        Color.DarkGray, Color.LightGray, Color.Gray,
    )

    LazyVerticalGrid(
        modifier = modifier,
        columns = GridCells.FixedSize(80.dp)
    ) {
        itemsIndexed(colors) { index, color ->
            var width = 80.dp

            if(index == 6) {
                width = 160.dp
            }

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(80.dp)
                    .width(width)
                    .background(color)
            ) {
                Text("i: $index", fontSize = 30.sp)
            }
        }
    }
}
