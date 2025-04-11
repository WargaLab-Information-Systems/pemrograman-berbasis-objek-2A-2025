/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul1;

class manusia {
    String nama;
    int umur;
    String alamat;
    
    //constructure
    manusia (String nama, int umur, String alamat) {
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
    }
    
    //method
    void berjalan() {
        System.out.println(nama + " " + "berasal dari " + alamat + " umur " + umur + " tahun sedang berjalan.");
    }
    
    void berlari() {
        System.out.println(nama + " " + "berasal dari " + alamat + " umur " + umur + " tahun sedang berlari.");
    }
}

public class Modul1 {

    public static void main(String[] args) {
        //object
        manusia m1 = new manusia("Salsabila", 19, "Gresik");
        manusia m2 = new manusia("Anantasya", 16, "Bandung");
        manusia m3 = new manusia("Novan", 20, "Mojokerto");
        manusia m4 = new manusia("Skala", 21, "Padang");
        manusia m5 = new manusia("Aldi", 4, "Lamongan");
        manusia m6 = new manusia ("Revan", 19, "Kediri");
        
        //manggil object dan method
        m1.berjalan();
        m2.berlari();
        m3.berjalan();
        m4.berlari();
        m5.berjalan();
        m6.berlari();
    }  
}
 