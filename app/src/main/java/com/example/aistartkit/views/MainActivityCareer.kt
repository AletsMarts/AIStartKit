package com.example.aistartkit.views

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.aistartkit.functions.CareerDetails
import com.example.aistartkit.R
import com.example.aistartkit.functions.ShowDropdownMenu


class MainActivityCareer : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = androidx.compose.ui.graphics.Color.Black // Fondo negro para toda la app
                ) {
                    MainApp()
                }
            }
        }
    }
}

@Composable
fun MainApp() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "menu") {
        // Pantalla principal (menú de carreras)
        composable("menu") {
            MainScreen { selectedCareer ->
                navController.navigate("materials/$selectedCareer")
            }
        }
        // Pantalla de materiales por carrera
        composable("materials/{career}") { backStackEntry ->
            val career = backStackEntry.arguments?.getString("career") ?: ""
            CareerDetails(career) { material ->
                navController.navigate("materialDetails/$material")
            }
        }
        // Pantalla de detalles de un material
        composable("materialDetails/{material}") { backStackEntry ->
            val material = backStackEntry.arguments?.getString("material") ?: ""
            MaterialDetails(material) {
                navController.popBackStack() // Regresa a la lista de materiales
            }
        }
    }
}

/**
 * Pantalla principal que muestra el menú de selección de carreras.
 * @param onCareerSelected Callback que maneja la selección de una carrera.
 */
@Composable
fun MainScreen(onCareerSelected: (String) -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Imagen del logo
        Image(
            painter = painterResource(id = R.drawable.logoia), // Recurso en res/drawable
            contentDescription = "Logo IA",
            modifier = Modifier
                .size(120.dp)
                .padding(top = 16.dp ,bottom = 16.dp)
                .fillMaxWidth()
        )

        // Menú desplegable de carreras
        ShowDropdownMenu(onCareerSelected)
    }
}
