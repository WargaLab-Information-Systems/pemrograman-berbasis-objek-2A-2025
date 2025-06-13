package modul7_soal3;

import java.util.HashSet;
import java.util.Set;

public class BukuFiksi extends Buku implements Meminjam, Reservasi {
    private static final int MAKS_HARI_PINJAM = 14;
    private static final int USIA_MINIMAL_PINJAM = 12;

    private boolean sedangDipinjam = false;
    private Set<String> daftarReservasi = new HashSet<>();

    public BukuFiksi(String idBuku, String judul, String pengarang) {
        super(idBuku, judul, pengarang);
    }

    public boolean isSedangDipinjam() {
        return sedangDipinjam;
    }

    public void setSedangDipinjam(boolean sedangDipinjam) {
        this.sedangDipinjam = sedangDipinjam;
    }

    public Set<String> getDaftarReservasi() {
        return new HashSet<>(daftarReservasi); 
    }

    public boolean tambahReservasi(String idPengguna) {
        if (daftarReservasi.contains(idPengguna)) {
            return false;
        }
        daftarReservasi.add(idPengguna);
        return true;
    }

    @Override
    public boolean pinjam(String idPengguna, int usiaPengguna) {
        if (usiaPengguna < USIA_MINIMAL_PINJAM) {
            System.out.println("Usia minimal untuk meminjam buku fiksi adalah " + USIA_MINIMAL_PINJAM + " tahun.");
            return false;
        }
        if (sedangDipinjam) {
            System.out.println("Buku '" + getJudul() + "' sedang dipinjam.");
            return false;
        }
        sedangDipinjam = true;
        System.out.println("Buku fiksi '" + getJudul() + "' berhasil dipinjam oleh user " + idPengguna + ".");
        return true;
    }

    @Override
    public boolean pesan(String idPengguna) {
        if (daftarReservasi.contains(idPengguna)) {
            System.out.println("User " + idPengguna + " sudah melakukan reservasi buku ini.");
            return false;
        }
        daftarReservasi.add(idPengguna);
        System.out.println("User " + idPengguna + " berhasil melakukan reservasi buku fiksi '" + getJudul() + "'.");
        return true;
    }

    @Override
    public int getMaksHariPinjam() {
        return MAKS_HARI_PINJAM;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("[Fiksi] ID: " + getIdBuku() + ", Judul: " + getJudul() + ", Pengarang: " + getPengarang());
    }
}
