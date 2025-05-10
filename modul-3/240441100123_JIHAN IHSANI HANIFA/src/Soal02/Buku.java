package Soal02;

import java.util.ArrayList;

class Buku {
    protected String judul;
    protected String penulis;

    public Buku(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }

    public void info() {
        System.out.println("Judul   : " + judul);
        System.out.println("Penulis : " + penulis);
    }
}

class BukuFiksi extends Buku {
    private String genre;

    public BukuFiksi(String judul, String penulis, String genre) {
        super(judul, penulis);
        this.genre = genre;
    }

    public void infoFiksi() {
        System.out.println("=== Buku Fiksi ===");
        info();
        System.out.println("Genre   : " + genre);
        System.out.println();
    }
}

class BukuNonFiksi extends Buku {
    private String topik;

    public BukuNonFiksi(String judul, String penulis, String topik) {
        super(judul, penulis);
        this.topik = topik;
    }

    public void infoNonFiksi() {
        System.out.println("=== Buku Non-Fiksi ===");
        info();
        System.out.println("Topik   : " + topik);
        System.out.println();
    }
}

class Perpustakaan {
    private ArrayList<BukuFiksi> koleksiFiksi;
    private ArrayList<BukuNonFiksi> koleksiNonFiksi;

    public Perpustakaan() {
        koleksiFiksi = new ArrayList<>();
        koleksiNonFiksi = new ArrayList<>();
    }

    public void tambahBukuFiksi(BukuFiksi buku) {
        koleksiFiksi.add(buku);
    }

    public void tambahBukuNonFiksi(BukuNonFiksi buku) {
        koleksiNonFiksi.add(buku);
    }

    public void tampilkanKoleksi() {
        System.out.println("\n--- Koleksi Buku Fiksi ---");
        if (koleksiFiksi.isEmpty()) {
            System.out.println("Tidak ada buku fiksi.");
        } else {
            for (BukuFiksi buku : koleksiFiksi) {
                buku.infoFiksi();
            }
        }

        System.out.println("--- Koleksi Buku Non-Fiksi ---");
        if (koleksiNonFiksi.isEmpty()) {
            System.out.println("Tidak ada buku non-fiksi.");
        } else {
            for (BukuNonFiksi buku : koleksiNonFiksi) {
                buku.infoNonFiksi();
            }
        }
    }
}
