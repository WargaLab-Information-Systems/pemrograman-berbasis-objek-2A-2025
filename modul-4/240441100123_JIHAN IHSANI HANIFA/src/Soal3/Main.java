package Soal3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Klinik klinik = new Klinik(10); 

        while (true) {
            System.out.println("\n=== Menu Klinik ===");
            System.out.println("1. Tambah Pasien");
            System.out.println("2. Tampilkan Daftar Pasien");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            String pilihan = input.nextLine();

            switch (pilihan) {
                case "1":
                    klinik.tambahPasien(input);
                    break;
                case "2":
                    klinik.tampilkanDaftarPasien();
                    break;
                case "3":
                    System.out.println("Program selesai.");
                    input.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}

