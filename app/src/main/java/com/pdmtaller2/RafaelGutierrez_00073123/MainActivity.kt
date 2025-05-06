package com.pdmtaller2.RafaelGutierrez_00073123

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.rememberNavController
import com.pdmtaller2.RafaelGutierrez_00073123.ui.layouts.CustomScaffold.CustomScaffold
import com.pdmtaller2.RafaelGutierrez_00073123.ui.theme.FoodSpotByRGutierrezTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()
            FoodSpotByRGutierrezTheme {
                CustomScaffold(navController = navController)
            }
        }
    }
}
