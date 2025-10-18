# 🧾 Implementasi JasperReports dalam Pembuatan Laporan Otomatis pada Aplikasi Java



## 📘 Deskripsi Proyek

Proyek ini merupakan hasil praktikum **Pemrograman Berbasis Objek** dengan tujuan menerapkan **JasperReports** sebagai library untuk membuat **laporan otomatis** pada aplikasi berbasis **Java**.
JasperReports berfungsi untuk mengompilasi file desain laporan (`.jrxml`) menjadi file laporan siap pakai (`.jasper`) yang dapat menampilkan data dari **database** secara dinamis.

Dalam proyek ini, pembuatan laporan dilakukan menggunakan **NetBeans** dengan menambahkan **plugin iReport 5.0.6** dan **Swing Layout Extensions RELEASE65** agar fitur JasperReports dapat dijalankan langsung di IDE tanpa harus menggunakan **Jaspersoft Studio**.

Selain itu, dibuat class khusus **`CompileReport`** untuk mengompilasi laporan secara manual karena versi **JDK 24** yang digunakan tidak lagi mendukung kompilasi otomatis JasperReports akibat perubahan sistem modul Java.

---

## ⚙️ Teknologi dan Tools yang Digunakan

| Komponen               | Deskripsi                                                                                                        |
| ---------------------- | ---------------------------------------------------------------------------------------------------------------- |
| **Bahasa Pemrograman** | Java                                                                                                             |
| **JDK Versi**          | 24                                                                                                               |
| **IDE**                | Apache NetBeans                                                                                                  |
| **Library Utama**      | JasperReports                                                                                                    |
| **Library Tambahan**   | `groovy-all-2.4.5.jar`,`groovy-3.0.20.jar` `org-jdesktop-layout-RELEASE65.jar`, `commons-beanutils.jar`, `commons-logging.jar`, dll |
| **Plugin Tambahan**    | iReport 5.0.6                                                                                                    |
| **Database**           | MySQL                                                                                                            |
| **Output Laporan**     | PDF                                                                                                              |

---

## 🧩 Struktur Proyek
<img width="472" height="362" alt="image" src="https://github.com/user-attachments/assets/03bbd8ba-7318-47dd-a0a4-0c998a248191" />



## 🪜 Langkah-Langkah Implementasi

### 1️⃣ Instalasi Plugin iReport dan Swing Layout Extensions

1. Unduh **iReport 5.0.6** serta **Swing Layout Extensions (RELEASE65)**.
2. Buka **NetBeans → Tools → Plugins → Downloaded → Add Plugins**.
3. Tambahkan keempat file plugin dari iReport dan file `org-jdesktop-layout-RELEASE65.nbm`.
4. Klik **Install**, lalu aktifkan plugin `ireport-designer`, `jasperreports-extensions`, `jasperserver-plugin`, dan `jasperreports-components`.
5. Restart NetBeans untuk memuat plugin.

---

### 2️⃣ Membuat Jasper Report di NetBeans

1. Klik kanan pada package → **New → Other → Report → Report Wizard**.
2. Pilih layout (misalnya *Simple Blue*) lalu klik **Next**.
3. Beri nama laporan, misalnya `ReportDataPasien`.
4. Buat koneksi database baru (JDBC Connection) dan hubungkan ke database proyek.
5. Masukkan query, contoh:

   ```sql
   SELECT * FROM data_pasien;
   ```
6. Pindahkan semua kolom ke sisi kanan, klik **Next → Finish**.
7. Sesuaikan desain laporan sesuai kebutuhan (judul, kolom, font, warna, dll).

---

### 3️⃣ Membuat Class CompileReport

Class ini digunakan untuk **mengompilasi file .jrxml menjadi .jasper** secara manual.
Hal ini diperlukan karena **JDK 24** tidak mendukung kompilasi otomatis akibat perubahan sistem modul Java.
<img width="980" height="402" alt="image" src="https://github.com/user-attachments/assets/4862f52c-d7ff-4d13-b3a8-f592967aee1f" />


### 4️⃣ Menambahkan Tombol Cetak di GUI

* Buka form `DataPasien.java`
* Tambahkan tombol **Cetak**
* Tambahkan kode berikut pada event *ActionPerformed* tombol tersebut:
<img width="939" height="476" alt="image" src="https://github.com/user-attachments/assets/9a767b6b-0293-4893-84d6-8a9afdd24669" />
<img width="441" height="353" alt="image" src="https://github.com/user-attachments/assets/447f9c3b-3764-4ebe-9af4-0fa31132b9c2" />
<img width="906" height="476" alt="image" src="https://github.com/user-attachments/assets/ab7ae4cf-8b89-460d-bec7-3dcd38be772e" />



### 5️⃣ Mengekspor Laporan ke PDF

Setelah laporan tampil, pengguna dapat menyimpannya sebagai **PDF** dengan klik ikon *save/memory disk* di pojok kiri atas viewer, lalu tentukan lokasi penyimpanan file.
<img width="929" height="523" alt="image" src="https://github.com/user-attachments/assets/8e352427-8087-4172-be76-487c7c69f1cb" />


## 🧠 Kesimpulan

Melalui implementasi ini, dapat disimpulkan bahwa **JasperReports** sangat membantu dalam proses pembuatan laporan otomatis pada aplikasi berbasis Java.
Dengan membuat class **CompileReport**, proses kompilasi file `.jrxml` ke `.jasper` tetap dapat dijalankan pada **JDK 24**, yang tidak mendukung kompilasi otomatis.
Hasil akhirnya adalah laporan yang terhubung langsung dengan database dan dapat diekspor ke berbagai format seperti **PDF**, **HTML**, atau **Excel**, tanpa memerlukan **Jaspersoft Studio**.


