/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2;

public class Main {
    public static void main(String[] args) {
        Perpustakaan perpustakaan = new Perpustakaan(50); 

        perpustakaan.tambahBuku(new Buku("Laskar Pelangi", "Andrea Hirata", 123));
        perpustakaan.tambahBuku(new Buku("Bumi", "Tere Liye", 345));
        perpustakaan.tambahBuku(new Buku("Dompet Ayah Sepatu Ibu", "Js.Khairen", 456));

        System.out.println("\nDaftar Buku di Perpustakaan:");
        perpustakaan.tampilkanDaftarBuku();
    }
}



