package modul1soal1;
//class-atribut
class Manusia {
    private String nama;
    private int umur;
    private String alamat;

//konstruktor-parameter
    public Manusia(String nama, int umur, String alamat) {
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
    }

//method berjalan dan berlari
    public void berjalan() {
        System.out.println(nama + umur + alamat + " sedang berjalan.");
    }

    public void berlari() {
        System.out.println(nama + " sedang berlari.");
    }
}

//object
public class Modul1Soal1 {
    public static void main(String[] args) {
        Manusia manusia1 = new Manusia("Febby", 19, "Mojokerto");
        Manusia manusia2 = new Manusia("Satriyo", 25, "Bandung");
        Manusia manusia3 = new Manusia("Anisa", 22, "Surabaya");
        Manusia manusia4 = new Manusia("Diva", 28, "Yogyakarta");
        Manusia manusia5 = new Manusia("Davi", 35, "Malang");

        manusia1.berjalan();
        manusia2.berlari();
        manusia3.berjalan();
        manusia4.berlari();
        manusia5.berjalan();
    }
}
