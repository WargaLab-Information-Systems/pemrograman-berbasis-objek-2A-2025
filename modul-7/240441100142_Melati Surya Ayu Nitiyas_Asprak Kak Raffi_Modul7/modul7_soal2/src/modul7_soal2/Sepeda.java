package modul7_soal2;

public class Sepeda extends Kendaraan {
    private static final int USIA_MINIMUM = 12;

    public Sepeda() {
        super("Sepeda", 50000);
    }

    @Override
    public void pesan(int usiaPengguna, int durasi) {
        if (!validasiUsia(usiaPengguna, USIA_MINIMUM)) return;

        double biayaSewa = hitungBiaya(durasi);

        System.out.println("Harga sewa per hari: Rp " + dapatHargaPerHari());
        System.out.printf("Pemesanan %s selama %d hari.\n", getNama(), durasi);
        System.out.printf("Total biaya: Rp %.2f\n", biayaSewa);
    }
}
