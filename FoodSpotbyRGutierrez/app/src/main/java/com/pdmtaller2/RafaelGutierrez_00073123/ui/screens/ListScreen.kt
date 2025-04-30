package com.pdmtaller2.RafaelGutierrez_00073123.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import coil3.compose.rememberAsyncImagePainter
import com.pdmtaller2.RafaelGutierrez_00073123.ui.data.model.Restaurant
import com.pdmtaller2.RafaelGutierrez_00073123.ui.navigations.navigations

@Composable
fun ListScreen(restaurants: List<Restaurant>, navController: NavHostController) {
    val quickFood = restaurants.filter { it.categories.any { category -> category.lowercase() == "pizzas" } }
    val mexicanFood = restaurants.filter { it.categories.any { category -> category.lowercase() == "comida mexicana" } }
    val italianFood = restaurants.filter { it.categories.any { category -> category.lowercase() == "comida italiana" } }
    val asianFood = restaurants.filter { it.categories.any { category -> category.lowercase() == "comida asiática" } }
    val healthyFood = restaurants.filter { it.categories.any { category -> category.lowercase() == "comida saludable" } }
    val desserts = restaurants.filter { it.categories.any { category -> category.lowercase() == "postres" } }
    val drinks = restaurants.filter { it.categories.any { category -> category.lowercase() == "bebidas" } }

    val scrollState = rememberScrollState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrollState)) {

        CategoryRow(title = "🍕 Pizzas", restaurants = quickFood, navController = navController)
        CategoryRow(title = "🌮 Comida Mexicana", restaurants = mexicanFood, navController = navController)
        CategoryRow(title = "🍝 Comida Italiana", restaurants = italianFood, navController = navController)
        CategoryRow(title = "🍣 Comida Asiática", restaurants = asianFood, navController = navController)
        CategoryRow(title = "🥗 Comida Saludable", restaurants = healthyFood, navController = navController)
        CategoryRow(title = "🍰 Postres y Dulces", restaurants = desserts, navController = navController)
        CategoryRow(title = "🥤 Bebidas", restaurants = drinks, navController = navController)
    }
}

@Composable
fun CategoryRow(title: String, restaurants: List<Restaurant>, navController: NavController) {
    Column(modifier = Modifier.padding(8.dp)) {
        Text(
            text = title,
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(4.dp)
        )
        LazyRow(
            contentPadding = PaddingValues(horizontal = 8.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            items(restaurants) { restaurant ->
                Card(
                    modifier = Modifier
                        .width(200.dp)
                        .padding(4.dp)
                        .clickable {
                            navController.navigate("${navigations.Menu}/${restaurant.id}")
                        }
                ) {
                    Column(modifier = Modifier.padding(8.dp)) {
                        Image(
                            painter = rememberAsyncImagePainter(model = restaurant.ImageUrl),
                            contentDescription = restaurant.name,
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(120.dp),
                            contentScale = ContentScale.Crop
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                        Text(
                            text = restaurant.name,
                            fontWeight = FontWeight.Bold,
                            style = MaterialTheme.typography.bodyLarge
                        )
                    }
                }
            }
        }
    }
}
