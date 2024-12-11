package com.example.aistartkit.navigation

open class AppScreens(val route: String) {
    object Home : AppScreens("Home")
    object Seleccion : AppScreens("Selección de materias")
    object Options : AppScreens("Opciones")
    object Guia : AppScreens("Guía")
    object CamFunc : AppScreens("Camara")
    object Exit : AppScreens("Salir")

}