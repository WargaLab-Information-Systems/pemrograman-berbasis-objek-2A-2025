package Soal3;
public abstract class Buku {
    private String judul;
    private String penulis;
    private boolean dipinjam;
    private boolean dipesan;

    public Buku(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
        this.dipinjam = false;
        this.dipesan = false;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public boolean isDipinjam() {
        return dipinjam;
    }

    public void setDipinjam(boolean dipinjam) {
        this.dipinjam = dipinjam;
    }

    public boolean isDipesan() {
        return dipesan;
    }

    public void setDipesan(boolean dipesan) {
        this.dipesan = dipesan;
    }

    public abstract void tampilkanInfo();
}

