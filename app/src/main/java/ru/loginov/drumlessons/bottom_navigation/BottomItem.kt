package ru.loginov.drumlessons.bottom_navigation

import ru.loginov.drumlessons.R

sealed class BottomItem(val title: String, val iconId: Int, val route: String) {
    object Screen1: BottomItem("Screen1", R.drawable.home,"Screen_1")
    object Screen2: BottomItem("Screen2", R.drawable.home,"Screen_2")
    object Screen3: BottomItem("Screen3", R.drawable.home,"Screen_3")
    object Screen4: BottomItem("Screen4", R.drawable.home,"Screen_4")
}