package ru.loginov.drumlessons

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LoginScreen() {

    val radialGradientBrush = Brush.radialGradient(
        colors = listOf(Color(0xff403E3E),Color(0xff403E3E), Color(0xFF403E3E), Color(0xffFF2222),Color(0xff403E3E),Color(0xff403E3E),), // List of colors for the gradient
        center = androidx.compose.ui.geometry.Offset(
            550f,
            750f
        ), // Center of the gradient (0.0 to 1.0)
        radius = 740f, // Radius of the gradient in pixels
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
                Text(text = "Email addres",
                    color = Color.White)
            },
            leadingIcon = {
            },
            shape = RoundedCornerShape(12.dp)
        )

        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(

            value = "",
            onValueChange = {},
            label = {
                Text(text = "Password",
                    color = Color.White)
                    },
            shape = RoundedCornerShape(12.dp),
            leadingIcon = {
            },


        )
        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = { /* Handle button click */ },
            modifier = Modifier.width(200.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(red = 255, green = 34, blue = 34), // Background color when enabled
                contentColor = Color.White, // Text/icon color when enabled
                disabledContainerColor = Color.Gray, // Background color when disabled
                disabledContentColor = Color.LightGray // Text/icon color when disabled
            )

        ) {
            Text("Вход")
        }

        Spacer(modifier = Modifier.height(12.dp))

        Text( text = "Забыли пароль?",
            color = MaterialTheme.colorScheme.primary,
            modifier = Modifier.clickable{
            },
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(16.dp))

        Row{
            Text( text = "Нет аккаунта? ",
                color = MaterialTheme.colorScheme.onSecondary,
                fontSize = 16.sp)

            Text( text = "Регистрируйся!",
                color = MaterialTheme.colorScheme.primary,
                modifier = Modifier.clickable{
                },
                fontSize = 16.sp)
        }
    }

}



@Composable
@Preview(showBackground = true)
private fun LoginPreview(){
    LoginScreen()
}



