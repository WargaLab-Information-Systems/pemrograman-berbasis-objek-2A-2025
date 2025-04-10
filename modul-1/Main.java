package javaapplication6;

class manusia {
    
    String nama;
    int umur;
    String alamat;
    
    public manusia(String nama, int umur, String alamat) {
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
    }


    
    public void berjalan() {
        System.out.println("Nama : " + nama + "Umur : " + umur + ", Alamat : " + alamat + "sedang berjalan");
    }


    
    public void berlari() {
        System.out.println("Nama : " + nama + "Umur : " + umur + ", Alamat : " + alamat + " sedang berlari");
    }
}


public class Main {
    public static void main(String[] args) {
       
        manusia objek1 = new manusia("Amina, ",  19, "Klampis, ");
        manusia objek2 = new manusia("novi, ", 19, "Arosbaya, ");
        manusia objek3 = new manusia("alivia, ", 20, "Arosbaya, ");
        manusia objek4 = new manusia("hida, ", 20, "Klampis, ");
        manusia objek5 = new manusia("yunita, ", 20, "Arosbaya, ");
        manusia objek6 = new manusia("Lisa, ", 17, "Pocogan, ");
        manusia objek7 = new manusia("novida, ", 18, "Arosbaya, ");


        
        objek1.berjalan();
        objek1.berlari();
        
        objek2.berjalan();
        objek2.berlari();
        
        objek3.berjalan();
        objek3.berlari();
        
        objek4.berjalan();
        objek4.berlari();
        
        objek5.berjalan();
        objek5.berlari();
        
        objek6.berjalan();
        objek6.berlari();
        
        objek7.berjalan();
        objek7.berlari();
        
        
    }
}