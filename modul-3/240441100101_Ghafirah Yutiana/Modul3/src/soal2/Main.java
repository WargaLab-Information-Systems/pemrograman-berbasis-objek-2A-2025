package soal2;

import java.util.ArrayList;
import java.util.Scanner;

class Buku {
    String judul;
    String penulis;

    public Buku(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }
    
    void info() {
        System.out.println("Judul: " + judul + ", Penulis: " + penulis);
    }
}

class BukuFiksi extends Buku {
    String genre;
    
    public BukuFiksi(String judul, String penulis, String genre) {
        super(judul, penulis);
        this.genre = genre;
    }
    
    void infoFiksi() {
        System.out.println("Fiksi - Judul: " + judul + ", Penulis: " + penulis + ", Genre: " + genre);
    }
}

class BukuNonFiksi extends Buku {
    String topik;
    
    public BukuNonFiksi(String judul, String penulis, String topik) {
        super(judul, penulis);
        this.topik = topik;
    }
    
    void infoNonFiksi() {
        System.out.println("Non-Fiksi - Judul: " + judul + ", Penulis: " + penulis + ", Topik: " + topik);
    }
}

class Perpustakaan {
    ArrayList<BukuFiksi> koleksiFiksi = new ArrayList<>();
    ArrayList<BukuNonFiksi> koleksiNonFiksi = new ArrayList<>();
    
    void tambahBukuFiksi(BukuFiksi buku) {
        koleksiFiksi.add(buku);
    }
    
    void tambahBukuNonFiksi(BukuNonFiksi buku) {
        koleksiNonFiksi.add(buku);
    }
    
    void tampilkanKoleksi() {
        System.out.println("\n=== KOLEKSI PERPUSTAKAAN ===");
        System.out.println("Buku Fiksi:");
        for(BukuFiksi fiksi : koleksiFiksi) {
            fiksi.infoFiksi();
        }
        
        System.out.println("\nBuku Non-Fiksi:");
        for(BukuNonFiksi nonFiksi : koleksiNonFiksi) {
            nonFiksi.infoNonFiksi();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Perpustakaan perpustakaan = new Perpustakaan();
            
            // Input buku fiksi
            System.out.print("Masukkan jumlah buku fiksi: ");
            int jmlFiksi = scanner.nextInt();
            scanner.nextLine();
            
            for(int i = 0; i < jmlFiksi; i++) {
                System.out.println("\nBuku Fiksi ke-" + (i+1));
                System.out.print("Judul: ");
                String judul = scanner.nextLine();
                System.out.print("Penulis: ");
                String penulis = scanner.nextLine();
                System.out.print("Genre: ");
                String genre = scanner.nextLine();
                
                perpustakaan.tambahBukuFiksi(new BukuFiksi(judul, penulis, genre));
            }
            
            // Input buku non-fiksi
            System.out.print("\nMasukkan jumlah buku non-fiksi: ");
            int jmlNonFiksi = scanner.nextInt();
            scanner.nextLine();
            
            for(int i = 0; i < jmlNonFiksi; i++) {
                System.out.println("\nBuku Non-Fiksi ke-" + (i+1));
                System.out.print("Judul: ");
                String judul = scanner.nextLine();
                System.out.print("Penulis: ");
                String penulis = scanner.nextLine();
                System.out.print("Topik: ");
                String topik = scanner.nextLine();
                
                perpustakaan.tambahBukuNonFiksi(new BukuNonFiksi(judul, penulis, topik));
            }
            
            // Menampilkan koleksi
            perpustakaan.tampilkanKoleksi();
        }
    }
}