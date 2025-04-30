package com.pdmtaller2.RafaelGutierrez_00073123.ui.layouts.BottomBar

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.pdmtaller2.RafaelGutierrez_00073123.ui.navigations.navigations

@Composable
fun BottomBar(navController: NavHostController) {

    Row (modifier = Modifier
        .fillMaxWidth()
        .background(Color.Black)
        .padding(5.dp)
    ){
        Button(
            modifier = Modifier
                .weight(1f)
                .padding(2.dp),
            shape = RoundedCornerShape(0.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.White),
            onClick = { navController.navigate(navigations.Listado) }
        ) {
            Text(text = "Listado")
        }
        Button(
            modifier = Modifier
                .weight(1f)
                .padding(2.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.White),
            shape = RoundedCornerShape(0.dp),
            onClick = { navController.navigate(navigations.Busqueda)}
        ) {
            Text(text = "Busqueda")
        }
        Button(
            modifier = Modifier
                .weight(1f)
                .padding(2.dp),
            shape = RoundedCornerShape(0.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.White),
            onClick = { navController.navigate(navigations.Ordenes)}
        ) {
            Text(text = "Ordenes")
        }
    }
}

