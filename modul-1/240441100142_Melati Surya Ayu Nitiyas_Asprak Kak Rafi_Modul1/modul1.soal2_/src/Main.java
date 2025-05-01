import java.util.Scanner;

// Mendefinisikan class Mahasiswa
class Mahasiswa {
    // Atribut
    private final String nama;
    private final String nim;
    private final String jurusan;
    private final String alamat;

    // Constructor untuk menginisialisasi objek
    public Mahasiswa(String nama, String nim, String jurusan, String alamat) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.alamat = alamat;
    }

    // Method untuk menampilkan informasi mahasiswa
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jurusan/Prodi: " + jurusan);
        System.out.println("Alamat: " + alamat);
        System.out.println();
    }
}

// Kelas utama untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        // Membuat array untuk menyimpan objek Mahasiswa
        try (Scanner scanner = new Scanner(System.in)) {
            // Membuat array untuk menyimpan objek Mahasiswa
            Mahasiswa[] mahasiswaArray = new Mahasiswa[3];
            // Mengumpulkan data dari pengguna untuk 3 mahasiswa
            for (int i = 0; i < 3; i++) {
                System.out.println("Masukkan data mahasiswa ke-" + (i + 1) + ":");
                System.out.print("Nama: ");
                String nama = scanner.nextLine();
                System.out.print("NIM: ");
                String nim = scanner.nextLine();
                System.out.print("Jurusan/Prodi: ");
                String jurusan = scanner.nextLine();
                System.out.print("Alamat: ");
                String alamat = scanner.nextLine();
                
                // Membuat objek Mahasiswa dan menyimpannya dalam array
                mahasiswaArray[i] = new Mahasiswa(nama, nim, jurusan, alamat);
                System.out.println(); // Menambahkan baris kosong untuk kejelasan
            }   // Menampilkan informasi semua mahasiswa
            System.out.println("Data Mahasiswa:");
            for (Mahasiswa mhs : mahasiswaArray) {
                mhs.tampilkanInfo();
            }
            // Menutup scanner
        }
    }
}
