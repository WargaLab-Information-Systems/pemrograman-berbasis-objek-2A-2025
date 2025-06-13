package modul7_soal2;

public abstract class Kendaraan implements Pemesanan {
    String nama;
    private double tarifDasar;

    public Kendaraan(String nama, double tarifDasar) {
        this.nama = nama;
        this.tarifDasar = tarifDasar;
    }

    // Getter dan Setter untuk nama
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter dan Setter untuk tarifDasar
    public double getTarifDasar() {
        return tarifDasar;
    }

    public void setTarifDasar(double tarifDasar) {
        this.tarifDasar = tarifDasar;
    }

    protected boolean validasiUsia(int usiaPengguna, int usiaMin) {
        if (usiaPengguna < usiaMin) {
            System.out.println("Usia minimal untuk pemesanan " + nama + " adalah " + usiaMin + " tahun.");
            return false;
        }
        return true;
    }

    @Override
    public void pesan(int usiaPengguna, int durasi) {
        if (!validasiUsia(usiaPengguna, 17)) return;

        double totalBiaya = hitungBiaya(durasi);
        System.out.println("Harga sewa per hari: Rp " + dapatHargaPerHari());
        System.out.printf("Pemesanan %s selama %d hari.\n", nama, durasi);
        System.out.printf("Total biaya: Rp %.2f\n", totalBiaya);
    }

    @Override
    public double hitungBiaya(int durasi) {
        return tarifDasar * durasi;
    }

    @Override
    public double dapatHargaPerHari() {
        return tarifDasar;
    }
}
