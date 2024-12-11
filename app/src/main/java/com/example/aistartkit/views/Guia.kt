package com.example.aistartkit.views

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.verticalScroll
import androidx.compose.ui.Modifier
import com.example.aistartkit.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class Guia {

    @Composable
    fun AnalyticalBalanceScreen() {
        Column(
            modifier = Modifier.fillMaxSize()
                .verticalScroll(rememberScrollState()) // Habilitamos el desplazamiento vertical
                .padding(16.dp)
        ) {
            // Título
            Text(
                text = "Balanza Analítica",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(16.dp))

            // Imagen de la balanza analítica
            Image(
                painter = painterResource(id = R.drawable.logoia), // Reemplaza con tu imagen
                contentDescription = "Balanza Analítica",
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp)
                    .align(Alignment.CenterHorizontally)
            )

            Spacer(modifier = Modifier.height(16.dp))

            // Información sobre la balanza
            TableSection(
                title = "Significado",
                content = "Una balanza analítica es un instrumento de laboratorio diseñado para medir masas con una precisión extremadamente alta, generalmente hasta 0.1 mg (0.0001 g). Es ideal para aplicaciones en química, biología, y otras ciencias donde se requieren mediciones exactas. Estas balanzas suelen contar con una cámara cerrada para evitar que corrientes de aire o vibraciones afecten la precisión."
            )

            TableSection(
                title = "Uso",
                content = "• Preparación: Asegúrate de que la balanza esté nivelada y ubicada en una superficie estable y libre de vibraciones.\n" +
                        "• Encendido y calibración: Enciende la balanza y calibra si es necesario, siguiendo las instrucciones del fabricante.\n" +
                        "• Colocación del recipiente: Si vas a usar un recipiente, colócalo en el plato y presiona la función \"tara\" para ajustar el peso a cero.\n" +
                        "• Añadir la muestra: Coloca cuidadosamente la muestra en el recipiente o directamente en el plato si es seguro hacerlo.\n" +
                        "• Lectura: Espera a que la balanza estabilice la medición y toma nota del peso mostrado."
            )

            TableSection(
                title = "Recomendaciones",
                content = "• Evita corrientes de aire y vibraciones: Usa la balanza en un lugar cerrado o protegido para garantizar mediciones precisas.\n" +
                        "• Mantenimiento regular: Limpia el plato y la cabina después de cada uso para evitar residuos que puedan afectar la calibración.\n" +
                        "• Usa pinzas o guantes: Si manipulas objetos pequeños, utiliza herramientas adecuadas para evitar transferir humedad o grasa que alteren la medición.\n" +
                        "• No sobrecargues la balanza: Respeta el límite máximo de peso indicado por el fabricante para evitar daños.\n" +
                        "• Calibra frecuentemente: Realiza calibraciones regulares, especialmente si la balanza se ha movido de lugar."
            )

            Spacer(modifier = Modifier.weight(1f)) // Empuja los botones hacia el fondo

            // Botones de avanzar y regresar
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp), // Ajusta el espacio encima de los botones
                horizontalArrangement = Arrangement.SpaceEvenly // Distribuye los botones equitativamente
            ) {
                // Botón de "Regresar"
                Button(
                    onClick = { /* Acción para regresar, por ejemplo, navegación hacia atrás */ },
                    modifier = Modifier.weight(1f) // Hace que el botón ocupe un espacio proporcional
                ) {
                    Text(text = "Regresar")
                }

                Spacer(modifier = Modifier.width(16.dp)) // Espacio entre los botones

                // Botón de "Avanzar"
                Button(
                    onClick = { /* Acción para avanzar, por ejemplo, navegar a la siguiente pantalla */ },
                    modifier = Modifier.weight(1f) // Hace que el botón ocupe un espacio proporcional
                ) {
                    Text(text = "Avanzar")
                }
            }
        }
    }

    @Composable
    private fun TableSection(title: String, content: String) {
        Column(modifier = Modifier.padding(vertical = 8.dp)) {
            Surface(
                color = Color.LightGray,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = title,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(8.dp)
                        .fillMaxWidth(), // Hace que el título esté centrado
                    textAlign = TextAlign.Center // Centra el texto del título
                )
            }
            // Texto justificado
            Text(
                text = content,
                fontSize = 16.sp,
                textAlign = TextAlign.Justify, // Justifica el texto
                modifier = Modifier.padding(8.dp)
            )
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun AnalyticalBalanceScreenPreview() {
        Guia().AnalyticalBalanceScreen()
    }

}