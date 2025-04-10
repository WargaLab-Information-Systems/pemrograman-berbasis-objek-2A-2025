package soal2;
// import
import java.util.Scanner;

// class
class Mahasiswa{
    String nama;
    String nim;
    String jurusan;
    String alamat;
    
    // konstruktor
    public Mahasiswa(String nama, String nim, String jurusan, String alamat){
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.alamat = alamat;
    }
    
    // method
    public void tampilkanMHS(){
        System.out.println("Nama    :" + nama);
        System.out.println("Nim     :" + nim);
        System.out.println("Jurusan :" + jurusan);
        System.out.println("Alamat  :" + alamat);
        System.out.println("------------------");
    }
}

public class Soal2 {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    // input mhs 1
    System.out.println("Masukkan Data MHS Ke-1");
    System.out.print("Nama  : ");
    String nama1 = scanner.nextLine();
    System.out.print("Nim: ");
    String nim1 = scanner.nextLine();
    System.out.print("Jurusan  : ");
    String jurusan1 = scanner.nextLine();
    System.out.print("Alamat  : ");
    String alamat1 = scanner.nextLine();
    Mahasiswa mahasiswa1 = new Mahasiswa(nama1, nim1, jurusan1, alamat1);
    System.out.println();
    
    // input mhs 2
    System.out.println("Masukkan Data MHS Ke-2");
    System.out.print("Nama  : ");
    String nama2 = scanner.nextLine();
    System.out.print("Nim: ");
    String nim2 = scanner.nextLine();
    System.out.print("Jurusan  : ");
    String jurusan2 = scanner.nextLine();
    System.out.print("Alamat  : ");
    String alamat2 = scanner.nextLine();
    Mahasiswa mahasiswa2 = new Mahasiswa(nama2, nim2, jurusan2, alamat2);
    System.out.println();
    
    // input mhs 3
    System.out.println("Masukkan Data MHS Ke-3");
    System.out.print("Nama  : ");
    String nama3 = scanner.nextLine();
    System.out.print("Nim: ");
    String nim3 = scanner.nextLine();
    System.out.print("Jurusan  : ");
    String jurusan3 = scanner.nextLine();
    System.out.print("Alamat  : ");
    String alamat3 = scanner.nextLine();
    Mahasiswa mahasiswa3 = new Mahasiswa(nama3, nim3, jurusan3, alamat3);
    System.out.println();
    
    // Menampilkan informasi mahasiswa
        System.out.println("===== Data Mahasiswa =====");
        mahasiswa1.tampilkanMHS();
        mahasiswa2.tampilkanMHS();
        mahasiswa3.tampilkanMHS();
    }
    
}