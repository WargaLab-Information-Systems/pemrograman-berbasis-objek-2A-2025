package Soal3;
public class Pasien {
    private String nama;
    private int umur;
    private String keluhan;

    public Pasien(String nama, int umur, String keluhan) {
        setNama(nama);
        setUmur(umur);
        setKeluhan(keluhan);
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        if (nama != null && !nama.trim().isEmpty()) {
            this.nama = nama;
        } else {
            System.out.println("Nama pasien tidak boleh kosong!");
        }
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        if (umur > 0) {
            this.umur = umur;
        } else {
            System.out.println("Umur harus lebih dari 0!");
        }
    }

    public String getKeluhan() {
        return keluhan;
    }

    public void setKeluhan(String keluhan) {
        if (keluhan != null && !keluhan.trim().isEmpty()) {
            this.keluhan = keluhan;
        } else {
            System.out.println("Keluhan tidak boleh kosong!");
        }
    }
}
