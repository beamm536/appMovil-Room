package com.appclass.app.room

import androidx.annotation.Px
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(tableName = "facturas")

data class FacturaEntity (
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val numeroFactura: String,
    val fecha: String,
    val emisorEmpresa: String,
    val emisorNifCif: String,
    val emisorDireccion: String,
    val receptorEmpresa: String,
    val receptorNifCif: String,
    val receptorDireccion: String
)

