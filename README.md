# Barang Hilang dan Temuan Kampus

Aplikasi ini dibuat untuk membantu mahasiswa melaporkan barang yang hilang atau ditemukan di lingkungan kampus.

## Informasi Kelompok

- **Nomor Tema:** 3
- **Nama Tema:** Barang Hilang dan Temuan Kampus
- **Ketua Kelompok:** Yayan Sofhian

## Anggota Kelompok

| Nama | NIM |
|---|---|
| Yayan Sofhian | 124140203 |
| Dimas Zhafran Adiwiyoto | 124140029 |

---

## Modul 2 — Model Data, Coroutines, dan Flow

### Tentang Modul 2

Pada modul ini, kami mulai membuat model data untuk aplikasi Barang Hilang dan Temuan Kampus. Kami juga mencoba mengambil data laporan menggunakan `suspend function` dan memantau perubahan status laporan menggunakan Kotlin Flow.

### Hasil Pengujian

Program berhasil dijalankan tanpa error. Berikut hasil output yang muncul saat program dijalankan:

```text
Laporan: #1 Dompet hitam, Gedung E
Pantauan laporan:
#1 Dompet hitam, Gedung E
Status laporan:
Menunggu petugas
Ditangani Petugas Kampus
Selesai: Barang sudah ditemukan

BUILD SUCCESSFUL
```

---

## Modul 3 — Dasar Compose Multiplatform

### Tentang Modul 3

Pada modul ini, kami mulai mengembangkan tampilan aplikasi Barang Hilang dan Temuan Kampus menggunakan Compose Multiplatform. Model data yang sudah dibuat pada modul sebelumnya mulai kami gunakan untuk menampilkan informasi barang hilang dan temuan dalam bentuk tampilan yang lebih mudah dibaca.

Kami membuat kartu untuk menampilkan informasi setiap laporan, seperti nama barang, deskripsi, lokasi, jenis laporan, dan statusnya. Selain itu, kami juga menampilkan 10 contoh laporan menggunakan `LazyColumn` agar daftar laporan bisa digulir ke bawah.

### Hasil Pengerjaan

Beberapa hal yang sudah kami kerjakan pada modul ini:

- Membuat tampilan kartu untuk setiap laporan barang.
- Menampilkan 10 data contoh barang hilang dan temuan.
- Menampilkan status laporan, mulai dari Baru, Diproses, hingga Selesai.
- Mengurutkan daftar laporan berdasarkan ID dari yang terbesar ke terkecil.
- Menambahkan tombol (+) untuk menambahkan laporan baru. Untuk saat ini, tombol tersebut masih berupa tampilan dan belum memiliki fungsi.

### Hasil Pengujian

Setelah semua bagian selesai dibuat, kami mencoba menjalankan aplikasi melalui emulator Android. Hasilnya, aplikasi berhasil dibuka dan menampilkan 10 laporan dengan informasi serta status yang sesuai.

Daftar laporan juga bisa digulir ke bawah, dan tombol tambah berhasil ditampilkan pada halaman utama aplikasi.

### Screenshot Aplikasi

![Screenshot Modul 3](Screenshot/Modul%203.png)

---

## Pembagian Tugas

| Nama | Tugas |
|---|---|
| Yayan Sofhian | Membuat model data, mengimplementasikan sumber data laporan, menguji program menggunakan Coroutines dan Flow, serta mengembangkan tampilan aplikasi menggunakan Compose Multiplatform. |
| Dimas Zhafran Adiwiyoto | Berkontribusi dalam pengerjaan proyek dan pengembangan aplikasi sesuai pembagian tugas kelompok. |