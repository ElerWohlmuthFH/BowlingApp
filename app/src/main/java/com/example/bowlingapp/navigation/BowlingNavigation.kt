package com.example.bowlingapp.navigation

import androidx.compose.runtime.Composable
import androidx.lifecycle.ViewModel

import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.bowlingapp.screens.GameScreen
import com.example.bowlingapp.screens.HomeScreen
import com.example.bowlingapp.screens.StatisticsScreen

@Composable
fun BowlingNavigation(){

    val navController = rememberNavController()

    val bowlingViewModel: ViewModel = viewModel()

    NavHost(navController = navController, startDestination = BowlingScreens.HomeScreen.name){
        composable(route = BowlingScreens.HomeScreen.name){
            HomeScreen(navController)
        }

        composable(route = BowlingScreens.GameScreen.name){
            GameScreen(navController)
        }

        composable(route = BowlingScreens.StatisticsScreen.name){
            StatisticsScreen(navController)
        }


    }
}