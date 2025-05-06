package com.pdmtaller2.RafaelGutierrez_00073123.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
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
    val scrollState = rememberScrollState()

    val categorized = listOf(
        "🍕 Pizzas" to "pizzas",
        "🌮 Comida Mexicana" to "comida mexicana",
        "🍝 Comida Italiana" to "comida italiana",
        "🍣 Comida Asiática" to "comida asiática",
        "🥗 Comida Saludable" to "comida saludable",
        "🍰 Postres y Dulces" to "postres",
        "🥤 Bebidas" to "bebidas"
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrollState)
            .padding(8.dp)
    ) {
        categorized.forEach { (title, category) ->
            val filtered = restaurants.filter { it.categories.any { it.equals(category, ignoreCase = true) } }
            if (filtered.isNotEmpty()) {
                CategoryRow(title = title, restaurants = filtered, navController = navController)
                Spacer(modifier = Modifier.height(12.dp))
            }
        }
    }
}

@Composable
fun CategoryRow(title: String, restaurants: List<Restaurant>, navController: NavController) {
    Column(modifier = Modifier.fillMaxWidth()) {
        Text(
            text = title,
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
        )

        LazyRow(
            contentPadding = PaddingValues(horizontal = 8.dp),
            horizontalArrangement = Arrangement.spacedBy(12.dp),
        ) {
            items(restaurants) { restaurant ->
                ElevatedCard(
                    modifier = Modifier
                        .width(200.dp)
                        .clickable {
                            navController.navigate("${navigations.Menu}/${restaurant.id}")
                        },
                    shape = MaterialTheme.shapes.medium
                ) {
                    Column(modifier = Modifier.padding(8.dp)) {
                        Image(
                            painter = rememberAsyncImagePainter(model = restaurant.ImageUrl),
                            contentDescription = restaurant.name,
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(120.dp)
                                .clip(MaterialTheme.shapes.medium)
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                        Text(
                            text = restaurant.name,
                            style = MaterialTheme.typography.titleMedium,
                            fontWeight = FontWeight.SemiBold,
                            maxLines = 2
                        )
                    }
                }
            }
        }
    }
}

