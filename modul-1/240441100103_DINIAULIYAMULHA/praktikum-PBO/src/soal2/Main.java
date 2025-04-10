package soal2;

import java.util.Scanner;

class Mahasiswa {
    String nama;
    String nim;
    String jurusan;
    String alamat;
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Membuat 3 objek mahasiswa
        Mahasiswa mhs1 = new Mahasiswa();
        Mahasiswa mhs2 = new Mahasiswa();
        Mahasiswa mhs3 = new Mahasiswa();

        // Mengambil input untuk mahasiswa 1
        System.out.println("Masukkan data mahasiswa 1:");
        System.out.print("Nama: ");
        mhs1.nama = input.nextLine();
        System.out.print("NIM: ");
        mhs1.nim = input.nextLine();
        System.out.print("Jurusan: ");
        mhs1.jurusan = input.nextLine();
        System.out.print("Alamat: ");
        mhs1.alamat = input.nextLine();

        // Mengambil input untuk mahasiswa 2
        System.out.println("\nMasukkan data mahasiswa 2:");
        System.out.print("Nama: ");
        mhs2.nama = input.nextLine();
        System.out.print("NIM: ");
        mhs2.nim = input.nextLine();
        System.out.print("Jurusan: ");
        mhs2.jurusan = input.nextLine();
        System.out.print("Alamat: ");
        mhs2.alamat = input.nextLine();

        // Mengambil input untuk mahasiswa 3
        System.out.println("\nMasukkan data mahasiswa 3:");
        System.out.print("Nama: ");
        mhs3.nama = input.nextLine();
        System.out.print("NIM: ");
        mhs3.nim = input.nextLine();
        System.out.print("Jurusan: ");
        mhs3.jurusan = input.nextLine();
        System.out.print("Alamat: ");
        mhs3.alamat = input.nextLine();

        // Menampilkan data mahasiswa
        System.out.println("\n=== Data Mahasiswa ===");
        System.out.println("Nama: " + mhs1.nama + ", NIM: " + mhs1.nim + ", Jurusan: " + mhs1.jurusan + ", Alamat: " + mhs1.alamat);
        System.out.println("Nama: " + mhs2.nama + ", NIM: " + mhs2.nim + ", Jurusan: " + mhs2.jurusan + ", Alamat: " + mhs2.alamat);
        System.out.println("Nama: " + mhs3.nama + ", NIM: " + mhs3.nim + ", Jurusan: " + mhs3.jurusan + ", Alamat: " + mhs3.alamat);

        input.close();
    }
}
