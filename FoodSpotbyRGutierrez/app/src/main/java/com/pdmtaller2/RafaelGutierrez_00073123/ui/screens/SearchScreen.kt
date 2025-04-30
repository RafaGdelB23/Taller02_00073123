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

    Column(modifier = Modifier.fillMaxSize().padding(8.dp)) {
        OutlinedTextField(
            value = consulta,
            onValueChange = { consulta = it },
            label = { Text("Buscar restaurante, platillo o categoría") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))

        LazyColumn {
            items(filteredRestaurants) { restaurant ->
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 4.dp)
                        .clickable {
                            navController.navigate("${navigations.Menu}/${restaurant.id}")
                        }
                ) {
                    Row(modifier = Modifier.padding(8.dp), verticalAlignment = Alignment.CenterVertically) {
                        Image(
                            painter = rememberAsyncImagePainter(restaurant.ImageUrl),
                            contentDescription = restaurant.name,
                            modifier = Modifier
                                .size(80.dp)
                                .padding(end = 8.dp)
                        )
                        Column {
                            Text(restaurant.name, fontWeight = FontWeight.Bold)
                            Text(restaurant.description, style = MaterialTheme.typography.bodySmall)
                        }
                    }
                }
            }
        }
    }
}
