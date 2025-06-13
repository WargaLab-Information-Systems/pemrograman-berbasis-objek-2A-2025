package modul7_soal2;

public class Mobil extends Kendaraan implements Diasuransikan {
    private static final int USIA_MINIMUM = 21;
    private static final double TARIF_ASURANSI = 50000; // per hari

    public Mobil() {
        super("Mobil", 200000);
    }

    @Override
    public void pesan(int usiaPengguna, int durasi) {
        if (!validasiUsia(usiaPengguna, USIA_MINIMUM)) return;

        double biayaSewa = hitungBiaya(durasi);
        double biayaAsuransi = hitungBiayaAsuransi(durasi);
        double totalBiaya = biayaSewa + biayaAsuransi;

        System.out.println("Harga sewa per hari: Rp " + dapatHargaPerHari());
        System.out.println("Biaya asuransi per hari: Rp " + TARIF_ASURANSI);
        // Gunakan getter untuk nama, misal getNama()
        System.out.printf("Pemesanan %s selama %d hari.\n", getNama(), durasi);
        System.out.printf("Biaya sewa: Rp %.2f\n", biayaSewa);
        System.out.printf("Biaya asuransi: Rp %.2f\n", biayaAsuransi);
        System.out.printf("Total biaya: Rp %.2f\n", totalBiaya);
    }

    @Override
    public double hitungBiayaAsuransi(int durasi) {
        return TARIF_ASURANSI * durasi;
    }
}
