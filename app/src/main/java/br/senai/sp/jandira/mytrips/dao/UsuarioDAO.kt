package br.senai.sp.jandira.mytrips.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import br.senai.sp.jandira.mytrips.model.Usuarios


@Dao
interface UsuarioDAO {

    @Insert
    fun salvar (Usuarios: Usuarios): Long

    @Update
    fun atualizar (Usuarios: Usuarios): Int

    @Delete
    fun excluir (Usuarios: Usuarios)

    @Query("SELECT * FROM tbl_usuarios ORDER BY nome ASC")
    fun listarTodososUsuarios(): List<Usuarios>

    @Query("SELECT * FROM tbl_usuarios WHERE id = :id")
    fun buscarUsuarioPeloId(id: Long): Usuarios

    @Query("SELECT * FROM tbl_usuarios WHERE nome = :nome ORDER BY nome ASC")
    fun buscarUsuarioPeloNome(nome: String): List<Usuarios>

    @Query("SELECT * FROM tbl_usuarios WHERE email = :email")
    fun buscarUsuarioPeloEmail(email: String): Usuarios?
}