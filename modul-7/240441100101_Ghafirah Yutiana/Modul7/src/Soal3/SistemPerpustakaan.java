package Soal3;
import java.util.*;

public class SistemPerpustakaan implements Peminjaman, Reservasi {
    private Map<String, Buku> daftarBuku = new HashMap<>();
    private Map<String, List<String>> peminjaman = new HashMap<>(); // idAnggota -> list idBuku
    private Map<String, List<String>> reservasi = new HashMap<>();  // idAnggota -> list idBuku

    // Aturan: Maksimal 1 buku fiksi dan 2 buku referensi (tidak bisa dipinjam)
    private static final int MAKS_FIKSI = 1;

    public void tambahBuku(Buku buku) {
        daftarBuku.put(buku.getId(), buku);
    }

    @Override
    public boolean pinjamBuku(String idBuku, String idAnggota) {
        Buku buku = daftarBuku.get(idBuku);
        if (buku == null) {
            System.out.println("Buku tidak ditemukan.");
            return false;
        }
        if (!buku.bisaDipinjam()) {
            System.out.println("Buku referensi tidak dapat dipinjam.");
            return false;
        }
        List<String> bukuDipinjam = peminjaman.getOrDefault(idAnggota, new ArrayList<>());

        // Hitung jumlah buku fiksi yang sudah dipinjam anggota
        long jumlahFiksi = bukuDipinjam.stream()
                .map(daftarBuku::get)
                .filter(b -> b instanceof BukuFiksi)
                .count();

        if (buku instanceof BukuFiksi && jumlahFiksi >= MAKS_FIKSI) {
            System.out.println("Maksimal peminjaman buku fiksi sudah tercapai.");
            return false;
        }

        if (bukuDipinjam.contains(idBuku)) {
            System.out.println("Buku sudah dipinjam oleh anggota ini.");
            return false;
        }

        bukuDipinjam.add(idBuku);
        peminjaman.put(idAnggota, bukuDipinjam);
        System.out.println("Buku berhasil dipinjam.");
        return true;
    }

    @Override
    public boolean kembalikanBuku(String idBuku, String idAnggota) {
        List<String> bukuDipinjam = peminjaman.get(idAnggota);
        if (bukuDipinjam != null && bukuDipinjam.remove(idBuku)) {
            System.out.println("Buku berhasil dikembalikan.");
            return true;
        } else {
            System.out.println("Buku tidak ditemukan dalam daftar peminjaman anggota.");
            return false;
        }
    }

    @Override
    public boolean reservasiBuku(String idBuku, String idAnggota) {
        Buku buku = daftarBuku.get(idBuku);
        if (buku == null) {
            System.out.println("Buku tidak ditemukan.");
            return false;
        }
        List<String> bukuReservasi = reservasi.getOrDefault(idAnggota, new ArrayList<>());
        if (bukuReservasi.contains(idBuku)) {
            System.out.println("Buku sudah direservasi oleh anggota ini.");
            return false;
        }
        bukuReservasi.add(idBuku);
        reservasi.put(idAnggota, bukuReservasi);
        System.out.println("Buku berhasil direservasi.");
        return true;
    }

    @Override
    public boolean batalkanReservasi(String idBuku, String idAnggota) {
        List<String> bukuReservasi = reservasi.get(idAnggota);
        if (bukuReservasi != null && bukuReservasi.remove(idBuku)) {
            System.out.println("Reservasi buku dibatalkan.");
            return true;
        } else {
            System.out.println("Reservasi buku tidak ditemukan.");
            return false;
        }
    }

    // Metode untuk menampilkan daftar buku yang dipinjam anggota
    public void tampilkanPeminjaman(String idAnggota) {
        List<String> bukuDipinjam = peminjaman.get(idAnggota);
        if (bukuDipinjam == null || bukuDipinjam.isEmpty()) {
            System.out.println("Tidak ada buku yang dipinjam.");
            return;
        }
        System.out.println("Buku yang dipinjam oleh anggota " + idAnggota + ":");
        for (String idBuku : bukuDipinjam) {
            Buku buku = daftarBuku.get(idBuku);
            System.out.println("- " + buku.getJudul() + " oleh " + buku.getPengarang());
        }
    }

    // Metode untuk menampilkan daftar buku yang direservasi anggota
    public void tampilkanReservasi(String idAnggota) {
        List<String> bukuReservasi = reservasi.get(idAnggota);
        if (bukuReservasi == null || bukuReservasi.isEmpty()) {
            System.out.println("Tidak ada buku yang direservasi.");
            return;
        }
        System.out.println("Buku yang direservasi oleh anggota " + idAnggota + ":");
        for (String idBuku : bukuReservasi) {
            Buku buku = daftarBuku.get(idBuku);
            System.out.println("- " + buku.getJudul() + " oleh " + buku.getPengarang());
        }
    }

    public void tampilkanDaftarBuku() {
    if (daftarBuku.isEmpty()) {
        System.out.println("Belum ada buku di perpustakaan.");
        return;
    }
    System.out.println("Daftar Buku di Perpustakaan:");
    System.out.printf("%-6s %-10s %-30s %-20s%n", "ID", "Jenis", "Judul", "Pengarang");
    System.out.println("-------------------------------------------------------------------------------");
    for (Buku buku : daftarBuku.values()) {
        String jenis = (buku instanceof BukuFiksi) ? "Fiksi" : "Referensi";
        System.out.printf("%-6s %-10s %-30s %-20s%n",
                buku.getId(),
                jenis,
                buku.getJudul(),
                buku.getPengarang());
    }
}
}

