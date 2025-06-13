package modul7_soal3;

public abstract class Buku {
    protected String judul;
    protected String pengarang;
    protected String idBuku;

    public Buku(String idBuku, String judul, String pengarang) {
        this.idBuku = idBuku;
        this.judul = judul;
        this.pengarang = pengarang;
    }

    public String getJudul() {
        return judul;
    }

    public String getIdBuku() {
        return idBuku;
    }

    public String getPengarang() {
        return pengarang;
    }

    public abstract void tampilkanInfo();
}
