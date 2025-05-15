package Soal2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Perpustakaan perpustakaan = new Perpustakaan(5); 

        while (true) {
            System.out.println("\n=== Menu Perpustakaan ===");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Tampilkan Daftar Buku");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            String pilihan = input.nextLine();

            switch (pilihan) {
                case "1":
                    perpustakaan.tambahBuku(input);
                    break;
                case "2":
                    perpustakaan.tampilkanDaftarBuku();
                    break;
                case "3":
                    System.out.println("Terima kasih!");
                    input.close();
                    return;
                default:
                    System.out.println("Menu tidak valid.");
            }
        }
    }
}
