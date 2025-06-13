package Soal2;
public class Sepeda extends Kendaraan implements Booking {

    public Sepeda(String nama, double tarifPerHari) {
        super(nama, tarifPerHari);
    }

    @Override
    public void prosesBooking(int durasiHari) {
        System.out.println("Sepeda " + getNama() + " berhasil dibooking selama " + durasiHari + " hari.");
    }

    @Override
    public double hitungBiaya(int durasiHari) {
        return getTarifPerHari() * durasiHari;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Sepeda: " + getNama() + " | Tarif per hari: Rp" + getTarifPerHari());
    }
}

