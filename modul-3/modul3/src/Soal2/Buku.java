package Soal2;
import java.util.ArrayList;

public class Buku {
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

    public String getJudul() {
        return judul.toLowerCase();
    }
}

class BukuFiksi extends Buku {
    String genre;

    public BukuFiksi(String judul, String penulis, String genre) {
        super(judul, penulis);
        this.genre = genre;
    }

    public void infoFiksi() {
        info();
        System.out.println("Genre: " + genre);
        System.out.println("-------------------------");
    }
}

class BukuNonFiksi extends Buku {
    String topik;

    public BukuNonFiksi(String judul, String penulis, String topik) {
        super(judul, penulis);
        this.topik = topik;
    }

    public void infoNonFiksi() {
        info();
        System.out.println("Topik: " + topik);
        System.out.println("-------------------------");
    }
}

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
        System.out.println("\n=== Koleksi Buku Fiksi ===");
        if (koleksiFiksi.isEmpty()) {
            System.out.println("Belum ada daftar buku fiksi.");
        } else {
            for (BukuFiksi buku : koleksiFiksi) {
                buku.infoFiksi();
            }
        }

        System.out.println("=== Koleksi Buku Non-Fiksi ===");
        if (koleksiNonFiksi.isEmpty()) {
            System.out.println("Belum ada daftar buku non-fiksi.");
        } else {
            for (BukuNonFiksi buku : koleksiNonFiksi) {
                buku.infoNonFiksi();
            }
        }
    }
    
    public void cariBuku(String judul) {
        boolean ditemukan = false;
        String j = judul.toLowerCase();

        for (BukuFiksi buku : koleksiFiksi) {
            if (buku.getJudul().equals(j)) {
                System.out.println("Buku ditemukan di koleksi fiksi:");
                buku.infoFiksi();
                ditemukan = true;
            }
        }

        for (BukuNonFiksi buku : koleksiNonFiksi) {
            if (buku.getJudul().equals(j)) {
                System.out.println("Buku ditemukan di koleksi non-fiksi:");
                buku.infoNonFiksi();
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Buku dengan judul \"" + judul + "\" tidak ditemukan.");
        }
    }

    public void hapusBuku(String judul) {
        String j = judul.toLowerCase();
        boolean dihapus = koleksiFiksi.removeIf(b -> b.getJudul().equals(j));
        dihapus |= koleksiNonFiksi.removeIf(b -> b.getJudul().equals(j));

        if (dihapus) {
            System.out.println("Buku berhasil dihapus.");
        } else {
            System.out.println("Buku tidak ditemukan, tidak dapat dihapus.");
        }
    }
}

