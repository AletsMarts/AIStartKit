package com.example.aistartkit.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.aistartkit.R

@Composable
fun Seleccion() {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.logoia),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 1.dp)
        )

        Text(
            "SELECCIÓN DE CARRERA",
            style = TextStyle(
                fontSize = 30.sp,
                fontWeight = FontWeight.ExtraBold,
                fontStyle = FontStyle.Normal,
                textAlign = TextAlign.Center
            ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 1.dp, bottom = 1.dp)
        )
        Text(
            text = "¿A qué carrera perteneces?",
            style = TextStyle(
                fontSize = 16.sp,
                fontStyle = FontStyle.Italic,
            ),
        )

        Spacer(modifier = Modifier.padding(10.dp))

        Box(modifier = Modifier.padding(8.dp)){
        Column(
            modifier = Modifier
                //.padding(top = 8.dp, start = 25.dp, end = 25.dp)
                .background(brush = Brush.linearGradient(
                    colors = listOf(Color.Black, Color.Blue)
                )
        )) {
            ElevatedButton(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .fillMaxWidth()
                    .height(45.dp)
                    .background(
                        brush = Brush.linearGradient(
                            colors = listOf(Color.Black, Color.Blue)
                        )
                    ),
                shape = RoundedCornerShape(40.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent)
            ) {
                Text(text = "INGENIERÍA EN SEMICONDUCTORES", textAlign = TextAlign.Center)
            }
            Spacer(modifier = Modifier.padding(horizontal = 10.dp))

            ElevatedButton(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .fillMaxWidth()
                    .height(45.dp)
                    .background(
                        brush = Brush.linearGradient(
                            colors = listOf(Color.Black, Color.Blue)
                        )
                    ),
                shape = RoundedCornerShape(40.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent)
            ) {
                Text(text = "INGENIERÍA SISTEMAS COMPUTACIONALES", textAlign = TextAlign.Center)
            }
            Spacer(
                modifier = Modifier
                    .padding(horizontal = 10.dp)
                    .fillMaxWidth()
            )

            ElevatedButton(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .fillMaxWidth()
                    .height(45.dp)
                    .background(
                        brush = Brush.linearGradient(
                            colors = listOf(Color.Black, Color.Blue)
                        )
                    ),
                shape = RoundedCornerShape(40.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent)
            ) {
                Text(text = "INGENIERÍA ELÉCTRICA")
            }
            Spacer(
                modifier = Modifier
                    .padding(horizontal = 10.dp)
                    .fillMaxWidth()
            )

            ElevatedButton(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .fillMaxWidth()
                    .height(45.dp)
                    .background(
                        brush = Brush.linearGradient(
                            colors = listOf(Color.Black, Color.Blue)
                        )
                    ),
                shape = RoundedCornerShape(40.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent)
            ) {
                Text(text = "INGENIERÍA ELECTRÓNICA")
            }
            Spacer(
                modifier = Modifier
                    .padding(horizontal = 10.dp)
                    .fillMaxWidth()
            )

            ElevatedButton(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .fillMaxWidth()
                    .height(45.dp)
                    .background(
                        brush = Brush.linearGradient(
                            colors = listOf(Color.Black, Color.Blue)
                        )
                    ),
                shape = RoundedCornerShape(40.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent)
            ) {
                Text(text = "INGENIERÍA EN ENERGÍAS RENOVABLES")
            }
            Spacer(
                modifier = Modifier
                    .padding(horizontal = 10.dp)
                    .fillMaxWidth()
            )

            ElevatedButton(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .fillMaxWidth()
                    .height(45.dp)
                    .background(
                        brush = Brush.linearGradient(
                            colors = listOf(Color.Black, Color.Blue)
                        )
                    ),
                shape = RoundedCornerShape(40.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent)
            ) {
                Text(text = "INGENIERÍA INDUSTRIAL", textAlign = TextAlign.Center)
            }
            Spacer(
                modifier = Modifier
                    .padding(horizontal = 10.dp)
                    .fillMaxWidth()
            )

            ElevatedButton(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .fillMaxWidth()
                    .height(45.dp)
                    .background(
                        brush = Brush.linearGradient(
                            colors = listOf(Color.Black, Color.Blue)
                        )
                    ),
                shape = RoundedCornerShape(40.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Transparent,
                    contentColor = Color.Black
                )
            ) {
                Text(
                    text = "INGENIERÍA MECÁNICA",
                    style = TextStyle(color = Color.White)
                )
            }
            Spacer(
                modifier = Modifier
                    .padding(horizontal = 10.dp)
                    .fillMaxWidth()
            )

            ElevatedButton(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .fillMaxWidth()
                    .height(45.dp)
                    .background(
                        brush = Brush.linearGradient(
                            colors = listOf(Color.Black, Color.Blue)
                        )
                    ),
                shape = RoundedCornerShape(40.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent)
            ) {
                Text(text = "INGENIERÍA MECATRÓNICA")
            }
            Spacer(
                modifier = Modifier
                    .padding(horizontal = 10.dp)
                    .fillMaxWidth()
            )

            ElevatedButton(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .fillMaxWidth()
                    .height(45.dp)
                    .background(
                        brush = Brush.linearGradient(
                            colors = listOf(Color.Black, Color.Blue)
                        )
                    ),
                shape = RoundedCornerShape(40.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent)
            ) {
                Text(text = "INGENIERÍA QUÍMICA")
            }
            Spacer(
                modifier = Modifier
                    .padding(horizontal = 10.dp)
                    .fillMaxWidth()
            )

            ElevatedButton(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .fillMaxWidth()
                    .height(45.dp)
                    .background(
                        brush = Brush.linearGradient(
                            colors = listOf(Color.Black, Color.Blue)
                        )
                    ),
                shape = RoundedCornerShape(40.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent)
            ) {
                Text(text = "LICENCIATURA EN ADMINISTRACIÓN")
            }
            Spacer(
                modifier = Modifier
                    .padding(horizontal = 10.dp)
                    .fillMaxWidth()
            )

            ElevatedButton(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .fillMaxWidth()
                    .height(45.dp)
                    .background(
                        brush = Brush.linearGradient(
                            colors = listOf(Color.Black, Color.Blue)
                        )
                    ),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent)
            ) {
                Text(text = "INGENIERÍA GESTIÓN EMPRESARIAL")
            }

        }
        }
    }
}
