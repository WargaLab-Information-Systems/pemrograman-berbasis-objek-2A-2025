package modul2;

public class Kampus {
    String nama;
    String alamat;
    static int totalMahasiswa = 0;

    public Kampus(String nama, String alamat) {
        if (!validNamaKampus(nama)) {
            System.out.println("Nama kampus tidak valid: " + nama);
            this.nama = null;
            this.alamat = null;
        } else {
            this.nama = nama;
            this.alamat = alamat;
        }
        totalMahasiswa = Mahasiswa.getJumlahMahasiswa();
    }

    public static boolean validNamaKampus(String nama) {
        return nama != null && !nama.matches(".*\\d.*");
    }

    public void tampilkanInfoKampus() {
        if (nama == null || alamat == null) {
            System.out.println("Informasi kampus tidak valid");
            return;
        }
        System.out.println("-----------------Informasi Kampus-------------------");
        System.out.println("Kampus: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Total Mahasiswa: " + totalMahasiswa);
        System.out.println("Validasi Nama Kampus: " + (validNamaKampus(nama) ? "Valid" : "Tidak Valid"));
    }
}
