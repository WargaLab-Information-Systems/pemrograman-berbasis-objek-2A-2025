package modul1soal1;

import java.util.ArrayList;
import java.util.List;

// Kelas Hewan 1: Buaya
class Buaya {
    private String nama;
   
    
//construktor
    public Buaya(String nama, int umur) {
        this.nama = nama;
       
    }
//method
    public void mengaum() {
        System.out.println(nama + " sedang mengaum.");
    }
}

// Kelas Hewan 2: Burung
class Burung {
    private String nama;
    private String warna;
    
//construktor
    public Burung(String nama, String warna) {
        this.nama = nama;
        this.warna = warna;
    }
//method
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
        System.out.println(nama + " sedang berenang di"+" air "+ jenisAir );
    }
}

// Kelas utama
public class Modul1Soal3  {
    public static void main(String[] args) {
        List<Buaya> buayaList = new ArrayList<>();
        List<Burung> burungList = new ArrayList<>();
        List<Ikan> ikanList = new ArrayList<>();

        // Membuat objek dengan looping
        for (int i = 1; i <= 3; i++) {
            buayaList.add(new Buaya("Buaya" + i, i * 2));
            burungList.add(new Burung("Burung" + i, "Warna" + i));
            ikanList.add(new Ikan("Ikan" + i, (i % 2 == 0) ? "tawar" : "laut"));
        }

        // Menjalankan metode setiap objek
        System.out.println("=== Suara Buaya ===");
        for (Buaya b : buayaList) {
            b.mengaum();
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

