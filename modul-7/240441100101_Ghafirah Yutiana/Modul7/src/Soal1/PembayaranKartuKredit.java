package Soal1;
public class PembayaranKartuKredit extends PembayaranAbstrak {

    public PembayaranKartuKredit() {
        super("Kartu Kredit");
    }

    @Override
    public double bayar(double jumlah) {
        // Biaya tambahan 2% untuk kartu kredit
        return jumlah * 1.02;
    }
}




