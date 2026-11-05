package id.ac.itera.baranghilangtemuankampus.ui

import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import id.ac.itera.baranghilangtemuankampus.model.Laporan
import id.ac.itera.baranghilangtemuankampus.model.StatusLaporan

@Composable
fun DaftarLaporan(modifier: Modifier = Modifier) {

    val semuaLaporan = listOf(
        Laporan(1, "Dompet hitam", "Dompet tertinggal di kelas", "Gedung E", "Hilang", null),
        Laporan(
            2, "Kunci motor", "Kunci ditemukan di parkiran",
            "Parkiran A", "Temuan", null,
            status = StatusLaporan.Diproses("Petugas Kampus")
        ),
        Laporan(
            3, "Botol minum", "Botol tertinggal di laboratorium",
            "Lab Informatika", "Hilang", null,
            status = StatusLaporan.Selesai("Barang sudah ditemukan")
        ),
        Laporan(4, "Flashdisk", "Flashdisk ditemukan di meja", "Gedung C", "Temuan", null),
        Laporan(5, "Tas hitam", "Tas tertinggal di kantin", "Kantin", "Hilang", null),
        Laporan(
            6,
            "Buku catatan",
            "Buku ditemukan di perpustakaan",
            "Perpustakaan",
            "Temuan",
            null
        ),
        Laporan(7, "Helm putih", "Helm tertinggal di parkiran", "Parkiran B", "Hilang", null),
        Laporan(8, "Kartu mahasiswa", "Kartu ditemukan dekat kelas", "Gedung B", "Temuan", null),
        Laporan(9, "Payung biru", "Payung tertinggal di masjid", "Masjid Kampus", "Hilang", null),
        Laporan(10, "Charger laptop", "Charger ditemukan di kelas", "Gedung D", "Temuan", null)
    )

    LazyColumn(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(
            semuaLaporan.sortedByDescending { it.id },
            key = { it.id }
        ) { laporan ->
            KartuLaporan(laporan)
        }
    }
}