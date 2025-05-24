package soal_2;

import java.util.Scanner;

public class Perpustakaan {
    private Buku[] daftarBuku;
    private int jumlahBuku;

    public Perpustakaan(int kapasitas) {
        daftarBuku = new Buku[kapasitas];
        jumlahBuku = 0;
    }

    public void tambahBukuDariInput(Scanner input) {
        if (jumlahBuku < daftarBuku.length) {
            System.out.println("\nInput data buku ke-" + (jumlahBuku + 1));
            Buku b = new Buku();

            System.out.print("Judul Buku     : ");
            b.setJudul(input.nextLine());

            System.out.print("Penulis Buku   : ");
            b.setPenulis(input.nextLine());

            System.out.print("Jumlah Halaman : ");
            b.setJumlahHalaman(input.nextInt());
            input.nextLine();

            daftarBuku[jumlahBuku] = b;
            jumlahBuku++;
        } else {
            System.out.println("Kapasitas buku penuh!");
        }
    }

    public void tampilkanDaftarBuku() {
        System.out.println("\n=== Daftar Buku di Perpustakaan ===");
        for (int i = 0; i < jumlahBuku; i++) {
            Buku b = daftarBuku[i];
            System.out.println("Buku " + (i + 1));
            System.out.println("Judul     : " + b.getJudul());
            System.out.println("Penulis   : " + b.getPenulis());
            System.out.println("Halaman   : " + b.getJumlahHalaman());
            System.out.println("---------------------------");
        }
    }
}
