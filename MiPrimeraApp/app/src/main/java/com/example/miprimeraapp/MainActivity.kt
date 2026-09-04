package com.example.miprimeraapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Text(
                        text = "Esto es un Contador",
                        style = MaterialTheme.typography.headlineLarge,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp, vertical = 200.dp)
                    )
                    ContadorDeNumeros()
                }
            }
        }
    }
}

@Composable
fun ContadorDeNumeros() {

    var contador by remember { mutableIntStateOf(0) }

    // Wrap everything in a Column to stack elements vertically
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp, Alignment.CenterVertically)
    ) {
        // Display the count
        Text(
            text = "Cuenta: $contador",
            style = MaterialTheme.typography.headlineLarge
        )

        // Row 1: Increase / Decrease Buttons
        Row(
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Button(onClick = { contador-- }, enabled = contador > 0) { //no puede ser 0
                Text(text = "-1", fontSize = 20.sp)
            }

            Button(onClick = { contador++ }) {
                Text(text = "+1", fontSize = 20.sp)
            }
        }

        // Row 2: Reset Button
        Button(
            onClick = { contador = 0 }, // Reset state back to 0
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF6200EE)
            ),
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "REINICIAR",
                color = Color.White,
                fontWeight = FontWeight.Bold
            )
        }
    }
}