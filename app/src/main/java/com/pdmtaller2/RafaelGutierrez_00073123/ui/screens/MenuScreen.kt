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
import androidx.compose.ui.draw.clip
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
                title = { Text(restaurant?.name ?: "", maxLines = 1) },
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Volver")
                    }
                }
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .padding(paddingValues)
                .padding(16.dp)
                .fillMaxSize()
        ) {
            Text(
                text = restaurant?.description ?: "",
                style = MaterialTheme.typography.bodyMedium,
                modifier = Modifier.padding(bottom = 8.dp)
            )

            OutlinedTextField(
                value = search,
                onValueChange = { search = it },
                label = { Text("Buscar platillo") },
                singleLine = true,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 16.dp),
                shape = MaterialTheme.shapes.large
            )

            LazyColumn(verticalArrangement = Arrangement.spacedBy(12.dp)) {
                items(restaurant?.menu?.filter { it.name.contains(search, ignoreCase = true) } ?: emptyList()) { dish ->
                    val isInCart = cartState[dish.id] ?: false

                    ElevatedCard(
                        modifier = Modifier.fillMaxWidth(),
                        shape = MaterialTheme.shapes.medium
                    ) {
                        Column(
                            modifier = Modifier
                                .padding(12.dp)
                                .fillMaxWidth()
                        ) {
                            Image(
                                painter = rememberAsyncImagePainter(model = dish.ImageUrl),
                                contentDescription = dish.name,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(180.dp)
                                    .padding(bottom = 8.dp)
                                    .clip(MaterialTheme.shapes.medium)
                            )
                            Text(
                                text = dish.name,
                                style = MaterialTheme.typography.titleMedium,
                                fontWeight = FontWeight.Bold
                            )
                            Spacer(modifier = Modifier.height(4.dp))
                            Text(
                                text = dish.description,
                                style = MaterialTheme.typography.bodySmall
                            )
                            Spacer(modifier = Modifier.height(12.dp))
                            Button(
                                onClick = {
                                    cartState[dish.id] = !isInCart
                                    val message = if (isInCart)
                                        "${dish.name} removido del carrito"
                                    else
                                        "${dish.name} agregado al carrito"
                                    Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
                                },
                                modifier = Modifier.align(Alignment.End)
                            ) {
                                Text(if (isInCart) "Remover del carrito" else "Agregar al carrito")
                            }
                        }
                    }
                }
            }
        }
    }
}
