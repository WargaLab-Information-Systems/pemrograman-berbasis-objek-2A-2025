
package modul7_soal1;


public class PembayaranTunai implements Pembayaran, Diskon {
    private static final double PERSENTASE_DISKON = 0.02; 

    @Override
    public void bayar(double jumlah) {
        double jumlahAkhir = hitungJumlahAkhir(jumlah);
        System.out.printf("Pembayaran tunai sebesar: %.2f\n", jumlahAkhir);
    }

    @Override
    public double hitungJumlahAkhir(double jumlah) {
        return terapkanDiskon(jumlah);
    }

    public double terapkanDiskon(double jumlah) {
        return jumlah - (jumlah * PERSENTASE_DISKON);
    }

    @Override
    public double aplikasikanDiskon(double jumlah) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
