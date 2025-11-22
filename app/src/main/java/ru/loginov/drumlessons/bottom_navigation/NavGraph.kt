package ru.loginov.drumlessons.bottom_navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost

@Composable
fun NavGraph(
    navHostController: NavHostController
) {
    NavHost(
        navHostController = navHostController, startDestination = "screen_1"
    ) {

    }
}