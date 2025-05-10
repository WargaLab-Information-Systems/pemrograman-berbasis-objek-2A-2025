
package constructor;

public class Kampus {
    String nama;
    private String alamat;

    public Kampus(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }

    public void tampilkanInfoKampus() {
        System.out.println("=== Informasi Kampus ===");
        System.out.println("Nama Kampus : " + nama);
        System.out.println("Alamat      : " + alamat);
        System.out.println("Total Mahasiswa: " + Mahasiswa.getJumlahMahasiswa());
    }

    public static boolean validNamaKampus(String nama) {
        return !nama.matches(".*\\d.*");
    }
}
