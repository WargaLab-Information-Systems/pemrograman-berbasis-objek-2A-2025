package modul7_soal1;

public class PembayaranKartuKredit implements Pembayaran {
    private static final double TARIF_BIAYA_TAMBAHAN = 0.02; // biaya tambahan 2%

    @Override
    public void bayar(double jumlah) {
        double jumlahAkhir = hitungJumlahAkhir(jumlah);
        System.out.printf("Pembayaran kartu kredit sebesar: %.2f\n", jumlahAkhir);
    }

    @Override
    public double hitungJumlahAkhir(double jumlah) {
        return jumlah + (jumlah * TARIF_BIAYA_TAMBAHAN);
    }
}
