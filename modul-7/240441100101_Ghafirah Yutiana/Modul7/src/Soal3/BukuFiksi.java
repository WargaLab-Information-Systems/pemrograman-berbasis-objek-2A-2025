package Soal3;
public class BukuFiksi extends Buku {
    public BukuFiksi(String id, String judul, String pengarang) {
        super(id, judul, pengarang);
    }

    @Override
    public boolean bisaDipinjam() {
        // Buku fiksi dapat dipinjam
        return true;
    }
}