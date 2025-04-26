package Soal01;

public class matakuliah {
    private String kode;
    private String nama;
    private int sks;

    public matakuliah(String kode, String nama, int sks) {
        if (!isValidSKS(sks)) {
            throw new IllegalArgumentException("SKS tidak valid! Hanya 2 atau 3.");
        }
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
    }

    public String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public int getSks() {
        return sks;
    }

    public static boolean isValidSKS(int sks) {
        return sks == 2 || sks == 3;
    }
}