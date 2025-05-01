
package perpustakan;
import java.util.ArrayList;
import java.util.Scanner;

// Class induk
class Buku {
   protected String judul;
   protected  String penulis;

    public Buku(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }

    public void info() {
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
    }
}

// Buku Fiksi
class BukuFiksi extends Buku {
    private String genre;

    public BukuFiksi(String judul, String penulis, String genre) {
        super(judul, penulis);
        this.genre = genre;
    }

    public void infoFiksi() {
        super.info();
        System.out.println("Genre: " + genre);
        System.out.println();
    }
}

// Buku Non-Fiksi
class BukuNonFiksi extends Buku {
    private String topik;

    public BukuNonFiksi(String judul, String penulis, String topik) {
        super(judul, penulis);
        this.topik = topik;
    }

    public void infoNonFiksi() {
        super.info();
        System.out.println("Topik: " + topik);
        System.out.println();
    }
}

// Perpustakaan
class Perpustakaan {
    private ArrayList<BukuFiksi> koleksiFiksi = new ArrayList<>();
    private ArrayList<BukuNonFiksi> koleksiNonFiksi = new ArrayList<>();

    public void tambahBukuFiksi(BukuFiksi buku) {
        koleksiFiksi.add(buku);
    }

    public void tambahBukuNonFiksi(BukuNonFiksi buku) {
        koleksiNonFiksi.add(buku);
    }

    public void tampilkanKoleksi() {
        System.out.println("=== Koleksi Buku Fiksi ===");
        for (BukuFiksi buku : koleksiFiksi) {
            buku.infoFiksi();
        }

        System.out.println("=== Koleksi Buku Non-Fiksi ===");
        for (BukuNonFiksi buku : koleksiNonFiksi) {
            buku.infoNonFiksi();
        }
    }
}

// Program utama
public class perpustakan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Perpustakaan perpustakaan = new Perpustakaan();
        int pilihan;

        do {
            System.out.println("\n=== Menu Perpustakaan ===");
            System.out.println("1. Tambah Buku Fiksi");
            System.out.println("2. Tambah Buku Non-Fiksi");
            System.out.println("3. Tampilkan Semua Koleksi");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            

            switch (pilihan) { 
                case 1:
                    System.out.print("Judul: ");
                    String judulFiksi = scanner.nextLine();
                    System.out.print("Penulis: ");
                    String penulisFiksi = scanner.nextLine();
                    System.out.print("Genre: ");
                    String genre = scanner.nextLine();

                    BukuFiksi bukuFiksi = new BukuFiksi(judulFiksi, penulisFiksi, genre);
                    perpustakaan.tambahBukuFiksi(bukuFiksi);
                    System.out.println("Buku fiksi berhasil ditambahkan!");
                    break;

                case 2:
                    System.out.print("Judul: ");
                    String judulNonFiksi = scanner.nextLine();
                    System.out.print("Penulis: ");
                    String penulisNonFiksi = scanner.nextLine();
                    System.out.print("Topik: ");
                    String topik = scanner.nextLine();

                    BukuNonFiksi bukuNonFiksi = new BukuNonFiksi(judulNonFiksi, penulisNonFiksi, topik);
                    perpustakaan.tambahBukuNonFiksi(bukuNonFiksi);
                    System.out.println("Buku non-fiksi berhasil ditambahkan!");
                    break;

                case 3:
                    perpustakaan.tampilkanKoleksi();
                    break;

                case 0:
                    System.out.println("Terima kasih telah menggunakan sistem perpustakaan.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);

        scanner.close();
    }
}
