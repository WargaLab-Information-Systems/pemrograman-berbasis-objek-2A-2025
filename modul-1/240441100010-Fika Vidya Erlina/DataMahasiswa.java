package data.mahasiswa;

import java.util.Scanner;

class Mahasiswa {
    String nama;
    String nim;
    String jurusan;
    String alamat;

    Mahasiswa(String nama, String nim, String jurusan, String alamat) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.alamat = alamat;
    }

    void Mahasiswa() {
        System.out.println("Nama     : " + nama);
        System.out.println("NIM      : " + nim);
        System.out.println("Jurusan  : " + jurusan);
        System.out.println("Alamat   : " + alamat);
        System.out.println();
    }
}

public class DataMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Mahasiswa ke-1");
        System.out.print("Nama     : ");
        String nama1 = input.nextLine();
        System.out.print("NIM      : ");
        String nim1 = input.nextLine();
        System.out.print("Jurusan  : ");
        String jurusan1 = input.nextLine();
        System.out.print("Alamat   : ");
        String alamat1 = input.nextLine();
        System.out.println();

        System.out.println("Mahasiswa ke-2");
        System.out.print("Nama     : ");
        String nama2 = input.nextLine();
        System.out.print("NIM      : ");
        String nim2 = input.nextLine();
        System.out.print("Jurusan  : ");
        String jurusan2 = input.nextLine();
        System.out.print("Alamat   : ");
        String alamat2 = input.nextLine();
        System.out.println();

        System.out.println("Mahasiswa ke-3");
        System.out.print("Nama     : ");
        String nama3 = input.nextLine();
        System.out.print("NIM      : ");
        String nim3 = input.nextLine();
        System.out.print("Jurusan  : ");
        String jurusan3 = input.nextLine();
        System.out.print("Alamat   : ");
        String alamat3 = input.nextLine();
        System.out.println();

        Mahasiswa m1 = new Mahasiswa(nama1, nim1, jurusan1, alamat1);
        Mahasiswa m2 = new Mahasiswa(nama2, nim2, jurusan2, alamat2);
        Mahasiswa m3 = new Mahasiswa(nama3, nim3, jurusan3, alamat3);

        System.out.println("=== Data Mahasiswa ===");
        System.out.println("Mahasiswa ke-1");
        m1.Mahasiswa();

        System.out.println("Mahasiswa ke-2");
        m2.Mahasiswa();

        System.out.println("Mahasiswa ke-3");
        m3.Mahasiswa();

        input.close();
    }
}
