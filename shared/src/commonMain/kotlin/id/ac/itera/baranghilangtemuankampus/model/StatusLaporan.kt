package id.ac.itera.baranghilangtemuankampus.model
sealed class StatusLaporan {
    data object Baru : StatusLaporan()
    data class Diproses(val petugas: String) : StatusLaporan()
    data class Selesai(val catatan: String) : StatusLaporan()
}