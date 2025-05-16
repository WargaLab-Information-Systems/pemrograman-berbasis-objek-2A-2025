
package modul4.soal.pkg2;

import java.util.ArrayList;

import java.util.Scanner;

class Buku {
    private final String judul;
    private final String penulis;
    private final int jumlahHalaman;

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
    private final ArrayList<Buku> daftarBuku;

    public Perpustakaan() {
        daftarBuku = new ArrayList<>();
    }

    public void tambahBuku(String judul, String penulis, int jumlahHalaman) {
        Buku bukuBaru = new Buku(judul, penulis, jumlahHalaman);
        daftarBuku.add(bukuBaru);
    }

    public void tampilkanBuku() {
        if (daftarBuku.isEmpty()) {
            System.out.println("Daftar buku kosong.");
        } else {
            System.out.println("Daftar Buku di Perpustakaan:");
            for (Buku buku : daftarBuku) {
                System.out.println("Judul: " + buku.getJudul());
                System.out.println("Penulis: " + buku.getPenulis());
                System.out.println("Jumlah Halaman: " + buku.getJumlahHalaman());
                System.out.println("---------------------------");
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Perpustakaan perpustakaan = new Perpustakaan();
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Masukkan jumlah buku yang ingin ditambahkan:");
            int jumlahBuku = 0;
            try {
                jumlahBuku = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid. Program dihentikan.");
                System.exit(0);
            }
            for (int i = 1; i <= jumlahBuku; i++) {
                System.out.println("Masukkan data buku ke-" + i + ":");
                
                System.out.print("Judul: ");
                String judul = scanner.nextLine();
                
                System.out.print("Penulis: ");
                String penulis = scanner.nextLine();
                
                int halaman = 0;
                while (true) {
                    System.out.print("Jumlah Halaman: ");
                    try {
                        halaman = Integer.parseInt(scanner.nextLine());
                        if (halaman <= 0) {
                            System.out.println("Jumlah halaman harus positif.");
                        } else {
                            break;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Input harus berupa angka.");
                    }
                }
                
                perpustakaan.tambahBuku(judul, penulis, halaman);
                System.out.println("Buku berhasil ditambahkan.\n");
            }
            System.out.println("\n=== Daftar Buku yang Tersimpan ===");
            perpustakaan.tampilkanBuku();
            }
    }
}
