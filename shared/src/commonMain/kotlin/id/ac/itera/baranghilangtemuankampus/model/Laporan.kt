package id.ac.itera.baranghilangtemuankampus.model

data class Laporan(
    val id: Int,
    val namaBarang: String,
    val deskripsi: String,
    val lokasi: String,
    val jenis: String,
    val fotoUrl: String?,
    val status: StatusLaporan = StatusLaporan.Baru
)

