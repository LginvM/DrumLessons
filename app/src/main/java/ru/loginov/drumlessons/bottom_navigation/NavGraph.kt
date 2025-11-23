package ru.loginov.drumlessons.bottom_navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun NavGraph(
    navHostController: NavHostController
) {
    NavHost(navHostController = navHostController, startDestination = "Screen_1")
    {
        composable("Screen_1"){
            Screen1()
        }
    }
}