package com.appclass.app.room

import androidx.room.Entity

@Entity(tableName = "receptores")

data class ReceptorEntity (
    val id_receptor: Int,
    val nombre: String,
    val nif: String,
    val direccion: String
)


