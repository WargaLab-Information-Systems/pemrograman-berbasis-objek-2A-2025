package Soal1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Manusia manusia = null;
        int pilihanKarakter;
        int pilihanAksi;

        while (true) {
            System.out.println("\n=== PILIH KARAKTER ===");
            System.out.println("1. Joko");
            System.out.println("2. Beni");
            System.out.println("3. Fani");
            System.out.println("4. Jani");
            System.out.println("5. Keluar program");
            System.out.print("Masukkan pilihan karakter (1-5): ");
            pilihanKarakter = scanner.nextInt();
            scanner.nextLine();

            if (pilihanKarakter == 5) {
                System.out.println("Program selesai. Terima kasih!");
                break;
            }

            switch (pilihanKarakter) {
                case 1:
                    manusia = new Joko();
                    break;
                case 2:
                    manusia = new Beni();
                    break;
                case 3:
                    manusia = new Fani();
                    break;
                case 4:
                    manusia = new Jani();
                    break;
                default:
                    System.out.println("Pilihan karakter tidak valid.");
                    continue;
            }

            while (true) {
                System.out.println("\n--- PILIH AKSI UNTUK " + manusia.getClass().getSimpleName() + " ---");
                System.out.println("1. Berbicara");
                System.out.println("2. Bekerja");
                System.out.println("3. Makan");
                System.out.println("4. Ganti karakter");
                System.out.print("Masukkan pilihan aksi (1-4): ");
                pilihanAksi = scanner.nextInt();
                scanner.nextLine();

                if (pilihanAksi == 4) {
                    break;
                }

                switch (pilihanAksi) {
                    case 1:
                        manusia.berbicara();
                        break;
                    case 2:
                        manusia.bekerja();
                        break;
                    case 3:
                        manusia.makan();
                        break;
                    default:
                        System.out.println("Pilihan aksi tidak valid.");
                }
            }
        }
    }
}
