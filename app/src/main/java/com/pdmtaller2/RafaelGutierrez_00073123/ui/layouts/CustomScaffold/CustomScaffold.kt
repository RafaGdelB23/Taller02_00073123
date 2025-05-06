package com.pdmtaller2.RafaelGutierrez_00073123.ui.layouts.CustomScaffold

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.pdmtaller2.RafaelGutierrez_00073123.ui.data.dummy.restaurants
import com.pdmtaller2.RafaelGutierrez_00073123.ui.layouts.BottomBar.BottomBar
import com.pdmtaller2.RafaelGutierrez_00073123.ui.navigations.navigations
import com.pdmtaller2.RafaelGutierrez_00073123.ui.screens.ListScreen
import com.pdmtaller2.RafaelGutierrez_00073123.ui.screens.OrdersScreen
import com.pdmtaller2.RafaelGutierrez_00073123.ui.screens.SearchScreen
import com.pdmtaller2.RafaelGutierrez_00073123.ui.screens.MenuScreen

@Composable
fun CustomScaffold(navController: NavHostController) {
    Scaffold(
        bottomBar = {
            BottomBar(navController = navController)
        }
    ) { innerPadding ->
        Box(modifier = Modifier.padding(innerPadding)) {
            NavHost(
                navController = navController,
                startDestination = navigations.Listado
            ) {
                composable(navigations.Listado) {
                    ListScreen(restaurants = restaurants, navController = navController)
                }
                composable(navigations.Busqueda) { SearchScreen(navController = navController) }
                composable(navigations.Ordenes) { OrdersScreen() }
                composable("${navigations.Menu}/{restaurantId}") { backStackEntry ->
                    val restaurantId = backStackEntry.arguments?.getString("restaurantId")?.toIntOrNull()
                    if (restaurantId != null) {
                        MenuScreen(restaurantId = restaurantId.toString(), navController = navController)
                    }
                }
            }
        }
    }
}