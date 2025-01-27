package com.appclass.app.room.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.appclass.app.room.FacturaEntity
import com.appclass.app.room.dao.FacturasDao

//unimos todas las tablas en una sola clase
@Database(entities = [FacturaEntity::class], version = 1, exportSchema = false)

//CONEXIN CON LA BASE DE DATOS
abstract class FacturasDatabase: RoomDatabase() {
    abstract fun facturasDao(): FacturasDao //conexion con la tabla/entidad facturas
}