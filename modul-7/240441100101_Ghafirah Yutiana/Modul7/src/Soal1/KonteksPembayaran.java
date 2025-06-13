package Soal1;

public class KonteksPembayaran {
    private Pembayaran strategiPembayaran;

    public void setStrategiPembayaran(Pembayaran strategiPembayaran) {
        this.strategiPembayaran = strategiPembayaran;
    }

    public double lakukanPembayaran(double jumlah) {
        if (strategiPembayaran == null) {
            throw new IllegalStateException("Metode pembayaran belum diset.");
        }
        return strategiPembayaran.bayar(jumlah);
    }

    public String getMetodePembayaranSaatIni() {
        if (strategiPembayaran instanceof PembayaranAbstrak) {
            return ((PembayaranAbstrak) strategiPembayaran).getMetodePembayaran();
        }
        return "Tidak Diketahui";
    }
}
