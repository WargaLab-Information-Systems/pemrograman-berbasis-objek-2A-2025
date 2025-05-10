// Class Kampus
public class Kampus {
    // Atribut
    private String namaKampus;
    private String alamatKampus;
    
    // Atribut class yang menyimpan jumlah total mahasiswa
    private static int totalMahasiswa = 0;
    
    // Constructor
    public Kampus(String namaKampus, String alamatKampus) {
        // Validasi nama kampus sebelum membuat objek
        if (isNamaKampusValid(namaKampus)) {
            this.namaKampus = namaKampus;
            this.alamatKampus = alamatKampus;
        } else {
            System.out.println("Nama kampus tidak valid! Nama kampus tidak boleh mengandung angka.");
            System.out.println("Objek Kampus dengan nama " + namaKampus + " tidak dibuat.");
        }
    }
    
    // Method untuk menambah jumlah mahasiswa
    public static void tambahMahasiswa(int jumlah) {
        totalMahasiswa += jumlah;
    }
    
    // Method untuk menampilkan informasi kampus
    public void tampilkanInfoKampus() {
        System.out.println("\n===== INFORMASI KAMPUS =====");
        System.out.println("Nama Kampus   : " + namaKampus);
        System.out.println("Alamat Kampus : " + alamatKampus);
        System.out.println("Total Mahasiswa: " + totalMahasiswa);
        System.out.println("Status Nama Kampus: " + (isNamaKampusValid(namaKampus) ? "Valid" : "Tidak Valid"));
        System.out.println("============================");
    }
    
    // Method static untuk mengecek validitas nama kampus
    public static boolean isNamaKampusValid(String namaKampus) {
        // Nama kampus dianggap valid jika tidak mengandung angka
        for (char c : namaKampus.toCharArray()) {
            if (Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
}
