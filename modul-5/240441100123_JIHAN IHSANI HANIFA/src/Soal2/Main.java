package Soal2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Mobil mobil = null;
        int pilihanMobil;
        int pilihanAksi;

        while (true) {
            System.out.println("\n=== PILIH JENIS MOBIL ===");
            System.out.println("1. Mobil Sport");
            System.out.println("2. Mobil Sedan");
            System.out.println("3. Keluar");
            System.out.print("Masukkan pilihan (1-3): ");
            pilihanMobil = scanner.nextInt();
            scanner.nextLine();

            if (pilihanMobil == 3) {
                System.out.println("Program selesai. Terima kasih!");
                break;
            }

            switch (pilihanMobil) {
                case 1:
                    mobil = new MobilSport();
                    break;
                case 2:
                    mobil = new MobilSedan();
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    continue;
            }

            while (true) {
                System.out.println("\n--- PILIH AKSI UNTUK " + mobil.getClass().getSimpleName() + " ---");
                System.out.println("1. Nyalakan Mesin");
                System.out.println("2. Matikan Mesin");
                System.out.println("3. Ganti Mobil");
                System.out.print("Masukkan pilihan aksi (1-3): ");
                pilihanAksi = scanner.nextInt();
                scanner.nextLine();

                if (pilihanAksi == 3) {
                    break;
                }

                switch (pilihanAksi) {
                    case 1:
                        mobil.nyalakanMesin();
                        break;
                    case 2:
                        mobil.matikanMesin();
                        break;
                    default:
                        System.out.println("Pilihan aksi tidak valid.");
                }
            }
        }
    }
}
