package br.senai.sp.jandira.mytrips.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.senai.sp.jandira.mytrips.R
import br.senai.sp.jandira.mytrips.repository.UsuarioRepository
import br.senai.sp.jandira.mytrips.ui.theme.MyTripsTheme

@Composable
fun LoginTela(controleDeNavegacao: NavHostController) {

    var emailState = remember {
        mutableStateOf("")
    }

    var senhaState = remember {
        mutableStateOf("")
    }

    var errorState = remember {
        mutableStateOf(false)
    }

    var mensagemErrorState = remember {
        mutableStateOf("")
    }

    var usuarioRepository = UsuarioRepository(LocalContext.current)

    var listaUsuarios = usuarioRepository.listarTodosUsuarios()

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
                    .offset(x = 277.dp, y = 0.dp),
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
            value = emailState.value,
            leadingIcon = {
                Image(
                    painter = painterResource(id = R.drawable.email),
                    contentDescription = "",
                    modifier = Modifier
                        .width(26.dp)
                        .height(26.dp)
                )
            },
            onValueChange = {
                emailState.value = it
            },
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
            value = senhaState.value,
            leadingIcon = {
                Image(
                    painter = painterResource(id = R.drawable.cadeado),
                    contentDescription = "",
                    modifier = Modifier
                        .width(26.dp)
                        .height(26.dp)
                )
            },
            onValueChange = {
                senhaState.value = it
            },
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
            onClick = {
                if (emailState.value != "" && senhaState.value != "") {
                    listaUsuarios.forEach{
                        if (it.email == emailState.value && it.senha == senhaState.value) {
                            controleDeNavegacao.navigate("home")
                        } else {
                            errorState.value = true
                            mensagemErrorState.value = "E-mail ou senha incorreto"
                        }
                    }
                } else {
                    errorState.value = true
                    mensagemErrorState.value = "Todos os campos são obrigatórios"
                }
            },
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
                .clickable { controleDeNavegacao.navigate("signUp") }
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
                    .offset(x = -1.dp, y = 421.dp),
                shape = RoundedCornerShape(topEnd = 20.dp)
            ){
            }
        }
    }
}

@Preview
@Composable
fun LoginTelaPreview() {
    MyTripsTheme {
        //LoginTela(controleDeNavegacao)
    }
}