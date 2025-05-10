package soal3;

public final class Kampus {
    String namaKampus;
    String alamatKampus;
    static int totalMahasiswa = 500;

    // Constructor
    public Kampus(String nama, String alamat) {
        if (isValidNamaKampus(nama)) {
            this.namaKampus = nama;
            this.alamatKampus = alamat;
        } else {
            System.out.println("Nama kampus tidak valid (tidak boleh mengandung angka)");
        }
    }

    // Method untuk mengecek apakah nama kampus valid
    public boolean isValidNamaKampus(String nama) {
        // Menyederhanakan validasi dengan mencari angka
        for (int i = 0; i < nama.length(); i++) {
            char c = nama.charAt(i);
            if (Character.isDigit(c)) {
                return false;  // Jika ada angka, dianggap tidak valid
            }
        }
        return true;  // Nama valid jika tidak ada angka
    }

    // Method untuk menambah total mahasiswa
    public static void tambahTotalMahasiswa() {
        totalMahasiswa++;
    }

    // Method untuk menampilkan informasi kampus
    public void tampilkanInfoKampus() {
        System.out.println("Nama Kampus: " + namaKampus);
        System.out.println("Alamat: " + alamatKampus);
        System.out.println("Status Validasi Nama Kampus: " + (isValidNamaKampus(namaKampus) ? "Valid" : "Tidak Valid"));
        System.out.println("Total Mahasiswa: " + totalMahasiswa);
        System.out.println();
    }
}

