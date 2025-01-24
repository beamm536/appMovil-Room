package com.appclass.app.room

import androidx.room.RoomDatabase

//CONEXIN CON LA BASE DE DATOS
abstract class FacturasDatabase: RoomDatabase() {
    abstract fun facturasDao(): FacturasDao
}