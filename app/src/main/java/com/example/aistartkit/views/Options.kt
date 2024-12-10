@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.aistartkit.views

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Options(
    onDismiss:()->Unit
)
{
    androidx.compose.material3.AlertDialog(

        onDismissRequest = onDismiss,
        confirmButton = {},
        modifier = Modifier.height(450.dp).shadow(elevation = 1.dp),

        title = {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            )
            {
                Row (verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.fillMaxWidth()){
                    Text(text = "Opciones",
                        textAlign = TextAlign.Center,
                        fontSize = 38.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .padding(top = 15.dp)
                            .fillMaxWidth())
                }
                Spacer(modifier = Modifier.padding(5.dp))

                Text(text = "Selecciona una función",
                    style = TextStyle(
                        fontWeight = FontWeight.Light,
                        fontStyle = FontStyle.Italic,
                        textAlign = TextAlign.Center
                    ),
                    fontSize = 15.sp,
                    modifier = Modifier.fillMaxWidth()
                )
            }
        },
        text = {

            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Spacer(modifier = Modifier.padding(top = 40.dp))
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .width(200.dp)
                        .height(80.dp)
                        .padding(10.dp)
                        .shadow(elevation = 8.dp, shape = RoundedCornerShape(50)),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF3230C3)
                    )

                ) {
                    Row (verticalAlignment = Alignment.CenterVertically) {
                        Icon(imageVector = Icons.Default.Build, contentDescription = "")
                        Text(text = "Escanear herramienta", style = TextStyle(fontWeight = FontWeight.SemiBold), textAlign = TextAlign.Center)
                    }

                }

                ElevatedButton(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .width(200.dp)
                        .height(80.dp)
                        .padding(10.dp)
                        .shadow(elevation = 8.dp, shape = RoundedCornerShape(50)),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF3230C3)
                    )
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(imageVector = Icons.Default.Menu, contentDescription = "")
                        Text("Guía de herramientas", style = TextStyle(fontWeight = FontWeight.SemiBold),
                            textAlign = TextAlign.Center
                        )
                    }
                }

                Column(
                    horizontalAlignment = Alignment.End,
                    verticalArrangement = Arrangement.Bottom
                ){
                    Spacer(modifier = Modifier.padding(top = 50.dp))
                    Text(text = "AIStartKit © 2024",
                        fontSize = 7.sp,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .fillMaxWidth())
                }

            }




        }


    )



}

@Preview(showBackground = true)
@Composable
fun OptionsPreview() {
    Options(onDismiss = {})
}