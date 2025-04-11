import java.util.Scanner;

class Mahasiswa {
    String nama;
    String nim;
    String prodi;
    String alamat;

    void tampilkanData() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Prodi: " + prodi);
        System.out.println("Alamat: " + alamat);
        System.out.println("---------------------------");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Mahasiswa 1
        Mahasiswa m1 = new Mahasiswa();
        System.out.println("Mahasiswa ke-1");
        System.out.print("Nama: ");
        m1.nama = input.nextLine();
        System.out.print("NIM: ");
        m1.nim = input.nextLine();
        System.out.print("Prodi: ");
        m1.prodi = input.nextLine();
        System.out.print("Alamat: ");
        m1.alamat = input.nextLine();
        System.out.println();

        // Mahasiswa 2
        Mahasiswa m2 = new Mahasiswa();
        System.out.println("Mahasiswa ke-2");
        System.out.print("Nama: ");
        m2.nama = input.nextLine();
        System.out.print("NIM: ");
        m2.nim = input.nextLine();
        System.out.print("Prodi: ");
        m2.prodi = input.nextLine();
        System.out.print("Alamat: ");
        m2.alamat = input.nextLine();
        System.out.println();

        // Mahasiswa 3
        Mahasiswa m3 = new Mahasiswa();
        System.out.println("Mahasiswa ke-3");
        System.out.print("Nama: ");
        m3.nama = input.nextLine();
        System.out.print("NIM: ");
        m3.nim = input.nextLine();
        System.out.print("Prodi: ");
        m3.prodi = input.nextLine();
        System.out.print("Alamat: ");
        m3.alamat = input.nextLine();
        System.out.println();

        // Menampilkan Data
        System.out.println("=== Data Mahasiswa ===");
        m1.tampilkanData();
        m2.tampilkanData();
        m3.tampilkanData();
    }
}
