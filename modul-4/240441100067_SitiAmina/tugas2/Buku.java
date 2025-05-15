/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas2;

/**
 *
 * @author HP
 */
public class Buku {
    private String judul;
    private String penulis;
    private int jumlahHalaman;

    public Buku(String judul, String penulis, int jumlahHalaman) {
        this.judul = judul;
        this.penulis = penulis;
        this.jumlahHalaman = jumlahHalaman;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public int getJumlahHalaman() {
        return jumlahHalaman;
    }

    public void info() {
        System.out.println("Judul       : " + judul);
        System.out.println("Penulis     : " + penulis);
        System.out.println("Halaman     : " + jumlahHalaman);
        System.out.println("---------------------------");
    }
}

// ========================
// Class Perpustakaan
class Perpustakaan {
    private Buku[] koleksiBuku;
    private int jumlahBuku;

    public Perpustakaan(int kapasitas) {
        koleksiBuku = new Buku[kapasitas];
        jumlahBuku = 0;
    }

    public void tambahBuku(Buku buku) {
        if (jumlahBuku < koleksiBuku.length) {
            koleksiBuku[jumlahBuku] = buku;
            jumlahBuku++;
        } else {
            System.out.println("perpustakaan penuh!");
        }
    }

    public void tampilkanDaftarBuku() {
        if (jumlahBuku == 0) {
            System.out.println("Belum ada buku dalam perpustakaan.");
        } else {
            for (int i = 0; i < jumlahBuku; i++) {
                koleksiBuku[i].info();
            }
        }
    }
}
