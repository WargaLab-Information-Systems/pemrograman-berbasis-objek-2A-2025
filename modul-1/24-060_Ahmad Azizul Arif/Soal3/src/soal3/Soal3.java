package soal3;

// Hewan 1
class Kucing {
    String nama;
    String jenis;
    int umur;

    // Konstruktor
    public Kucing(String nama, String jenis, int umur) {
        this.nama = nama;
        this.jenis = jenis;
        this.umur = umur;
    }

    // Method
    void miaw() {
        System.out.println(nama + ": Miaww Miawww!!\n");
    }

    void infoKucing() {
        System.out.println("Nama: " + nama + ", Jenis: " + jenis + ", Umur: " + umur + " Tahun");
    }
}

// Hewan 2
class Ayam {
    String nama;
    String jenis;
    int umur;

    // Konstruktor
    public Ayam(String nama, String jenis, int umur) {
        this.nama = nama;
        this.jenis = jenis;
        this.umur = umur;
    }

    // Method
    void berkokok() {
        System.out.println(nama + ": kukuruyuukk!!\n");
    }

    void infoAyam() {
        System.out.println("Nama: " + nama + ", Jenis: " + jenis + ", Umur: " + umur + " Tahun");
    }
}

// Hewan 3
class Ikan {
    String jenis;
    String habitat;
    int umur;

    // Konstruktor
    public Ikan(String jenis, String habitat, int umur) {
        this.jenis = jenis;
        this.habitat = habitat;
        this.umur = umur;
    }

    // Method
    void berenang() {
        System.out.println(jenis + ": sedang berenang...\n");
    }

    void infoIkan() {
        System.out.println("Jenis: " + jenis + ", Habitat: " + habitat + ", Umur: " + umur + " Tahun");
    }
}

public class Soal3 {
    public static void main(String[] args) {
        String[] namaKucing = {"Oyen", "Mici", "Kitty"};
        int[] umurKucing = {4, 2, 3};

        String[] namaAyam = {"Joko", "Rembo", "Beo"};
        String[] jenisAyam = {"Kate", "Kampung", "Cemani"};

        String[] namaIkan = {"Arwana", "Louhan", "Guppy"};
        int[] umurIkan = {5, 3, 1};

        System.out.println("=== Kucing ===");
        for (int i = 0; i < namaKucing.length; i++) {
            Kucing k = new Kucing(namaKucing[i], "Persia", umurKucing[i]);
            k.infoKucing();
            k.miaw();
        }

        System.out.println("\n=== Ayam ===");
        for (int i = 0; i < namaAyam.length; i++) {
            Ayam a = new Ayam(namaAyam[i], jenisAyam[i], 4);
            a.infoAyam();
            a.berkokok();
        }

        System.out.println("\n=== Ikan ===");
        for (int i = 0; i < namaIkan.length; i++) {
            Ikan ikn = new Ikan(namaIkan[i], "Akuarium", umurIkan[i]);
            ikn.infoIkan();
            ikn.berenang();
        }
    }
}