package praktikum.pbo;

class Manusia {
    String nama;
    String alamat;
    int umur;

    Manusia(String nama, String alamat, int umur) {
        this.nama = nama;
        this.alamat = alamat;
        this.umur = umur;
    }

    void berjalan() {
        System.out.println(nama + " sedang berjalan.");
    }

    void berlari() {
        System.out.println(nama + " sedang berlari.");
    }

    void tampilkanInfo() {
        System.out.println("Nama: " + nama + ", Alamat: " + alamat + ", Umur: " + umur );
    }
}

public class Modul1 {
    public static void main(String[] args) {
        Manusia manusia1 = new Manusia("Mahen", "Malang", 23);
        Manusia manusia2 = new Manusia("Reyhan", "Semarang", 22);
        Manusia manusia3 = new Manusia ("Jevan", "Jakarta", 22);
        Manusia manusia4 = new Manusia ("Haikal", "Bandung", 21);
        Manusia manusia5 = new Manusia ("Jarendra", "Yogyakarta", 21);
                
        manusia1.tampilkanInfo();
        manusia1.berjalan();
        manusia2.tampilkanInfo();
        manusia2.berlari();
        manusia3.tampilkanInfo();
        manusia3.berlari();
        manusia4.tampilkanInfo();
        manusia4.berjalan();
        manusia5.tampilkanInfo();
        manusia5.berjalan();
    }
}