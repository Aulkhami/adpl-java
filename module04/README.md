# Module 4 - GUI Part 3 & Java Database Connectivity (JDBC)
## Panduan Pengerjaan Laporan Praktikum
### Pengaturan Database
1. Install MySQL (https://dev.mysql.com/downloads/installer/), pastikan password yang disetting disimpan dan diingat.
2. Buka aplikasi MySQL Command Line Client. Setelah dibuka, masukkan password yang tadi disetting.
```
Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 4
Server version: 5.7.32 MySQL Community Server (GPL)

Copyright (c) 2000, 2020, Oracle and/or its affiliates.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

mysql>
```
3. Setelah muncul tampilan yang mirip seperti di atas dalam terminal yang terbuka, copy & paste command di bawah ini ke dalam terminal untuk membuat database yang baru:
```sql
CREATE DATABASE moduladpl;
```
4. Berikutnya, copy & paste command ini untuk ganti ke database yang baru saja dibuat:
```sql
USE moduladpl;
```
5. Copy & paste command ini untuk membuat tabel baru:
```sql
CREATE TABLE tabel_penjualan (
    kode VARCHAR(10) PRIMARY KEY,
    nama VARCHAR(100) NOT NULL,
    harga INT NOT NULL
);
```
6. Terakhir, isi tabel dengan data dummy melalui command ini:
```sql
INSERT INTO tabel_penjualan (kode, nama, harga) VALUES
('P001', 'Laptop', 10000000),
('P002', 'Mouse', 150000),
('P003', 'Keyboard', 350000);
```

### Penjalanan Aplikasi
1. Buka modul sebagai project dalam NetBeans.
2. Ubah variabel `String pass` dalam class `Database` yang di package `model` sesuai dengan password yang disetting.
<img width="639" height="197" alt="image" src="https://github.com/user-attachments/assets/2a5ad3c4-c911-4774-b0bd-85e757d426a7" />

3. Klik Clean and Build Project.
<img width="828" height="112" alt="image" src="https://github.com/user-attachments/assets/07675b13-f11b-4b17-96d0-a21a0730ea55" />

4. Klik Run Project.
<img width="828" height="112" alt="image" src="https://github.com/user-attachments/assets/34eb82dc-1d6a-429c-9bcf-535a18b40218" />

### Kriteria Isi Laporan
1. Screenshot setiap langkah pengaturan database MySQL.
2. Screenshot file directory dalam tab Project di NetBeans.
3. Lampiran source code.
4. Screenshot aplikasi hasil Run Project.

(note: Penjelasan cukup mengulas bagian Model (CRUD) dan penghubungan antara aplikasi dengan database)
