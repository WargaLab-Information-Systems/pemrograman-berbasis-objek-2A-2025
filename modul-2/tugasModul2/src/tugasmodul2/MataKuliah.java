package tugasModul2;
public class MataKuliah {
    private String kode;
    private String nama;
    private int sks;

    public MataKuliah(String kode, String nama, int sks) {
        // Validasi SKS: harus bernilai 2 atau 3
        if (!(sks == 2 || sks == 3)) {
            throw new IllegalArgumentException("SKS anda tidak valid. SKS harus berisi antara 2 atau 3.");
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
    
    // Mengembalikan string informasi untuk ditampilkan dalam tabel
    public String getInfo() {
        return String.format("%-7s %-25s %2d", kode, nama, sks);
    }
}