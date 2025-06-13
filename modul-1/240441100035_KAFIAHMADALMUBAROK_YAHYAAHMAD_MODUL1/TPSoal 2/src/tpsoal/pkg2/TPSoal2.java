/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tpsoal.pkg2;
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
    
    void DataMahasiswa() {
        System.out.println("Nama: " + nama);
        System.out.println("Nim: " + nim);
        System.out.println("Jurusan: " + jurusan);
        System.out.println("Alamat: " + alamat);
    }
}

public class TPSoal2 {
    public static void main(String[] args) {
        try ( // TODO code application logic here
        java.util.Scanner input = new Scanner(System.in)) {
            // Mahasiswa 1
            System.out.println("Mahasiswa 1:");
            System.out.print("Nama: ");
            String nama1 = input.nextLine();
            System.out.print("Nim: ");
            String nim1 = input.nextLine();
            System.out.print("Jurusan: ");
            String jurusan1 = input.nextLine();
            System.out.print("Alamat: ");
            String alamat1 = input.nextLine();
            Mahasiswa mhs1 = new Mahasiswa(nama1, nim1, jurusan1, alamat1);
            
            // Mahasiswa 2
            System.out.println("\nMahasiswa 2:");
            System.out.print("Nama: ");
            String nama2 = input.nextLine();
            System.out.print("Nim: ");
            String nim2 = input.nextLine();
            System.out.print("Jurusan: ");
            String jurusan2 = input.nextLine();
            System.out.print("Alamat: ");
            String alamat2 = input.nextLine();
            Mahasiswa mhs2 = new Mahasiswa(nama2, nim2, jurusan2, alamat2);
            
            // Mahasiswa 3
            System.out.println("\nMahasiswa 3:");
            System.out.print("Nama: ");
            String nama3 = input.nextLine();
            System.out.print("Nim: ");
            String nim3 = input.nextLine();
            System.out.print("Jurusan: ");
            String jurusan3 = input.nextLine();
            System.out.print("Alamat: ");
            String alamat3 = input.nextLine();
            Mahasiswa mhs3 = new Mahasiswa(nama3, nim3, jurusan3, alamat3);
            
            // Tampilkan data
            System.out.println("\nData Mahasiswa:");
            mhs1.DataMahasiswa();
            mhs2.DataMahasiswa();   
            mhs3.DataMahasiswa();
        }
    }
}