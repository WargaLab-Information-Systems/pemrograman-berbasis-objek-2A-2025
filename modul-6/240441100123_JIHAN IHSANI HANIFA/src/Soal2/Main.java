package Soal2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ManajemenMobil manajemen = new ManajemenMobil();

        while (true) {
            System.out.println("\n=== MENU MANAJEMEN MOBIL ===");
            System.out.println("1. Tambah Mobil Sport");
            System.out.println("2. Tambah Mobil Sedan");
            System.out.println("3. Operasikan Semua Mobil");
            System.out.println("4. Keluar");
            System.out.print("Pilihan Anda: ");
            int pilihan = input.nextInt();
            input.nextLine(); 

            switch (pilihan) {
                case 1:
                    manajemen.tambahMobil(new MobilSport());
                    System.out.println("Mobil sport berhasil ditambahkan.");
                    break;
                case 2:
                    manajemen.tambahMobil(new MobilSedan());
                    System.out.println("Mobil sedan berhasil ditambahkan.");
                    break;
                case 3:
                    manajemen.operasikanSemuaMobil();
                    break;
                case 4:
                    System.out.println("Program selesai.");
                    return;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }
}
