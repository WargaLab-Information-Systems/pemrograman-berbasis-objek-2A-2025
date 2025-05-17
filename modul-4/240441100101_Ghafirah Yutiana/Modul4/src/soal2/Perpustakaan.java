package soal2;

// Class Perpustakaan untuk mengelola daftar buku menggunakan array
public class Perpustakaan {
    private Buku[] daftarBuku;
    private int jumlahBuku;

    public Perpustakaan(int kapasitas) {
        daftarBuku = new Buku[kapasitas];
        jumlahBuku = 0;
    }

    // Method untuk menambahkan buku baru
    public void tambahBuku(Buku buku) {
        if (jumlahBuku < daftarBuku.length) {
            daftarBuku[jumlahBuku] = buku;
            jumlahBuku++;
            System.out.println("Buku '" + buku.getJudul() + "' berhasil ditambahkan.");
        } else {
            System.out.println("Kapasitas perpustakaan penuh, tidak bisa menambah buku baru.");
        }
    }

    // Method untuk menampilkan semua buku
    public void tampilkanDaftarBuku() {
        if (jumlahBuku == 0) {
            System.out.println("Belum ada buku yang terdaftar.");
        } else {
            System.out.println("Daftar Buku di Perpustakaan:");
            System.out.println("===========================");
            for (int i = 0; i < jumlahBuku; i++) {
                Buku buku = daftarBuku[i];
                System.out.println("Judul       : " + buku.getJudul());
                System.out.println("Penulis     : " + buku.getPenulis());
                System.out.println("Jumlah Halaman: " + buku.getJumlahHalaman());
                System.out.println("---------------------------");
            }
        }
    }
}

