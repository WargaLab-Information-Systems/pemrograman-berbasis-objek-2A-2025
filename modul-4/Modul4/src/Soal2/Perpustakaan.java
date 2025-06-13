package Soal2;
public class Perpustakaan {
    private Buku[] koleksi;
    private int jumlahBuku;

    public Perpustakaan(int kapasitas) {
        koleksi = new Buku[kapasitas];
        jumlahBuku = 0;
    }

    public void tambahBuku(Buku buku) {
        if (jumlahBuku < koleksi.length) {
            koleksi[jumlahBuku++] = buku;
        }
    }

    public void tampilkanSemuaBuku() {
        for (int i = 0; i < jumlahBuku; i++) {
            Buku b = koleksi[i];
            System.out.println("Buku ke-" + (i + 1));
            System.out.println("Judul   : " + b.getJudul());
            System.out.println("Penulis : " + b.getPenulis());
            System.out.println("Halaman : " + b.getJumlahHalaman());
            System.out.println("-----------------------");
        }
    }
}
