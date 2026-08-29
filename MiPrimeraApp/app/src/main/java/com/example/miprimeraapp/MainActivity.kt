package com.example.miprimeraapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.miprimeraapp.ui.theme.MiPrimeraAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MiPrimeraAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column(modifier = Modifier.padding(innerPadding)) {
                        FichaDelEstudiante()
                    }
                }
            }
        }
    }
}

@Composable
fun FichaDelEstudiante() {
    val nombre = "Ana"
    val edad = 20
    val promedio = 8.25
    val cursaProgramacion = true
    val materias: Int = 5
    val ciudad: String = "Cordoba"

    Column() {
        Text("Nombre: $nombre")
        Text("Edad: $edad")
        Text("Promedio: $promedio")
        Text("Cursa Programacion: $cursaProgramacion")
        Text("Año Proximo: ${edad + 1}")
        Text("Materias: $materias")
        Text("Ciudad: $ciudad")
    }
}

@Preview(showBackground = true)
@Composable
fun FichaDelEstudiantePreview() {
    MiPrimeraAppTheme() {
        FichaDelEstudiante()
    }
}