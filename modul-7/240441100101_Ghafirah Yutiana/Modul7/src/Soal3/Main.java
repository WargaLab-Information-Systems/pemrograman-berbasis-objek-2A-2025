package Soal3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SistemPerpustakaan perpustakaan = new SistemPerpustakaan();
        Scanner scanner = new Scanner(System.in);

        // Tambah beberapa buku awal
        perpustakaan.tambahBuku(new BukuFiksi("F001", "Laskar Pelangi", "Andrea Hirata"));
        perpustakaan.tambahBuku(new BukuFiksi("F002", "Harry Potter", "J.K. Rowling"));
        perpustakaan.tambahBuku(new BukuReferensi("R001", "Kamus Bahasa Indonesia", "Pusat Bahasa"));
        perpustakaan.tambahBuku(new BukuReferensi("R002", "Ensiklopedia Dunia", "Tim Ensiklopedia"));

        System.out.print("Masukkan ID anggota: ");
        String idAnggota = scanner.nextLine();

        boolean keluar = false;
        while (!keluar) {
            System.out.println("\nMenu Sistem Perpustakaan:");
            System.out.println("1. Pinjam Buku");
            System.out.println("2. Kembalikan Buku");
            System.out.println("3. Reservasi Buku");
            System.out.println("4. Batalkan Reservasi");
            System.out.println("5. Tampilkan Peminjaman");
            System.out.println("6. Tampilkan Reservasi");
            System.out.println("7. Tambah Buku Baru");
            System.out.println("8. Keluar");
            System.out.print("Pilih menu (1-8): ");

            int pilihan = Integer.parseInt(scanner.nextLine());

            switch (pilihan) {
                case 1:
                    System.out.println("Daftar Buku Tersedia:");
                    perpustakaan.tampilkanDaftarBuku();
                    System.out.print("Masukkan ID buku yang ingin dipinjam: ");
                    String idPinjam = scanner.nextLine();
                    perpustakaan.pinjamBuku(idPinjam, idAnggota);
                    break;
                case 2:
                    System.out.println("Daftar Buku yang Dipinjam:");
                    perpustakaan.tampilkanPeminjaman(idAnggota);
                    System.out.print("Masukkan ID buku yang ingin dikembalikan: ");
                    String idKembali = scanner.nextLine();
                    perpustakaan.kembalikanBuku(idKembali, idAnggota);
                    break;
                case 3:
                    System.out.println("Daftar Buku Tersedia:");
                    perpustakaan.tampilkanDaftarBuku();
                    System.out.print("Masukkan ID buku yang ingin direservasi: ");
                    String idRes = scanner.nextLine();
                    perpustakaan.reservasiBuku(idRes, idAnggota);
                    break;
                case 4:
                    System.out.println("Daftar Buku yang Direservasi:");
                    perpustakaan.tampilkanReservasi(idAnggota);
                    System.out.print("Masukkan ID buku reservasi yang ingin dibatalkan: ");
                    String idBatalkan = scanner.nextLine();
                    perpustakaan.batalkanReservasi(idBatalkan, idAnggota);
                    break;
                case 5:
                    perpustakaan.tampilkanPeminjaman(idAnggota);
                    break;
                case 6:
                    perpustakaan.tampilkanReservasi(idAnggota);
                    break;
                case 7:
                    System.out.print("Masukkan jenis buku (Fiksi/Referensi): ");
                    String jenis = scanner.nextLine().trim().toLowerCase();
                    System.out.print("Masukkan ID buku: ");
                    String idBaru = scanner.nextLine();
                    System.out.print("Masukkan judul buku: ");
                    String judul = scanner.nextLine();
                    System.out.print("Masukkan pengarang buku: ");
                    String pengarang = scanner.nextLine();
                    if (jenis.equals("fiksi")) {
                        perpustakaan.tambahBuku(new BukuFiksi(idBaru, judul, pengarang));
                        System.out.println("Buku fiksi berhasil ditambahkan.");
                    } else if (jenis.equals("referensi")) {
                        perpustakaan.tambahBuku(new BukuReferensi(idBaru, judul, pengarang));
                        System.out.println("Buku referensi berhasil ditambahkan.");
                    } else {
                        System.out.println("Jenis buku tidak valid.");
                    }
                    break;
                case 8:
                    keluar = true;
                    System.out.println("Terima kasih telah menggunakan sistem perpustakaan.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
        }

        scanner.close();
    }
}
