package Soal1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean ulang = true;
        System.out.println("=== Sistem Pembayaran Toko Abadi Jaya ===");
        while (ulang) {
            System.out.print("Masukkan jumlah belanja (Rp): ");
            double jumlahBelanja = scanner.nextDouble();

            System.out.println("Pilih metode pembayaran:");
            System.out.println("1. Tunai");
            System.out.println("2. Kartu Kredit (Diskon 5%)");
            System.out.println("3. E-Wallet (Cashback 10%)");

            System.out.print("Pilihan Anda (1/2/3): ");
            int pilihan = scanner.nextInt();
            Payment pembayaran;
            switch (pilihan) {
                case 1:
                    pembayaran = new Tunai();
                    break;
                case 2:
                    pembayaran = new KartuKredit();
                    break;
                case 3:
                    pembayaran = new EWallet();
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Pembayaran dibatalkan.");
                    continue; 
            }

            System.out.println();
            pembayaran.prosesPembayaran(jumlahBelanja);

            System.out.print("Apakah Anda ingin memproses pembayaran lagi? (y/n): ");
            String jawab = scanner.next();

            if (!jawab.equalsIgnoreCase("y")) {
                ulang = false;
                System.out.println("Terima kasih telah menggunakan sistem pembayaran Kami!!.");
            }
        }

        scanner.close();
    }
}