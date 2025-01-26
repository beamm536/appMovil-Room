package com.appclass.app.room.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.appclass.app.room.EmisorEntity
import com.appclass.app.room.FacturaEntity

@Dao
interface EmisorDao {

    //metodo para guardar una factura
    @Insert
    suspend fun insertEmisor(emisorEntity: EmisorEntity)

    //metodo para obtener todas las facturas
    @Query("SELECT * FROM emisores")
    fun getAllEmisores(): List<EmisorEntity>


    @Delete
    suspend fun deleteEmisor(emisorEntity: EmisorEntity)


    @Update
    suspend fun updateEmisor(emisorEntity: EmisorEntity)
}