package id.ac.itera.baranghilangtemuankampus.data

import id.ac.itera.baranghilangtemuankampus.model.Laporan
import id.ac.itera.baranghilangtemuankampus.model.StatusLaporan
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

suspend fun ambilLaporan(id: Int): Laporan {
    delay(1000)

    return Laporan(
        id = id,
        namaBarang = "Dompet hitam",
        deskripsi  = "Dompet tertinggal di kelas",
        lokasi     = "Gedung E",
        jenis      = "Hilang",
        fotoUrl    = null
    )
}

fun pantauStatus(id: Int): Flow<StatusLaporan> = flow {
    emit(StatusLaporan.Baru)
    delay(1000)

    emit(StatusLaporan.Diproses("Petugas Kampus"))
    delay(1000)

    emit(StatusLaporan.Selesai("Barang sudah ditemukan"))
}

interface Sumber<T> {
    suspend fun ambil(id: Int): T
    fun pantau(id: Int): Flow<T>
}


class SumberLaporanPalsu : Sumber<Laporan> {
    override suspend fun ambil(id: Int): Laporan {
        return ambilLaporan(id)
    }

    override fun pantau(id: Int): Flow<Laporan> = flow {
        val laporanAwal = ambilLaporan(id)
        emit(laporanAwal)

        emit(
            laporanAwal.copy(
                status = StatusLaporan.Diproses("Petugas Kampus")
            )
        )

        delay(100)

        emit(
            laporanAwal.copy(
                status = StatusLaporan.Selesai("Barang sudah ditemukan")
            )
        )
    }
}

