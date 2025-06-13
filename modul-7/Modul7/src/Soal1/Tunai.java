package Soal1;
public class Tunai implements Payment {
    private double biayaAdmin = 2000;

    @Override
    public void prosesPembayaran(double jumlah) {
        double total = jumlah + biayaAdmin;
        System.out.println("=== Pembayaran Tunai ===");
        System.out.println("Jumlah belanja: Rp " + jumlah);
        System.out.println("Biaya administrasi: Rp " + biayaAdmin);
        System.out.println("Total yang dibayar: Rp " + total);
        System.out.println();
    }
}
