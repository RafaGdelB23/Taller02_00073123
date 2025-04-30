package com.pdmtaller2.RafaelGutierrez_00073123.ui.screens

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil3.compose.rememberAsyncImagePainter
import com.pdmtaller2.RafaelGutierrez_00073123.ui.data.model.getRestaurantById

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MenuScreen(restaurantId: String, navController: NavController) {
    val restaurant = getRestaurantById(restaurantId.toInt())
    val context = LocalContext.current
    var search by remember { mutableStateOf("") }
    val cartState = remember { mutableStateMapOf<Int, Boolean>() }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(restaurant?.name ?: "") },
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Volver")
                    }
                }
            )
        }
    ) { paddingValues ->
        Column(modifier = Modifier.padding(paddingValues)) {
            Text(
                text = restaurant?.description ?: "",
                modifier = Modifier.padding(8.dp),
                style = MaterialTheme.typography.bodyMedium
            )

            OutlinedTextField(
                value = search,
                onValueChange = { search = it },
                label = { Text("Buscar platillo") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            )

            LazyColumn(modifier = Modifier.fillMaxSize()) {
                items(restaurant?.menu?.filter { it.name.contains(search, ignoreCase = true) } ?: emptyList()) { dish ->
                    val isInCart = cartState[dish.id] ?: false
                    Card(modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp)) {
                        Column(
                            modifier = Modifier
                                .padding(8.dp)
                                .fillMaxWidth(),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Image(
                                painter = rememberAsyncImagePainter(model = dish.ImageUrl),
                                contentDescription = dish.name,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(150.dp)
                            )
                            Spacer(modifier = Modifier.height(8.dp))
                            Text(dish.name, fontWeight = FontWeight.Bold)
                            Text(dish.description, style = MaterialTheme.typography.bodySmall)
                            Spacer(modifier = Modifier.height(8.dp))
                            Button(
                                onClick = {
                                    cartState[dish.id] = !isInCart
                                    val message = if (isInCart) "${dish.name} removido del carrito" else "${dish.name} agregado al carrito"
                                    Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
                                },
                                modifier = Modifier.padding(top = 8.dp),
                            ) {
                                Text(if (isInCart) "${dish.name} agregado al carrito" else "Agregar al carrito")
                            }
                        }
                    }
                }
            }
        }
    }
}
