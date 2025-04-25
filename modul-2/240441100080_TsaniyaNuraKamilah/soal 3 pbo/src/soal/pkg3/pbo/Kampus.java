
package soal.pkg3.pbo;

public class Kampus {
    String namaKampus;
    String alamat;

    public Kampus(String namaKampus, String alamat) {
        if (!validasiNamaKampus(namaKampus)) {
            throw new IllegalArgumentException("Nama kampus tidak valid: " + namaKampus);
        }
        this.namaKampus = namaKampus;
        this.alamat = alamat;
    }
      public static boolean validasiNamaKampus(String nama) {
        return nama != null && !nama.trim().isEmpty() && nama.length() >= 3;
    }

    public void tampilkanInfoKampus() {
        System.out.println("Nama Kampus : " + namaKampus);
        System.out.println("Alamat      : " + alamat);
        System.out.println("Status Validasi: " + (validasiNamaKampus(namaKampus) ? "Valid" : "Tidak Valid"));
    }

}
