// Class Mahasiswa
import java.util.ArrayList;

public class Mahasiswa {
    // Atribut
    private String nama;
    private String nim;
    private String prodi;
    private ArrayList<MataKuliah> daftarMatkul;
    
    // Atribut static untuk menghitung jumlah mahasiswa
    private static int jumlahMahasiswa = 0;
    
    // Constructor
    public Mahasiswa(String nama, String nim, String prodi) {
        // Validasi NIM sebelum membuat objek
        if (isNimValid(nim)) {
            this.nama = nama;
            this.nim = nim;
            this.prodi = prodi;
            this.daftarMatkul = new ArrayList<>();
            jumlahMahasiswa++; // Menambah jumlah mahasiswa setiap kali objek dibuat
        } else {
            System.out.println("NIM tidak valid! NIM harus dimulai dengan '23' dan terdiri dari 10 digit.");
            System.out.println("Objek Mahasiswa dengan NIM " + nim + " tidak dibuat.");
        }
    }
    
    // Method untuk menambahkan mata kuliah
    public void tambahMataKuliah(MataKuliah mataKuliah) {
        daftarMatkul.add(mataKuliah);
    }
    
    // Method untuk menampilkan biodata lengkap
    public void tampilkanBiodata() {
        System.out.println("\n===== BIODATA MAHASISWA =====");
        System.out.println("Nama  : " + nama);
        System.out.println("NIM   : " + nim);
        System.out.println("Prodi : " + prodi);
        System.out.println("Daftar Mata Kuliah yang Diambil:");
        
        if (daftarMatkul.isEmpty()) {
            System.out.println("- Belum mengambil mata kuliah");
        } else {
            int i = 1;
            for (MataKuliah mk : daftarMatkul) {
                System.out.println(i + ". " + mk.getNamaMatkul() + " (" + mk.getKodeMatkul() + ") - " + mk.getSks() + " SKS");
                i++;
            }
        }
        System.out.println("=============================");
    }
    
    // Method static untuk menampilkan jumlah total mahasiswa
    public static void tampilkanJumlahMahasiswa() {
        System.out.println("Jumlah total mahasiswa: " + jumlahMahasiswa);
    }
    
    // Method static untuk memvalidasi NIM
    public static boolean isNimValid(String nim) {
        // NIM valid jika dimulai dengan "23" dan terdiri dari 10 digit
        return nim.startsWith("23") && nim.length() == 10;
    }


}