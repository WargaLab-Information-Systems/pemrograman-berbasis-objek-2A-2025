package soal2;

// Class Buku dengan atribut private dan akses melalui method getter
public class Buku {
    private String judul;
    private String penulis;
    private int jumlahHalaman;

    public Buku(String judul, String penulis, int jumlahHalaman) {
        this.judul = judul;
        this.penulis = penulis;
        this.jumlahHalaman = jumlahHalaman;
    }

    // Getter untuk judul
    public String getJudul() {
        return judul;
    }

    // Getter untuk penulis
    public String getPenulis() {
        return penulis;
    }

    // Getter untuk jumlah halaman
    public int getJumlahHalaman() {
        return jumlahHalaman;
    }
}
