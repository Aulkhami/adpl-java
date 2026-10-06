/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  rakha
 * Created: 6 Oct 2026
 */

CREATE TABLE tabel_penjualan (
    kode VARCHAR(10) PRIMARY KEY,
    nama VARCHAR(100) NOT NULL,
    harga INT NOT NULL
);

INSERT INTO tabel_penjualan (kode, nama, harga) VALUES
('P001', 'Laptop', 10000000),
('P002', 'Mouse', 150000),
('P003', 'Keyboard', 350000);
