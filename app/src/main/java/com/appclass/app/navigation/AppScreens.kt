package com.appclass.app.navigation

sealed class AppScreens(val ruta: String) {
    object FormularioEntrada: AppScreens("FormularioEntrada")
}