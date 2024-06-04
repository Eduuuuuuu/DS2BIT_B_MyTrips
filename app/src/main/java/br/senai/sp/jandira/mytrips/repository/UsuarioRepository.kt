package br.senai.sp.jandira.mytrips.repository

import android.content.Context
import androidx.compose.runtime.Composable
import br.senai.sp.jandira.mytrips.dao.UsuarioDb
import br.senai.sp.jandira.mytrips.model.Usuarios

class UsuarioRepository(context: Context) {
    private val dao = UsuarioDb.getBancoDeDados(context).usuarioDao()

    fun salvar(usuario: Usuarios): Long {
        return dao.salvar(usuario)
    }

    @Composable
    fun listarTodosUsuarios(): List<Usuarios> {
        return dao.listarTodososUsuarios()
    }

    fun verificarCredenciais(email: String, senha: String): Boolean {
        val usuario = dao.buscarUsuarioPeloEmail(email)
        return usuario != null && usuario.senha == senha
    }
}