package Soal1;

public class Kampus {
    private String namaKampus;
    private String alamat;

    public Kampus(String namaKampus, String alamat) {
        if (!isValidNamaKampus(namaKampus)) {
            throw new IllegalArgumentException("Nama kampus tidak valid! Tidak boleh mengandung angka.");
        }
        this.namaKampus = namaKampus;
        this.alamat = alamat;
    }

    public static boolean isValidNamaKampus(String nama) {
        return !nama.matches(".\\d.");
    }

    public void tampilkanInfo() {
        System.out.println("========== Informasi Kampus ==========");
        System.out.println("Nama Kampus : " + namaKampus);
        System.out.println("Alamat      : " + alamat);
        System.out.println("Mahasiswa : " + Mahasiswa.getTotalMahasiswa());
        System.out.println("Status Validasi Nama Kampus: " + (isValidNamaKampus(namaKampus) ? "Valid" : "Tidak Valid"));
        System.out.println();
  }
}