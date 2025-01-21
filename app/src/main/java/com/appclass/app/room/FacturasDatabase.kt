package com.appclass.app.room

import androidx.room.RoomDatabase

abstract class FacturasDatabase: RoomDatabase() {
    abstract fun facturasDao(): FacturasDatabaseDao
}