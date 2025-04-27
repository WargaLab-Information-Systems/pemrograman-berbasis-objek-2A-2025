package Soal01;

public class kampus {
    private String namakampus;
    private String alamat;

    public kampus(String namakampus, String alamat) {
        if (!isValidnamakampus(namakampus)) {
            throw new IllegalArgumentException("Nama kampus tidak valid!  : " + namakampus);
        }
        this.namakampus = namakampus;
        this.alamat = alamat;
    }

    public static boolean isValidnamakampus(String nama) {
        return nama != null && !nama.trim().isEmpty() && nama.length() >= 3;
    }

    public void tampilkanInfo() {
        System.out.println("======== Informasi Kampus ========");
        System.out.println("Nama Kampus : " + namakampus);
        System.out.println("Alamat      : " + alamat);
        System.out.println("Total Mahasiswa: " + mahasiswa.getTotalMahasiswa());
        System.out.println("Status Validasi Nama Kampus: " + (isValidnamakampus(namakampus) ? "Valid" : "Tidak Valid"));
        System.out.println();
    }
}
