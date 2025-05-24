package soal_2;

public class Buku {
    private String judul;
    private String penulis;
    private int jumlahHalaman;

    public Buku() {}

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public void setJumlahHalaman(int jumlahHalaman) {
        if (jumlahHalaman > 0) {
            this.jumlahHalaman = jumlahHalaman;
        } else {
            this.jumlahHalaman = 1;
            System.out.println("Jumlah halaman tidak valid, di-set ke 1.");
        }
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public int getJumlahHalaman() {
        return jumlahHalaman;
    }
}
