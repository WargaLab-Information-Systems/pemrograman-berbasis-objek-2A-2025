package Soal1;
public class KartuKredit implements Payment, Diskon {
    @Override
    public void prosesPembayaran(double jumlah) {
        double diskon = hitungDiskon(jumlah);
        double total = jumlah - diskon;
        System.out.println("=== Pembayaran Kartu Kredit ===");
        System.out.println("Jumlah belanja: Rp " + jumlah);
        System.out.println("Diskon: Rp " + diskon);
        System.out.println("Total yang dibayar: Rp " + total);
        System.out.println();
    }

    @Override
    public double hitungDiskon(double jumlah) {
        return jumlah * 0.05; // 5% diskon
    }
}
