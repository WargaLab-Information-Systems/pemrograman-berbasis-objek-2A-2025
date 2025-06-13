package Soal2;
public class Main {
    public static void main(String[] args) {
        Perpustakaan perpus = new Perpustakaan(5);

        Buku b1 = new Buku("Laut Bercerita", "Leila S. Chudori", 200);
        Buku b2 = new Buku("Bumi Manusia", "Pramoedya Ananta Toer", 432);
        Buku b3 = new Buku("Negeri 5 Menara", "Ahmad Fuadi", -1);

        perpus.tambahBuku(b1);
        perpus.tambahBuku(b2);
        perpus.tambahBuku(b3);

        System.out.println("== Daftar Buku di Perpustakaan ==");
        perpus.tampilkanSemuaBuku();
    }
}
