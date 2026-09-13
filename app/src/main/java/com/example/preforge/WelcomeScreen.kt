package com.example.preforge

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Bolt
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.preforge.ui.theme.* // Importamos nuestros colores


@Composable
fun WelcomeScreen(onNavigateToDashboard: () -> Unit = {}) {
    // Column apila los elementos de arriba hacia abajo
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(BackgroundGreen) // Fondo verde clarito
            .padding(24.dp), // Espacio en las orillas
        horizontalAlignment = Alignment.CenterHorizontally, // Centrar todo
        verticalArrangement = Arrangement.Center
    ) {

        // 1. Icono simulando tu logo
        Icon(
            imageVector = Icons.Default.Bolt,
            contentDescription = "Logo",
            tint = DarkGreen,
            modifier = Modifier.size(80.dp)
        )

        Spacer(modifier = Modifier.height(16.dp)) // Espacio vacío

        // 2. Textos principales
        Text(
            text = "PrepForge",
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
            color = DarkGreen
        )
        Text(
            text = "LA EXAM ENGINE",
            fontSize = 12.sp,
            color = PrimaryGreen,
            letterSpacing = 2.sp
        )

        Spacer(modifier = Modifier.height(48.dp))

        // 3. Eslogan
        Text(
            text = "De tus apuntes a tu examen perfecto en segundos",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = DarkGreen,
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Carga tus resúmenes o PDFs y nuestro AI generará simuladores interactivos de alta fidelidad al instante.",
            fontSize = 14.sp,
            color = PrimaryGreen,
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(48.dp))

        // 4. Botón Iniciar Sesión (Relleno oscuro)
        Button(
            onClick = onNavigateToDashboard,
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp),
            colors = ButtonDefaults.buttonColors(containerColor = DarkGreen),
            shape = RoundedCornerShape(12.dp)
        ) {
            Text(text = "Iniciar Sesión", color = Color.White, fontSize = 16.sp)
        }

        Spacer(modifier = Modifier.height(16.dp))

        // 5. Botón Registrarse (Fondo blanco, borde oscuro)
        OutlinedButton(
            onClick = { /* Acción futura */ },
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp),
            colors = ButtonDefaults.outlinedButtonColors(containerColor = Color.White),
            border = androidx.compose.foundation.BorderStroke(1.dp, DarkGreen),
            shape = RoundedCornerShape(12.dp)
        ) {
            Text(text = "Registrarse Gratis", color = DarkGreen, fontSize = 16.sp)
        }
    }
}