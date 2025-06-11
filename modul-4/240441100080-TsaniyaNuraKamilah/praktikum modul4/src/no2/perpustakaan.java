
package no2;

public class perpustakaan {
    private Buku[] koleksi = new Buku[100];
    private int jumlah = 0;

    public void tambahBuku(Buku buku) {
        koleksi[jumlah++] = buku;
    }

    public void tampilkanSemuaBuku() {
        for (int i = 0; i < jumlah; i++) {
            koleksi[i].tampilkanInfo();
        }
    }
}
