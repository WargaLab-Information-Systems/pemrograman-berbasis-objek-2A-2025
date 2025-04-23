public class MataKuliah {
    private String kode;
    private String nama;
    private int sks;

    public MataKuliah(String kode, String nama, int sks) {
        if (!isValidSKS(sks)) {
            throw new IllegalArgumentException("SKS tidak valid: " + sks);
        }
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
    }

    public String getInfo() {
        return kode + " - " + nama + " (" + sks + " SKS)";
    }

    public static boolean isValidSKS(int sks) {
        return sks == 2 || sks == 3;
    }
}