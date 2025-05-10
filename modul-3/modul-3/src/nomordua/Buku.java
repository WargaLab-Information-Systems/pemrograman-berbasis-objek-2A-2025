/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nomordua;

/**
 *
 * @author Miftakhul Arinda
 */
import java.util.ArrayList;

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

class BukuFiksi extends Buku {
    private String genre;

    public BukuFiksi(String judul, String penulis, String genre) {
        super(judul, penulis);
        this.genre = genre;
    }

    public void infoFiksi() {
        info();
        System.out.println("Genre: " + genre);
        System.out.println("---------------------------");
    }
}

class BukuNonFiksi extends Buku {
    private String topik;

    public BukuNonFiksi(String judul, String penulis, String topik) {
        super(judul, penulis);
        this.topik = topik;
    }

    public void infoNonFiksi() {
        info();
        System.out.println("Topik: " + topik);
        System.out.println("---------------------------");
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
        for (BukuFiksi buku : koleksiFiksi) {
            buku.infoFiksi();
        }

        System.out.println("=== Koleksi Buku Non-Fiksi ===");
        for (BukuNonFiksi buku : koleksiNonFiksi) {
            buku.infoNonFiksi();
        }
    }
}
