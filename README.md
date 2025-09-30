# Sistem Reservasi di Gacoan

## Deskripsi Singkat

Sistem Reservasi di Gacoan dibuat untuk membantu admin atau karyawan untuk mengelola peesanan reeservasi yang ada di Gacoan. Program ini memungkinkan admin atau karyawan yang ada di Gacoan untuk Melihat, Membuat, Memperbarui, dan Menghapus data reservasi pelanggan, namun dalam pt 2 kali ini pengguna dapat melakukan pencarian untuk pelanggan yang telah melakukan reservasi, program juga membantu pengguna untuk mengatasi kesalahan kecil seperti kesalahan penginputan data atau tipe data tidak sesuai menggunakan validasi input.

## Penjelasan Alur Program

### 1. Menu Utama

<img width="266" height="147" alt="image" src="https://github.com/user-attachments/assets/945c5d56-603f-4ced-8162-a43ac15579f1" />

Pada Menu Utama ini admin atau karyawan dapat memilih untuk melihat, menambah reservasi dine in, menambah reservasi take away, memperbarui atau bahkan menghapus data reservasi pelanggan.

### 2. Lihat Reservasi

<img width="469" height="414" alt="image" src="https://github.com/user-attachments/assets/2c8e5e2b-7227-4ad8-9dff-cd3836941ed3" />

Ketika admin atau karyawan memilih opsi 1 maka program akan menampilkan data yang tersedia atau pelanggan yang telah melakukan reservasi (di ambil dari data dummy).

### 2.1 Searching
<img width="469" height="216" alt="image" src="https://github.com/user-attachments/assets/02ca8350-0c6d-4e09-8884-d254a7431cf4" />

Pengguna dapat melakukan penacrian berdasarkan nama pelanggan untuk mempermudah pengguna untuk melakukan pencarian pelanggan reservasi.


### 3. Buat Reservasi

#### 3.1 Fitur Buat Reservasi apabila pelanggan melakukan PO

<img width="587" height="366" alt="image" src="https://github.com/user-attachments/assets/dc2879a4-ca79-4b12-b795-92d274b3615e" />

Pada program ini admin dapat memilih pesanan apa yang di inginkan pelanggan serta langsung memberikan total harga yang telah di pre-Order oleh pelanggan, pada program ini admin atau karyawan dapat kembali ke menu utama dengan mengetikkan 0 di awal (Menginputkan nama pelanggan).

#### 3.2 Fitur Buat Reservasi apabila pelanggan tidak melakukan PO

<img width="301" height="160" alt="image" src="https://github.com/user-attachments/assets/7102c9ca-919a-4b74-acc4-90a54600ebd3" />

Pada fitur ini program akan langsung berhenti apabila pelanggan tidak melakukan pre-Order melainkan hanya melakukan reservasi meja dan waktu saja, admin atau karyawan dapat kembali ke menu utama dengan mengetikkan 0 di awal (Menginputkan nama pelanggan).

### 3.3 Validasi Inputan

<img width="333" height="279" alt="image" src="https://github.com/user-attachments/assets/931acc8f-df39-4cb4-99f4-21692a23e26b" />

Pengguna dapat meminimalisir untuk kesalahan kecil seperti salah memasukkan tipe data.

### 3.4 Detail reservasi Dine In

<img width="469" height="170" alt="image" src="https://github.com/user-attachments/assets/2d75d332-0be1-4c14-863f-75db7c7b0b1d" />

terlihat untuk detail reservasi dine in menampilkan nomor meja dan jumlah orang

### 3.5 Detail reservasi Take Away

<img width="480" height="170" alt="image" src="https://github.com/user-attachments/assets/5943c4e5-7ed3-4332-a00d-5ecbf5985f73" />

untuk detail reservasi take away akan menampilkan status apakah pesanan pelanggan sudah di ambil atau belum


### 4. Perbarui Reservasi

<img width="692" height="448" alt="image" src="https://github.com/user-attachments/assets/78a815f8-caed-4644-a333-cd7f2bdc42f2" />

Pada fitur ini admin dapat memperbarui bagian - bagian yang perlu dan jika ada kolom yang tidak ingin diperbarui cukup tekan enter, admin atau karyawan dapat kembali ke menu utama dengan mengetikkan 0 di awal.

### 5. Hapus Reservasi

<img width="410" height="154" alt="image" src="https://github.com/user-attachments/assets/68904404-56d5-43e9-abcd-c9459436864a" />

Pada fitur ini admin dapat menghapus reservasi pelanggan dengan memilih index atau nomor yang telah di sediakan, admin atau karyawan dapat kembali ke menu utama dengan mengetikkan 0 di awal.

### 6. Keluar dari Program
<img width="519" height="243" alt="image" src="https://github.com/user-attachments/assets/17ca1fb6-437c-438a-b09a-7a9d10888875" />

Ketika admin atau karyawan ingin keluar dari program dapat menginputkan 6 pada menu utama.

### 7. Package MVC + Service

<img width="142" height="95" alt="image" src="https://github.com/user-attachments/assets/bef2bf6c-5793-4512-82ae-31f8a27e4843" />

- Model -> Package model digunakan untuk menyiapkan, mengatur dan mengelola data dalam kasus program ini package model digunakan untuk menyiapkan field, konstruktor serta data dummy.
  
- View  -> Pacakge view digunakan untuk mengatur ui atau tampilan dalam program dalam kasus program ini package view digunakan untuk beberapa tampilan salah satunya adalah tampilan menu.
- Controller -> Package ini digunakan untuk menghubungkan model, view dan service dalam kasus program saya controller ini menerima inputan dari pengguna (view) lalu di teruskan ke service.
- Service -> Package ini adalah logika atau inti dalam program, dalam kasus program saya service ini di gunakan untuk membuat CRUD, validasi inputan dan kode penting lainnya berada dalam service.
- Main -> Package main dalam program ini digunakan agar program java tetap berjalan.

### 8. Tambahan kode
<img width="981" height="438" alt="image" src="https://github.com/user-attachments/assets/4ec0338a-bae4-4656-ae64-a8c3a5f784f8" />

<img width="947" height="385" alt="image" src="https://github.com/user-attachments/assets/845abb5e-3951-469f-b2f5-6ec32f3bdf6c" />

Menjadikan Reservasi super class dan menambahkan sub class yang bernama DineIn dan TakeAway, kemudian menerapkan setter getter agar setNama(), setWaktu(), getNama(), getWaktu() dst dapat di pakai dalam controller, service maupun view, untuk override dilakukan getDetail karena reservasi untuk TakeAway dan DineIn memiliki fungsi yang sama yaitu memberikan info yang lebih detail untuk pelanggan yang melakukan reservasi.

### 8. Abstraction, Interface, Overriding dan Overloading

    A. Abstraction
      - Class Reservasi dijadikan abstract class.
      - Reservasi hanya berisi atribut umum dan method abstract getDetail().
      - Detail implementasi digunakan ke subclass (DineIn dan TakeAway).

    B. Interface
      - Membuat interface CRUD agar lebih mudah di panggil kedepannya namun untuk sekarang hanya pada ReservasiService.

    C. Overriding
      - getDetail() di-override pada DineIn dan TakeAway.

    D. Overloading
      - Constructor DineIn dan TakeAway dibuat lebih dari satu versi (parameter berbeda), dan digunakan pada dataDummy.
