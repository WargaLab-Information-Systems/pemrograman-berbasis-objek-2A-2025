package Soal1;

public class EWallet implements Payment {
    private double cashback = 0.02;

    @Override
    public double hitungTotal(double jumlahAwal) {
        return jumlahAwal - (jumlahAwal * cashback);
    }

    @Override
    public void prosesPembayaran(double jumlahAwal) {
        double total = hitungTotal(jumlahAwal);
        System.out.println("Pembayaran melalui E-Wallet dengan cashback 2%");
        System.out.println("Total bayar: Rp" + total);
    }
}

