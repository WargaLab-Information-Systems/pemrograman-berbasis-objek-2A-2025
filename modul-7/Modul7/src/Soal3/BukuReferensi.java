package Soal3;
public class BukuReferensi extends Buku implements Reservasi {

    public BukuReferensi(String judul, String penulis) {
        super(judul, penulis);
    }

    // Tidak ada pinjam(), kembalikan(), hanya reservasi

    @Override
    public void reservasi() {
        if (!isDipesan()) {
            setDipesan(true);
            System.out.println("Buku Referensi '" + getJudul() + "' berhasil dipesan.");
        } else {
            System.out.println("Buku Referensi '" + getJudul() + "' sudah dipesan.");
        }
    }

    @Override
    public void batalkanReservasi() {
        if (isDipesan()) {
            setDipesan(false);
            System.out.println("Reservasi Buku Referensi '" + getJudul() + "' dibatalkan.");
        } else {
            System.out.println("Buku Referensi '" + getJudul() + "' belum dipesan.");
        }
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("=== Buku Referensi ===");
        System.out.println("Judul : " + getJudul());
        System.out.println("Penulis : " + getPenulis());
        System.out.println("Status Reservasi : " + (isDipesan() ? "Dipesan" : "Tidak Dipesan"));
    }
}
