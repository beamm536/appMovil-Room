package com.appclass.app.ui.screens.formEntrada

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.appclass.app.room.FacturaEntity
import com.appclass.app.room.dao.EmisorDao
import com.appclass.app.room.dao.FacturasDao
import com.appclass.app.room.dao.ReceptorDao
import kotlinx.coroutines.launch

class FormularioEntradaViewModel(
    //por parametro las entidades que vamos a usar
    private val facturasDao: FacturasDao,
    private val emisorDao: EmisorDao,
    private val receptorDao: ReceptorDao
): ViewModel() {

    var numeroFactura = mutableStateOf("")
    var fechaFactura = mutableStateOf("")
    var emisorEmpresa = mutableStateOf("")
    var emisorNifCif = mutableStateOf("")
    var emisorDireccion = mutableStateOf("")
    var receptorEmpresa = mutableStateOf("")
    var receptorNifCif = mutableStateOf("")
    var receptorDireccion = mutableStateOf("")

    fun guardarFactura() {
        viewModelScope.launch {
            val factura = FacturaEntity(
                id = 0, // Room autogenera el ID
                numeroFactura = numeroFactura.value,
                fecha = fechaFactura.value
            )
            val emisor = EmisorEntity(
                id = 0,
                nombreEmpresa = emisorEmpresa.value,
                nifCif = emisorNifCif.value,
                direccion = emisorDireccion.value
            )
            val receptor = ReceptorEntity(
                id = 0,
                nombreEmpresa = receptorEmpresa.value,
                nifCif = receptorNifCif.value,
                direccion = receptorDireccion.value
            )

            facturasDao.insertFactura(factura)
            emisorDao.insertEmisor(emisor)
            receptorDao.insertReceptor(receptor)
        }
    }
}