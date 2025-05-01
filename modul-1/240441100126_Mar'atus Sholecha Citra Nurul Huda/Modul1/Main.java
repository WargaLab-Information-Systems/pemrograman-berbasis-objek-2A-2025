// Class Induk Hewan
class Hewan {
    String nama;
    int umur;

    // Constructor
    Hewan(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    // Method bersuara
    void bersuara() {
        System.out.println(nama + " mengeluarkan suara.");
    }
}

// Class Kucing
class Kucing extends Hewan {
    Kucing(String nama, int umur) {
        super(nama, umur);
    }

    // Override method bersuara
    @Override
    void bersuara() {
        System.out.println(nama + " Meow!");
    }
}

// Class Anjing
class Anjing extends Hewan {
    Anjing(String nama, int umur) {
        super(nama, umur);
    }

    // Override method bersuara
    @Override
    void bersuara() {
        System.out.println(nama + " Guk Guk!");
    }
}

// Class Burung
class Burung extends Hewan {
    Burung(String nama, int umur) {
        super(nama, umur);
    }

    // Override method bersuara
    @Override
    void bersuara() {
        System.out.println(nama + " Kicau!");
    }
}

// Class Main untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        // Membuat array hewan
        Hewan[] hewanPeliharaan = {
            new Kucing("Kitty", 2),
            new Anjing("Buddy", 3),
            new Burung("Tweety", 1)
        };

        // Menampilkan informasi dan suara hewan
        for (Hewan hewan : hewanPeliharaan) {
            System.out.println("Nama: " + hewan.nama);
            System.out.println("Umur: " + hewan.umur + " tahun");
            hewan.bersuara();
            System.out.println();
        }
    }
}
