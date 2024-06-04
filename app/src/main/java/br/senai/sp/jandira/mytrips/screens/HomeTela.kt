package br.senai.sp.jandira.mytrips.screens

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
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.BeachAccess
import androidx.compose.material.icons.filled.Landscape
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Snowboarding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
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
import androidx.navigation.NavHostController
import br.senai.sp.jandira.mytrips.R
import br.senai.sp.jandira.mytrips.reduzirData
import br.senai.sp.jandira.mytrips.repository.ViagemRepository
import br.senai.sp.jandira.mytrips.ui.theme.MyTripsTheme

@Composable
fun HomeTela(controleDeNavegacao: NavHostController) {

    val viagens = ViagemRepository().listarTodasAsViagens()

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
            onValueChange = {},
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 13.dp)
                .padding(vertical = 10.dp),
            shape = RoundedCornerShape(30.dp),
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = Color.White,
                focusedBorderColor = Color.White
            ),
            placeholder = {
                Text(
                    text = "Search for your destiny",
                    color = Color.LightGray
                )
            },
            trailingIcon = {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = "",
                    tint = Color.LightGray
                )
            }
        )
        Text(
            text = "Past Trips",
            fontSize = 18.sp,
            color = Color.Gray,
            modifier = Modifier
                .padding(horizontal = 13.dp)
        )
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(13.dp),
            elevation = CardDefaults.elevatedCardElevation(defaultElevation = 16.dp)
        ) {
            LazyColumn(
                modifier = Modifier.fillMaxSize()
            ) {
                items(viagens) {
                    Card(
                        colors = CardDefaults.cardColors(
                            containerColor = Color(0xFFFFFFFF)
                        ),
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 17.dp)
                    ) {
                        Column(
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Surface(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(250.dp)
                            ) {
                                Image(
                                    painter = if (it.imagem == null) painterResource(id = R.drawable.not_found) else it.imagem!!,
                                    contentDescription = "",
                                    contentScale = ContentScale.Crop
                                )
                            }
                            Column(
                                modifier = Modifier.padding(8.dp)
                            ) {
                                Text(
                                    text = "${it.destino}, ${it.dataChegada.year}",
                                    fontSize = 16.sp,
                                    color = Color(0xFFCF06F0)
                                )
                                Text(
                                    text = it.descricao,
                                    fontSize = 14.sp,
                                    color = Color.Gray,
                                    lineHeight = 15.sp
                                )
                                Column(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(8.dp),
                                    horizontalAlignment = Alignment.End
                                ) {
                                    Text(
                                        text = "${reduzirData(it.dataChegada)} - ${reduzirData(it.dataPartida)}",
                                        fontSize = 15.sp,
                                        color = Color(0xD3FC06F0)
                                    )
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun HomeTelaPreview() {
    MyTripsTheme {
        //HomeTela(controleDeNavegacao)
    }
}