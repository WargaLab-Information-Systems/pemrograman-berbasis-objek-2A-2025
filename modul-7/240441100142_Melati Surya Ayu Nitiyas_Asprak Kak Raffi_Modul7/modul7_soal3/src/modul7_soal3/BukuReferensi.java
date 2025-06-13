package modul7_soal3;

import java.util.HashSet;
import java.util.Set;

public class BukuReferensi extends Buku implements Reservasi {
    private Set<String> daftarReservasi = new HashSet<>();

    public BukuReferensi(String idBuku, String judul, String pengarang) {
        super(idBuku, judul, pengarang);
    }

    // Buku referensi tidak bisa dipinjam, hanya bisa direservasi
    @Override
    public boolean pesan(String idPengguna) {
        if (daftarReservasi.contains(idPengguna)) {
            System.out.println("User " + idPengguna + " sudah melakukan reservasi buku ini.");
            return false;
        }
        daftarReservasi.add(idPengguna);
        System.out.println("User " + idPengguna + " berhasil melakukan reservasi buku referensi '" + judul + "'.");
        return true;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("[Referensi] ID: " + idBuku + ", Judul: " + judul + ", Pengarang: " + pengarang);
    }
}
