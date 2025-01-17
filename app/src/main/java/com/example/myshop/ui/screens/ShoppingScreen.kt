package com.example.myshop.ui.screens

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.ListItem
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myshop.data.Product
import com.example.myshop.data.itemList
import com.example.myshop.ui.components.ItemListSummary
import com.example.myshop.ui.components.ProductItem


@Composable
fun ShoppingScreen(modifier: Modifier = Modifier) {
    //Jedes Composable erhält 'modifier : Modifier = Modifier' als Parameter

    var warenkorb: List<Product> by remember {
        mutableStateOf(
            listOf()
        )
    }



    Surface(
        modifier = modifier.fillMaxSize()
    ) {
        Column() {

            ProductItem(
                product = itemList[0],
                itemClicked = { clickedProduct ->


                    //So funktioniert es aber es ist schöner wenn die Funktion
                    //das geklickte Product als Parameter erhält
//                    warenkorb.add(itemList[0])

                    warenkorb = warenkorb + clickedProduct

                },
            )
            ProductItem(
                itemList[1],
                itemClicked = {
                    warenkorb = warenkorb + it
                    Log.d("WarenkorbLog", "$warenkorb")
                },
            )
            ProductItem(
                itemList[2],
                itemClicked = { warenkorb = warenkorb + it},
            )
            ProductItem(
                itemList[3],
                itemClicked = { warenkorb = warenkorb + it })
            ProductItem(
                itemList[4],
                itemClicked = { warenkorb = warenkorb + it })

            Spacer(Modifier.weight(1f))

            ItemListSummary(warenkorb)


        }

    }
}

@Preview
@Composable
private fun ShoppingScreenPreview() {

    ShoppingScreen()


}
