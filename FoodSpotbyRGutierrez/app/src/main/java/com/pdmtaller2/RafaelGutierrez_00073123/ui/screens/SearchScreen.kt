package com.pdmtaller2.RafaelGutierrez_00073123.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import coil3.compose.rememberAsyncImagePainter
import com.pdmtaller2.RafaelGutierrez_00073123.ui.data.dummy.restaurants
import com.pdmtaller2.RafaelGutierrez_00073123.ui.navigations.navigations

@Composable
fun SearchScreen(navController: NavHostController) {
    var consulta by remember { mutableStateOf("") }
    val filteredRestaurants by remember(consulta) {
        derivedStateOf {
            val consultaMinus = consulta.lowercase()
            restaurants.filter { restaurant ->
                restaurant.name.lowercase().contains(consultaMinus) ||
                        restaurant.categories.any { it.lowercase().contains(consultaMinus) } ||
                        restaurant.menu.any { it.name.lowercase().contains(consultaMinus) }
            }
        }
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        OutlinedTextField(
            value = consulta,
            onValueChange = { consulta = it },
            label = { Text("Buscar restaurante, platillo o categoría") },
            modifier = Modifier.fillMaxWidth(),
            singleLine = true,
            shape = MaterialTheme.shapes.large
        )

        Spacer(modifier = Modifier.height(20.dp))

        LazyColumn(verticalArrangement = Arrangement.spacedBy(12.dp)) {
            items(filteredRestaurants) { restaurant ->
                ElevatedCard(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable {
                            navController.navigate("${navigations.Menu}/${restaurant.id}")
                        },
                    shape = MaterialTheme.shapes.medium,
                    elevation = CardDefaults.elevatedCardElevation(4.dp)
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(12.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            painter = rememberAsyncImagePainter(restaurant.ImageUrl),
                            contentDescription = restaurant.name,
                            modifier = Modifier
                                .size(80.dp)
                                .padding(end = 12.dp)
                                .clip(MaterialTheme.shapes.medium)
                        )
                        Column(
                            verticalArrangement = Arrangement.Center
                        ) {
                            Text(
                                text = restaurant.name,
                                style = MaterialTheme.typography.titleMedium,
                                fontWeight = FontWeight.Bold
                            )
                            Spacer(modifier = Modifier.height(4.dp))
                            Text(
                                text = restaurant.description,
                                style = MaterialTheme.typography.bodyMedium
                            )
                        }
                    }
                }
            }
        }
    }
}
