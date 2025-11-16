# 💰 Aplikasi Keuangan "Dompet Saya"

Aplikasi desktop berbasis **Java Swing** untuk mencatat pemasukan dan pengeluaran harian.
Dilengkapi fitur **Ekspor & Impor data ke file CSV**, perhitungan **Saldo Otomatis**, dan dibangun menggunakan arsitektur **DAO Pattern** yang bersih.

---

## 🧱 Fitur Utama

✅ **Manajemen Transaksi (CRUD)**
- Menambah data pemasukan atau pengeluaran baru ke dalam daftar.
- Mengubah data (deskripsi, jumlah, tipe) yang sudah ada di daftar.
- Menghapus transaksi yang dipilih dari daftar.

✅ **Perhitungan Saldo Otomatis**
- Menghitung total saldo (Pemasukan - Pengeluaran) secara *real-time*.
- Label saldo akan otomatis berwarna **Merah** jika total saldo negatif.

✅ **Ekspor & Impor Data CSV**
- Menyimpan semua data transaksi di daftar ke dalam file `.csv`.
- Dapat memuat data dari file `.csv` untuk me-restore data, menggantikan data yang ada saat ini.

✅ **Daftar Transaksi Interaktif (JList)**
- Menampilkan daftar semua transaksi (yang terbaru di atas).
- Saat item di daftar diklik, data akan otomatis muncul di form untuk diubah atau dihapus.

---

## 🧩 Komponen GUI yang Digunakan

| Komponen | Nama Variabel | Fungsi |
| :--- | :--- | :--- |
| JFrame | `AplikasiKeuangan` | Wadah utama aplikasi. |
| JPanel | `jPanel1`, `jPanel2`, `panel` | Panel utama untuk menyusun komponen. |
| JList | `listTransaksi` | Menampilkan daftar semua transaksi. |
| JScrollPane | `jScrollPane1`, `jScrollPane2` | Membungkus list dan text area agar bisa discroll. |
| JLabel | `lblTotalSaldo` | Menampilkan total saldo saat ini. |
| JLabel | `jLabel1`, `jLabel2`, `jLabel3`, `jLabel4` | Label teks informatif (Judul, Tipe, Deskripsi, Jumlah). |
| JRadioButton | `radioPemasukan`, `radioPengeluaran` | Memilih tipe transaksi (Pemasukan/Pengeluaran). |
| ButtonGroup | `buttonGroup1` | Mengelompokkan RadioButton agar hanya satu yang bisa dipilih. |
| JTextArea | `txtDeskripsi` | Tempat pengguna memasukkan deskripsi transaksi. |
| JTextField | `txtJumlah` | Tempat pengguna memasukkan nominal uang. |
| JButton | `btnTambah`, `btnUbah`, `btnHapus` | Tombol aksi utama untuk memanipulasi data. |
| JButton | `btnEkspor`, `btnImpor` | Tombol untuk menyimpan/memuat data dari file CSV. |
| JButton | `btnBersihkan` | Tombol untuk membersihkan form input. |

---

## ⚙️ Cara Menggunakan

### 1️⃣ Jalankan Program
Buka proyek di **NetBeans** dan jalankan kelas utama `AplikasiKeuangan.java`.

### 2️⃣ Tambah Transaksi
1. Isi form: **Tipe Transaksi**, **Deskripsi**, dan **Jumlah**.
2. Klik tombol **"Tambah"**.
3. Data akan muncul di daftar dan saldo akan ter-update.

### 3️⃣ Ubah Transaksi
1. **Klik salah satu item** di daftar transaksi.
2. Data transaksi tersebut akan otomatis muncul di form.
3. Ubah data di form sesuai keinginan.
4. Klik tombol **"Ubah"**.

### 4️⃣ Hapus Transaksi
1. **Klik salah satu item** di daftar transaksi.
2. Klik tombol **"Hapus"**.
3. Sebuah dialog konfirmasi akan muncul sebelum data dihapus.

### 5️⃣ Ekspor Data
1. Klik tombol **"EKSPOR"**.
2. Pilih lokasi dan beri nama file `.csv` Anda.
3. Semua data di daftar akan disimpan ke file tersebut.

### 6️⃣ Impor Data
1. Klik tombol **"IMPORT"**.
2. Pilih file `.csv` yang sesuai.
3. Konfirmasi impor (ini akan **menghapus semua data saat ini**).
4. Data dari file akan dimuat ke dalam aplikasi.

---

## 📂 Arsitektur & Pola Desain

Proyek ini tidak menggunakan API eksternal, melainkan menggunakan **Pola Desain DAO (Data Access Object)** untuk memisahkan logika bisnis dari penyimpanan data.

* **`Transaksi.java`**: Model (POJO) yang menyimpan data transaksi.
* **`TransaksiDAO.java`**: *Interface* yang mendefinisikan operasi data (CRUD).
* **`TransaksiListDAO.java`**: Implementasi DAO yang menggunakan `ArrayList` sebagai database *in-memory*.
