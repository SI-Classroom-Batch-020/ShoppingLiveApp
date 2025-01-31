package com.example.myshop.ui.screens

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.myshop.data.model.Product

@Composable
fun OrderScreen(
    cart: List<Pair<Product,Int>>,
    modifier: Modifier = Modifier
) {

    LazyColumn(modifier = modifier) {
        items(cart) { item ->
            val product = item.first
            val amount = item.second

            Text("${product.name} : $amount")

        }
    }


}