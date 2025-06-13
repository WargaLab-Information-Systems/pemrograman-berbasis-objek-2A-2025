package Soal2;
public class Motor implements DapatDibooking, DapatDiasuransikan {
    private boolean sudahDipesan = false;

    @Override
    public boolean pesan(int usiaPengguna) {
        if (usiaPengguna < 17) {
            System.out.println("Usia tidak cukup untuk memesan motor.");
            return false;
        }
        sudahDipesan = true;
        return true;
    }

    @Override
    public double hitungBiaya() {
        return 200_000;
    }

    @Override
    public double hitungAsuransi() {
        return 20_000;
    }
}


