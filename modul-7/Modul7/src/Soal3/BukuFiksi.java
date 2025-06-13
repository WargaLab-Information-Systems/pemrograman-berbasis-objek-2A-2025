package Soal3;
public class BukuFiksi extends Buku implements Peminjaman, Reservasi {

    public BukuFiksi(String judul, String penulis) {
        super(judul, penulis);
    }

    @Override
    public void pinjam() {
        if (!isDipinjam()) {
            setDipinjam(true);
            System.out.println("Buku Fiksi '" + getJudul() + "' berhasil dipinjam.");
        } else {
            System.out.println("Buku Fiksi '" + getJudul() + "' sudah dipinjam.");
        }
    }

    @Override
    public void kembalikan() {
        if (isDipinjam()) {
            setDipinjam(false);
            System.out.println("Buku Fiksi '" + getJudul() + "' berhasil dikembalikan.");
        } else {
            System.out.println("Buku Fiksi '" + getJudul() + "' belum dipinjam.");
        }
    }

    @Override
    public void reservasi() {
        if (!isDipesan()) {
            setDipesan(true);
            System.out.println("Buku Fiksi '" + getJudul() + "' berhasil dipesan.");
        } else {
            System.out.println("Buku Fiksi '" + getJudul() + "' sudah dipesan.");
        }
    }

    @Override
    public void batalkanReservasi() {
        if (isDipesan()) {
            setDipesan(false);
            System.out.println("Reservasi Buku Fiksi '" + getJudul() + "' dibatalkan.");
        } else {
            System.out.println("Buku Fiksi '" + getJudul() + "' belum dipesan.");
        }
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("=== Buku Fiksi ===");
        System.out.println("Judul : " + getJudul());
        System.out.println("Penulis : " + getPenulis());
        System.out.println("Status Pinjam : " + (isDipinjam() ? "Dipinjam" : "Tersedia"));
        System.out.println("Status Reservasi : " + (isDipesan() ? "Dipesan" : "Tidak Dipesan"));
    }
}

