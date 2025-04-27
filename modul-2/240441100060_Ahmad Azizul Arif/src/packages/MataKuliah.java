package packages;

public class MataKuliah {
    public String kode;
    private String nama;
    private int sks;

    public MataKuliah(String kode, String nama, int sks) {
        if (!cekValidSKS(sks)) {
            throw new IllegalArgumentException("SKS tidak valid (harus 2 atau 3).");
        }
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
    }

    public String Nama() {
        return nama;
    }

    public int Sks() {
        return sks;
    }

    public static boolean cekValidSKS(int sks) {
        return sks == 2 || sks == 3;
    }
}