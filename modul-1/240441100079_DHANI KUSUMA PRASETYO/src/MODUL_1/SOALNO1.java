package MODUL_1;

class Manusia {  
    String nama;
    int umur;
    String alamat;


    public void berjalan() {
        System.out.println(nama + " sedang berjalan.");
    }

    public void berlari() {
        System.out.println(nama + " sedang berlari.");
    }

    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("Alamat: " + alamat);
    }
}

public class SOALNO1 {
    public static void main(String[] args) {
        Manusia orang1 = new Manusia();
        Manusia orang2 = new Manusia();
        Manusia orang3 = new Manusia();
        Manusia orang4 = new Manusia();
        Manusia orang5 = new Manusia();
        
        orang1.nama ="dhani";
        orang1.umur= 19;
        orang1.alamat="lamongan";
        
        orang1.tampilkanInfo();
        orang1.berjalan();
        
        orang2.nama ="kusuma";
        orang2.umur= 18;
        orang2.alamat="Tuban";
        
        orang2.tampilkanInfo();
        orang2.berlari();
        
        orang3.nama ="Prasetyo";
        orang3.umur= 17;
        orang3.alamat="Gresik";
        
        orang3.tampilkanInfo();
        orang3.berlari();
        
        orang4.nama ="Jois";
        orang4.umur= 19;
        orang4.alamat="Bangkalan";
        
        orang4.tampilkanInfo();
        orang4.berjalan();
        
        orang5.nama ="Faisol";
        orang5.umur= 19;
        orang5.alamat="Surabaya";
        
        orang5.tampilkanInfo();
        orang5.berjalan();
    }
}
