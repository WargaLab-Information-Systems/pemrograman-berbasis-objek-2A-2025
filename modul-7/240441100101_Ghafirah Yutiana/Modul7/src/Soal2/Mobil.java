package Soal2;
public class Mobil implements DapatDibooking, DapatDiasuransikan {
    private boolean sudahDipesan = false;

    @Override
    public boolean pesan(int usiaPengguna) {
        if (usiaPengguna < 17) {
            System.out.println("Usia tidak cukup untuk memesan mobil.");
            return false;
        }
        sudahDipesan = true;
        return true;
    }

    @Override
    public double hitungBiaya() {
        return 500_000;
    }

    @Override
    public double hitungAsuransi() {
        return 50_000;
    }
}


