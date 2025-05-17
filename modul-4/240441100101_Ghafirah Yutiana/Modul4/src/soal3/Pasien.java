package soal3;

// Class Pasien dengan atribut private dan akses melalui method getter
public class Pasien {
    private String nama;
    private int umur;
    private String keluhan;

    public Pasien(String nama, int umur, String keluhan) {
        this.nama = nama;
        this.umur = umur;
        this.keluhan = keluhan;
    }

    // Getter untuk nama
    public String getNama() {
        return nama;
    }

    // Getter untuk umur
    public int getUmur() {
        return umur;
    }

    // Getter untuk keluhan
    public String getKeluhan() {
        return keluhan;
    }
}

