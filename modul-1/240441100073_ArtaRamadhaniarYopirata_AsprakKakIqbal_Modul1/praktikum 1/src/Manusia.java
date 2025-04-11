public class Manusia {
    String nama;
    int umur;
    String alamat;

    Manusia(String nama, int umur, String alamat) {
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
    }

    void berjalan() {
        System.out.println(nama + " sedang berjalan.");
    }

    void berlari() {
        System.out.println(nama + " sedang berlari.");
    }
}