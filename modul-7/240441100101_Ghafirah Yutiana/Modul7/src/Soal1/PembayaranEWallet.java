package Soal1;
public class PembayaranEWallet extends PembayaranAbstrak implements DapatDiskon {

    public PembayaranEWallet() {
        super("E-Wallet");
    }

    @Override
    public double terapkanDiskon(double jumlah) {
        // Potongan 10% untuk pembayaran e-wallet
        return jumlah * 0.90;
    }

    @Override
    public double bayar(double jumlah) {
        return terapkanDiskon(jumlah);
    }
}




