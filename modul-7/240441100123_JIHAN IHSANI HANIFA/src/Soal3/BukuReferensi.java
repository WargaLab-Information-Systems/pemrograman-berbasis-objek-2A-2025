package Soal3;

public class BukuReferensi implements Reservasi {
    private String judul;

    public BukuReferensi(String judul) {
        this.judul = judul;
    }

    public void aturanPeminjaman() {
        System.out.println("Buku referensi tidak bisa dipinjam, hanya bisa dibaca di tempat.");
    }

    @Override
    public void reservasi(String nama) {
        System.out.println(nama + " telah mereservasi buku referensi '" + judul + "'.");
    }
}
