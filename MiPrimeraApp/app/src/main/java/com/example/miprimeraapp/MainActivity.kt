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
                        DatoEstudiante("Nombre", "Ana")
                        DatoEstudiante("Carrera", "Sistemas")
                        DatoEstudiante("Anio", "1")
                        Text("${descripcionEdad(30)}")
                        Text("${descripcionEdadModif(15)}")
                        Text("${descripcionEdadModif(24)}")

                    }
                }
            }
        }
    }
}

@Composable
fun DatoEstudiante(etiqueta: String, valor: String) {
    Text("$etiqueta: $valor")
}


@Preview(showBackground = true)
@Composable
fun DatoEstudiantePreview() {
    MiPrimeraAppTheme() {
        DatoEstudiante("Anio", "1")
    }
}

fun descripcionEdad(edad: Int): String {
    return "Edad: $edad anios"
}

fun descripcionEdadModif(edad: Int): String {
    if (edad < 18){
        return "Mi edad es $edad anios y soy menor de edad"
    }
    else{
        return "Mi edad es $edad anios y soy mayor de edad"
    }
}
