package nomortiga;

import java.util.Scanner;

abstract class Hewan {
    String nama;
    String jenis;

    public Hewan(String nama, String jenis) {
        this.nama = nama;
        this.jenis = jenis;
    }

    public abstract void bergerak();

    public abstract void makan();
}

class Kucing extends Hewan {
    String warna;

    public Kucing(String nama, String jenis, String warna) {
        super(nama, jenis);
        this.warna = warna;
    }

    public void bergerak() {
        System.out.println(nama + " (Kucing) sedang bergerak dengan anggun.");
    }

    public void makan() {
        System.out.println(nama + " (Kucing) sedang makan makanan kucing.");
    }
}

class Burung extends Hewan {
    String warna;

    public Burung(String nama, String jenis, String warna) {
        super(nama, jenis);
        this.warna = warna;
    }

    public void bergerak() {
        System.out.println(nama + " (Burung) sedang terbang di udara.");
    }

    public void makan() {
        System.out.println(nama + " (Burung) sedang makan biji-bijian.");
    }
}

class Anjing extends Hewan {
    String warna;

    public Anjing(String nama, String jenis, String warna) {
        super(nama, jenis);
        this.warna = warna;
    }

    public void bergerak() {
        System.out.println(nama + " (Anjing) sedang berlari dengan cepat.");
    }

    public void makan() {
        System.out.println(nama + " (Anjing) sedang makan makanan anjing.");
    }
}

public class Nomortiga {
    public static void main(String[] args) {
        Kucing kucing1 = new Kucing("Tommy", "Kucing Persia", "Putih");
        Kucing kucing2 = new Kucing("Mimi", "Kucing Anggora", "Abu-abu");

        Burung burung1 = new Burung("Elang", "Burung Elang", "Coklat");
        Burung burung2 = new Burung("Merpati", "Burung Merpati", "Putih");

        Anjing anjing1 = new Anjing("Rex", "Anjing German Shepherd", "Coklat");
        Anjing anjing2 = new Anjing("Max", "Anjing Golden Retriever", "Emas");

        
        kucing1.bergerak();
        kucing1.makan();

        kucing2.bergerak();
        kucing2.makan();

        burung1.bergerak();
        burung1.makan();

        burung2.bergerak();
        burung2.makan();

        anjing1.bergerak();
        anjing1.makan();

        anjing2.bergerak();
        anjing2.makan();
        }
    }

