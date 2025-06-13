package modul7_soal1;

public abstract class MetodePembayaran implements Pembayaran {

   
    private String namaMetode;

    public MetodePembayaran(String namaMetode) {
        this.namaMetode = namaMetode;
    }

    
    public String getNamaMetode() {
        return namaMetode;
    }


    public void setNamaMetode(String namaMetode) {
        this.namaMetode = namaMetode;
    }

    public void tampilkanInfo() {
        System.out.println("Metode: " + namaMetode);
    }

    @Override
    public abstract void bayar(double jumlah);

    @Override
    public abstract double hitungJumlahAkhir(double jumlah);

    // Factory method untuk membuat objek Pembayaran sesuai pilihan
    public static Pembayaran buatMetodePembayaran(int pilihan) {
        switch (pilihan) {
            case 1:
                return new PembayaranTunai(); // Pastikan kelas ini sudah ada dan meng-extend MetodePembayaran
            case 2:
                return new PembayaranKartuKredit(); // Pastikan kelas ini sudah ada
            case 3:
                return new PembayaranDompetElektronik(); // Pastikan kelas ini sudah ada
            default:
                throw new IllegalArgumentException("Pilihan metode pembayaran tidak valid.");
        }
    }
}
