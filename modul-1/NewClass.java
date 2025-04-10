package javaapplication6;

import java.util.Scanner;
class mahasiswa {
    
    String nama;
    String alamat;
    String nim;
    String prodi;
    
    public mahasiswa(String nama, String alamat, String nim, String prodi) {
        this.nama = nama;
        this.alamat = alamat;
        this.nim = nim;
        this.prodi = prodi;
    } 
    public void datainputan() {
        System.out.println("Nama: " +nama);
        System.out.println("Alamat :" +alamat);
        System.out.println("NIM :" +nim);
        System.out.println("prodi :" +prodi);
        System.out.println(" "); 
    }
}
public class NewClass {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Input Data Mahasiswa 1");
        System.out.print("Masukkan Nama Mahasiswa: ");
        String nama1 = scanner.nextLine();
        System.out.print("Masukkan Alamat : ");
        String alamat1 = scanner.nextLine();
        System.out.print("Masukkan Prodi Mahasiswa: ");
        String prodi1 = scanner.nextLine();
        System.out.print("Masukkan NIM Mahasiswa: ");
        String nim1 = scanner.nextLine();
        
       mahasiswa objek1 = new mahasiswa(nama1,alamat1,nim1,prodi1 );
       
       System.out.println(""); 
       System.out.println("Input Data Mahasiswa 2");
        System.out.print("Masukkan Nama Mahasiswa: ");
        String nama2 = scanner.nextLine();
        System.out.print("Masukkan Alamat : ");
        String alamat2 = scanner.nextLine();
        System.out.print("Masukkan Prodi Mahasiswa: ");
        String prodi2 = scanner.nextLine();
        System.out.print("Masukkan NIM Mahasiswa: ");
        String nim2 = scanner.nextLine();
        
       mahasiswa objek2 = new mahasiswa(nama2,alamat2,nim2,prodi2 );
       
        System.out.println("");
        System.out.println("Input Data Mahasiswa 3");
        System.out.print("Masukkan Nama Mahasiswa: ");
        String nama3 = scanner.nextLine();
        System.out.print("Masukkan Alamat : ");
        String alamat3 = scanner.nextLine();
        System.out.print("Masukkan Prodi Mahasiswa: ");
        String prodi3 = scanner.nextLine();
        System.out.print("Masukkan NIM Mahasiswa: ");
        String nim3 = scanner.nextLine();
        
       mahasiswa objek3 = new mahasiswa(nama3,alamat3,nim3,prodi3 );
        System.out.println(" ");
        System.out.println("Data Inputan : ");
        objek1.datainputan();
        objek2.datainputan();
        objek3.datainputan();
       
    }
}