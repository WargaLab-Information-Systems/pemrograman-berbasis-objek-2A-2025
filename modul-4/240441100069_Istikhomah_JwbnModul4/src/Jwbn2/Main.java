/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Jwbn2;

/**
 *
 * @author istikhomah
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Perpustakaan perpustakaan = new Perpustakaan();

        System.out.print("Berapa jumlah buku yang ingin ditambahkan? ");
        int jumlah = input.nextInt();
        input.nextLine(); // bersihkan enter

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nData Buku ke-" + (i + 1));
            System.out.print("Judul          : ");
            String judul = input.nextLine();
            System.out.print("Penulis        : ");
            String penulis = input.nextLine();
            System.out.print("Jumlah Halaman : ");
            int halaman = input.nextInt();
            input.nextLine(); // bersihkan enter

            // Buat objek buku dan isi dengan setter
            Buku buku = new Buku();
            buku.setJudul(judul);
            buku.setPenulis(penulis);
            buku.setJumlahHalaman(halaman);

            // Tambah ke perpustakaan
            perpustakaan.tambahBuku(buku);
        }

        // Tampilkan semua buku
        perpustakaan.tampilkanDaftarBuku();
    }
}

