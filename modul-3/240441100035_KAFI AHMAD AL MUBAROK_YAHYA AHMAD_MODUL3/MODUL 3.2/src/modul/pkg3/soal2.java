/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul.pkg3.pkg2;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author KAFI AHMAD
 */

class Buku {
    String judul;
    String penulis;
    
    Buku(String judul, String penulis){
        this.judul = judul;
        this.penulis = penulis;
    }
    
    void tampilBuku() {
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
    }
}

class BukuFiksi extends Buku  {
    String genre;
    
    BukuFiksi(String judul, String penulis, String genre) {
        super(judul, penulis);
        this.genre = genre;
    }
    
    void TampilBukuFiksi() {
        tampilBuku();
        System.out.println("Genre: " + genre);
    }
}
class BukuNonFiksi extends Buku {
    String topik;

    BukuNonFiksi(String judul, String penulis, String topik) {
        super(judul, penulis);
        this.topik = topik;
    }

    void infoNonFiksi() {
        System.out.println("\n=== Buku Non-Fiksi ===");
        tampilBuku();
        System.out.println("Topik: " + topik);
    }
}

class Perpustakaan {
    ArrayList<BukuFiksi> koleksiFiksi;
    ArrayList<BukuNonFiksi> koleksiNonFiksi;

    public Perpustakaan() {
        koleksiFiksi = new ArrayList<>();
        koleksiNonFiksi = new ArrayList<>();
    }

    void tambahBukuFiksi(BukuFiksi buku) {
        koleksiFiksi.add(buku);
        System.out.println("Buku fiksi berhasil ditambahkan!");
    }

    void tambahBukuNonFiksi(BukuNonFiksi buku) {
        koleksiNonFiksi.add(buku);
        System.out.println("Buku non-fiksi berhasil ditambahkan!");
    }

    void tampilkanKoleksi() {
        System.out.println("=== KOLEKSI PERPUSTAKAAN ===");
        
        System.out.println("\nBuku Fiksi:");
        if (koleksiFiksi.isEmpty()) {
            System.out.println("Belum ada buku fiksi dalam koleksi.");
        } else {
            for (BukuFiksi buku : koleksiFiksi) {
                buku.TampilBukuFiksi();
            }
        }
        
        System.out.println("Buku Non-Fiksi:");
        if (koleksiNonFiksi.isEmpty()) {
            System.out.println("Belum ada buku non-fiksi dalam koleksi.");
        } else {
            for (BukuNonFiksi buku : koleksiNonFiksi) {
                buku.infoNonFiksi();
            }
        }
    }
}
