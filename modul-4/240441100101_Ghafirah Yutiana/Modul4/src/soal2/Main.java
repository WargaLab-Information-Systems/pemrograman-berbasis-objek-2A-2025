package soal2;

// Class Main untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        Perpustakaan perpustakaan = new Perpustakaan(5); // kapasitas maksimal 5 buku

        // Menambahkan beberapa buku
        perpustakaan.tambahBuku(new Buku("Laskar Pelangi", "Andrea Hirata", 529));
        perpustakaan.tambahBuku(new Buku("Bumi Manusia", "Pramoedya Ananta Toer", 440));
        perpustakaan.tambahBuku(new Buku("Negeri 5 Menara", "Ahmad Fuadi", 350));

        // Menampilkan daftar buku
        perpustakaan.tampilkanDaftarBuku();
    }
}

