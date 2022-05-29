package com.example.bowlingapp.screens

import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Scaffold
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.example.bowlingapp.navigation.BowlingScreens

@Composable
fun HomeScreen(navController: NavHostController) {

    Scaffold() {
        IconButton(onClick = { navController.navigate(route = BowlingScreens.GameScreen.name) }) {
            Icon(imageVector = Icons.Default.MoreVert, contentDescription = "More")
        }
    }
}
