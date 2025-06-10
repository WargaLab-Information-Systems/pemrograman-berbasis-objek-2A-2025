package Soal3;

public class BukuFiksi implements Peminjaman, Reservasi {
    private String judul;

    public BukuFiksi(String judul) {
        this.judul = judul;
    }

    @Override
    public void pinjam(String nama) {
        System.out.println(nama + " meminjam buku fiksi berjudul '" + judul + "'.");
    }

    @Override
    public void reservasi(String nama) {
        System.out.println(nama + " telah mereservasi buku fiksi '" + judul + "'.");
    }
}
