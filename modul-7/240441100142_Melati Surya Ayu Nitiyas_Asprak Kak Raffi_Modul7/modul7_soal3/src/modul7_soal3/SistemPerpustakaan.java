package modul7_soal3;

import java.util.ArrayList;
import java.util.List;

public class SistemPerpustakaan {
    private List<Buku> daftarBuku = new ArrayList<>();

    public void tambahBuku(Buku buku) {
        daftarBuku.add(buku);
    }

    public Buku cariBukuById(String idBuku) {
        for (Buku b : daftarBuku) {
            if (b.getIdBuku().equalsIgnoreCase(idBuku)) {
                return b;
            }
        }
        return null;
    }

    public void tampilkanDaftarBuku() {
        System.out.println("Daftar Buku:");
        for (Buku b : daftarBuku) {
            b.tampilkanInfo();
        }
    }
}
