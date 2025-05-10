package Soal2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Perpustakaan perpustakaan = new Perpustakaan();
        boolean jalan = true;

        while (jalan) {
            System.out.println("\n===== MENU PERPUSTAKAAN =====");
            System.out.println("1. Tambah Buku Fiksi");
            System.out.println("2. Tambah Buku Non-Fiksi");
            System.out.println("3. Tampilkan Koleksi");
            System.out.println("4. Cari Buku");
            System.out.println("5. Hapus Buku");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            int pilih = input.nextInt();
            input.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Judul: ");
                    String judulFiksi = input.nextLine();
                    System.out.print("Penulis: ");
                    String penulisFiksi = input.nextLine();
                    System.out.print("Genre: ");
                    String genre = input.nextLine();
                    BukuFiksi fiksi = new BukuFiksi(judulFiksi, penulisFiksi, genre);
                    perpustakaan.tambahBukuFiksi(fiksi);
                    break;

                case 2:
                    System.out.print("Judul: ");
                    String judulNon = input.nextLine();
                    System.out.print("Penulis: ");
                    String penulisNon = input.nextLine();
                    System.out.print("Topik: ");
                    String topik = input.nextLine();
                    BukuNonFiksi nonFiksi = new BukuNonFiksi(judulNon, penulisNon, topik);
                    perpustakaan.tambahBukuNonFiksi(nonFiksi);
                    break;

                case 3:
                    perpustakaan.tampilkanKoleksi();
                    break;

                case 4:
                    System.out.print("Masukkan judul buku yang dicari: ");
                    String cariJudul = input.nextLine();
                    perpustakaan.cariBuku(cariJudul);
                    break;

                case 5:
                    System.out.print("Masukkan judul buku yang ingin dihapus: ");
                    String hapusJudul = input.nextLine();
                    perpustakaan.hapusBuku(hapusJudul);
                    break;

                case 0:
                    jalan = false;
                    System.out.println("Terima kasih telah menggunakan sistem.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }

        input.close();
    }
}
