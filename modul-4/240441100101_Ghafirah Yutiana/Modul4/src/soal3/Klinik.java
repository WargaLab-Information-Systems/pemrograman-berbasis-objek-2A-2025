package soal3;

// Class Klinik untuk mengelola daftar pasien menggunakan array
public class Klinik {
    private Pasien[] daftarPasien;
    private int jumlahPasien;

    public Klinik(int kapasitas) {
        daftarPasien = new Pasien[kapasitas];
        jumlahPasien = 0;
    }

    // Method untuk menambahkan pasien baru
    public void tambahPasien(Pasien pasien) {
        if (jumlahPasien < daftarPasien.length) {
            daftarPasien[jumlahPasien] = pasien;
            jumlahPasien++;
            System.out.println("Pasien '" + pasien.getNama() + "' berhasil ditambahkan.");
        } else {
            System.out.println("Kapasitas klinik penuh, tidak bisa menambah pasien baru.");
        }
    }

    // Method untuk menampilkan semua pasien
    public void tampilkanDaftarPasien() {
        if (jumlahPasien == 0) {
            System.out.println("Belum ada pasien yang terdaftar.");
        } else {
            System.out.println("Daftar Pasien di Klinik:");
            System.out.println("=======================");
            for (int i = 0; i < jumlahPasien; i++) {
                Pasien pasien = daftarPasien[i];
                System.out.println("Nama    : " + pasien.getNama());
                System.out.println("Umur    : " + pasien.getUmur() + " tahun");
                System.out.println("Keluhan : " + pasien.getKeluhan());
                System.out.println("--------------------------");
            }
        }
    }
}
