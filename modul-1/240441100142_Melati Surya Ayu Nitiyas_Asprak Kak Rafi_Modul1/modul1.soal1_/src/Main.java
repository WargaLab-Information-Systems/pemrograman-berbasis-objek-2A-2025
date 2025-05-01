
class Manusia {
    private final String nama;
    private final int umur;
    private final String alamat;

    // Constructor
    public Manusia(String nama, int umur, String alamat) {
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
    }

    
    public void berjalan() {
        System.out.println(nama + " sedang berjalan.");
    }

    
    public void berlari() {
        System.out.println(nama + " sedang berlari.");
         System.out.println(" ");
    }

    // Method untuk menampilkan informasi manusia
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("Alamat: " + alamat);
        
    }
}

// Kelas utama untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        // Membuat objek dari class Manusia
        Manusia manusia1 = new Manusia("Melati", 19, "Jakarta");
        Manusia manusia2 = new Manusia("Yolanda", 20, "Bandung");
        Manusia manusia3 = new Manusia("Nessa", 21, "Surabaya");
        Manusia manusia4 = new Manusia("Dini", 22, "Yogyakarta");
        Manusia manusia5 = new Manusia("Maulida", 23, "Medan");

        // Menampilkan informasi dan aktivitas setiap objek
        manusia1.tampilkanInfo();
        manusia1.berjalan();
        manusia1.berlari();
        
        
        manusia2.tampilkanInfo();
        manusia2.berjalan();
        manusia2.berlari();

        manusia3.tampilkanInfo();
        manusia3.berjalan();
        manusia3.berlari();

        manusia4.tampilkanInfo();
        manusia4.berjalan();
        manusia4.berlari();

        manusia5.tampilkanInfo();
        manusia5.berjalan();
        manusia5.berlari();
    }
}
