/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jawaban2;

/**
 *
 * @author istikhomah
 */

import java.util.ArrayList;


class Perpustakaan {
    ArrayList<BukuFiksi> daftarFiksi = new ArrayList<>();
    ArrayList<BukuNonFiksi> daftarNonFiksi = new ArrayList<>();

    void tambahFiksi(BukuFiksi buku) {
        daftarFiksi.add(buku);
    }

    void tambahNonFiksi(BukuNonFiksi buku) {
        daftarNonFiksi.add(buku);
    }

    void tampilkanSemua() {
        System.out.println("\n== Koleksi Buku Fiksi ==");
        if (daftarFiksi.isEmpty()) {
            System.out.println("Belum ada buku fiksi.");
        } else {
            for (BukuFiksi b : daftarFiksi) {
                b.tampilFiksi();
            }
        }

        System.out.println("== Koleksi Buku Non-Fiksi ==");
        if (daftarNonFiksi.isEmpty()) {
            System.out.println("Belum ada buku non-fiksi.");
        } else {
            for (BukuNonFiksi b : daftarNonFiksi) {
                b.tampilNonFiksi();
            }
        }
    }
}

