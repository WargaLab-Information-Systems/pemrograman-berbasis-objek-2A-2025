package Soal3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== SISTEM PEMINJAMAN DAN RESERVASI BUKU ===");
        System.out.print("Masukkan nama Anda: ");
        String nama = input.nextLine();

        System.out.println("Pilih jenis buku:");
        System.out.println("1. Buku Fiksi");
        System.out.println("2. Buku Referensi");
        System.out.print("Pilihan Anda (1/2): ");
        int pilihan = input.nextInt();
        input.nextLine();

        if (pilihan == 1) {

            String lanjut;
            do {
                System.out.print("\nMasukkan judul buku fiksi: ");
                String judul = input.nextLine();
                BukuFiksi bukuFiksi = new BukuFiksi(judul);

                System.out.println("Pilih aksi:");
                System.out.println("1. Pinjam");
                System.out.println("2. Reservasi");
                System.out.print("Pilihan Anda: ");
                int aksi = input.nextInt();
                input.nextLine(); // clear buffer

                if (aksi == 1) {
                    bukuFiksi.pinjam(nama);
                } else if (aksi == 2) {
                    bukuFiksi.reservasi(nama);
                } else {
                    System.out.println("Pilihan tidak valid.");
                }

                System.out.print("Apakah Anda ingin meminjam buku fiksi lagi? (y/n): ");
                lanjut = input.nextLine();
            } while (lanjut.equalsIgnoreCase("y"));

        } else if (pilihan == 2) {
            System.out.print("Masukkan judul buku referensi: ");
            String judul = input.nextLine();
            BukuReferensi bukuRef = new BukuReferensi(judul);

            System.out.println("Pilih aksi:");
            System.out.println("1. Baca di tempat (info)");
            System.out.println("2. Reservasi");
            System.out.print("Pilihan Anda: ");
            int aksi = input.nextInt();

            if (aksi == 1) {
                bukuRef.aturanPeminjaman();
            } else if (aksi == 2) {
                bukuRef.reservasi(nama);
            } else {
                System.out.println("Pilihan tidak valid.");
            }

        } else {
            System.out.println("Jenis buku tidak valid.");
        }

        input.close();
    }
}
