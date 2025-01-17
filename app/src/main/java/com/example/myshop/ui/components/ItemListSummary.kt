package com.example.myshop.ui.components

import androidx.compose.material3.ListItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.myshop.data.Product

@Composable
fun ItemListSummary(
    warenkorb : List<Product>,
    modifier: Modifier = Modifier
) {

    ListItem(
        headlineContent = {
            Text("${warenkorb.size} Gegenstände im Warenkorb")
        },
        supportingContent = {
            Text("Gesamtpreis ${String.format("%.2f", warenkorb.sumOf { it.price })}€")
        }
    )



}