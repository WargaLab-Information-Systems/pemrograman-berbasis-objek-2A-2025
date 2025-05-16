/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dua;

/**
 *
 * @author Miftakhul Arinda
 */
public class perpustakaan {
    private buku[] daftarBuku = new buku[100];
    private int jumlahBuku = 0;

    public void tambahBuku(buku b) {
        if (jumlahBuku < daftarBuku.length) {
            daftarBuku[jumlahBuku++] = b;
        }
    }

    public void tampilkanSemuaBuku() {
        for (int i = 0; i < jumlahBuku; i++) {
            daftarBuku[i].tampilInfo();
        }
    }
}
