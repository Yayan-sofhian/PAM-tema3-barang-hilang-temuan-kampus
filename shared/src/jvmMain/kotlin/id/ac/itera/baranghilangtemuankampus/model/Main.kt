package id.ac.itera.baranghilangtemuankampus.model

import id.ac.itera.baranghilangtemuankampus.data.pantauStatus
import id.ac.itera.baranghilangtemuankampus.data.SumberLaporanPalsu
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    val sumber = SumberLaporanPalsu()
    val laporan = sumber.ambil(1)

    println("Laporan: ${laporan.ringkas()}")

    println("Status laporan:")
    sumber.pantau(1).collect { laporanPantau ->
        println(laporanPantau.ringkas())
    }
    println("Status laporan:")
    pantauStatus(1).collect { status ->
        println(status.label())
    }
}
