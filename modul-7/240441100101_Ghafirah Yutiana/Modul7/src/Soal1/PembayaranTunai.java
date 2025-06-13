package Soal1;

public class PembayaranTunai extends PembayaranAbstrak implements DapatDiskon {

    public PembayaranTunai() {
        super("Tunai");
    }

    @Override
    public double terapkanDiskon(double jumlah) {
        // Diskon 5% untuk pembayaran tunai
        return jumlah * 0.95;
    }

    @Override
    public double bayar(double jumlah) {
        return terapkanDiskon(jumlah);
    }
}


