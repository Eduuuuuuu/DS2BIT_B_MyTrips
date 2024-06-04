package br.senai.sp.jandira.mytrips.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
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
import br.senai.sp.jandira.mytrips.model.Usuarios
import br.senai.sp.jandira.mytrips.repository.UsuarioRepository
import br.senai.sp.jandira.mytrips.ui.theme.MyTripsTheme

@Composable
fun SingUpTela(controleDeNavegacao: NavHostController) {

    var nomeState = remember {
        mutableStateOf("")
    }

    var foneState = remember {
        mutableStateOf("")
    }

    var emailState = remember {
        mutableStateOf("")
    }

    var senhaState = remember {
        mutableStateOf("")
    }

    var lembrarState = remember {
        mutableStateOf(false)
    }

    var usuarioRepository = UsuarioRepository(LocalContext.current)

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
            value = nomeState.value,
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
            onValueChange = {
                nomeState.value = it
            },
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
            value = foneState.value,
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
            onValueChange = {
                foneState.value = it
            },
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
            value = emailState.value,
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
            onValueChange = {
                emailState.value = it
            },
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
            value = senhaState.value,
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
            onValueChange = {
                senhaState.value = it
            },
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
                checked = lembrarState.value,
                onCheckedChange = {
                    lembrarState.value = it
                },
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
            onClick = {
                val novoUsuario = Usuarios(
                    nome = nomeState.value,
                    telefone = foneState.value,
                    email = emailState.value,
                    senha = senhaState.value
                )
                usuarioRepository.salvar(novoUsuario)

                controleDeNavegacao.navigate("login")
            },
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
                    .clickable { controleDeNavegacao.navigate("login") }
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
                    .offset(x = 0.dp, y = 100.dp),
                shape = RoundedCornerShape(topEnd = 16.dp)
            ){
            }
        }
    }
}

@Preview
@Composable
fun SingUpTelaPreview() {
    MyTripsTheme {
        //SingUpTela(controleDeNavegacao)
    }
}