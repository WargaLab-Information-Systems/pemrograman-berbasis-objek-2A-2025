import java.util.ArrayList;
import java.util.Scanner;

// Superclass
class Buku {
    String judul;
    String penulis;

    public Buku(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }

    public void info() {
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
    }
}

// Subclass BukuFiksi
class BukuFiksi extends Buku {
    String genre;

    public BukuFiksi(String judul, String penulis, String genre) {
        super(judul, penulis);
        this.genre = genre;
    }

    public void infoFiksi() {
        info();
        System.out.println("Genre: " + genre);
    }
}

// Subclass BukuNonFiksi
class BukuNonFiksi extends Buku {
    String topik;

    public BukuNonFiksi(String judul, String penulis, String topik) {
        super(judul, penulis);
        this.topik = topik;
    }

    public void infoNonFiksi() {
        info();
        System.out.println("Topik: " + topik);
    }
}

// Class Perpustakaan
class Perpustakaan {
    ArrayList<BukuFiksi> koleksiFiksi = new ArrayList<>();
    ArrayList<BukuNonFiksi> koleksiNonFiksi = new ArrayList<>();

    public void tambahBukuFiksi(BukuFiksi buku) {
        koleksiFiksi.add(buku);
    }

    public void tambahBukuNonFiksi(BukuNonFiksi buku) {
        koleksiNonFiksi.add(buku);
    }

    public void tampilkanKoleksi() {
        System.out.println("\n=== Koleksi Buku Fiksi ===");
        for (BukuFiksi b : koleksiFiksi) {
            b.infoFiksi();
            System.out.println("-------------------");
        }
        System.out.println("\n=== Koleksi Buku Non Fiksi ===");
        for (BukuNonFiksi b : koleksiNonFiksi) {
            b.infoNonFiksi();
            System.out.println("-------------------");
        }
    }
}

// Main Program
public class MainPerpustakaan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Perpustakaan perpustakaan = new Perpustakaan();

        System.out.print("Jumlah buku fiksi: ");
        int nFiksi = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < nFiksi; i++) {
            System.out.println("\nData Buku Fiksi ke-" + (i+1));
            System.out.print("Judul: ");
            String judul = sc.nextLine();
            System.out.print("Penulis: ");
            String penulis = sc.nextLine();
            System.out.print("Genre: ");
            String genre = sc.nextLine();
            perpustakaan.tambahBukuFiksi(new BukuFiksi(judul, penulis, genre));
        }

        System.out.print("\nJumlah buku non-fiksi: ");
        int nNonFiksi = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < nNonFiksi; i++) {
            System.out.println("\nData Buku Non Fiksi ke-" + (i+1));
            System.out.print("Judul: ");
            String judul = sc.nextLine();
            System.out.print("Penulis: ");
            String penulis = sc.nextLine();
            System.out.print("Topik: ");
            String topik = sc.nextLine();
            perpustakaan.tambahBukuNonFiksi(new BukuNonFiksi(judul, penulis, topik));
        }

        perpustakaan.tampilkanKoleksi();
    }
}
