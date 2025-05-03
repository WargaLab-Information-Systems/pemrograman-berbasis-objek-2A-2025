public class Kampus {
    private String nama;
    private String alamat;
    private static int totalMahasiswa = 0;
    
    public Kampus(String nama, String alamat) {
        if (!isNamaKampusValid(nama)) {
            throw new IllegalArgumentException("Nama kampus tidak valid! Nama kampus tidak boleh mengandung angka.");
        }
        
        this.nama = nama;
        this.alamat = alamat;
    }
    
    public void setTotalMahasiswa(int jumlah) {
        totalMahasiswa = jumlah;
    }
    
    public static void tampilkanInfoKampus(Kampus kampus) {
        System.out.println("===== INFORMASI KAMPUS =====");
        System.out.println("Nama Kampus  : " + kampus.nama);
        System.out.println("Alamat       : " + kampus.alamat);
        System.out.println("Total Mahasiswa: " + totalMahasiswa);
        System.out.println("Status Validasi Nama Kampus: " + (isNamaKampusValid(kampus.nama) ? "Valid" : "Tidak Valid"));
        System.out.println("============================");
    }
    
    public static boolean isNamaKampusValid(String nama) {
        // Nama kampus valid jika tidak mengandung angka
        return nama != null && !nama.matches(".\\d.");
    }
}
