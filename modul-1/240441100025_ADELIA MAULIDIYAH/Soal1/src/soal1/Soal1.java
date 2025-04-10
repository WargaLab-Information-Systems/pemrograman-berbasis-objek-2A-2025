package Soal1;

class Manusia {
    private String nama;
    private int umur;
    private String alamat;

    public Manusia(String nama, int umur, String alamat) {
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
    }

    public void berjalan() {
        System.out.println(nama + umur + alamat + " sedang berjalan.");
    }

    public void berlari() {
        System.out.println(nama + umur + alamat +" sedang berlari.");
    }
}

public class Soal1 {
    public static void main(String[] args) {
        Manusia manusia1 = new Manusia("Adelia", 19, "Mojokerto");
        Manusia manusia2 = new Manusia("Rafly", 25, "Bandung");
        Manusia manusia3 = new Manusia("Citra", 22, "Surabaya");
        Manusia manusia4 = new Manusia("Dewi", 28, "Yogyakarta");
        Manusia manusia5 = new Manusia("Dava", 35, "Malang");

        manusia1.berjalan();
        manusia2.berlari();
        manusia3.berjalan();
        manusia4.berlari();
        manusia5.berjalan();
    }
}
