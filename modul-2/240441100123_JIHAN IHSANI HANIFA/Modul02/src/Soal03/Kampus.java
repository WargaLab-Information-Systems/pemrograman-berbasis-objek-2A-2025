package Soal03;

public class Kampus {
    private String nama;
    private String alamat;
    private int totalMahasiswa;

    public Kampus(String nama, String alamat, int totalMahasiswa) {
        if (!isValidNamaKampus(nama)) {
            throw new IllegalArgumentException("Nama kampus tidak valid! Tidak boleh mengandung angka.");
        }
        this.nama = nama;
        this.alamat = alamat;
        this.totalMahasiswa = totalMahasiswa;
    }

    public void tampilkanInfo() {
        System.out.println("\n=== INFORMASI KAMPUS ===");
        System.out.println("Nama Kampus: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Total Mahasiswa: " + totalMahasiswa);
    }

    public String getNama() {
        return nama;
    }

    public static boolean isValidNamaKampus(String nama) {
        return !nama.matches(".*\\d.*");
    }
}