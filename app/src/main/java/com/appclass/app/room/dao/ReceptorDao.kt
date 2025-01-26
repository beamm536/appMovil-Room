package com.appclass.app.room.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.appclass.app.room.EmisorEntity
import com.appclass.app.room.ReceptorEntity

@Dao
interface ReceptorDao {

    //metodo para guardar una factura
    @Insert
    suspend fun insertEmisor(receptorEntity: ReceptorEntity)

    //metodo para obtener todas las facturas
    @Query("SELECT * FROM receptores")
    fun getAllReceptores(): List<ReceptorEntity>


    @Delete
    suspend fun deleteReceptor(receptorEntity: ReceptorEntity)


    @Update
    suspend fun updateReceptor(receptorEntity: ReceptorEntity)
}