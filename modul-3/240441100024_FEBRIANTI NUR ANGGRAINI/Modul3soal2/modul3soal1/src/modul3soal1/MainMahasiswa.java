package modul3soal1;

import java.util.Scanner; // <-- import HARUS di luar class, bukan di dalam class!

public class MainMahasiswa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input Mahasiswa Reguler
        System.out.print("Masukkan jumlah mahasiswa reguler: ");
        int jumlahReguler = scanner.nextInt();
        scanner.nextLine(); // konsumsi newline

        MahasiswaReguler[] regulerArray = new MahasiswaReguler[jumlahReguler];

        for (int i = 0; i < jumlahReguler; i++) {
            System.out.println("\nData Mahasiswa Reguler ke-" + (i + 1));
            System.out.print("Nama: ");
            String nama = scanner.nextLine();
            System.out.print("NIM: ");
            String nim = scanner.nextLine();
            System.out.print("Kelas: ");
            String kelas = scanner.nextLine();

            regulerArray[i] = new MahasiswaReguler(nama, nim, kelas);
        }

        // Input Mahasiswa Beasiswa
        System.out.print("\nMasukkan jumlah mahasiswa beasiswa: ");
        int jumlahBeasiswa = scanner.nextInt();
        scanner.nextLine(); // konsumsi newline

        MahasiswaBeasiswa[] beasiswaArray = new MahasiswaBeasiswa[jumlahBeasiswa];

        for (int i = 0; i < jumlahBeasiswa; i++) {
            System.out.println("\nData Mahasiswa Beasiswa ke-" + (i + 1));
            System.out.print("Nama: ");
            String nama = scanner.nextLine();
            System.out.print("NIM: ");
            String nim = scanner.nextLine();
            System.out.print("Jenis Beasiswa: ");
            String jenisBeasiswa = scanner.nextLine();

            beasiswaArray[i] = new MahasiswaBeasiswa(nama, nim, jenisBeasiswa);
        }

        // Menampilkan Data Mahasiswa Reguler
        System.out.println("\n=== Daftar Mahasiswa Reguler ===");
        for (MahasiswaReguler mhsReguler : regulerArray) {
            mhsReguler.infoReguler();
        }

        // Menampilkan Data Mahasiswa Beasiswa
        System.out.println("\n=== Daftar Mahasiswa Beasiswa ===");
        for (MahasiswaBeasiswa mhsBeasiswa : beasiswaArray) {
            mhsBeasiswa.infoBeasiswa();
        }
    }
}
