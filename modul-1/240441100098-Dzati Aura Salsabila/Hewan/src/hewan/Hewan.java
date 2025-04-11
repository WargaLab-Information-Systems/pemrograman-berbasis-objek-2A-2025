/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hewan;

class anjing {
    String nama;
    String jenis;
    int umur;
    
    //constructure
    anjing (String nama, String jenis, int umur){
        this.nama = nama;
        this.jenis = jenis;
        this.umur = umur;
    }
    
    //method
    void suara() {
        System.out.println(nama + " menggonggong : guk guk!");
    }
    
    void panggil() {
        System.out.println("Anjing ini bernama " + nama + ", Jenis " + jenis + ", Umur " + umur + " tahun ");
    }
}

class kucing {
    String nama;
    String warna;
    int umur;
    
    //constructure
    kucing (String nama, String warna, int umur){
        this.nama = nama;
        this.warna = warna;
        this.umur = umur;
    }
    
    //method
    void suara() {
        System.out.println(nama + " mengeong : meow!");
    }
    
    void panggil() {
        System.out.println("Kucing ini bernama " + nama + ", warnanya " + warna + ", Umur " + umur + " tahun ");
    }
}

class domba {
    String nama;
    String jenis;
    int umur;
    
    //constructure
    domba (String nama, String jenis, int umur){
        this.nama = nama;
        this.jenis = jenis;
        this.umur = umur;
    }
    
    //method
    void berbulu() {
        System.out.println(nama + " domba yang berumur " + umur + " tahun, " + "merupakan domba jenis " + jenis);
    }
    
    void makan() {
        System.out.println(nama + " adalah domba yang suka makan rumput.");
    }
}

public class Hewan {

    public static void main(String[] args) {
       String[] namaAnjing = {"Abul", "Oyen", "Doggy"};
       String[] namaKucing = {"Wony", "Uwon", "Abu"};
       String[] namaDomba = {"Suki", "Bola", "Luli"};
       
       System.out.println("=== Daftar Anjingku ===");
       for (int i = 0;  i < 3; i++){
           anjing aj = new anjing(namaAnjing[i], (i % 2 == 0) ? "bulldog" : "husky", 1 + i);
           aj.panggil();
           aj.suara();
           System.out.println(); 
       }
       
        System.out.println("=== Daftar Kucingku ===");
        for (int i = 0; i < 3; i++){
           kucing kc = new kucing(namaKucing[i], (i % 2 == 0) ? "abu" : "hitam", 1 + i);
           kc.panggil();
           kc.suara();
           System.out.println(); 
       }
        
        System.out.println("=== Daftar Dombaku ===");
        for (int i = 0; i < 3; i++){
           domba db = new domba(namaDomba[i], (i % 2 == 0) ? "merino" : "romney", 2 + i);
           db.makan();
           db.berbulu();
           System.out.println(); 
       }
        
    }
    
}
