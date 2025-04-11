    package Soal01;

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
        System.out.println("Nama : " + nama);
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
        
        manusia orang1 = new manusia("Arif", 19, "Bangkalan");
        manusia orang2 = new manusia("Galih", 20, "Jombang");
        manusia orang3 = new manusia("Melati", 20, "Jombang");
        manusia orang4 = new manusia("Fifi", 19, "Sumenep");
        manusia orang5 = new manusia("Citra", 20, "Gresik");
        manusia siswa = new manusia ("gwen", 20, "Sulawesi");
        
        orang1.tampilkanInfo();
        orang2.tampilkanInfo();
        orang3.tampilkanInfo();
        orang4.tampilkanInfo();
        orang5.tampilkanInfo();
        siswa.tampilkanInfo();


    }
    
}