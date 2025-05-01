package Soal2;
import java.util.Scanner;

public class Mahasiswa {
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
        System.out.println("\nNama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Jurusan : " + jurusan);
        System.out.println("Alamat :" + alamat);
    }
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan data mahasiswa pertama:");
        System.out.print("Nama : ");
        String nama1 = input.nextLine();
        System.out.print("NIM :");
        String nim1 = input.nextLine();
        System.out.print("Jurusan :");
        String jurusan1 = input.nextLine();
        System.out.print("Alamat :");
        String alamat1 = input.nextLine();
        Mahasiswa mhs1 = new Mahasiswa(nama1, nim1, jurusan1, alamat1);
        
        System.out.println("\nMasukkan data mahasiswa kedua:");
        System.out.print("Nama :");
        String nama2 = input.nextLine();
        System.out.print("NIM :");
        String nim2 = input.nextLine();
        System.out.print("Jurusan :");
        String jurusan2 = input.nextLine();
        System.out.print("Alamat :");
        String alamat2 = input.nextLine();
        Mahasiswa mhs2 = new Mahasiswa(nama2, nim2, jurusan2, alamat2);
        
        System.out.println("\nMasukkan data mahasiswa ketiga");
        System.out.print("Nama :");
        String nama3 = input.nextLine();
        System.out.print("NIM :");
        String nim3 = input.nextLine();
        System.out.print("Jurusan :");
        String jurusan3 = input.nextLine();
        System.out.print("Alamat :");
        String alamat3 = input.nextLine();
        Mahasiswa mhs3 = new Mahasiswa (nama3, nim3, jurusan3, alamat3);
        
        System.out.print("\n=== DATA MAHASISWA ===");
        mhs1.tampilkanInfo();
        mhs2.tampilkanInfo();
        mhs3.tampilkanInfo();
        
        input.close();
    }
    
}