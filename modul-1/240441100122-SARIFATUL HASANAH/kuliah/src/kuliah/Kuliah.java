/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kuliah;

import java.util.Scanner;

class mahasiswa {
    String nama;
    String nim;
    String prodi;
    String alamat;

    // constructur
    mahasiswa(String nama, String nim, String prodi, String alamat){
       this.nama = nama;
       this.nim = nim;
       this.prodi = prodi;
       this.alamat = alamat;
    }
    
    void tampilMahasiswa(){
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Prodi : " + prodi);
        System.out.println("Alamat : " + alamat);
        System.out.println("---------------------");
    }
}

public class Kuliah {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //mahasiswa 1
        System.out.println("Mahasiswa 1");
        System.out.print("Nama : ");
        String nama1 = scanner.nextLine();
        System.out.print("NIM : ");
        String nim1 = scanner.nextLine();
        System.out.print("Prodi : ");
        String prodi1 = scanner.nextLine();
        System.out.print("Alamat : ");
        String alamat1 = scanner.nextLine();
        
        mahasiswa mhs1 = new mahasiswa(nama1,nim1,prodi1, alamat1);
        
        //mahasiswa 2
        System.out.println("Mahasiswa 2");
        System.out.print("Nama : ");
        String nama2 = scanner.nextLine();
        System.out.print("NIM : ");
        String nim2 = scanner.nextLine();
        System.out.print("Prodi : ");
        String prodi2 = scanner.nextLine();
        System.out.print("Alamat : ");
        String alamat2 = scanner.nextLine();
        
        mahasiswa mhs2 = new mahasiswa(nama2,nim2,prodi2, alamat2);
        
        //mahasiswa 3
        System.out.println("Mahasiswa 3");
        System.out.print("Nama : ");
        String nama3 = scanner.nextLine();
        System.out.print("NIM : ");
        String nim3 = scanner.nextLine();
        System.out.print("Prodi : ");
        String prodi3 = scanner.nextLine();
        System.out.print("Alamat : ");
        String alamat3 = scanner.nextLine();
        
        mahasiswa mhs3 = new mahasiswa(nama3,nim3,prodi3, alamat3);
        
        System.out.println();
        //panggil abjek plus method
        System.out.println("****** Data Mahasiwa Trunojoyo ******");
        mhs1.tampilMahasiswa();
        mhs2.tampilMahasiswa();
        mhs3.tampilMahasiswa();
        
        scanner.close();
    }
}
