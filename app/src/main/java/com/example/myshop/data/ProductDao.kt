package com.example.myshop.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.myshop.data.model.CartEntry
import com.example.myshop.data.model.Product
import kotlinx.coroutines.flow.Flow


@Dao
interface ProductDao {

    @Query("SELECT * FROM products")
    fun getAllProducts() : Flow<List<Product>>

    @Query("SELECT * FROM products WHERE id=:productId")
    fun getProduct(productId: Long) : Flow<Product>

    @Query("SELECT * FROM cart")
    fun getCart() : Flow<List<CartEntry>>

    //Insert & Update gleichzeitig -> Upsert
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertCartEntry(cartEntry : CartEntry)

    @Query("SELECT * FROM cart WHERE productId=:productId")
    fun getCartEntry(productId : Long) : Flow<CartEntry?>


    //getAllAngebote

    //getAllStandardProdukte

    //Insert

    //Delete Product

    //Delete All

}