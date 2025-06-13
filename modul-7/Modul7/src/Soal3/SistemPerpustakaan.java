package Soal3;
import java.util.ArrayList;

public class SistemPerpustakaan {
    private ArrayList<Buku> daftarBuku;

    public SistemPerpustakaan() {
        daftarBuku = new ArrayList<>();
    }

    public void tambahBuku(Buku buku) {
        daftarBuku.add(buku);
    }

    public void tampilkanDaftarBuku() {
        System.out.println("\n=== Daftar Buku di Perpustakaan ===");
        for (int i = 0; i < daftarBuku.size(); i++) {
            System.out.println("[" + (i + 1) + "] " + daftarBuku.get(i).getJudul() + " oleh " + daftarBuku.get(i).getPenulis());
        }
    }

    public Buku getBuku(int index) {
        if (index >= 0 && index < daftarBuku.size()) {
            return daftarBuku.get(index);
        } else {
            System.out.println("Indeks buku tidak valid.");
            return null;
        }
    }
}
