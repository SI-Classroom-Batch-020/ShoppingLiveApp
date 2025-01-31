package com.example.myshop.domain

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.myshop.data.ProductDatabase
import com.example.myshop.data.model.CartEntry
import com.example.myshop.data.model.Product
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

class ShopViewModel(application: Application) : AndroidViewModel(application) {

    private val dao = ProductDatabase.getDatabase(application).productDao()

    val allProducts = dao.getAllProducts().stateIn(
        scope = viewModelScope,
        started = SharingStarted.WhileSubscribed(),
        initialValue = emptyList()
    )

    val cart = dao.getCart().map { cart ->

        val result: MutableList<Pair<Product, Int>> = mutableListOf()

        cart.forEach { cartEntry ->
            //such mir Produkt und Anzahl raus
            val productId = cartEntry.productId
            val product = dao.getProduct(productId).first()
            val anzahl = cartEntry.amount

            result.add(Pair(product, anzahl))
        }

        return@map result.toList()
    }.stateIn(
        scope = viewModelScope,
        started = SharingStarted.WhileSubscribed(),
        initialValue = emptyList()
    )


    fun addToCart(product: Product) {
        viewModelScope.launch(Dispatchers.IO) {

            //Prüfen ob es schon existiert -> wenn ja dann amount + 1
            //wenn nein dann neu eintragen mit amount = 1

            val cartEntry = dao.getCartEntry(product.id).first()
            Log.d("CartDatabaseLog", "$cartEntry")
            if (cartEntry == null) {
                val newCartEntry = CartEntry(
                    productId = product.id,
                    amount = 1,
                )
                dao.insertCartEntry(newCartEntry)
            } else {
                val newCartEntry = cartEntry.copy(amount = cartEntry.amount + 1)
                dao.insertCartEntry(newCartEntry)
            }
        }
    }


}