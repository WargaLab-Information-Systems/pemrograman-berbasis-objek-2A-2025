package modul3soal2;
import java.util.Scanner;

public class MainBuku {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Perpustakaan perpustakaan = new Perpustakaan();

        System.out.print("Berapa banyak buku fiksi yang ingin ditambahkan? ");
        int jumlahFiksi = scanner.nextInt();
        scanner.nextLine(); // konsumsi newline

        for (int i = 0; i < jumlahFiksi; i++) {
            System.out.println("\nData Buku Fiksi ke-" + (i + 1));
            System.out.print("Judul: ");
            String judul = scanner.nextLine();
            System.out.print("Penulis: ");
            String penulis = scanner.nextLine();
            System.out.print("Genre: ");
            String genre = scanner.nextLine();

            BukuFiksi bukuFiksi = new BukuFiksi(judul, penulis, genre);
            perpustakaan.tambahBukuFiksi(bukuFiksi);
        }

        System.out.print("\nBerapa banyak buku non-fiksi yang ingin ditambahkan? ");
        int jumlahNonFiksi = scanner.nextInt();
        scanner.nextLine(); // konsumsi newline

        for (int i = 0; i < jumlahNonFiksi; i++) {
            System.out.println("\nData Buku Non-Fiksi ke-" + (i + 1));
            System.out.print("Judul: ");
            String judul = scanner.nextLine();
            System.out.print("Penulis: ");
            String penulis = scanner.nextLine();
            System.out.print("Topik: ");
            String topik = scanner.nextLine();

            BukuNonFiksi bukuNonFiksi = new BukuNonFiksi(judul, penulis, topik);
            perpustakaan.tambahBukuNonFiksi(bukuNonFiksi);
        }

        // Menampilkan seluruh koleksi
        perpustakaan.tampilkanKoleksi();

        scanner.close();
    }
}