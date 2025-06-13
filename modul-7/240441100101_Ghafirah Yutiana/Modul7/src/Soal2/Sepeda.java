package Soal2;

// Pastikan interface DapatDibooking juga berada di package Soal2
public class Sepeda implements DapatDibooking {
    private boolean sudahDipesan = false;

    @Override
    public boolean pesan(int usiaPengguna) {
        // Tidak ada batasan usia untuk sepeda
        sudahDipesan = true;
        return true;
    }

    @Override
    public double hitungBiaya() {
        return 50_000;
    }
}
