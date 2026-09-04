package com.example.miprimeraapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.miprimeraapp.ui.theme.MiPrimeraAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MiPrimeraAppTheme {
                Column(modifier = Modifier.fillMaxWidth().padding(16.dp)) {
                    Text(
                        text = "Perfil",
                        style = MaterialTheme.typography.titleLarge,
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(top = 32.dp, bottom = 8.dp)
                    )
                    DatoEstudiante("Nombre", "Ana")
                    DatoEstudiante("Carrera", "Sistemas")
                    DatoEstudiante("Anio", "1")
                    Text(descripcionEdad(30))
                    Text(descripcionEdadModif(15))
                    Text(descripcionEdadModif(24))
                }

            }
        }
    }
}

@Composable
fun DatoEstudiante(etiqueta: String, valor: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp),
        horizontalArrangement = Arrangement.SpaceBetween // Separa etiqueta a la izquierda y valor a la derecha
    ){
        Text("$etiqueta: $valor")
    }
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

//Calculador de edad
fun descripcionEdadModif(edad: Int): String {
    if (edad < 18){
        return "Mi edad es $edad anios y soy menor de edad"
    }
    else{
        return "Mi edad es $edad anios y soy mayor de edad"
    }
}
