
package pkg240441100145_aryabdifatah_modul1_nomor1;

public class Manusia {
    String nama;
    int umur;
    String alamat;


    public Manusia(String nama, int umur, String alamat) {
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
    }

    
    public void berjalan() {
        System.out.println(nama + " Sedang berjalan.");
    }

    
    public void berlari() {
        System.out.println(nama + " Sedang berlari.");
    }

    
    public static void main(String[] args) {
        Manusia manusia1 = new Manusia("Rafly", 25, "Jombang");
        Manusia manusia2 = new Manusia("Naufal", 19, "Bangkalan");
        Manusia manusia3 = new Manusia("Biyan", 22, "Lamongan");
        Manusia manusia4 = new Manusia("Dewi", 28, "Telang");
        Manusia manusia5 = new Manusia("Eka", 35, "Medan");

        // Memanggil method
        manusia1.berjalan();
        manusia2.berlari();
        manusia3.berjalan();
        manusia4.berlari();
        manusia5.berjalan();
    }
}