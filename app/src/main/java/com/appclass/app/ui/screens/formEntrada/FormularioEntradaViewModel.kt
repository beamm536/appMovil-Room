package com.appclass.app.ui.screens.formEntrada

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.appclass.app.room.FacturaEntity
import com.appclass.app.room.dao.FacturasDao
import kotlinx.coroutines.launch

class FormularioEntradaViewModel(
    //por parametro las entidades que vamos a usar
    private val facturasDao: FacturasDao
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
                numeroFactura = numeroFactura.value,
                fecha = fechaFactura.value,
                emisorEmpresa = emisorEmpresa.value,
                emisorNifCif = emisorNifCif.value,
                emisorDireccion = emisorDireccion.value,
                receptorEmpresa = receptorEmpresa.value,
                receptorNifCif = receptorNifCif.value,
                receptorDireccion = receptorDireccion.value
            )
            facturasDao.insertFactura(factura)
        }
    }
}