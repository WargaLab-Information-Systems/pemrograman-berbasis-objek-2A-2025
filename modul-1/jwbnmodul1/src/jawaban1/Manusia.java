/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jawaban1;

//class
class Manusia {
    String nama;
    int umur;
    String alamat;

    // Constructor
    public Manusia(String nama, int umur, String alamat) {
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
    }

    // Method berjalan dan berlari
     public void tampilkanInfo() {
        System.out.println("Nama: " + nama + ", Umur: " + umur + ", Alamat: " + alamat);
    }
     
    public void berjalan() {
        System.out.println(nama + " sedang berjalan.");
    }

    public void berlari() {
        System.out.println(nama + " sedang berlari.");
    }
}




