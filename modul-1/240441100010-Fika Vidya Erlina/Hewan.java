package hewan;

// === CLASS KUCING ===
class Kucing {
    String nama;
    int umur;
    String warna;

    Kucing(String nama, int umur, String warna) {
        this.nama = nama;
        this.umur = umur;
        this.warna = warna;
    }

    void suara() {
        System.out.println(" jika dipanggil " + nama + " dia akan mengeong!");
    }

    void tampilkan() {
        System.out.println("Nama: " + nama + " | Umur: " + umur + " tahun | Warna: " + warna);
    }
}

// === CLASS PANDA ===
class Panda {
    String nama;
    int umur;
    String makananFavorit;

    Panda(String nama, int umur, String makananFavorit) {
        this.nama = nama;
        this.umur = umur;
        this.makananFavorit = makananFavorit;
    }

    void suara() {
        System.out.println(nama + " mengeluarkan suara: Groaarr!");
    }

    void tampilkan() {
        System.out.println("Nama: " + nama + " | Umur: " + umur + " tahun | Makanan Favorit: " + makananFavorit);
    }
}

// === CLASS IKAN ===
class Ikan {
    String nama;
    String habitat;
    String warna;

    Ikan(String nama, String habitat, String warna) {
        this.nama = nama;
        this.habitat = habitat;
        this.warna = warna;
    }

    void berenang() {
        System.out.println(nama + " sedang berenang di " + habitat);
    }

    void tampilkan() {
        System.out.println("Nama: " + nama + " | Habitat: " + habitat + " | Warna: " + warna);
    }
}

// === CLASS UTAMA ===
public class Hewan {
    public static void main(String[] args) {
        // Data langsung (tanpa input Scanner)
        Kucing[] kucingList = {
            new Kucing("Mimi", 2, "Putih"),
            new Kucing("Oyen", 3, "Oranye")
        };

        Panda[] pandaList = {
            new Panda("Po", 5, "Bambu"),
            new Panda("Lulu", 4, "Daun muda")
        };

        Ikan[] ikanList = {
            new Ikan("Nemo", "Laut", "Oranye"),
            new Ikan("Cupang", "Akuarium", "Biru")
        };

        // Tampilkan data
        System.out.println("=== DATA KUCING ===");
        for (Kucing k : kucingList) {
            k.tampilkan();
            k.suara();
            System.out.println();
        }

        System.out.println("=== DATA PANDA ===");
        for (Panda p : pandaList) {
            p.tampilkan();
            p.suara();
            System.out.println();
        }

        System.out.println("=== DATA IKAN ===");
        for (Ikan i : ikanList) {
            i.tampilkan();
            i.berenang();
            System.out.println();
        }
    }
}
