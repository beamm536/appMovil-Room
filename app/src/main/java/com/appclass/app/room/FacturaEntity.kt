package com.appclass.app.room

import androidx.annotation.Px
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    tableName = "facturas",
    foreignKeys = [
        ForeignKey(
            entity = EmisorEntity::class,
            parentColumns = ["id_emisor"],
            childColumns = ["id_emisor"],
            onDelete = ForeignKey.CASCADE
        ),
        ForeignKey(
            entity = ReceptorEntity::class,
            parentColumns = ["id_receptor"],
            childColumns = ["id_receptor"],
            onDelete = ForeignKey.CASCADE
        )
    ]
)
data class FacturaEntity (
    //columnas de la tabla Factura
    @PrimaryKey(autoGenerate = true) var id_factura: Int = 0,
    @ColumnInfo(name = "numero_factura") val numeroFactura: String,
    @ColumnInfo(name = "fecha_emision") val fechaEmision: String,

    //relacion con la tabla Emisor
    @ColumnInfo(name = "id_emisor") val idEmisor: Int,

    //relacion con la tabla receptor
    @ColumnInfo(name = "id_receptor") val idReceptor: Int,

    @ColumnInfo(name = "base_imponible") val baseImponible: Double,
    @ColumnInfo(name = "iva_porcentaje") val ivaPorcentaje: Double,
    @ColumnInfo(name = "iva_total") val ivaTotal: Double,
    @ColumnInfo(name = "total") val total: Double
)

