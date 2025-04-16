
package pkg240441100145_aryaabdi_modul1_nomor2;

import java.util.Scanner;

public class Mahasiswa {
    // Atribut (ciri-ciri mahasiswa)
    String nama;
    String nim;
    String jurusan;
    String alamat;

    // Method untuk mengisi data mahasiswa
    void setData(String nama, String nim, String jurusan, String alamat) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.alamat = alamat;
    }

    // Method untuk menampilkan data mahasiswa
    void tampilkanData() {
        System.out.println("\n--- Data Mahasiswa ---");
        System.out.println("Nama     : " + nama);
        System.out.println("NIM      : " + nim);
        System.out.println("Jurusan  : " + jurusan);
        System.out.println("Alamat   : " + alamat);
    }

    // main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Buat array untuk 3 objek Mahasiswa
        Mahasiswa[] daftarMahasiswa = new Mahasiswa[3];

        // Input data 3 kali menggunakan looping
        for (int i = 0; i < 3; i++) {
            System.out.println("\nMasukkan data mahasiswa ke-" + (i + 1));
            System.out.print("Nama    : ");
            String nama = input.nextLine();
            System.out.print("NIM     : ");
            String nim = input.nextLine();
            System.out.print("Jurusan : ");
            String jurusan = input.nextLine();
            System.out.print("Alamat  : ");
            String alamat = input.nextLine();

            // Buat objek dan set data
            Mahasiswa mhs = new Mahasiswa();
            mhs.setData(nama, nim, jurusan, alamat);

            // Simpan objek ke array
            daftarMahasiswa[i] = mhs;
        }

        // Tampilkan semua data mahasiswa
        System.out.println("\n===== Daftar Mahasiswa =====");
        for (int i = 0; i < 3; i++) {
            System.out.println("\nData Mahasiswa ke-" + (i + 1));
            daftarMahasiswa[i].tampilkanData();
        }
    }
}


