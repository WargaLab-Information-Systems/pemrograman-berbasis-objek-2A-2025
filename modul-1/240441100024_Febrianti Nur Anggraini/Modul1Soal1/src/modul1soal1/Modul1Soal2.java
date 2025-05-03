package modul1soal1;

import java.util.Scanner; // Import library untuk input pengguna

// Deklarasi Class Mahasiswa
class Mahasiswa {
    private String nama;
    private String nim;
    private String prodi;
    private String alamat;
    
    // Constructor
    public Mahasiswa(String nama, String nim, String prodi, String alamat) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.alamat = alamat;
    }

    // Method untuk Menampilkan Data Mahasiswa
    public void tampilkanData() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Program Studi: " + prodi);
        System.out.println("Alamat: " + alamat);
        System.out.println("---------------------------");
    }
}

//Program Utama (Main Class)
public class Modul1Soal2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner untuk Input Data

        // Array untuk Menyimpan
        int jumlahMahasiswa = 3; 
        Mahasiswa[] mahasiswaArray = new Mahasiswa[jumlahMahasiswa];

        // Perulangan untuk Input Data Mahasiswa
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1) + ":");
            System.out.print("Nama: ");
            String nama = scanner.nextLine();
            System.out.print("NIM: ");
            String nim = scanner.nextLine();
            System.out.print("Program Studi: ");
            String prodi = scanner.nextLine();
            System.out.print("Alamat: ");
            String alamat = scanner.nextLine();

            // Membuat Objek Mahasiswa 
            mahasiswaArray[i] = new Mahasiswa(nama, nim, prodi, alamat);
        }

        System.out.println("\nData Mahasiswa:");
        for (Mahasiswa mhs : mahasiswaArray) {
            mhs.tampilkanData();
        }
    }
}

   
