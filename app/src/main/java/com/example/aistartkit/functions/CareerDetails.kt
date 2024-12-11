package com.example.aistartkit.functions

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


private val materialsMap = mapOf(
    "Ingeniería Química" to listOf(
        "Balanza Analítica", "Bureta", "Condensador", "Desecador", "Embudo",
        "Embudo de Decantación", "Matraz Bola", "Matraz Volumétrico",
        "Matraz Erlenmeyer", "Mortero", "Pipeta", "Piseta", "Probeta","Soporte Universal",
        "Tubo de Ensaye", "Vaso Precipitado", "Vidrio de Reloj"
    ),
    "Ingeniería Eléctrica" to listOf(
        "Amperímetro de Gancho", "Apagador", "Cinta de Aislar", "Contacto",
        "Cutter", "Desarmadores Aislados", "Guantes", "Guía Eléctrica",
        "Interruptor Termomagnético", "Pinzas de Puntas", "Pinzas Pela Cable",
        "Pinzas de Corte", "Probador de Circuitos", "Soquet"
    ),

    "Ingeniería Mecánica" to listOf(
        "Aislador Vibraciones", "AutoCAD", "Calibradores", "Impresora",  "Llave Inglesa",
                "Medidor Flujo",  "Medidor Fuerza",  "Ohmímetro",  "Tenazas"
    ),

    "Ingenieria Electronica" to listOf(
        "Alicates", "Destornillador", "Guantes", "Microfibra",  "Protoboard"

    ),
    "Sistemas Computacionales" to listOf(
        "Android Studio", "Arduino", "Calculadora", "Laptop",  "Router",
        "Sensor", "Switch"
    ),
    "Ing Gestion Empresarial" to listOf(
        "DosBox", "Excel", "Grafica"

    ),
    "Administracion de Empresas" to listOf(
        "Access", "Calculadora", "Diagrama de Flujo", "Diagrama de Ishikawa",
        "Excel", "Foda"
    ),

    "Ingenieria Industrial" to listOf(
        "Cizalla", "Destornillador", "Dobladora de Maquina", "Dobladora de Tubos",
        "Duramatro", "Prensa Hidraulica", "Soldadora de Punto"
    ),
    "Ingenieria Mecatronica" to listOf(
        "Alambre", "Alicate", "Calibrador", "Cautin",
        "Corta Alambre", "Desarmadores", "Llaves Alen", "Multimetro",
        "Pasta de Soldar", "Protoboard"
    ),
    "Ing en Energias Renovables" to listOf(
        "Alicantes de punta", "Densimetro", "Maquina de Soldar", "Multimetro",
        "Paneles Solares", "Pinzas", "Taladro"
    ),
    "Ingenieria en Semiconductores" to listOf(
        "Marposs", "Tornillo"
    ),




)

/**
 * Pantalla que muestra los materiales de una carrera específica.
 * @param career Nombre de la carrera seleccionada.
 * @param onBack Callback para regresar al menú principal.
 */
@Composable
fun CareerDetails(career: String, onMaterialSelected: (String) -> Unit) {
    val materials = materialsMap[career] ?: emptyList()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Materiales para $career",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .verticalScroll(rememberScrollState())
                .padding(8.dp)
        ) {
            materials.forEach { material ->
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp)
                        .clickable { onMaterialSelected(material) },
                    colors = CardDefaults.cardColors(containerColor = Color(0xFF1976D2)),
                    shape = RoundedCornerShape(8.dp)
                ) {
                    Text(
                        text = material,
                        fontSize = 18.sp,
                        color = Color.White,
                        modifier = Modifier.padding(16.dp)
                    )
                }
            }
        }

        Spacer(modifier = Modifier.weight(1f))

        Button(
            onClick = { onMaterialSelected("") },
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF0D47A1)),
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp)
        ) {
            Text("Regresar", color = Color.White, fontSize = 16.sp)
        }
    }
}
