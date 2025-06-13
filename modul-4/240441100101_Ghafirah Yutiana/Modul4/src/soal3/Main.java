package soal3;

// Class Main untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        Klinik klinik = new Klinik(5); // kapasitas maksimal 5 pasien

        // Menambahkan beberapa pasien
        klinik.tambahPasien(new Pasien("Daif", 20, "Demam dan batuk"));
        klinik.tambahPasien(new Pasien("Fifi", 19, "Sakit kepala"));
        klinik.tambahPasien(new Pasien("Dafi", 2, "Tipes"));

        // Menampilkan daftar pasien
        klinik.tampilkanDaftarPasien();
    }
}

