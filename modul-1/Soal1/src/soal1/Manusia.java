package Soal1;
public class Manusia {
    String nama;
    int umur;
    String alamat;
    
    public Manusia(String nama, int umur, String alamat) {
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
        
        Manusia orang1 = new Manusia( "Juna", 20, "Bangkalan");
        Manusia orang2 = new Manusia("Gilang", 20, "Jombang");
        Manusia orang3 = new Manusia("Ardhi", 20, "Jombang");
        Manusia orang4 = new Manusia("Yuni", 19, "Sumenep");
        Manusia orang5 = new Manusia("Cinta", 20, "Gresik");
        
        orang1.tampilkanInfo();
        orang2.tampilkanInfo();
        orang3.tampilkanInfo();
        orang4.tampilkanInfo();
        orang5.tampilkanInfo();
    }
}