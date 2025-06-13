package Soal2;
public class Motor extends Kendaraan implements Booking {

    public Motor(String nama, double tarifPerHari) {
        super(nama, tarifPerHari);
    }

    @Override
    public void prosesBooking(int durasiHari) {
        System.out.println("Motor " + getNama() + " berhasil dibooking selama " + durasiHari + " hari.");
    }

    @Override
    public double hitungBiaya(int durasiHari) {
        return getTarifPerHari() * durasiHari;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Motor: " + getNama() + " | Tarif per hari: Rp" + getTarifPerHari());
    }
}

