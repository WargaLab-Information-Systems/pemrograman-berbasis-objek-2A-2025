package modul1;

class Manusia {
    String nama;
    int umur;
    String kota;

    Manusia(String nama, int umur, String kota) {
        this.nama = nama;
        this.umur = umur;
        this.kota = kota;
    }

    void tampilkanInfo() {
        System.out.println("Nama: " + nama + ", Umur: " + umur + ", Kota: " + kota);
    }

    void berjalan() {
        System.out.println(nama + " sedang berjalan.");
    }

    void berlari() {
        System.out.println(nama + " sedang berlari.");
    }
}

public class soal1 {
    public static void main(String[] args) {
        Manusia[] manusia = {
            new Manusia("Rofy", 19, "Surabaya"),
            new Manusia("Hasyim", 20, "Gresik"),
            new Manusia("Rangga", 22, "Sidoarjo"),
            new Manusia("Budiono", 23, "Mojokerto"),
            new Manusia("Siregar", 25, "Madura")
        };

        for (Manusia m : manusia) {
            m.tampilkanInfo();
            m.berjalan();
            m.berlari();
            System.out.println();
        }
    }
}