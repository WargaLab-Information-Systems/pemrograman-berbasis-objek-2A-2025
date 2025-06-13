package Soal3;
public class BukuReferensi extends Buku {
    public BukuReferensi(String id, String judul, String pengarang) {
        super(id, judul, pengarang);
    }

    @Override
    public boolean bisaDipinjam() {
        // Buku referensi tidak dapat dipinjam, hanya bisa dibaca di perpustakaan
        return false;
    }
}