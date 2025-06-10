package Soal2;

public class Sepeda implements Booking {
    private double biaya = 50000;

    @Override
    public void prosesBooking(int usia) {
        if (usia < 12) {
            System.out.println("Usia minimal untuk booking sepeda adalah 12 tahun.");
            return;
        }
        System.out.println("Sepeda berhasil dibooking.");
        System.out.println("Total biaya: Rp " + hitungBiaya());
    }

    @Override
    public double hitungBiaya() {
        return biaya;
    }
}
