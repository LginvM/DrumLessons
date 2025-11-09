package ru.loginov.drumlessons

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter.Companion.tint
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun LoginScreen() {

    val radialGradientBrush = Brush.radialGradient(
        colors = listOf(Color(0xff403E3E),Color(0xff403E3E), Color(0xff808080), Color(0xffFFB266),Color(0xff403E3E),Color(0xff403E3E),), // List of colors for the gradient
        center = androidx.compose.ui.geometry.Offset(
            550f,
            750f
        ), // Center of the gradient (0.0 to 1.0)
        radius = 750f, // Radius of the gradient in pixels
        tileMode = androidx.compose.ui.graphics.TileMode.Clamp // How the gradient repeats outside its bounds
    )

    Column(
        modifier = Modifier.fillMaxSize().background(radialGradientBrush),
//        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,

    ) {

        Image(painter = painterResource(R.drawable.logo),  contentDescription = null, modifier = Modifier.size(450.dp).padding(top=100.dp))

        Spacer(modifier = Modifier.height(25.dp))

        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = {
                Text(text = "Email addres")
            }
        )

        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = {
                Text(text = "Password")
            }
        )


    }

}



@Composable
@Preview(showBackground = true)
private fun LoginPreview(){
    LoginScreen()
}



