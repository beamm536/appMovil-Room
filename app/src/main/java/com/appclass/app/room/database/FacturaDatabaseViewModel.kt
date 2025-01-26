package com.appclass.app.room.database

import androidx.room.Room

class FacturaDatabaseViewModel(facturasDatabase: FacturasDatabase) {

    private val db: FacturasDatabase = Room.databaseBuilder(
        facturasDatabase,
        FacturasDatabase::class.java,
        "FacturasDatabase"
    ).build()

    val facturasDao = db.facturasDao()
    val emisorDao = db.emisorDao()
    val receptorDao = db.receptorDao()
}