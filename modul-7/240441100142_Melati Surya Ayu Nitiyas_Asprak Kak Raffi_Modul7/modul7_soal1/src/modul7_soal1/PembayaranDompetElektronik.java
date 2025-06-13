package modul7_soal1;

public class PembayaranDompetElektronik implements Pembayaran, Diskon {
    private static final double JUMLAH_DISKON = 1000; // potongan tetap Rp 1000

    @Override
    public void bayar(double jumlah) {
        double jumlahAkhir = hitungJumlahAkhir(jumlah);
        System.out.printf("Pembayaran e-wallet sebesar: %.2f\n", jumlahAkhir);
    }

    @Override
    public double hitungJumlahAkhir(double jumlah) {
        return aplikasikanDiskon(jumlah);
    }

    @Override
    public double aplikasikanDiskon(double jumlah) {
        return jumlah - JUMLAH_DISKON;
    }
}
