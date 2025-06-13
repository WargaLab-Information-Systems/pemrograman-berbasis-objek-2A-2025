package modul7_soal2;

public class SepedaMotor extends Kendaraan {
    private static final int USIA_MINIMUM = 17;

    public SepedaMotor() {
        super("Motor", 100000);
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
