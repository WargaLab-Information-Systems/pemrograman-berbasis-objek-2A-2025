package Soal1;
public class EWallet implements Payment, Diskon {
    @Override
    public void prosesPembayaran(double jumlah) {
        double diskon = hitungDiskon(jumlah);
        double total = jumlah - diskon;
        System.out.println("=== Pembayaran E-Wallet ===");
        System.out.println("Jumlah belanja: Rp " + jumlah);
        System.out.println("Cashback (sebagai diskon): Rp " + diskon);
        System.out.println("Total yang dibayar: Rp " + total);
        System.out.println();
    }

    @Override
    public double hitungDiskon(double jumlah) {
        return jumlah * 0.10; 
    }
}
