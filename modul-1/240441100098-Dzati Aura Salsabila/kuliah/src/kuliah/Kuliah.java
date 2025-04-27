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
    
    //constructure
    mahasiswa(String nama, String nim, String prodi, String alamat) {
       this.nama = nama;
       this.nim = nim;
       this.prodi = prodi;
       this.alamat = alamat;
    }
    
    void tampilMahasiswa() {
        System.out.println("Nama : " + nama);
        System.out.println("Nim : " + nim);
        System.out.println("Prodi : " + prodi);
        System.out.println("Alamat : " + alamat);
        System.out.println("********************");
    }
}

public class Kuliah {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //mahasiswa1
        System.out.println("Mahasiswa Pertama");
        System.out.print("Nama : ");
        String nama1 = input.nextLine();
        System.out.print("NIM : ");
        String nim1 = input.nextLine();
        System.out.print("Prodi : ");
        String prodi1 = input.nextLine();
        System.out.print("Alamat : ");
        String alamat1 = input.nextLine();
        
        mahasiswa Mhs1 = new mahasiswa (nama1, nim1, prodi1, alamat1);
        
         //mahasiswa2
        System.out.println("Mahasiswa Kedua");
        System.out.print("Nama : ");
        String nama2 = input.nextLine();
        System.out.print("NIM : ");
        String nim2 = input.nextLine();
        System.out.print("Prodi : ");
        String prodi2 = input.nextLine();
        System.out.print("Alamat : ");
        String alamat2 = input.nextLine();
        
        mahasiswa Mhs2 = new mahasiswa (nama2, nim2, prodi2, alamat2);
        
         //mahasiswa3
        System.out.println("Mahasiswa Ketiga");
        System.out.print("Nama : ");
        String nama3 = input.nextLine();
        System.out.print("NIM : ");
        String nim3 = input.nextLine();
        System.out.print("Prodi : ");
        String prodi3 = input.nextLine();
        System.out.print("Alamat : ");
        String alamat3 = input.nextLine();
        
        mahasiswa Mhs3 = new mahasiswa (nama3, nim3, prodi3, alamat3);
        
        System.out.println();
        //manggil object dan method
        System.out.println("____ Data Mahasiswa Trunojoyo ____");
        Mhs1.tampilMahasiswa();
        Mhs2.tampilMahasiswa();
        Mhs3.tampilMahasiswa();
        
        input.close();
    }
}
