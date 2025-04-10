package modul1;
import java.util.Scanner;

class Mahasiswa {
    private String nama;
    private String nim;
    private String jurusan;
    private String alamat;

    public Mahasiswa(String nama, String nim, String jurusan, String alamat) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.alamat = alamat;
    }

    // Metode untuk menampilkan data mahasiswa
    public void tampilkanData() {
        System.out.println("Nama     : " + nama);
        System.out.println("NIM      : " + nim);
        System.out.println("Jurusan  : " + jurusan);
        System.out.println("Alamat   : " + alamat);
        System.out.println("------------------------");
    }
}

public class soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Mahasiswa[] daftarMahasiswa = new Mahasiswa[3];

        // Loop untuk mengisi data mahasiswa
        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("Nama     : ");
            String nama = input.nextLine();
            System.out.print("NIM      : ");
            String nim = input.nextLine();
            System.out.print("Jurusan  : ");
            String jurusan = input.nextLine();
            System.out.print("Alamat   : ");
            String alamat = input.nextLine();
            System.out.println("------------------------");

            // Membuat objek mahasiswa dan menyimpannya di array
            daftarMahasiswa[i] = new Mahasiswa(nama, nim, jurusan, alamat);
        }

        // Menampilkan semua data mahasiswa
        System.out.println("=== Data Mahasiswa ===");
        for (Mahasiswa mhs : daftarMahasiswa) {
            mhs.tampilkanData();
        }

        input.close();
    }
}
