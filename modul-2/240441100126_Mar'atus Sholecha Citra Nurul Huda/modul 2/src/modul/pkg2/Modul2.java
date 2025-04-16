import java.util.ArrayList;

class Mahasiswa {
    // Variabel kelas untuk menyimpan jumlah total mahasiswa
    static int totalMahasiswa = 0; // Menggunakan static agar dapat diakses tanpa objek
    String nama; // Atribut untuk menyimpan nama mahasiswa
    String nim; // Atribut untuk menyimpan NIM mahasiswa
    String prodi; // Atribut untuk menyimpan program studi
    ArrayList<String> daftarMataKuliah; // Daftar mata kuliah yang diambil

    // Constructor untuk inisialisasi objek Mahasiswa
    Mahasiswa(String nama, String nim, String prodi) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.daftarMataKuliah = new ArrayList<>();
        totalMahasiswa++; // Increment jumlah total mahasiswa
    }

    // Metode untuk menambahkan mata kuliah ke daftar yang diambil
    void tambahMataKuliah(String mataKuliah) {
        daftarMataKuliah.add(mataKuliah);
    }

    // Metode untuk menampilkan biodata lengkap beserta daftar mata kuliah yang diambil
    void tampilkanBiodata() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Program Studi: " + prodi);
        System.out.println("Daftar Mata Kuliah yang Diambil:");
        for (String mk : daftarMataKuliah) {
            System.out.println("- " + mk);
        }
    }

    // Metode kelas untuk menampilkan jumlah total mahasiswa yang telah dibuat
    static int jumlahTotalMahasiswa() {
        return totalMahasiswa;
    }

    // Metode statis untuk memvalidasi apakah NIM valid atau tidak
    static boolean validasiNim(String nim) {
        return nim.length() == 10 && nim.startsWith("23");
    }

    // Metode utama untuk menjalankan program
    public static void main(String[] args) {
        // Contoh penggunaan class Mahasiswa
        Mahasiswa mhs1 = new Mahasiswa("Alice", "2301234567", "Teknik Informatika");
        mhs1.tambahMataKuliah("Algoritma");
        mhs1.tambahMataKuliah("Struktur Data");

        Mahasiswa mhs2 = new Mahasiswa("Bob", "2309876543", "Sistem Informasi");
        mhs2.tambahMataKuliah("Basis Data");

        // Menampilkan biodata mahasiswa
        mhs1.tampilkanBiodata();
        mhs2.tampilkanBiodata();

        // Menampilkan jumlah total mahasiswa
        System.out.println("Total Mahasiswa: " + Mahasiswa.jumlahTotalMahasiswa());
    }
}