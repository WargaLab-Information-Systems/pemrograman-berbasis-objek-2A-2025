package Soal2;
public class BookingContext {
    private DapatDibooking kendaraan;

    public void setKendaraan(DapatDibooking kendaraan) {
        this.kendaraan = kendaraan;
    }

    public boolean prosesBooking(int usiaPengguna) {
        if (kendaraan == null) {
            System.out.println("Kendaraan belum dipilih.");
            return false;
        }
        return kendaraan.pesan(usiaPengguna);
    }

    public void tampilkanBiaya() {
        if (kendaraan == null) {
            System.out.println("Kendaraan belum dipilih.");
            return;
        }
        double biaya = kendaraan.hitungBiaya();
        System.out.print("Total biaya: " + biaya);

        if (kendaraan instanceof DapatDiasuransikan) {
            double asuransi = ((DapatDiasuransikan) kendaraan).hitungAsuransi();
            System.out.println(" + asuransi: " + asuransi);
        } else {
            System.out.println();
        }
    }
}


