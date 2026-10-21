package id.ac.itera.baranghilangtemuankampus

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*

import androidx.compose.ui.Alignment

@Composable
fun App() = MaterialTheme {
    var tampil by remember { mutableStateOf(false) }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Barang Hilang Temuan Kampus")

        Button(onClick = { tampil = !tampil }) {
            Text("Cek platform")
        }

        AnimatedVisibility(tampil) {
            Text("Aplikasi berjalan di ${getPlatform().name}")
        }
    }
}