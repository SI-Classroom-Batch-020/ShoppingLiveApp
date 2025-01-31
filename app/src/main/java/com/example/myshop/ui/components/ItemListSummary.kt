package com.example.myshop.ui.components

import android.annotation.SuppressLint
import androidx.compose.material3.ListItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myshop.data.model.Product

@SuppressLint("DefaultLocale")
@Composable
fun ItemListSummary(
    cart: List<Pair<Product, Int>>,
    modifier: Modifier = Modifier
) {

    ListItem(
        headlineContent = {
            Text("${cart.sumOf { it.second }} Gegenstände im Warenkorb")
        },
        supportingContent = {
            Text(
                "Gesamtpreis ${
                    String.format("%.2f", cart.sumOf { pair ->
                        pair.first.price * pair.second
                    })
                }€"
            )
        }
    )
}

@Preview
@Composable
private fun ItemListSummaryPreview() {
    ItemListSummary(
        cart = listOf(
            Pair(
                Product(
                    name = "Test 1",
                    description = "Description",
                    price = 2.99
                ), 2
            ),
            Pair(
                Product(
                    name = "Test 1",
                    description = "Description",
                    price = 1.99
                ), 5
            ),
            Pair(
                Product(
                    name = "Test 1",
                    description = "Description",
                    price = 5.99
                ), 1
            ),
        )
    )
}