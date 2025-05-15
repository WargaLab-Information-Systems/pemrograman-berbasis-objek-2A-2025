/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal2;
import java.util.ArrayList;
/**
 *
 * @author wingd
 */
public class Perpustakaan {
    private ArrayList<Buku> daftarBuku;

    public Perpustakaan() {
        daftarBuku = new ArrayList<>();
    }

    // Method menambahkan buku
    public void tambahBuku(Buku buku) {
        daftarBuku.add(buku);
        System.out.println("\nBuku berhasil ditambahkan!");
    }

    // Method menampilkan semua buku
    public void tampilkanSemuaBuku() {
        if (daftarBuku.isEmpty()) {
            System.out.println("\nBelum ada buku di perpustakaan.");
            return;
        }

        System.out.println("\nDAFTAR BUKU DI PERPUSTAKAAN:");
        System.out.println("-----------------------------");
        for (int i = 0; i < this.daftarBuku.size(); i++) {
            Buku buku = this.daftarBuku.get(i);
            System.out.println("Buku " + (i + 1));
            System.out.println("Judul: " + buku.getJudul());
            System.out.println("Penulis: " + buku.getPenulis());
            System.out.println("Jumlah Halaman: " + buku.getJumlahHalaman());
            System.out.println("-----------------------------");
        }
    }
}
