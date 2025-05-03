public class Mahasiswa {
    private String nama;
    private String nim;
    private String prodi;
    private MataKuliah[] daftarMataKuliah;
    private int jumlahMataKuliah;
    private static int totalMahasiswa = 0;
    
    public Mahasiswa(String nama, String nim, String prodi) {
        if (!isNimValid(nim)) {
            throw new IllegalArgumentException("NIM tidak valid! NIM harus dimulai dengan '23' dan terdiri dari 10 digit.");
        }
        
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.daftarMataKuliah = new MataKuliah[10]; // Asumsi maksimal 10 mata kuliah
        this.jumlahMataKuliah = 0;
        totalMahasiswa++;
    }
    
    public void tambahMataKuliah(MataKuliah mataKuliah) {
        if (jumlahMataKuliah < daftarMataKuliah.length) {
            daftarMataKuliah[jumlahMataKuliah] = mataKuliah;
            jumlahMataKuliah++;
        } else {
            System.out.println("Jumlah mata kuliah maksimal telah tercapai!");
        }
    }
    
    public void tampilkanBiodata() {
        System.out.println("===== BIODATA MAHASISWA =====");
        System.out.println("Nama  : " + nama);
        System.out.println("NIM   : " + nim);
        System.out.println("Prodi : " + prodi);
        System.out.println("Daftar Mata Kuliah yang Diambil:");
        
        if (jumlahMataKuliah == 0) {
            System.out.println("  Belum mengambil mata kuliah");
        } else {
            for (int i = 0; i < jumlahMataKuliah; i++) {
                System.out.println("  " + (i+1) + ". " + daftarMataKuliah[i].getKode() + " - " + 
                                   daftarMataKuliah[i].getNama() + " (" + daftarMataKuliah[i].getSks() + " SKS)");
            }
        }
        System.out.println("=============================");
    }
    
    public static void tampilkanJumlahMahasiswa() {
        System.out.println("Total mahasiswa yang telah dibuat: " + totalMahasiswa);
    }
    
    public static boolean isNimValid(String nim) {
        // NIM valid jika dimulai dengan "24" dan terdiri dari 10 digit
        return nim != null && nim.startsWith("23") && nim.length() == 10 && nim.matches("\\d+");
    }
}
