package Soal2;

public class Mobil implements Booking, Asuransi {
    private double biaya = 500000;

    @Override
    public void prosesBooking(int usia) {
        if (usia < 18) {
            System.out.println("Usia minimal untuk booking mobil adalah 18 tahun.");
            return;
        }
        System.out.println("Mobil berhasil dibooking.");
        tambahkanAsuransi();
        System.out.println("Total biaya: Rp " + hitungBiaya());
    }

    @Override
    public double hitungBiaya() {
        return biaya + 100000;
    }

    @Override
    public void tambahkanAsuransi() {
        System.out.println("Asuransi mobil ditambahkan (Rp 100.000).");
    }
}
