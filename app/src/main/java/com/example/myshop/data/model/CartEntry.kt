package com.example.myshop.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "cart")
data class CartEntry(

    @PrimaryKey(autoGenerate = true)
    val id : Long = 0,


    val productId: Long,
    val amount: Int,

    //val userId : Long



)