package br.senai.sp.jandira.mytrips

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.BeachAccess
import androidx.compose.material.icons.filled.Landscape
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Snowboarding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.senai.sp.jandira.mytrips.screens.HomeTela
import br.senai.sp.jandira.mytrips.screens.LoginTela
import br.senai.sp.jandira.mytrips.screens.SingUpTela
import br.senai.sp.jandira.mytrips.ui.theme.MyTripsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyTripsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val controleDeNavegacao = rememberNavController()
                    NavHost(
                        navController = controleDeNavegacao,
                        startDestination = "home"
                    ){
                        composable(route = "signUp"){ SingUpTela(controleDeNavegacao)}
                        composable(route = "login"){ LoginTela(controleDeNavegacao) }
                        composable(route = "home"){ HomeTela(controleDeNavegacao) }
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    Column (
        modifier = Modifier
            .fillMaxSize()
    ){
        Row {
            Card (
                colors = CardDefaults.cardColors(containerColor = Color(0xFFCF06F0)),
                modifier = Modifier
                    .width(135.dp)
                    .height(40.dp)
                    .offset(x = 259.dp, y = 0.dp),
                shape = RoundedCornerShape(bottomStart = 16.dp)
            ){
            }
        }
        Text(
            text = "Login",
            color = Color(0xFFCF06F0),
            fontSize = 50.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .offset(x = 15.dp, y = 160.dp)
        )
        Text(
            text = "Please sign in to continue.",
            color = Color(0xFFA09C9C),
            fontSize = 16.sp,
            modifier = Modifier
                .offset(x = 15.dp, y = 158.dp),
        )
        OutlinedTextField(
            value = "teste@email.com",
            leadingIcon = {
                Image(
                    painter = painterResource(id = R.drawable.email),
                    contentDescription = "",
                    modifier = Modifier
                        .width(26.dp)
                        .height(26.dp)
                )
            },
            onValueChange = {},
            shape = RoundedCornerShape(16.dp),
            modifier = Modifier
                .width(362.dp)
                .height(65.dp)
                .offset(x = 15.dp, y = 240.dp),
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = Color(0xFFCF06F0),
                unfocusedTextColor = Color.Black,
                focusedTextColor = Color.Black,
                focusedBorderColor = Color(0xFFCF06F0)
            ),
            label = {
                Text(
                    text = "E-mail",
                    color = Color.Black,
                )
            }
        )
        OutlinedTextField(
            value = "************",
            leadingIcon = {
                Image(
                    painter = painterResource(id = R.drawable.cadeado),
                    contentDescription = "",
                    modifier = Modifier
                        .width(26.dp)
                        .height(26.dp)
                )
            },
            onValueChange = {},
            shape = RoundedCornerShape(16.dp),
            modifier = Modifier
                .width(362.dp)
                .height(65.dp)
                .offset(x = 15.dp, y = 265.dp),
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = Color(0xFFCF06F0),
                unfocusedTextColor = Color.Black,
                focusedTextColor = Color.Black,
                focusedBorderColor = Color(0xFFCF06F0)
            ),
            label = {
                Text(
                    text = "Password",
                    color = Color.Black,
                )
            }
        )
        Button(
            onClick = { /*TODO*/ },
            shape = RoundedCornerShape(16.dp),
            modifier = Modifier
                .width(135.dp)
                .height(50.dp)
                .offset(x = 245.dp, y = 300.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFCF06F0))
        ) {
            Text(
                text = "SIGN IN",
                fontSize = 17.sp,
                fontWeight = FontWeight.Bold
            )
            Spacer(
                modifier = Modifier
                    .width(9.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.seta),
                contentDescription = "",
                modifier = Modifier
                    .width(16.dp)
                    .height(16.dp),
            )
        }
        Text(
            text = "Don’t have an account?",
            fontSize = 13.sp,
            color = Color(0xFFA09C9C),
            modifier = Modifier
                .offset(x = 190.dp, y = 330.dp)
        )
        Text(
            text = "Sign up",
            fontSize = 13.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFFCF06F0),
            modifier = Modifier
                .offset(x = 335.dp, y = 313.dp)
        )
        Row (
            modifier = Modifier
                .fillMaxWidth()
        ){
            Card (
                colors = CardDefaults.cardColors(containerColor = Color(0xFFCF06F0)),
                modifier = Modifier
                    .width(135.dp)
                    .height(40.dp)
                    .offset(x = -1.dp, y = 395.dp),
                shape = RoundedCornerShape(topEnd = 20.dp)
            ){
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    MyTripsTheme {
        Greeting()
    }
}

@Composable
fun SignUp() {
    Column (
        modifier = Modifier
            .fillMaxSize()
    ) {
        Row {
            Card(
                colors = CardDefaults.cardColors(containerColor = Color(0xFFCF06F0)),
                modifier = Modifier
                    .width(135.dp)
                    .height(40.dp)
                    .offset(x = 259.dp, y = 0.dp),
                shape = RoundedCornerShape(bottomStart = 16.dp)
            ) {
            }
            Text(
                text = "Sign Up",
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFFCF06F0),
                modifier = Modifier
                    .offset(x = 0.dp, y = 50.dp)
            )
        }
        Text(
            text = "Create a new account",
            fontSize = 14.sp,
            color = Color(0xFFA09C9C),
            modifier = Modifier
                .offset(x = 120.dp, y = 50.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.imagem_borda),
            contentDescription = "",
            modifier = Modifier
                .offset(x = 145.dp, y = 70.dp)
                .width(100.dp)
                .height(100.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.profile),
            contentDescription = "",
            modifier = Modifier
                .offset(x = 164.dp, y = -12.dp)
                .width(64.dp)
                .height(64.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.camera),
            contentDescription = "",
            modifier = Modifier
                .offset(x = 219.dp, y = -20.dp)
                .width(28.dp)
                .height(28.dp)
            )
        OutlinedTextField(
            value = "Susanna Hoffs",
            leadingIcon = {
                Image(
                    painter = painterResource(id = R.drawable.username),
                    contentDescription = "",
                    modifier = Modifier
                        .width(22.dp)
                        .height(22.dp)
                    )
            },
            shape = RoundedCornerShape(16.dp),
            onValueChange = {},
            modifier = Modifier
                .width(362.dp)
                .height(60.dp)
                .offset(x = 15.dp, y = 0.dp),
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = Color(0xFFCF06F0),
                unfocusedTextColor = Color.Black,
                focusedTextColor = Color.Black,
                focusedBorderColor = Color(0xFFCF06F0)
            ),
            label = {
                Text(
                    text = "Username"
                )
            }
        )
        OutlinedTextField(
            value = "99999-0987",
            leadingIcon = {
                Image(
                    painter = painterResource(id = R.drawable.celular),
                    contentDescription = "",
                    modifier = Modifier
                        .width(22.dp)
                        .height(22.dp)
                )
            },
            shape = RoundedCornerShape(16.dp),
            onValueChange = {},
            modifier = Modifier
                .width(362.dp)
                .height(60.dp)
                .offset(x = 15.dp, y = 10.dp),
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = Color(0xFFCF06F0),
                unfocusedTextColor = Color.Black,
                focusedTextColor = Color.Black,
                focusedBorderColor = Color(0xFFCF06F0)
            ),
            label = {
                Text(
                    text = "Phone"
                )
            }
        )
        OutlinedTextField(
            value = "susanna@email.com",
            leadingIcon = {
                Image(
                    painter = painterResource(id = R.drawable.email),
                    contentDescription = "",
                    modifier = Modifier
                        .width(22.dp)
                        .height(22.dp)
                )
            },
            shape = RoundedCornerShape(16.dp),
            onValueChange = {},
            modifier = Modifier
                .width(362.dp)
                .height(60.dp)
                .offset(x = 15.dp, y = 20.dp),
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = Color(0xFFCF06F0),
                unfocusedTextColor = Color.Black,
                focusedTextColor = Color.Black,
                focusedBorderColor = Color(0xFFCF06F0)
            ),
            label = {
                Text(
                    text = "E-mail"
                )
            }
        )
        OutlinedTextField(
            value = "************",
            leadingIcon = {
                Image(
                    painter = painterResource(id = R.drawable.cadeado),
                    contentDescription = "",
                    modifier = Modifier
                        .width(22.dp)
                        .height(22.dp)
                )
            },
            shape = RoundedCornerShape(16.dp),
            onValueChange = {},
            modifier = Modifier
                .width(362.dp)
                .height(60.dp)
                .offset(x = 15.dp, y = 30.dp),
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = Color(0xFFCF06F0),
                unfocusedTextColor = Color.Black,
                focusedTextColor = Color.Black,
                focusedBorderColor = Color(0xFFCF06F0)
            ),
            label = {
                Text(
                    text = "Password"
                )
            }
        )
        Row(
            verticalAlignment = Alignment.CenterVertically
        ){
            Checkbox(
                checked = false,
                onCheckedChange = {},
                modifier = Modifier
                    .offset(x = 2.dp, y = 35.dp),
                colors = CheckboxDefaults.colors(
                    uncheckedColor = Color(0xFFCF06F0),
                    checkedColor = Color(0xFFCF06F0)
                )
            )
            Text(
                text = "Over 18?",
                modifier = Modifier
                    .offset(x = 0.dp, y = 35.dp)
            )
        }
        Button(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFCF06F0)),
            modifier = Modifier
                .offset(x = 20.dp, y = 50.dp)
                .width(350.dp)
                .height(48.dp),
            shape = RoundedCornerShape(16.dp)
        ) {
            Text(
                text = "CREATE ACCOUNT",
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp
            )
        }
        Spacer(modifier = Modifier.height(14.dp))
        Row (
            horizontalArrangement = Arrangement.End,
            modifier = Modifier
                .fillMaxWidth()
        ){
            Text(
                text = "Already have an account?",
                fontSize = 13.sp,
                color = Color(0xFFA09C9C),
                modifier = Modifier
                    .offset(x = -35.dp, y = 60.dp)
            )
            Text(
                text = "Sign in",
                fontSize = 13.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFFCf06F0),
                modifier = Modifier
                    .offset(x = -30.dp, y = 60.dp)
            )
        }
        Row (
            modifier = Modifier
                .fillMaxWidth()
        ){
            Card (
                colors = CardDefaults.cardColors(containerColor = Color(0xFFCF06F0)),
                modifier = Modifier
                    .width(135.dp)
                    .height(40.dp)
                    .offset(x = 0.dp, y = 117.dp),
                shape = RoundedCornerShape(topEnd = 16.dp)
            ){
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun SignUpPreview() {
    MyTripsTheme {
        SignUp()
    }
}

@Composable
fun Home() {
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(215.dp),
            shape = RoundedCornerShape(0.dp)
        ) {
            Surface(modifier = Modifier.fillMaxSize()) {
                Image(
                    painter = painterResource(id = R.drawable.fundo_paris),
                    contentScale = ContentScale.Crop,
                    contentDescription = ""
                )
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.End
                ) {
                    Card (
                        modifier = Modifier
                            .width(61.dp)
                            .height(61.dp)
                            .offset(x = 80.dp, y = 15.dp),
                        shape = CircleShape
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.mulher),
                            contentDescription = "",
                            modifier = Modifier
                                .fillMaxSize()
                        )
                    }
                    Text(
                        text = "Susanna Hoffs",
                        fontSize = 14.sp,
                        color = Color.White,
                        modifier = Modifier
                            .offset(x = -10.dp, y = 80.dp)
                    )
                }
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(215.dp),
                    verticalArrangement = Arrangement.Bottom
                    ) {
                    Text(
                        text = "You're in Paris",
                        color = Color.White,
                        fontSize = 16.sp,
                        modifier = Modifier
                            .offset(x = 35.dp, y = 16.dp)
                    )
                    Icon(
                        imageVector = Icons.Default.LocationOn,
                        contentDescription = "",
                        tint = Color.White,
                        modifier = Modifier
                            .height(18.dp)
                            .width(18.dp)
                            .offset(x = 18.dp, y = -4.dp)
                    )
                    Text(
                        text = "My Trips",
                        color = Color.White,
                        fontSize = 28.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .offset(x = 20.dp, y = -10.dp)
                    )
                }
            }
        }
        Text(
            text = "Categories",
            color = Color(0xFF565454),
            fontSize = 18.sp,
            modifier = Modifier
                .offset(x = 19.dp, y = 10.dp)
        )
        LazyRow (
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 18.dp)
                .padding(vertical = 20.dp)
        ){
            item{
                Card(
                    elevation = CardDefaults.cardElevation(8.dp),
                    colors = CardDefaults.cardColors(containerColor = Color(0xFFCF06F0)),
                    modifier = Modifier
                        .height(90.dp)
                        .width(145.dp)
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center,
                        modifier = Modifier
                            .padding(8.dp)
                            .fillMaxSize()
                    ) {
                        Icon(
                            imageVector = Icons.Default.Landscape,
                            contentDescription = "",
                            tint = Color.White,
                            modifier = Modifier
                                .height(42.dp)
                                .width(42.dp)
                        )
                        Text(
                            text = "Montain",
                            color = Color.White,
                            fontSize = 18.sp,
                            modifier = Modifier
                                .offset(x = 0.dp, y = -5.dp)
                        )
                    }
                }
                Spacer(modifier = Modifier.width(8.dp))
                Card(
                    elevation = CardDefaults.cardElevation(8.dp),
                    colors = CardDefaults.cardColors(containerColor = Color(0xFFEAABF4)),
                    modifier = Modifier
                        .height(90.dp)
                        .width(145.dp)
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center,
                        modifier = Modifier
                            .padding(9.dp)
                            .fillMaxSize()
                    ) {
                        Icon(
                            imageVector = Icons.Default.Snowboarding,
                            contentDescription = "",
                            tint = Color.White,
                            modifier = Modifier
                                .width(42.dp)
                                .height(42.dp)
                        )
                        Text(
                            text = "Snow",
                            color = Color.White,
                            fontSize = 18.sp,
                            modifier = Modifier
                                .offset(x = 0.dp, y = -3.dp)
                        )
                    }
                }
                Spacer(modifier = Modifier.width(8.dp))
                Card(
                    elevation = CardDefaults.cardElevation(8.dp),
                    colors = CardDefaults.cardColors(containerColor = Color(0xFFEAABF4)),
                    modifier = Modifier
                        .height(90.dp)
                        .width(145.dp)
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center,
                        modifier = Modifier
                            .padding(9.dp)
                            .fillMaxSize()
                    ) {
                        Icon(
                            imageVector = Icons.Default.BeachAccess,
                            contentDescription = "",
                            tint = Color.White,
                            modifier = Modifier
                                .width(42.dp)
                                .height(42.dp)
                        )
                        Text(
                            text = "Beach",
                            color = Color.White,
                            fontSize = 18.sp,
                            modifier = Modifier
                                .offset(x = 0.dp, y = -3.dp)
                        )
                    }
                }
            }
        }
        OutlinedTextField(
            value = "",
            trailingIcon = {
                 IconButton(onClick = { /*TODO*/ }) {
                     Icon(
                         imageVector = Icons.Default.Search,
                         contentDescription = "",
                         tint = Color(0xFFB7B7B7)
                     )
                 }
            },
            onValueChange = {},
            modifier = Modifier
                .height(58.dp)
                .width(357.dp)
                .offset(x = 16.dp),
            shape = RoundedCornerShape(16.dp),
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = Color.White,
                unfocusedContainerColor = Color.White
            ),
            placeholder = {
                Text(
                    text = "Search your destiny",
                    color = Color(0xFFA09C9C)
                )
            }
        )
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = "Past Trips",
            color = Color(0xFF565454),
            fontSize = 18.sp,
            modifier = Modifier
                .offset(x = 17.dp)
        )
        Spacer(modifier = Modifier.height(9.dp))
        LazyColumn{
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HomePreview() {
    MyTripsTheme {
        Home()
    }
}
