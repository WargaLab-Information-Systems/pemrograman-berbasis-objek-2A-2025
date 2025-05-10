import java.util.ArrayList;
import java.util.Scanner;

// Class Mahasiswa
class Mahasiswa {
    // Atribut-atribut mahasiswa
    private final String nama;
    private final String nim;
    private final String jurusan;
    private final String alamat;

    // Konstruktor
    public Mahasiswa(String nama, String nim, String jurusan, String alamat) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.alamat = alamat;
    }

    // Method untuk menampilkan informasi mahasiswa
    public void tampilkanInformasi() {
        System.out.println("Nama Mahasiswa: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jurusan: " + jurusan);
        System.out.println("Alamat: " + alamat);
        System.out.println(); // Baris kosong untuk pemisah
    }
}

// Class utama untuk menjalankan program
public class InputDataMahasiswa {
    public static void main(String[] args) {
        // Membuat ArrayList untuk menyimpan objek Mahasiswa
        try ( // Membuat scanner untuk input
                Scanner scanner = new Scanner(System.in)) {
            // Membuat ArrayList untuk menyimpan objek Mahasiswa
            ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();
            // Input data untuk 3 mahasiswa
            for (int i = 1; i <= 3; i++) {
                System.out.println("=== Input Data Mahasiswa " + i + " ===");
                
                // Input nama
                System.out.print("Masukkan Nama Mahasiswa: ");
                String nama = scanner.nextLine();
                
                // Input NIM
                System.out.print("Masukkan NIM: ");
                String nim = scanner.nextLine();
                
                // Input Jurusan
                System.out.print("Masukkan Jurusan/Prodi: ");
                String jurusan = scanner.nextLine();
                
                // Input Alamat
                System.out.print("Masukkan Alamat: ");
                String alamat = scanner.nextLine();
                
                // Membuat objek Mahasiswa dan menambahkannya ke ArrayList
                Mahasiswa mahasiswa = new Mahasiswa(nama, nim, jurusan, alamat);
                daftarMahasiswa.add(mahasiswa);
                
                System.out.println(); // Baris kosong untuk pemisah
            }   // Menampilkan informasi semua mahasiswa
            System.out.println("=== Informasi Mahasiswa yang Diinputkan ===");
            for (Mahasiswa mhs : daftarMahasiswa) {
                mhs.tampilkanInformasi();
            }
            // Menutup scanner
        }
    }
}

