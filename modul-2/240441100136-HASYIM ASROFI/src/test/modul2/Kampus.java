public class Kampus {
    private String nama;
    private String alamat;
    private static int totalMahasiswa;

    public Kampus(String nama, String alamat) {
        if (!isValidNamaKampus(nama)) {
            throw new IllegalArgumentException("Nama kampus tidak valid: " + nama);
        }
        this.nama = nama;
        this.alamat = alamat;
        totalMahasiswa = Mahasiswa.getTotalMahasiswa();
    }

    public void tampilkanInfo() {
        System.out.println("Nama Kampus: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Total Mahasiswa: " + totalMahasiswa);
    }

    public static boolean isValidNamaKampus(String nama) {
        return !nama.matches(".\\d.");
    }
}