package Soal1;

import java.util.Scanner;

public class MainPembayaran {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        KonteksPembayaran konteks = new KonteksPembayaran();

        System.out.print("Masukkan jumlah pembayaran: ");
        double jumlah = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Pilih metode pembayaran:");
        System.out.println("1. Tunai");
        System.out.println("2. Kartu Kredit");
        System.out.println("3. E-Wallet");
        System.out.print("Masukkan pilihan (1-3): ");
        int pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:
                konteks.setStrategiPembayaran(new PembayaranTunai());
                break;
            case 2:
                konteks.setStrategiPembayaran(new PembayaranKartuKredit());
                break;
            case 3:
                konteks.setStrategiPembayaran(new PembayaranEWallet());
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                scanner.close();
                return;
        }

        double totalBayar = konteks.lakukanPembayaran(jumlah);
        System.out.println(konteks.getMetodePembayaranSaatIni() + " bayar: " + totalBayar);

        scanner.close();
    }
}
