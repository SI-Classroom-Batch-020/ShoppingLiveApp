package com.example.myshop.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "products")
data class Product (

    @PrimaryKey(autoGenerate = true)
    val id : Long = 0,

    val name: String,
    val description: String,
    val price: Double,
    val reduziert : Double = 0.0, // Bei Angeboten ungleich 0.0
)


