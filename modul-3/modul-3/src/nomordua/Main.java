/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nomordua;

import java.util.Scanner;

/**
 *
 * @author Miftakhul Arinda
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Perpustakaan perpustakaan = new Perpustakaan();

        boolean lanjut = true;

        while (lanjut) {
            System.out.println("\nPilih jenis buku:");
            System.out.println("1. Buku Fiksi");
            System.out.println("2. Buku Non-Fiksi");
            System.out.print("Pilihan: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); 

            System.out.print("Judul: ");
            String judul = scanner.nextLine();
            System.out.print("Penulis: ");
            String penulis = scanner.nextLine();

            if (pilihan == 1) {
                System.out.print("Genre: ");
                String genre = scanner.nextLine();
                BukuFiksi bukuFiksi = new BukuFiksi(judul, penulis, genre);
                perpustakaan.tambahBukuFiksi(bukuFiksi);
            } else if (pilihan == 2) {
                System.out.print("Topik: ");
                String topik = scanner.nextLine();
                BukuNonFiksi bukuNonFiksi = new BukuNonFiksi(judul, penulis, topik);
                perpustakaan.tambahBukuNonFiksi(bukuNonFiksi);
            } else {
                System.out.println("Pilihan tidak valid!");
            }

            System.out.print("Tambah buku lagi? (y/n): ");
            String jawab = scanner.nextLine();
            if (!jawab.equalsIgnoreCase("y")) {
                lanjut = false;
            }
        }

        perpustakaan.tampilkanKoleksi();

        scanner.close();
    }
}