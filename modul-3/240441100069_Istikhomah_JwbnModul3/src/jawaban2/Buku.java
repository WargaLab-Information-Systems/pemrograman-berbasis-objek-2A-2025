/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jawaban2;

/**
 *
 * @author istikhomah
 */

// Class Buku sebagai induk
class Buku {
    String judul;
    String penulis;

    Buku(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }

    void tampilInfo() {
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
    }
}

class BukuFiksi extends Buku {
    String genre;

    BukuFiksi(String judul, String penulis, String genre) {
        super(judul, penulis);
        this.genre = genre;
    }

    void tampilFiksi() {
        tampilInfo();
        System.out.println("Genre: " + genre);
        System.out.println();
    }
}

class BukuNonFiksi extends Buku {
    String topik;

    BukuNonFiksi(String judul, String penulis, String topik) {
        super(judul, penulis);
        this.topik = topik;
    }

    void tampilNonFiksi() {
        tampilInfo();
        System.out.println("Topik: " + topik);
        System.out.println();
    }
}
