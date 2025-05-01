
package Soal02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Perpustakaan perpustakaan = new Perpustakaan();

        int pilihan = 0;
        boolean running = true;

        while (running) {
            System.out.println("\n=== MENU PERPUSTAKAAN ===");
            System.out.println("1. Tambah Buku Fiksi");
            System.out.println("2. Tambah Buku Non-Fiksi");
            System.out.println("3. Tampilkan Koleksi Buku");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");

            try {
                pilihan = input.nextInt();
                input.nextLine(); 

                switch (pilihan) {
                    case 1:
                        System.out.print("Judul Buku     : ");
                        String judulF = input.nextLine();
                        System.out.print("Penulis Buku   : ");
                        String penulisF = input.nextLine();
                        System.out.print("Genre          : ");
                        String genre = input.nextLine();
                        BukuFiksi bukuF = new BukuFiksi(judulF, penulisF, genre);
                        perpustakaan.tambahBukuFiksi(bukuF);
                        break;

                    case 2:
                        System.out.print("Judul Buku     : ");
                        String judulNF = input.nextLine();
                        System.out.print("Penulis Buku   : ");
                        String penulisNF = input.nextLine();
                        System.out.print("Topik          : ");
                        String topik = input.nextLine();
                        BukuNonFiksi bukuNF = new BukuNonFiksi(judulNF, penulisNF, topik);
                        perpustakaan.tambahBukuNonFiksi(bukuNF);
                        break;

                    case 3:
                        perpustakaan.tampilkanKoleksi();
                        break;

                    case 4:
                        System.out.println("Program selesai.");
                        running = false;
                        break;

                    default:
                        System.out.println("Pilihan tidak valid! Silakan pilih antara 1-4.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Input harus berupa angka! Silakan coba lagi.");
                input.nextLine(); 
            }
        }

        input.close();
    }
}
