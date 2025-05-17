package Soal1;

public class manusia {
    String nama;
    int umur;
    String alamat;
    
    public manusia(String nama, int umur, String alamat) {
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
    }
    
    public void tampilkanInfo() {
        System.out.println("\nNama : " + nama);
        System.out.println("Umur : " + umur);
        System.out.println("Alamat : " + alamat);
        berjalan();
        berlari();
    }
    public void berjalan() {
        System.out.println(nama + " sedang berjalan.");
    }
    public void berlari() {
        System.out.println(nama + " sedang berlari.");
    }
    public static void main(String[]args) {
        
        manusia orang1 = new manusia("Fifin", 19, "Pangaran");
        manusia orang2 = new manusia("Eva", 20, "Gapura");
        manusia orang3 = new manusia("Indri", 20, "Dungkek");
        manusia orang4 = new manusia("Mila", 19, "Batang-batang");
        manusia orang5 = new manusia("Ifa", 20, "Talango");
        
        orang1.tampilkanInfo();
        orang2.tampilkanInfo();
        orang3.tampilkanInfo();
        orang4.tampilkanInfo();
        orang5.tampilkanInfo();
    }
    
}

