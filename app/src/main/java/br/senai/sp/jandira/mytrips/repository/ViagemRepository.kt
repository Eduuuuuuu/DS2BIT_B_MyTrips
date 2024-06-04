package br.senai.sp.jandira.mytrips.repository

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import br.senai.sp.jandira.mytrips.R
import br.senai.sp.jandira.mytrips.model.Viagem
import java.time.LocalDate

class ViagemRepository {

    @Composable
    fun listarTodasAsViagens() : List<Viagem> {
        val londres = Viagem()
        londres.id = 1
        londres.destino = "Londres"
        londres.descricao = "Londres, capital da Inglaterra e do Reino Unido, é uma cidade do século 21 com uma história que remonta à era romana."
        londres.dataChegada = LocalDate.of(2019,2,18)
        londres.dataPartida = LocalDate.of(2019,2,21)
        londres.imagem = painterResource(id = R.drawable.londres)

        val paris = Viagem()
        paris.id = 2
        paris.destino = "Paris"
        paris.descricao = "Paris, a capital da França, é uma importante cidade europeia e um centro mundial de arte, moda, gastronomia e cultura."
        paris.dataChegada = LocalDate.of(2014,6,10)
        paris.dataPartida = LocalDate.of(2014,6,15)
        paris.imagem = painterResource(id = R.drawable.paris)

        val maranhao = Viagem()
        maranhao.id = 3
        maranhao.destino = "Maranhão"
        maranhao.descricao = "O Parque Nacional dos Lençóis Maranhenses é uma área protegida na costa atlântica norte do Brasil."
        maranhao.dataChegada = LocalDate.of(2023,6,30)
        maranhao.dataPartida = LocalDate.of(2024,5,27)
        maranhao.imagem = painterResource(id = R.drawable.maranhao)

        return listOf(londres, paris, maranhao)
    }
}