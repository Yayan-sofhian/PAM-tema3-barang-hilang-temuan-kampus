package id.ac.itera.baranghilangtemuankampus.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import id.ac.itera.baranghilangtemuankampus.model.Laporan
import id.ac.itera.baranghilangtemuankampus.model.label
import id.ac.itera.baranghilangtemuankampus.model.ringkas

@Composable
fun KartuLaporan(laporan: Laporan) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Text(
                text = laporan.namaBarang,
                style = MaterialTheme.typography.titleMedium
            )

            Text(text = laporan.ringkas())

            Text(text = laporan.deskripsi)

            Row {
                Text(
                    text = laporan.jenis,
                    style = MaterialTheme.typography.bodyMedium
                )
            }

            Text(
                text = laporan.status.label(),
                style = MaterialTheme.typography.bodyMedium
            )
        }
    }
}