/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Jwbn2;

/**
 *
 * @author istikhomah
 */
public class Perpustakaan {
    private Buku[] daftarBuku = new Buku[100];
    private int jumlahBuku = 0;

    public void tambahBuku(Buku buku) {
        if (jumlahBuku < daftarBuku.length) {
            daftarBuku[jumlahBuku] = buku;
            jumlahBuku++;
            System.out.println("Buku berhasil ditambahkan!\n");
        } else {
            System.out.println("Penyimpanan penuh, tidak bisa menambahkan buku lagi!");
        }
    }

    public void tampilkanDaftarBuku() {
        if (jumlahBuku == 0) {
            System.out.println("Belum ada buku dalam perpustakaan.");
        } else {
            System.out.println("\n=== Daftar Buku di Perpustakaan ===");
            for (int i = 0; i < jumlahBuku; i++) {
                System.out.println("Judul          : " + daftarBuku[i].getJudul());
                System.out.println("Penulis        : " + daftarBuku[i].getPenulis());
                System.out.println("Jumlah Halaman : " + daftarBuku[i].getJumlahHalaman());
                System.out.println("---------------------------");
            }
        }
    }
}

