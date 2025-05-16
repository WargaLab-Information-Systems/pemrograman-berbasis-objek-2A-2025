/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jawaban2;

/**
 *
 * @author istikhomah
 */


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Perpustakaan perpustakaan = new Perpustakaan();

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Tambah Buku Fiksi");
            System.out.println("2. Tambah Buku Non-Fiksi");
            System.out.println("3. Tampilkan Koleksi");
            System.out.println("4. Keluar");
            System.out.print("Pilihan Anda: ");
            int pilihan = input.nextInt();
            input.nextLine(); 

            if (pilihan == 1) {
                System.out.print("Judul: ");
                String judul = input.nextLine();
                System.out.print("Penulis: ");
                String penulis = input.nextLine();
                System.out.print("Genre: ");
                String genre = input.nextLine();

                BukuFiksi fiksi = new BukuFiksi(judul, penulis, genre);
                perpustakaan.tambahFiksi(fiksi);
                System.out.println("Buku fiksi ditambahkan!");

            } else if (pilihan == 2) {
                System.out.print("Judul: ");
                String judul = input.nextLine();
                System.out.print("Penulis: ");
                String penulis = input.nextLine();
                System.out.print("Topik: ");
                String topik = input.nextLine();

                BukuNonFiksi nonFiksi = new BukuNonFiksi(judul, penulis, topik);
                perpustakaan.tambahNonFiksi(nonFiksi);
                System.out.println("Buku non-fiksi ditambahkan!");

            } else if (pilihan == 3) {
                System.out.println("\nMenampilkan seluruh koleksi buku...");
                perpustakaan.tampilkanSemua();
              
            } else if (pilihan == 4) {
                System.out.println("Program selesai.");
                break;
            }
            
        }

        input.close();
    }
}
