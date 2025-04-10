/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package data_mahasiswa;

import java.util.Scanner;

class mahasiswa {
    String nama;
    String nim;
    String prodi;
    String alamat;

    // Constructor
    mahasiswa(String nama, String nim, String prodi, String alamat){
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.alamat = alamat;
    }

    void tampilkan(){
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Prodi : " + prodi);
        System.out.println("Alamat : " + alamat);
        System.out.println();
    }
}

public class Data_mahasiswa {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // Mahasiswa 1
        System.out.println("Mahasiswa 1");
        System.out.print("Nama : ");
        String nama1 = scan.nextLine();
        System.out.print("NIM : ");
        String nim1 = scan.nextLine();
        System.out.print("Prodi : ");
        String prodi1 = scan.nextLine();
        System.out.print("Alamat : ");
        String alamat1 = scan.nextLine();

        mahasiswa mhs1 = new mahasiswa(nama1, nim1, prodi1, alamat1);

        // Mahasiswa 2
        System.out.println("Mahasiswa 2");
        System.out.print("Nama : ");
        String nama2 = scan.nextLine();
        System.out.print("NIM : ");
        String nim2 = scan.nextLine();
        System.out.print("Prodi : ");
        String prodi2 = scan.nextLine();
        System.out.print("Alamat : ");
        String alamat2 = scan.nextLine();

        mahasiswa mhs2 = new mahasiswa(nama2, nim2, prodi2, alamat2);

        // Mahasiswa 3
        System.out.println("Mahasiswa 3");
        System.out.print("Nama : ");
        String nama3 = scan.nextLine();
        System.out.print("NIM : ");
        String nim3 = scan.nextLine();
        System.out.print("Prodi : ");
        String prodi3 = scan.nextLine();
        System.out.print("Alamat : ");
        String alamat3 = scan.nextLine();

        mahasiswa mhs3 = new mahasiswa(nama3, nim3, prodi3, alamat3);

        // Menampilkan data
        System.out.println("\n********* Data Mahasiswa Trunojoyo *********");
        mhs1.tampilkan();
        mhs2.tampilkan();
        mhs3.tampilkan();
        
       
    }
}