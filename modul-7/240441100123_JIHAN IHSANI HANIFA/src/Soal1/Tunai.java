package Soal1;

public class Tunai implements Payment {
    private double diskon = 0.05;

    @Override
    public double hitungTotal(double jumlahAwal) {
        return jumlahAwal - (jumlahAwal * diskon);
    }

    @Override
    public void prosesPembayaran(double jumlahAwal) {
        double total = hitungTotal(jumlahAwal);
        System.out.println("Pembayaran tunai dengan diskon 5%");
        System.out.println("Total bayar: Rp" + total);
    }
}

