package Soal2;
public class Mobil extends Kendaraan implements Booking, Asuransi {

    public Mobil(String nama, double tarifPerHari) {
        super(nama, tarifPerHari);
    }

    @Override
    public void prosesBooking(int durasiHari) {
        System.out.println("Mobil " + getNama() + " berhasil dibooking selama " + durasiHari + " hari.");
    }

    @Override
    public double hitungBiaya(int durasiHari) {
        return getTarifPerHari() * durasiHari + hitungBiayaAsuransi(durasiHari);
    }

    @Override
    public double hitungBiayaAsuransi(int durasiHari) {
        return 50000 * durasiHari;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Mobil: " + getNama() + " | Tarif per hari: Rp" + getTarifPerHari());
    }
}

