package com.example.preforge // Verifica tu paquete

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Timer
import androidx.compose.material.icons.filled.Description
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.preforge.ui.theme.*

@Composable
fun SimulatorScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(BackgroundGreen)
            .padding(24.dp)
    ) {
        // 1. Encabezado: Pregunta actual y Cronómetro
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(Icons.Default.Description, contentDescription = "Pregunta", tint = DarkGreen)
                Spacer(modifier = Modifier.width(8.dp))
                Text(text = "Pregunta 4/20", fontWeight = FontWeight.Bold, color = DarkGreen)
            }

            // Botoncito del temporizador
            Surface(
                color = Color.White,
                shape = RoundedCornerShape(16.dp),
                modifier = Modifier.border(1.dp, LightGreen, RoundedCornerShape(16.dp))
            ) {
                Row(
                    modifier = Modifier.padding(horizontal = 12.dp, vertical = 6.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(Icons.Default.Timer, contentDescription = "Tiempo", tint = DarkGreen, modifier = Modifier.size(16.dp))
                    Spacer(modifier = Modifier.width(4.dp))
                    Text(text = "15:00", fontWeight = FontWeight.Bold, color = DarkGreen, fontSize = 14.sp)
                }
            }
        }

        Spacer(modifier = Modifier.height(24.dp))

        // 2. Barra de progreso
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "Progreso Simulador", fontSize = 12.sp, color = PrimaryGreen)
            Text(text = "20% completado", fontSize = 12.sp, color = PrimaryGreen, fontWeight = FontWeight.Bold)
        }
        Spacer(modifier = Modifier.height(8.dp))
        LinearProgressIndicator(
            progress = { 0.2f },
            modifier = Modifier.fillMaxWidth().height(8.dp),
            color = DarkGreen,
            trackColor = LightGreen,
        )

        Spacer(modifier = Modifier.height(32.dp))

        // 3. Etiqueta de la materia y Pregunta
        Surface(
            color = Color.White,
            shape = RoundedCornerShape(16.dp),
            modifier = Modifier.border(1.dp, LightGreen, RoundedCornerShape(16.dp))
        ) {
            Text(
                text = "BIOLOGÍA CELULAR",
                modifier = Modifier.padding(horizontal = 12.dp, vertical = 4.dp),
                fontSize = 10.sp,
                fontWeight = FontWeight.Bold,
                color = PrimaryGreen
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "¿Cuál es la función principal de la mitocondria en la célula?",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
            color = DarkGreen
        )

        Spacer(modifier = Modifier.height(32.dp))

        // 4. Opciones de respuesta
        val opciones = listOf("A) Producir energía (ATP)", "B) Almacenar ADN", "C) Sintetizar proteínas", "D) Regular el pH celular")

        opciones.forEach { opcion ->
            OutlinedButton(
                onClick = { /* Acción para seleccionar respuesta */ },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 12.dp)
                    .height(56.dp),
                colors = ButtonDefaults.outlinedButtonColors(containerColor = Color.White),
                border = androidx.compose.foundation.BorderStroke(1.dp, LightGreen),
                shape = RoundedCornerShape(12.dp)
            ) {
                Text(
                    text = opcion,
                    color = DarkGreen,
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Start
                )
            }
        }

        Spacer(modifier = Modifier.weight(1f)) // Empuja los botones de abajo hasta el fondo

        // 5. Botones inferiores
        Button(
            onClick = { /* Siguiente */ },
            modifier = Modifier.fillMaxWidth().height(56.dp),
            colors = ButtonDefaults.buttonColors(containerColor = DarkGreen),
            shape = RoundedCornerShape(12.dp)
        ) {
            Text(text = "Siguiente Pregunta", color = Color.White, fontSize = 16.sp)
        }

        Spacer(modifier = Modifier.height(16.dp))

        TextButton(
            onClick = { /* Pausar */ },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Pausar Simulador", color = PrimaryGreen, fontWeight = FontWeight.Bold)
        }
    }
}