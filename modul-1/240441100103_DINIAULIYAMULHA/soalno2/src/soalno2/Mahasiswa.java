package soalno2;

import java.util.Scanner;
        
public class Mahasiswa {
    String nama;
    String nim;
    String prodi;
    String alamat;

    void tampilkanData() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Prodi: " + prodi);
        System.out.println("Alamat: " + alamat);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Mahasiswa mhs = new Mahasiswa();

        System.out.print("Masukkan Nama: ");
        mhs.nama = input.nextLine();

        System.out.print("Masukkan NIM: ");
        mhs.nim = input.nextLine();

        System.out.print("Masukkan Prodi: ");
        mhs.prodi = input.nextLine();

        System.out.print("Masukkan Alamat: ");
        mhs.alamat = input.nextLine();

        System.out.println("\n=== Data Mahasiswa ===");
        mhs.tampilkanData();
    }
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
