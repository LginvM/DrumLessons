package ru.loginov.drumlessons.bottom_navigation

import androidx.compose.material.BottomNavigation
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState

@Composable
fun BottomNavigate (
    navController: NavController
){
    val listItems = listOf(
        BottomItem.Screen1,
        BottomItem.Screen2,
        BottomItem.Screen3,
        BottomItem.Screen4
    )


    BottomNavigation(
        backgroundColor = Color.White
    ){
        val backStackEntry by navController.currentBackStackEntryAsState()
    }
}

