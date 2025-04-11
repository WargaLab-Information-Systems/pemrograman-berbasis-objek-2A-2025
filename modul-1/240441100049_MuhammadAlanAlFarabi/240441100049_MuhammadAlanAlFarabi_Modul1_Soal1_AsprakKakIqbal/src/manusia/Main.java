package manusia;

class Manusia {
    String nama;
    int umur;
    String alamat;

    Manusia(String nama, int umur, String alamat) {
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
    }

    void tampilkanInfo() {
        System.out.println("Nama: " + nama + ", Umur: " + umur + ", Alamat: " + alamat);
        System.out.println(nama + " sedang berjalan.");
        System.out.println(nama + " sedang berlari.\n");
    }
}

public class Main {
    public static void main(String[] args) {
        Manusia[] manusia = {
            new Manusia("Sumanto", 25, "Jakarta"),
            new Manusia("Gus", 30, "Bandung"),
            new Manusia("Samsudin", 22, "Surabaya"),
            new Manusia("Supri", 28, "Medan"),
            new Manusia("Agus", 35, "Bali")
        };

        for (Manusia m : manusia) m.tampilkanInfo();
        
        Manusia orang = new Manusia("alan", 18, "telang");
        
        orang.tampilkanInfo();
        
    }
}
