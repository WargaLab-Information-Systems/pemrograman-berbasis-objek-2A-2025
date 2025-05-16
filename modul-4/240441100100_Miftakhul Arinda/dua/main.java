/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dua;

/**
 *
 * @author Miftakhul Arinda
 */
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        perpustakaan perpustakaan = new perpustakaan();
        int menu = -1;

        while (menu != 0) {
            System.out.println("\n--- MENU PERPUSTAKAAN ---");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Tampilkan Semua Buku");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            menu = scanner.nextInt();
            scanner.nextLine();

            if (menu == 1) {
                System.out.print("Judul Buku: ");
                String judul = scanner.nextLine();
                System.out.print("Penulis: ");
                String penulis = scanner.nextLine();
                System.out.print("Jumlah Halaman: ");
                int halaman = scanner.nextInt();
                scanner.nextLine();
                perpustakaan.tambahBuku(new buku(judul, penulis, halaman));
            } else if (menu == 2) {
                perpustakaan.tampilkanSemuaBuku();
            } else if (menu != 0) {
                System.out.println("Pilihan tidak valid.");
            }
        }

        scanner.close();
        System.out.println("Program Perpustakaan selesai.");
    }
}