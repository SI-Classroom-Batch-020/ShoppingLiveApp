package com.example.myshop.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myshop.data.model.Product
import com.example.myshop.ui.components.ItemListSummary
import com.example.myshop.ui.components.ProductItem


@Composable
fun ShoppingScreen(
    productList: List<Product>,
    cart: List<Pair<Product, Int>>,
    productClicked : (Product) -> Unit = {},
    modifier: Modifier = Modifier
) {

    Surface(
        modifier = modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier.fillMaxHeight()
        ) {

            LazyColumn(
                modifier = Modifier.fillMaxHeight(0.9f)
            ) {

                items(productList) { product ->

                    ProductItem(
                        product = product,
                        itemClicked = productClicked,
                        modifier = Modifier
                    )

                }


            }

            Spacer(Modifier.weight(1f))

            ItemListSummary(cart)


        }

    }
}

@Preview
@Composable
private fun ShoppingScreenPreview() {

    ShoppingScreen(
        productList = listOf(
            Product(
                name = "Saure Schlangen 1",
                description = "Box 1kg",
                price = 10.0
            ),
            Product(
                name = "Saure Schlangen 2",
                description = "Box 1kg",
                price = 10.0
            ),
            Product(
                name = "Saure Schlangen 3",
                description = "Box 1kg",
                price = 10.0
            ),
        ),
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
