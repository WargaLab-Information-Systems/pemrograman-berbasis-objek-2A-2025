// Class MataKuliah
public class MataKuliah {
    // Atribut
    private String kodeMatkul;
    private String namaMatkul;
    private int sks;
    
    // Constructor
    public MataKuliah(String kodeMatkul, String namaMatkul, int sks) {
        // Validasi SKS sebelum membuat objek
        if (isSksValid(sks)) {
            this.kodeMatkul = kodeMatkul;
            this.namaMatkul = namaMatkul;
            this.sks = sks;
        } else {
            System.out.println("Jumlah SKS tidak valid untuk mata kuliah " + namaMatkul + "! SKS hanya boleh bernilai 2 atau 3.");
            System.out.println("Objek MataKuliah dengan kode " + kodeMatkul + " tidak dibuat.");
        }
    }
    
    // Getter methods
    public String getKodeMatkul() {
        return kodeMatkul;
    }
    
    public String getNamaMatkul() {
        return namaMatkul;
    }
    
    public int getSks() {
        return sks;
    }
    
    // Method static untuk mengecek validitas SKS
    public static boolean isSksValid(int sks) {
        // SKS hanya dianggap valid jika bernilai 2 atau 3
        return sks == 2 || sks == 3;
    }
}