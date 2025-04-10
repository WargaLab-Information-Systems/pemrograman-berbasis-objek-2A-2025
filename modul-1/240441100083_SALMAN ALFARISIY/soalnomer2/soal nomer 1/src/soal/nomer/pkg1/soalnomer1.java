/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal.nomer.pkg1;
class Manusia{
    String nama;
    String alamat;
    int umur;

    public void berjalan(){
        System.out.println(nama + " berjalan");
    }
    public void berlari(){
        System.out.println(nama+ " berlari");
    }
    public void info (){
        System.out.println("nama: " + nama +",alamat: "+alamat+",umur: "+ umur );
    }
    
}


public class soalnomer1 {
    public static void main(String[] args) {
        Manusia manusia1 = new Manusia();
        Manusia manusia2 = new Manusia();
        Manusia manusia3 = new Manusia();
        Manusia manusia4 = new Manusia();
        Manusia manusia5 = new Manusia();
//        
        manusia1.nama="salman";
        manusia1.alamat = "lamongan";
        manusia1.umur = 24;
                
        manusia1.info();
        manusia1.berjalan();
        
        manusia2.nama="salman";
        manusia2.alamat = "lamongan";
        manusia2.umur = 24;
        
        manusia2.info();
        manusia2.berjalan();
        
        manusia3.nama="modric";
        manusia3.alamat = "ngawi";
        manusia3.umur = 20;
        
        manusia3.info();
        manusia3.berjalan();
        
        manusia4.nama="ronaldo";
        manusia4.alamat = "jember";
        manusia4.umur = 32;
        
        manusia4.info();
        manusia4.berjalan();
        
        manusia5.nama="shiva";
        manusia5.alamat = "gersik";
        manusia5.umur = 16;
        
        manusia5.info();
        manusia5.berjalan();
        
    }
}
    
    
