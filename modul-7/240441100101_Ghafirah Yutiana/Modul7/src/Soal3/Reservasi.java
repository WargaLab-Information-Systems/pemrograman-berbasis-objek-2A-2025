package Soal3;
public interface Reservasi {
    boolean reservasiBuku(String idBuku, String idAnggota);
    boolean batalkanReservasi(String idBuku, String idAnggota);
}


