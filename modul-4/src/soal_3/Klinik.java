package soal_3;

public class Klinik {
    private Pasien[] daftarPasien;
    private int jumlahPasien;

    public Klinik(int kapasitas) {
        daftarPasien = new Pasien[kapasitas];
        jumlahPasien = 0;
    }

    public void tambahPasien(Pasien pasien) {
        if (jumlahPasien < daftarPasien.length) {
            daftarPasien[jumlahPasien] = pasien;
            jumlahPasien++;
        } else {
            System.out.println("Kapasitas klinik penuh.");
        }
    }

    public void tampilkanDaftarPasien() {
        System.out.println("\n=== Daftar Pasien Klinik ===");
        for (int i = 0; i < jumlahPasien; i++) {
            Pasien p = daftarPasien[i];
            System.out.println("Pasien " + (i + 1));
            System.out.println("Nama    : " + p.getNama());
            System.out.println("Umur    : " + p.getUmur());
            System.out.println("Keluhan : " + p.getKeluhan());
            System.out.println("---------------------------");
        }
    }
}
