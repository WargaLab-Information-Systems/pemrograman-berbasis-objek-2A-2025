package Soal1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah pembayaran: ");
        double jumlah = input.nextDouble();

        System.out.println("Pilih metode pembayaran:");
        System.out.println("1. Tunai");
        System.out.println("2. Kartu Kredit");
        System.out.println("3. E-Wallet");
        System.out.print("Masukkan pilihan (1-3): ");
        int pilihan = input.nextInt();

        Payment metode;

        switch (pilihan) {
            case 1:
                metode = new Tunai();
                break;
            case 2:
                metode = new KartuKredit();
                break;
            case 3:
                metode = new EWallet();
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                input.close();
                return;
        }

        metode.prosesPembayaran(jumlah);
        input.close();
    }
}


