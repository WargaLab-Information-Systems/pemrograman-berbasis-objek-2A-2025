package soal_3;

public class Pasien {
    private String nama;
    private int umur;
    private String keluhan;

    // Constructor default (jika ingin input manual lewat setter)
    public Pasien() {}

    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    public String getKeluhan() {
        return keluhan;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setUmur(int umur) {
        if (umur > 0) {
            this.umur = umur;
        } else {
            System.out.println("Umur harus lebih dari 0.");
            this.umur = 1; // default minimal
        }
    }

    public void setKeluhan(String keluhan) {
        this.keluhan = keluhan;
    }
}
