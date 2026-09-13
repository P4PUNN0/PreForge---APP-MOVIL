package com.example.preforge // Asegúrate de que coincida con tu paquete

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CloudUpload
import androidx.compose.material.icons.filled.Person
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
fun DashboardScreen(onNavigateToSimulator: () -> Unit = {}) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(BackgroundGreen)
            .padding(24.dp)
    ) {
        // 1. Encabezado del usuario
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ) {
            Icon(
                imageVector = Icons.Default.Person,
                contentDescription = "Perfil",
                tint = DarkGreen,
                modifier = Modifier.size(40.dp)
            )
            Spacer(modifier = Modifier.width(12.dp))
            Column {
                Text(text = "¡Hola, Estudiante!", fontSize = 12.sp, color = PrimaryGreen)
                Text(text = "Rodrigo Pèrez", fontSize = 18.sp, fontWeight = FontWeight.Bold, color = DarkGreen)
            }
        }

        Spacer(modifier = Modifier.height(32.dp))

        // 2. Título de la sección
        Text(
            text = "Sube tus apuntes",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = DarkGreen
        )
        Text(
            text = "Sube archivos, fotos de tus libretas o texto y déjalos listos para el examen.",
            fontSize = 14.sp,
            color = PrimaryGreen
        )

        Spacer(modifier = Modifier.height(24.dp))

        // 3. Área de carga de archivos (Card)
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .border(2.dp, LightGreen, RoundedCornerShape(16.dp)),
            colors = CardDefaults.cardColors(containerColor = Color.White),
            shape = RoundedCornerShape(16.dp)
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Icon(
                    imageVector = Icons.Default.CloudUpload,
                    contentDescription = "Subir",
                    tint = PrimaryGreen,
                    modifier = Modifier.size(48.dp)
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = "Arrastra o selecciona tus archivos",
                    fontWeight = FontWeight.Bold,
                    color = DarkGreen
                )
                Text(
                    text = "Admite PDF, DOCX, TXT hasta 20 MB",
                    fontSize = 12.sp,
                    color = PrimaryGreen
                )
            }
        }

        Spacer(modifier = Modifier.height(32.dp))

        // 4. Botón Generar
        Button(
            onClick = onNavigateToSimulator,
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp),
            colors = ButtonDefaults.buttonColors(containerColor = DarkGreen),
            shape = RoundedCornerShape(12.dp)
        ) {
            Text(text = "Generar Simulador", color = Color.White, fontSize = 16.sp)
        }
    }
}