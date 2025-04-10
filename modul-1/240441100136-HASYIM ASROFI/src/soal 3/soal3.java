
package modul1;
// Class Kucing
class Kucing {
    String nama;
    String warna;
    int umur;

    // Constructor
    public Kucing(String nama, String warna, int umur) {
        this.nama = nama;
        this.warna = warna;
        this.umur = umur;
    }

    // Method untuk menampilkan informasi kucing
    public void info() {
        System.out.println("Kucing: " + nama + ", Warna: " + warna + ", Umur: " + umur + " tahun.");
    }

    // Method untuk membuat suara kucing
    public void bersuara() {
        System.out.println(nama + " berkata: Meong!");
    }
}

// Class Kambing
class Kambing {
    String nama;
    String jenis;
    int umur;

    // Constructor
    public Kambing(String nama, String jenis, int umur) {
        this.nama = nama;
        this.jenis = jenis;
        this.umur = umur;
    }

    // Method untuk menampilkan informasi kambing
    public void info() {
        System.out.println("Kambing: " + nama + ", Jenis: " + jenis + ", Umur: " + umur + " tahun.");
    }

    // Method untuk membuat suara kambing
    public void bersuara() {
        System.out.println(nama + " berkata: Mbeeek!");
    }
}

// Class Burung
class Burung {
    String nama;
    String jenis;
    int umur;

    // Constructor
    public Burung(String nama, String jenis, int umur) {
        this.nama = nama;
        this.jenis = jenis;
        this.umur = umur;
    }

    // Method untuk menampilkan informasi burung
    public void info() {
        System.out.println("Burung: " + nama + ", Jenis: " + jenis + ", Umur: " + umur + " tahun.");
    }

    // Method untuk membuat suara burung
    public void bersuara() {
        System.out.println(nama + " berkata: Cuit cuit!");
    }
}

// Class utama untuk menjalankan program
public class soal3 {
    public static void main(String[] args) {
        // Array untuk menyimpan beberapa objek
        Kucing[] kucingList = {
            new Kucing("Luna", "Hitam", 2),
            new Kucing("Milo", "Putih", 3),
            new Kucing("Oren", "Oren", 1)
        };

        Kambing[] kambingList = {
            new Kambing("Domba", "Merino", 4),
            new Kambing("Kiki", "Etawa", 5),
            new Kambing("Joko", "Kacang", 3)
        };

        Burung[] burungList = {
            new Burung("Rio", "Beo", 2),
            new Burung("Pipi", "Kenari", 1),
            new Burung("Ciko", "Parkit", 3)
        };

        // Menampilkan informasi dan suara setiap hewan menggunakan looping
        System.out.println("=== Daftar Kucing ===");
        for (Kucing k : kucingList) {
            k.info();
            k.bersuara();
        }

        System.out.println("\n=== Daftar Kambing ===");
        for (Kambing kb : kambingList) {
            kb.info();
            kb.bersuara();
        }

        System.out.println("\n=== Daftar Burung ===");
        for (Burung b : burungList) {
            b.info();
            b.bersuara();
        }
    }
}