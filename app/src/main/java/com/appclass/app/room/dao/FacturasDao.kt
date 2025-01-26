package com.appclass.app.room.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.appclass.app.room.FacturaEntity

@Dao
interface FacturasDao {

    //metodo para guardar una factura
    @Insert
    suspend fun insertFactura(factura: FacturaEntity)

    //metodo para obtener todas las facturas
    @Query("SELECT * FROM facturas")
    fun getAllFacturas(): List<FacturaEntity>

    //eliminar una factura
    @Delete
    suspend fun deleteFactura(factura: FacturaEntity)

    //actualizar una factura
    @Update
    suspend fun updateFactura(factura: FacturaEntity)
}