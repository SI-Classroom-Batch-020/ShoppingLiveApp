package com.example.myshop

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.myshop.domain.ShopViewModel
import com.example.myshop.ui.screens.OrderScreen
import com.example.myshop.ui.screens.ShoppingScreen
import com.example.myshop.ui.theme.MyShopTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            val viewModel : ShopViewModel = viewModel()

            val productList by viewModel.allProducts.collectAsState()
            val cart by viewModel.cart.collectAsState()

            MyShopTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                ) { innerPadding ->

//                    ShoppingScreen(
//                        productList = productList,
//                        cart = cart,
//                        productClicked = { product ->
//                            viewModel.addToCart(product)
//                        },
//                        modifier = Modifier.padding(innerPadding)
//                    )

                    OrderScreen(
                        cart = cart,
                        modifier = Modifier.padding(innerPadding)
                    )


                }
            }
        }
    }
}

