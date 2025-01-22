package com.appclass.app.navigation

import androidx.compose.runtime.Composable
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.appclass.app.ui.screens.formEntrada.FormularioEntrada
import com.appclass.app.ui.screens.formEntrada.FormularioEntradaViewModel

@Composable
fun NavigationWrapper(navController: NavHostController) {

    //val navController = rememberNavController()
    val formularioEntradaViewModel: FormularioEntradaViewModel = viewModel()

    NavHost(navController = navController, startDestination = AppScreens.FormularioEntrada.ruta){
        composable(AppScreens.FormularioEntrada.ruta) {
            FormularioEntrada(viewModel = formularioEntradaViewModel)

        }
    }
}