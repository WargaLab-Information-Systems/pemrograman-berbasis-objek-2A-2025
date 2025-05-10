import java.util.ArrayList;
import java.util.List;

// Kelas MataKuliah merepresentasikan mata kuliah dengan atribut kode, nama, dan jumlah SKS
class MataKuliah {
    private String kode;  // Kode unik mata kuliah, misal "MK001"
    private String nama;  // Nama mata kuliah, misal "Matematika Dasar"
    private int sks;      // Jumlah SKS, harus 2 atau 3

    // Konstruktor MataKuliah dengan validasi SKS
    public MataKuliah(String kode, String nama, int sks) {
        if (!isValidSKS(sks)) {
            // Jika SKS bukan 2 atau 3, lempar exception
            throw new IllegalArgumentException("Jumlah SKS tidak valid. SKS harus 2 atau 3.");
        }
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
    }

    // Method static untuk validasi SKS
    public static boolean isValidSKS(int sks) {
        return sks == 2 || sks == 3;
    }

    // Override method toString untuk menampilkan info mata kuliah dengan format yang mudah dibaca
    @Override
    public String toString() {
        return kode + " - " + nama + " (" + sks + " SKS)";
    }
}

// Kelas Mahasiswa merepresentasikan data mahasiswa dan daftar mata kuliah yang diambil
class Mahasiswa {
    private static int totalMahasiswa = 0; // Variabel static untuk menghitung total mahasiswa yang dibuat

    private String nama;                   // Nama mahasiswa
    private String nim;                    // Nomor Induk Mahasiswa, harus valid
    private String prodi;                  // Program studi mahasiswa
    private List<MataKuliah> daftarMataKuliah; // Daftar mata kuliah yang diambil mahasiswa

    // Konstruktor Mahasiswa dengan validasi NIM
    public Mahasiswa(String nama, String nim, String prodi) {
        if (!validasiNIM(nim)) {
            // Jika NIM tidak valid, lempar exception
            throw new IllegalArgumentException("NIM tidak valid. Harus dimulai dengan '23' dan terdiri dari 10 digit.");
        }
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.daftarMataKuliah = new ArrayList<>(); // Inisialisasi list mata kuliah kosong
        totalMahasiswa++; // Tambah jumlah total mahasiswa setiap kali objek dibuat
    }

    // Method untuk menambahkan mata kuliah ke daftar mahasiswa
    public void tambahMataKuliah(MataKuliah mk) {
        daftarMataKuliah.add(mk);
    }

    // Method untuk menampilkan biodata mahasiswa beserta mata kuliah yang diambil
    public void tampilkanBiodata() {
        System.out.println("Nama     : " + nama);
        System.out.println("NIM      : " + nim);
        System.out.println("Prodi    : " + prodi);
        System.out.println("Mata Kuliah yang diambil:");
        for (MataKuliah mk : daftarMataKuliah) {
            System.out.println("  - " + mk);  // Memanggil toString() MataKuliah
        }
        System.out.println("-----------------------------------");
    }

    // Method static untuk mengambil total mahasiswa yang sudah dibuat
    public static int getTotalMahasiswa() {
        return totalMahasiswa;
    }

    // Validasi NIM: harus mulai dengan "23", panjang 10 digit, dan hanya angka
    public static boolean validasiNIM(String nim) {
        return nim.startsWith("23") && nim.length() == 10 && nim.matches("\\d+");
    }
}

// Kelas Kampus merepresentasikan kampus dengan nama dan alamat
class Kampus {
    private String nama;    // Nama kampus, harus valid (tidak mengandung angka)
    private String alamat;  // Alamat kampus

    // Konstruktor Kampus dengan validasi nama kampus
    public Kampus(String nama, String alamat) {
        if (!isValidNamaKampus(nama)) {
            // Jika nama kampus mengandung angka, lempar exception
            throw new IllegalArgumentException("Nama kampus tidak valid. Tidak boleh mengandung angka.");
        }
        this.nama = nama;
        this.alamat = alamat;
    }

    // Method static untuk validasi nama kampus (tidak boleh ada angka)
    public static boolean isValidNamaKampus(String nama) {
        return !nama.matches(".*\\d.*"); // Regex untuk cek ada angka atau tidak
    }

    // Method untuk menampilkan informasi kampus dan total mahasiswa
    public void tampilkanInfo() {
        System.out.println("Nama Kampus       : " + nama);
        System.out.println("Alamat Kampus     : " + alamat);
        System.out.println("Total Mahasiswa   : " + Mahasiswa.getTotalMahasiswa()); // Ambil dari kelas Mahasiswa
        System.out.println("Status Validasi   : " + (isValidNamaKampus(nama) ? "Valid" : "Tidak Valid"));
        System.out.println("-----------------------------------");
    }
}

// Kelas Main sebagai entry point program
public class Main {
    public static void main(String[] args) {
        try {
            // Membuat objek Kampus dengan nama dan alamat
            Kampus kampus = new Kampus("Universitas Trunojoyo Madura", "Jl. Raya Telang");

            // Membuat objek MataKuliah (minimal 8 mata kuliah)
            MataKuliah mk1 = new MataKuliah("MK001", "Matematika Dasar", 3);
            MataKuliah mk2 = new MataKuliah("MK002", "Fisika Dasar", 2);
            MataKuliah mk3 = new MataKuliah("MK003", "Kimia Dasar", 3);
            MataKuliah mk4 = new MataKuliah("MK004", "Pemrograman Dasar", 3);
            MataKuliah mk5 = new MataKuliah("MK005", "Algoritma dan Struktur Data", 3);
            MataKuliah mk6 = new MataKuliah("MK006", "Basis Data", 2);
            MataKuliah mk7 = new MataKuliah("MK007", "Sistem Operasi", 9);
            MataKuliah mk8 = new MataKuliah("MK008", "Jaringan Komputer", 2);

            // Membuat objek Mahasiswa (minimal 6 mahasiswa), setiap mahasiswa mengambil minimal 4 mata kuliah
            Mahasiswa mhs1 = new Mahasiswa("Melati Surya", "2301234567", "Sistem Informasi");
            mhs1.tambahMataKuliah(mk1);
            mhs1.tambahMataKuliah(mk4);
            mhs1.tambahMataKuliah(mk5);
            mhs1.tambahMataKuliah(mk6);

            Mahasiswa mhs2 = new Mahasiswa("Deva Angga", "2309876543", "Teknik Informatika");
            mhs2.tambahMataKuliah(mk2);
            mhs2.tambahMataKuliah(mk3);
            mhs2.tambahMataKuliah(mk7);
            mhs2.tambahMataKuliah(mk8);

            Mahasiswa mhs3 = new Mahasiswa("Fifi", "2301122334", "Sistem Informasi");
            mhs3.tambahMataKuliah(mk1);
            mhs3.tambahMataKuliah(mk5);
            mhs3.tambahMataKuliah(mk6);
            mhs3.tambahMataKuliah(mk7);

            Mahasiswa mhs4 = new Mahasiswa("Citra", "2302233445", "Sistem Informasi");
            mhs4.tambahMataKuliah(mk2);
            mhs4.tambahMataKuliah(mk3);
            mhs4.tambahMataKuliah(mk4);
            mhs4.tambahMataKuliah(mk8);

            Mahasiswa mhs5 = new Mahasiswa("Gwen", "2303344556", "Sistem Informasi");
            mhs5.tambahMataKuliah(mk1);
            mhs5.tambahMataKuliah(mk4);
            mhs5.tambahMataKuliah(mk7);
            mhs5.tambahMataKuliah(mk8);

            Mahasiswa mhs6 = new Mahasiswa("Angga", "2304455667", "Teknik Informatika");
            mhs6.tambahMataKuliah(mk2);
            mhs6.tambahMataKuliah(mk3);
            mhs6.tambahMataKuliah(mk5);
            mhs6.tambahMataKuliah(mk6);

            // Menampilkan informasi kampus
            System.out.println("=== Informasi Kampus ===");
            kampus.tampilkanInfo();

            // Menampilkan biodata semua mahasiswa yang sudah dibuat
            System.out.println("=== Informasi Mahasiswa ===");
            List<Mahasiswa> daftarMahasiswa = List.of(mhs1, mhs2, mhs3, mhs4, mhs5, mhs6);
            for (Mahasiswa mhs : daftarMahasiswa) {
                mhs.tampilkanBiodata();
            }

        } catch (IllegalArgumentException e) {
            // Menangani error validasi dan menampilkan pesan error
            System.out.println("Error: " + e.getMessage());
        }
    }
}
