package nomordua;

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

    void tampilkandata() {
        System.out.println("Nama :" + nama);
        System.out.println("NIM :" + nim);
        System.out.println("Jurusan :" + jurusan);
        System.out.println("Alamat :" + alamat);
    }
}

public class Nomordua {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Mahasiswa[] mahasiswaData = new Mahasiswa[3];
        
        for (int i = 0; i < 3;i++) {
            System.out.println("Data Mahasiswa " + (i + 1));
            System.out.print("Masukkan nama mahasiswa: ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan NIM mahasiswa: ");
            String nim = scanner.nextLine();
            System.out.print("Masukkan jurusan/prodi mahasiswa: ");
            String jurusan = scanner.nextLine();
            System.out.print("Masukkan alamat mahasiswa: ");
            String alamat = scanner.nextLine();
            
            mahasiswaData[i] = new Mahasiswa(nama, nim, jurusan, alamat);
        }
        System.out.println("\nData Mahasiswa yang telah dimasukkan:");
        for (Mahasiswa mhs : mahasiswaData) {
            mhs.tampilkandata();
        }

        scanner.close();
    }
}