public class MataKuliah {
    private String kode;
    private String nama;
    private int sks;
    
    public MataKuliah(String kode, String nama, int sks) {
        if (!isSksValid(sks)) {
            throw new IllegalArgumentException("Jumlah SKS tidak valid! SKS harus bernilai 2 atau 3.");
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
    
    public static boolean isSksValid(int sks) {
        // SKS valid jika bernilai 2 atau 3
        return sks == 2 || sks == 3;
    }
}
