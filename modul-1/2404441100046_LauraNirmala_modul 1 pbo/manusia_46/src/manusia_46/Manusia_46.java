/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manusia_46;

class manusia {
    String nama;
    int umur;
    String alamat;

    // Constructor
    manusia(String nama, int umur, String alamat) {
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
    }

    // Method berjalan
    void berjalan() {
        System.out.println(nama + " " + umur + " tahun " + alamat + " sedang berjalan");
    }

    // Method berlari
    void berlari() {
        System.out.println(nama + " " + umur + " tahun " + alamat + " sedang berlari");
    }
}

public class Manusia_46 {
    public static void main(String[] args) {
        // Membuat objek
        manusia manusia1 = new manusia("Sulis", 19, "Sampang");
        manusia manusia2 = new manusia("laura", 20, "jakarta");
        manusia manusia3 = new manusia("icha", 18, "Surabaya");
        manusia manusia4 = new manusia("bagas", 21, "lumajang");
        manusia manusia5 = new manusia("mamat", 17, "Pamekasan");

        // Memanggil method pada objek
        manusia1.berjalan();
        manusia2.berjalan();
        manusia3.berlari();
        manusia4.berjalan();
        manusia5.berjalan();
    }
}