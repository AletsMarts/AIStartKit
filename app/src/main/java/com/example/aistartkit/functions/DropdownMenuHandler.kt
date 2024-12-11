package com.example.aistartkit.functions

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

private val menuItems = listOf(
    "Ingeniería Química",
    "Ingeniería Eléctrica",
    "Ingeniería Mecánica",
    "Sistemas Computacionales",
    "Ingenieria Electronica",
    "Ing en Energias Renovables",
    "Administracion de Empresas",
    "Ingenieria en Semiconductores",
    "Ingenieria Mecatronica",
    "Ingenieria Industrial",
    "Ing Gestion Empresarial"
)

@Composable
fun ShowDropdownMenu(onItemSelected: (String) -> Unit) {
    val expanded = remember { mutableStateOf(false) }

    Column(modifier = Modifier.fillMaxWidth().padding(top = 16.dp)) {
        Button(
            onClick = { expanded.value = !expanded.value },
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF6200EA))
        ) {
            Text(
                text = "¿A QUÉ CARRERA PERTENECES?",
                color = Color.White,
                fontSize = 16.sp
            )
        }

        DropdownMenu(
            expanded = expanded.value,
            onDismissRequest = { expanded.value = false },
            modifier = Modifier
                .background(Color(0xFF1E1E1E))
                .fillMaxWidth()
        ) {
            menuItems.forEach { item ->
                DropdownMenuItem(
                    text = { Text(item, color = Color.White, fontSize = 18.sp) },
                    onClick = {
                        expanded.value = false
                        onItemSelected(item)
                    }
                )
                HorizontalDivider(thickness = 1.dp, color = Color.Gray)
            }
        }
    }
}

