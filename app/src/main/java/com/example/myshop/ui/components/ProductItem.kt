package com.example.myshop.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.ListItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myshop.data.model.Product


@Composable
fun ProductItem(
    product: Product,
    itemClicked: (Product) -> Unit,
    modifier: Modifier = Modifier
) {


    Card(
        modifier = modifier
            .padding(4.dp)
            .clickable {
                itemClicked(product)
            }
    ) {
        ListItem(
            headlineContent = {
                Text(product.name)
            },
            supportingContent = {
                Text(product.description)
            },
            trailingContent = {
                Text(String.format("%.2f", product.price) + "€")
            }
        )
    }
}


@Preview
@Composable
private fun ProductItemPreview() {

    ProductItem(
        Product(
            name = "Product",
            description = "Description",
            price = 4.99
        ),
        itemClicked = {})


}