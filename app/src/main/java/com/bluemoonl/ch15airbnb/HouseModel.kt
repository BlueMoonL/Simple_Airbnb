package com.bluemoonl.ch15airbnb

data class HouseModel(
    val id: Int,
    val title: String,
    val price: String,
    val imgUrl: String,
    val lat: Double,
    val lng: Double
)
