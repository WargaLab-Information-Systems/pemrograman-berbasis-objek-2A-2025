package Soal3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SistemPerpustakaan sistem = new SistemPerpustakaan();

        boolean ulang = true;
        System.out.println("=== Sistem Peminjaman & Reservasi Buku ===");

        while (ulang) {
            System.out.println("\n=== Menu Perpustakaan ===");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Lihat Daftar Buku");
            System.out.println("3. Pinjam Buku");
            System.out.println("4. Kembalikan Buku");
            System.out.println("5. Reservasi Buku");
            System.out.println("6. Batalkan Reservasi");
            System.out.println("7. Tampilkan Info Buku");
            System.out.println("0. Keluar");
            System.out.print("Pilihan Anda (0-7): ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // clear buffer
            System.out.println();

            switch (pilihan) {
                case 1:
                    // Tambah Buku
                    System.out.println("=== Tambah Buku Baru ===");
                    System.out.println("Pilih jenis buku:");
                    System.out.println("1. Buku Fiksi");
                    System.out.println("2. Buku Referensi");
                    System.out.print("Pilihan Anda (1/2): ");
                    int jenisBuku = scanner.nextInt();
                    scanner.nextLine(); 

                    System.out.print("Masukkan judul buku: ");
                    String judul = scanner.nextLine();
                    System.out.print("Masukkan penulis buku: ");
                    String penulis = scanner.nextLine();

                    if (jenisBuku == 1) {
                        BukuFiksi bukuFiksi = new BukuFiksi(judul, penulis);
                        sistem.tambahBuku(bukuFiksi);
                        System.out.println("Buku Fiksi berhasil ditambahkan.");
                    } else if (jenisBuku == 2) {
                        BukuReferensi bukuReferensi = new BukuReferensi(judul, penulis);
                        sistem.tambahBuku(bukuReferensi);
                        System.out.println("Buku Referensi berhasil ditambahkan.");
                    } else {
                        System.out.println("Jenis buku tidak valid.");
                    }
                    break;
                case 2:
                    sistem.tampilkanDaftarBuku();
                    break;
                case 3:
                    sistem.tampilkanDaftarBuku();
                    System.out.print("Pilih nomor buku untuk dipinjam: ");
                    int pinjamIdx = scanner.nextInt() - 1;
                    Buku bukuPinjam = sistem.getBuku(pinjamIdx);
                    if (bukuPinjam instanceof Peminjaman) {
                        ((Peminjaman) bukuPinjam).pinjam();
                    } else {
                        System.out.println("Buku ini tidak dapat dipinjam.");
                    }
                    break;
                case 4:
                    sistem.tampilkanDaftarBuku();
                    System.out.print("Pilih nomor buku untuk dikembalikan: ");
                    int kembaliIdx = scanner.nextInt() - 1;
                    Buku bukuKembali = sistem.getBuku(kembaliIdx);
                    if (bukuKembali instanceof Peminjaman) {
                        ((Peminjaman) bukuKembali).kembalikan();
                    } else {
                        System.out.println("Buku ini tidak dapat dikembalikan.");
                    }
                    break;
                case 5:
                    sistem.tampilkanDaftarBuku();
                    System.out.print("Pilih nomor buku untuk reservasi: ");
                    int reservasiIdx = scanner.nextInt() - 1;
                    Buku bukuReservasi = sistem.getBuku(reservasiIdx);
                    if (bukuReservasi instanceof Reservasi) {
                        ((Reservasi) bukuReservasi).reservasi();
                    } else {
                        System.out.println("Buku ini tidak dapat direservasi.");
                    }
                    break;
                case 6:
                    sistem.tampilkanDaftarBuku();
                    System.out.print("Pilih nomor buku untuk batalkan reservasi: ");
                    int batalIdx = scanner.nextInt() - 1;
                    Buku bukuBatal = sistem.getBuku(batalIdx);
                    if (bukuBatal instanceof Reservasi) {
                        ((Reservasi) bukuBatal).batalkanReservasi();
                    } else {
                        System.out.println("Buku ini tidak dapat direservasi.");
                    }
                    break;
                case 7:
                    sistem.tampilkanDaftarBuku();
                    System.out.print("Pilih nomor buku untuk lihat info: ");
                    int infoIdx = scanner.nextInt() - 1;
                    Buku bukuInfo = sistem.getBuku(infoIdx);
                    if (bukuInfo != null) {
                        bukuInfo.tampilkanInfo();
                    }
                    break;
                case 0:
                    ulang = false;
                    System.out.println("Terima kasih telah menggunakan Sistem Perpustakaan!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }

            if (pilihan != 0) {
                System.out.print("\nApakah Anda ingin kembali ke menu utama? (y/n): ");
                String jawab = scanner.next();
                if (!jawab.equalsIgnoreCase("y")) {
                    ulang = false;
                    System.out.println("Terima kasih telah menggunakan Sistem Perpustakaan!");
                }
            }
        }

        scanner.close();
    }
}
