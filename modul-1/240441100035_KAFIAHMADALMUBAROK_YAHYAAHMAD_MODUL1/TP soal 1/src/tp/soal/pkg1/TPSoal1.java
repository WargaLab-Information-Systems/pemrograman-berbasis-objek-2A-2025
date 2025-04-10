/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp.soal.pkg1;

/**
 *
 * @author KAFI AHMAD
 */

class manusia {
    String nama;
    int umur;
    String alamat;

    manusia(String nama, String alamat, int umur) {
        this.nama = nama;
        this.alamat = alamat;
        this.umur = umur;
    }
    
    public void berjalan(){
    System.out.println("Nama:"+ nama + " Alamat:" + alamat + " Umur:" + umur + " Dia sedang berjalan");
    }

    public void berlari(){
    System.out.println("Nama:"+ nama + " Alamat:" + alamat + " Umur:" + umur + " Dia sedang berlari");
    }  
}

public class TPSoal1{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        manusia manusia1 = new manusia("Aki", "Lamongan", 13);
        manusia manusia2 = new manusia("Afis", "Padang", 17);
        manusia manusia3 = new manusia("Kina", "Surabaya", 16);
        manusia manusia4 = new manusia("Kira", "Kediri", 19);
        manusia manusia5 = new manusia("Jojon", "Brebes", 13);
        
        manusia1.berjalan();
        manusia2.berlari();
        manusia3.berjalan();
        manusia4.berlari();
        manusia5.berlari();
    }
}
