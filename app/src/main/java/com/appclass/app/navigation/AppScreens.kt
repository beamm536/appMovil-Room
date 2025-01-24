package com.appclass.app.navigation

sealed class AppScreens(val ruta: String) {
    object FormularioEntrada: AppScreens("FormularioEntrada")
    object FormularioEntrada2: AppScreens("FormularioEntrada2")
}