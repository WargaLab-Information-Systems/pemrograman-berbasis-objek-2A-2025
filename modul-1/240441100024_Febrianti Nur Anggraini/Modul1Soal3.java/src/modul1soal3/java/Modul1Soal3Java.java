package modul1soal3.java;

import java.util.ArrayList;
import java.util.List;

// Kelas Hewan 1: Kucing
class Kucing {
    private String nama;
    private int umur;

    public Kucing(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public void meong() {
        System.out.println(nama + " sedang mengeong.");
    }
}

// Kelas Hewan 2: Burung
class Burung {
    private String nama;
    private String warna;

    public Burung(String nama, String warna) {
        this.nama = nama;
        this.warna = warna;
    }

    public void terbang() {
        System.out.println(nama + " sedang terbang dengan sayapnya yang berwarna " + warna + ".");
    }
}

// Kelas Hewan 3: Ikan
class Ikan {
    private String nama;
    private String jenisAir;

    public Ikan(String nama, String jenisAir) {
        this.nama = nama;
        this.jenisAir = jenisAir;
    }

    public void berenang() {
        System.out.println(nama + " sedang berenang di " + jenisAir + " water.");
    }
}

// Kelas utama
public class Main {
    public static void main(String[] args) {
        List<Kucing> kucingList = new ArrayList<>();
        List<Burung> burungList = new ArrayList<>();
        List<Ikan> ikanList = new ArrayList<>();

        // Membuat objek dengan looping
        for (int i = 1; i <= 3; i++) {
            kucingList.add(new Kucing("Kucing" + i, i * 2));
            burungList.add(new Burung("Burung" + i, "Warna" + i));
            ikanList.add(new Ikan("Ikan" + i, (i % 2 == 0) ? "tawar" : "laut"));
        }

        // Menjalankan metode setiap objek
        System.out.println("=== Suara Kucing ===");
        for (Kucing k : kucingList) {
            k.meong();
        }

        System.out.println("\n=== Burung Terbang ===");
        for (Burung b : burungList) {
            b.terbang();
        }

        System.out.println("\n=== Ikan Berenang ===");
        for (Ikan i : ikanList) {
            i.berenang();
        }
    }
}
