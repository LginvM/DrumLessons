package ru.loginov.drumlessons.bottom_navigation

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import ru.loginov.drumlessons.LoginScreen


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
        val currentRout = backStackEntry?.destination?.route
        listItems.forEach {
            item ->
            BottomNavigationItem(
                selected = currentRout == item.route,
                onClick = {
                    navController.navigate(item.route)
                },
                icon = {
                    Icon(painter = painterResource(id = item.iconId), contentDescription = "")               },
                label = {
                    Text(
                        text = item.title,fontSize = 9.sp
                    )
                },
                selectedContentColor = Color.Red,
                unselectedContentColor = Color.Gray
            )
        }
    }
}

@Composable
@Preview(showBackground = true)
private fun LoginPreview(){
    BottomNavigate(navController = { } as NavController)
}