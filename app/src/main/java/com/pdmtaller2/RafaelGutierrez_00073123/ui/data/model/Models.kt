package com.pdmtaller2.RafaelGutierrez_00073123.ui.data.model

import com.pdmtaller2.RafaelGutierrez_00073123.ui.data.dummy.restaurants

data class Dish(
    val id: Int,
    val name: String,
    val description: String,
    val ImageUrl: String
)

data class Restaurant(
    val id: Int,
    val name: String,
    val description: String,
    val ImageUrl: String,
    val categories: List<String>,
    val menu: List<Dish>
)

fun getRestaurantById(id: Int): Restaurant? {
    return restaurants.find { it.id == id }
}
