package Soal3;
public interface Peminjaman {
    boolean pinjamBuku(String idBuku, String idAnggota);
    boolean kembalikanBuku(String idBuku, String idAnggota);
}