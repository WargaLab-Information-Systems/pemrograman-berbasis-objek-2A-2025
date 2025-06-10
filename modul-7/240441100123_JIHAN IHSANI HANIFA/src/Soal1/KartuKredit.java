package Soal1;

public class KartuKredit implements Payment {
    private double biayaAdmin = 3000;

    public double hitungTotal(double jumlahAwal) {
        return jumlahAwal + biayaAdmin;
    }

    public void prosesPembayaran(double jumlahAwal) {
        double total = hitungTotal(jumlahAwal);
        System.out.println("Pembayaran dengan Kartu Kredit (biaya admin Rp3000)");
        System.out.println("Total bayar: Rp" + total);
    }
}
