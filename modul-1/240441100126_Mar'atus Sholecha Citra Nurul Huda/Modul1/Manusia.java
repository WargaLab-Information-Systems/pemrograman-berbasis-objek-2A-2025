package Modul1;

public class Manusia {
    // Atribut
    private final String nama;
    private final int umur;
    private final String alamat;

    // Konstruktor
    public Manusia(String nama, int umur, String alamat) {
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
    }

    // Method berjalan
    public void berjalan() {
        System.out.println(nama + " sedang berjalan perlahan.");
    }

    // Method berlari
    public void berlari() {
        System.out.println(nama + " sedang berlari dengan cepat.");
    }

    // Getter untuk menampilkan informasi
    public void tampilkanInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur + " tahun");
        System.out.println("Alamat: " + alamat);
    }

    // Method main untuk menjalankan program
    public static void main(String[] args) {
        // Membuat objek-objek Manusia
        Manusia manusia1 = new Manusia("Citra", 20, "Gresik");
        Manusia manusia2 = new Manusia("Melati", 19, "Jombang");
        Manusia manusia3 = new Manusia("Ghafirah", 19, "Sumenep");
        Manusia manusia4 = new Manusia("Galih", 20, "Jombang");
        Manusia manusia5 = new Manusia("Gweneth", 21, "Malaysia");
        Manusia manusia6 = new Manusia("Arif", 19, "Sampang");

        // Menampilkan informasi dan aksi masing-masing manusia
        System.out.println("Informasi Manusia 1:");
        manusia1.tampilkanInformasi();
        manusia1.berjalan();
        manusia1.berlari();
        System.out.println();

        System.out.println("Informasi Manusia 2:");
        manusia2.tampilkanInformasi();
        manusia2.berjalan();
        manusia2.berlari();
        System.out.println();

        System.out.println("Informasi Manusia 3:");
        manusia3.tampilkanInformasi();
        manusia3.berjalan();
        manusia3.berlari();
        System.out.println();

        System.out.println("Informasi Manusia 4:");
        manusia4.tampilkanInformasi();
        manusia4.berjalan();
        manusia4.berlari();
        System.out.println();

        System.out.println("Informasi Manusia 5:");
        manusia5.tampilkanInformasi();
        manusia5.berjalan();
        manusia5.berlari();
        System.out.println();
        
        System.out.println("Informasi Manusia 6:");
        manusia6.tampilkanInformasi();
        manusia6.berjalan();
        manusia6.berlari();
        System.out.println();
        
    }
}

