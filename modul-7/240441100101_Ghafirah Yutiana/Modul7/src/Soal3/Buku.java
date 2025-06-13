package Soal3;
public abstract class Buku {
    private String id;
    private String judul;
    private String pengarang;

    public Buku(String id, String judul, String pengarang) {
        this.id = id;
        this.judul = judul;
        this.pengarang = pengarang;
    }

    public String getId() {
        return id;
    }

    public String getJudul() {
        return judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    // Metode abstrak untuk menentukan apakah buku bisa dipinjam
    public abstract boolean bisaDipinjam();
}

