package soal1;

public class MataKuliah {
    String kode;
    String nama;
    int sks;

    public MataKuliah(String kode, String nama, int sks) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
    }

    public void tampilkanInfo() {
        System.out.println("Mata Kuliah: " + nama + " (" + kode + ") - " + sks + " SKS");
    }
}

