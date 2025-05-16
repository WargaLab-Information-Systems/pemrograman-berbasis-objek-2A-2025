public class MataKuliah {
    private String kode;
    private String nama;
    private int sks;
    
    // Konstruktor
    public MataKuliah(String kode, String nama, int sks) {
        if (!isValidSKS(sks)) {
            throw new IllegalArgumentException("Jumlah SKS tidak valid. SKS harus 2 atau 3.");
        }
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
    }

    // Getter
    public String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public int getSks() {
        return sks;
    }

    // Method statis untuk validasi SKS
    public static boolean isValidSKS(int sks) {
        return sks == 2 || sks == 3;
    }

    @Override
    public String toString() {
        return kode + " - " + nama + " (" + sks + " SKS)";
    }
}
