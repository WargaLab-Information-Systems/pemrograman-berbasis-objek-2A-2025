/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manusia_122;

class manusia {
    String nama;
    int umur;
    String alamat;

    //constructure
    manusia (String nama, int umur, String alamat){
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
    }

    //method
    void berjalan() {
        System.out.println(nama + " " + umur + " tahun " + alamat + " sedang berjalan");
    }

    void berlari() {
        System.out.println(nama + " " + umur + " tahun " + alamat + " sedang berlari");
    }
}

public class Manusia_122 {

    public static void main(String[] args) {
        //object
        manusia manusia1 = new manusia("Sarifa", 19, "Probolinggo");
        manusia manusia2 = new manusia("Reval", 5, "Pendil");
        manusia manusia3 = new manusia("Dewi", 21, "Surabaya");
        manusia manusia4 = new manusia("Hidayat", 25, "Bangkalan");
        manusia manusia5 = new manusia("Ana", 15, "Pamekasan");
        
        //panggil objeknya plus method
        manusia1.berjalan();
        manusia2.berlari();
        manusia3.berjalan();
        manusia4.berlari();
        manusia5.berjalan();
    } 
}
