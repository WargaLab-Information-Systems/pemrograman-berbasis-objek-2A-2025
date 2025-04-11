package soalnomor2;

import java.util.Scanner;

class Mahasiswa {
    String nama;
    String nim;
    String prodi;
    String alamat;

    // constructor (penyimpanan data input kedalam objek)
    Mahasiswa(String nama, String nim, String prodi, String alamat) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.alamat = alamat;
    }

    void tampilMahasiswa() {
        System.out.println("Nama   : " + nama);
        System.out.println("NIM    : " + nim);
        System.out.println("Prodi  : " + prodi);
        System.out.println("Alamat : " + alamat);
        System.out.println();
    }
}

public class SoalNomor2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Mahasiswa 1 (scaner pengambilan input dari pengguna)
        System.out.println("Mahasiswa 1");
        System.out.print("Nama   : ");
        String nama1 = scanner.nextLine();
        System.out.print("NIM    : ");
        String nim1 = scanner.nextLine();
        System.out.print("Prodi  : ");
        String prodi1 = scanner.nextLine();
        System.out.print("Alamat : ");
        String alamat1 = scanner.nextLine();
        Mahasiswa mhs1 = new Mahasiswa(nama1, nim1, prodi1, alamat1);

        // Mahasiswa 2
        System.out.println("Mahasiswa 2");
        System.out.print("Nama   : ");
        String nama2 = scanner.nextLine();
        System.out.print("NIM    : ");
        String nim2 = scanner.nextLine();
        System.out.print("Prodi  : ");
        String prodi2 = scanner.nextLine();
        System.out.print("Alamat : ");
        String alamat2 = scanner.nextLine();
        Mahasiswa mhs2 = new Mahasiswa(nama2, nim2, prodi2, alamat2);

        // Mahasiswa 3
        System.out.println("Mahasiswa 3");
        System.out.print("Nama   : ");
        String nama3 = scanner.nextLine();
        System.out.print("NIM    : ");
        String nim3 = scanner.nextLine();
        System.out.print("Prodi  : ");
        String prodi3 = scanner.nextLine();
        System.out.print("Alamat : ");
        String alamat3 = scanner.nextLine();
        Mahasiswa mhs3 = new Mahasiswa(nama3, nim3, prodi3, alamat3);

        // Output Data
        System.out.println();
        System.out.println("******* Data Mahasiswa Trunojoyo *******");
        mhs1.tampilMahasiswa();
        mhs2.tampilMahasiswa();
        mhs3.tampilMahasiswa();
    }
}
