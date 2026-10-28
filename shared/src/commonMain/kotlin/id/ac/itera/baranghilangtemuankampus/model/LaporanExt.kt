package id.ac.itera.baranghilangtemuankampus.model

fun StatusLaporan.label(): String = when (this) {
    StatusLaporan.Baru -> "Menunggu petugas"
    is StatusLaporan.Diproses -> "Ditangani $petugas"
    is StatusLaporan.Selesai -> "Selesai: $catatan"
}

fun Laporan.ringkas(): String =
    "#$id $namaBarang, $lokasi"