package Soal1;

public abstract class PembayaranAbstrak implements Pembayaran {
    protected String metodePembayaran;

    public PembayaranAbstrak(String metodePembayaran) {
        this.metodePembayaran = metodePembayaran;
    }

    public String getMetodePembayaran() {
        return metodePembayaran;
    }
}


