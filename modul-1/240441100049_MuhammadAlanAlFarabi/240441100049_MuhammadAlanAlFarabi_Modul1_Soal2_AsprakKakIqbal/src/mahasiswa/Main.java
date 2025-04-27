package mahasiswa;
import java.util.Scanner;


class Mahasiswa {
    String nama;
    String nim;
    String jurusan;
    String alamat;

    public Mahasiswa(String nama, String nim, String jurusan, String alamat) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.alamat = alamat;
    }

    public void tampilkanInfo() {
        System.out.println("Nama: " + nama + ", NIM: " + nim + ", Jurusan: " + jurusan + ", Alamat: " + alamat);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Mahasiswa[] mahasiswa = new Mahasiswa[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Nama Mahasiswa: ");
            String nama = input.nextLine();
            System.out.println("Masukkan NIM Mahasiswa: ");
            String nim = input.nextLine();
            System.out.println("Masukkan Jurusan Mahasiswa: ");
            String jurusan = input.nextLine();
            System.out.println("Masukkan Alamat Mahasiswa: ");
            String alamat = input.nextLine();

            mahasiswa[i] = new Mahasiswa(nama, nim, jurusan, alamat);
        }

        input.close();

        System.out.println("\nData Mahasiswa:");
        for (Mahasiswa m : mahasiswa) {
            m.tampilkanInfo();
        }
    }
}
