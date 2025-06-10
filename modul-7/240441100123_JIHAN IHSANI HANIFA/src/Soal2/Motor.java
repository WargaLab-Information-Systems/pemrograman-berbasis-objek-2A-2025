package Soal2;

public class Motor implements Booking, Asuransi {
    private double biaya = 200000;

    @Override
    public void prosesBooking(int usia) {
        if (usia < 17) {
            System.out.println("Usia minimal untuk booking motor adalah 17 tahun.");
            return;
        }
        System.out.println("Motor berhasil dibooking.");
        tambahkanAsuransi();
        System.out.println("Total biaya: Rp " + hitungBiaya());
    }

    @Override
    public double hitungBiaya() {
        return biaya + 50000;
    }

    @Override
    public void tambahkanAsuransi() {
        System.out.println("Asuransi motor ditambahkan (Rp 50.000).");
    }
}
