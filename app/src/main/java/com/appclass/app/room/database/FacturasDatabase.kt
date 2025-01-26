package com.appclass.app.room.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.appclass.app.room.EmisorEntity
import com.appclass.app.room.FacturaEntity
import com.appclass.app.room.ReceptorEntity
import com.appclass.app.room.dao.EmisorDao
import com.appclass.app.room.dao.FacturasDao
import com.appclass.app.room.dao.ReceptorDao

//unimos todas las tablas en una sola clase
@Database(
    entities = [
        FacturaEntity::class,
        EmisorEntity::class,
        ReceptorEntity::class
    ],
    version = 1,
    exportSchema = false
)

//CONEXIN CON LA BASE DE DATOS
abstract class FacturasDatabase: RoomDatabase() {

    abstract fun facturasDao(): FacturasDao //conexion con la tabla facturas

    abstract fun emisorDao(): EmisorDao //conexion con la tabla emisor

    abstract fun receptorDao(): ReceptorDao //conexion con la tabla receptor

}