package soal2;
import java.util.Scanner;

// Kelas Mahasiswa
class Mahasiswa {
    String nama;
    int nim;
    String jurusan;
    String alamat;

    // Constructor
    public Mahasiswa(String nama, int nim, String jurusan, String alamat) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.alamat = alamat;
    }

    // Method untuk menampilkan data mahasiswa
    public void tampilkanData() {
        System.out.println("===========================");
        System.out.println("Nama    : " + nama);
        System.out.println("NIM     : " + nim);
        System.out.println("Jurusan : " + jurusan);
        System.out.println("Alamat  : " + alamat);
    }
}

// Kelas utama
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Mahasiswa[] mahasiswaArray = new Mahasiswa[3];

        // Input data untuk 3 mahasiswa
        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1) + "");
            System.out.print("Nama: ");
            String nama = scanner.nextLine();
            System.out.print("NIM: ");
            int nim = scanner.nextInt();
            scanner.nextLine(); // Mengonsumsi newline
            System.out.print("Jurusan/Prodi: ");
            String jurusan = scanner.nextLine();
            System.out.print("Alamat: ");
            String alamat = scanner.nextLine();
            
            // Membuat objek Mahasiswa
            mahasiswaArray[i] = new Mahasiswa(nama, nim, jurusan, alamat);
        }

        // Menampilkan data mahasiswa
        System.out.println("\nData Mahasiswa:");
        for (Mahasiswa mhs : mahasiswaArray) {
            mhs.tampilkanData();
        }

        scanner.close();
    }
}