package com.appclass.app.room

import androidx.room.Entity

@Entity(tableName = "emisores")

data class EmisorEntity (
    val id_emisor: Int,
    val nombre: String,
    val nif: String,
    val direccion: String
)
