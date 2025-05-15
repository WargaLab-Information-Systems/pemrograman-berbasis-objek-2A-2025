package Soal2;
import java.util.Scanner;

class Buku {
    private String judul;
    private String penulis;
    private int jumlahHalaman;

    public Buku(String judul, String penulis, int jumlahHalaman) {
        this.judul = judul;
        this.penulis = penulis;
        this.jumlahHalaman = jumlahHalaman;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public int getJumlahHalaman() {
        return jumlahHalaman;
    }
}

class Perpustakaan {
    private Buku[] daftarBuku;
    private int jumlahBuku;

    public Perpustakaan(int kapasitas) {
        daftarBuku = new Buku[kapasitas];
        jumlahBuku = 0;
    }

    public void tambahBuku(Scanner input) {
        if (jumlahBuku >= daftarBuku.length) {
            System.out.println("Kapasitas perpustakaan penuh!");
            return;
        }

        System.out.print("Masukkan judul buku: ");
        String judul = input.nextLine();

        System.out.print("Masukkan nama penulis: ");
        String penulis = input.nextLine();

        System.out.print("Masukkan jumlah halaman: ");
        int halaman = Integer.parseInt(input.nextLine());

        daftarBuku[jumlahBuku] = new Buku(judul, penulis, halaman);
        jumlahBuku++;
        System.out.println("Buku berhasil ditambahkan!\n");
    }

    public void tampilkanDaftarBuku() {
        System.out.println("\n=== Daftar Buku di Perpustakaan ===");
        if (jumlahBuku == 0) {
            System.out.println("Belum ada buku.");
        } else {
            for (int i = 0; i < jumlahBuku; i++) {
                Buku b = daftarBuku[i]; 
                System.out.println("Buku ke-" + (i + 1));
                System.out.println("Judul         : " + b.getJudul());
                System.out.println("Penulis       : " + b.getPenulis());
                System.out.println("Jumlah Halaman: " + b.getJumlahHalaman());
                System.out.println("-------------------------------");
            }
        }
    }
}