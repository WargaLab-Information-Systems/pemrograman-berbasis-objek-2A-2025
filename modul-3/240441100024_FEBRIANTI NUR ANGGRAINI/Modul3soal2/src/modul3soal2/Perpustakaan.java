package modul3soal2;

import java.util.ArrayList;

public class Perpustakaan {
    ArrayList<BukuFiksi> koleksiFiksi;
    ArrayList<BukuNonFiksi> koleksiNonFiksi;

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
        System.out.println("\n=== Koleksi Buku Fiksi ===");
        for (BukuFiksi buku : koleksiFiksi) {
            buku.infoFiksi();
        }

        System.out.println("\n=== Koleksi Buku Non-Fiksi ===");
        for (BukuNonFiksi buku : koleksiNonFiksi) {
            buku.infoNonFiksi();
        }
    }
}
