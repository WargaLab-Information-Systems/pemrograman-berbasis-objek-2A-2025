package modul7_soal3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SistemPerpustakaan perpustakaan = new SistemPerpustakaan();

        // Tambah buku contoh
        perpustakaan.tambahBuku(new BukuFiksi("F001", "Laskar Pelangi", "Andrea Hirata"));
        perpustakaan.tambahBuku(new BukuFiksi("F002", "Harry Potter", "J.K. Rowling"));
        perpustakaan.tambahBuku(new BukuReferensi("R001", "Kamus Besar Bahasa Indonesia", "Pusat Bahasa"));
        perpustakaan.tambahBuku(new BukuReferensi("R002", "Ensiklopedia Dunia", "John Smith"));

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Sistem Peminjaman dan Reservasi Buku ===");

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Lihat daftar buku");
            System.out.println("2. Pinjam buku");
            System.out.println("3. Reservasi buku");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            int menu = scanner.nextInt();
            scanner.nextLine(); // membersihkan newline

            if (menu == 0) {
                System.out.println("Terima kasih. Program selesai.");
                break;
            }

            switch (menu) {
                case 1 -> perpustakaan.tampilkanDaftarBuku();

                case 2 -> {
                    System.out.print("Masukkan ID buku yang ingin dipinjam: ");
                    String idPinjam = scanner.nextLine();
                    Buku bukuPinjam = perpustakaan.cariBukuById(idPinjam);
                    if (bukuPinjam == null) {
                        System.out.println("Buku tidak ditemukan.");
                        break;
                    }
                    if (!(bukuPinjam instanceof Meminjam)) {
                        System.out.println("Buku ini tidak dapat dipinjam.");
                        break;
                    }
                    System.out.print("Masukkan ID user: ");
                    String idUserPinjam = scanner.nextLine();
                    System.out.print("Masukkan usia user: ");
                    int usiaUser = scanner.nextInt();
                    scanner.nextLine();

                    Meminjam bukuYangDipinjam = (Meminjam) bukuPinjam;
                    bukuYangDipinjam.pinjam(idUserPinjam, usiaUser);
                }

                case 3 -> {
                    System.out.print("Masukkan ID buku yang ingin direservasi: ");
                    String idReservasi = scanner.nextLine();
                    Buku bukuReservasi = perpustakaan.cariBukuById(idReservasi);
                    if (bukuReservasi == null) {
                        System.out.println("Buku tidak ditemukan.");
                        break;
                    }
                    if (!(bukuReservasi instanceof Reservasi)) {
                        System.out.println("Buku ini tidak dapat direservasi.");
                        break;
                    }
                    System.out.print("Masukkan ID user: ");
                    String idUserReservasi = scanner.nextLine();

                    Reservasi bukuYangDireservasi = (Reservasi) bukuReservasi;
                    bukuYangDireservasi.pesan(idUserReservasi);
                }

                default -> System.out.println("Pilihan menu tidak valid.");
            }
        }

        scanner.close();
    }
}
