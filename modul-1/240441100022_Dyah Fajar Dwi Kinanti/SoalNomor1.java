/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soalnomor1;

class manusia {
    String nama;
    int umur;
    String alamat;
    
    //constructure (penyimpanan data input kedalam objek)
    
    manusia (String nama, int umur, String alamat) {
        this.nama = nama;
        this.umur =umur;
        this.alamat = alamat;
    }
    
    // method (penampilan aksi dari objek) menampilkan tidak mengembalikan
    void berjalan (){
        System.out.println(nama + " " + umur + " tahun " + alamat + " sedang berjalan ");
    }
    
    void berlari(){
        System.out.println(nama + " " + umur + " tahun " + alamat + " sedang berlari ");
    }
}

public class SoalNomor1 {
    
    public static void main (String[] args) {
        //object (penempatan program di eksekusi)
        manusia manusia1 = new manusia(" Dyah ", 18, " Bojonegoro ");
        manusia manusia2 = new manusia(" Dea ", 19, " Malang ");
        manusia manusia3 = new manusia(" Aqila ", 17, " Bojonegoro ");
        manusia manusia4 = new manusia(" Fajar ", 18, " Surabaya ");
        manusia manusia5 = new manusia(" Dwi ", 20, " Bojonegoro ");
        
        //panggil objek plus method
        manusia1.berjalan();
        manusia2.berjalan();
        manusia3.berlari();
        manusia4.berjalan();
        manusia5.berlari();
    }
}

           
            
            
 
