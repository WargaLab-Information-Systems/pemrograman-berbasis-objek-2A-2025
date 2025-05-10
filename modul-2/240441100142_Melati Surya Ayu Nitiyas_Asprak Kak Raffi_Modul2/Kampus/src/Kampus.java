public class Kampus {
    private String nama;
    private String alamat;
    private static int totalMahasiswa = 0;

    // Konstruktor
    public Kampus(String nama, String alamat) {
        if (!isValidNamaKampus(nama)) {
            throw new IllegalArgumentException("Nama kampus tidak valid. Tidak boleh mengandung angka.");
        }
        this.nama = nama;
        this.alamat = alamat;
    }

    // Getter nama kampus
    public String getNama() {
        return nama;
    }

    // Getter alamat kampus
    public String getAlamat() {
        return alamat;
    }

    // Method class untuk menampilkan info kampus dan total mahasiswa
    public void tampilkanInfo() {
        System.out.println("Nama Kampus     : " + nama);
        System.out.println("Alamat Kampus   : " + alamat);
        System.out.println("Total Mahasiswa : " + totalMahasiswa);
    }

    // Method statis untuk validasi nama kampus
    public static boolean isValidNamaKampus(String nama) {
        // Nama kampus valid jika tidak mengandung angka
        return !nama.matches(".*\\d.*");
    }

    // Method class untuk mengupdate total mahasiswa
    public static void tambahMahasiswa() {
        totalMahasiswa++;
    }

    // Method class untuk mendapatkan total mahasiswa
    public static int getTotalMahasiswa() {
        return totalMahasiswa;
    }
}
