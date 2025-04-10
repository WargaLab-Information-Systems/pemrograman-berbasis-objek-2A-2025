/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jawaban2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input data untuk masing-masing mahasiswa
        System.out.println("Masukkan data mahasiswa Hogwarts:");
        System.out.print("Nama: ");
        String nama1 = input.nextLine();
        System.out.print("NIM: ");
        String nim1 = input.nextLine();
        System.out.print("Jurusan: ");
        String jurusan1 = input.nextLine();
        System.out.print("Alamat: ");
        String alamat1 = input.nextLine();
        Mahasiswa mahasiswa1 = new Mahasiswa(nama1, nim1, jurusan1, alamat1);
        System.out.println();

        System.out.println("Masukkan data mahasiswa Hogwarts:");
        System.out.print("Nama: ");
        String nama2 = input.nextLine();
        System.out.print("NIM: ");
        String nim2 = input.nextLine();
        System.out.print("Jurusan: ");
        String jurusan2 = input.nextLine();
        System.out.print("Alamat: ");
        String alamat2 = input.nextLine();
        Mahasiswa mahasiswa2 = new Mahasiswa(nama2, nim2, jurusan2, alamat2);
        System.out.println();

        System.out.println("Masukkan data mahasiswa Hogwarts:");
        System.out.print("Nama: ");
        String nama3 = input.nextLine();
        System.out.print("NIM: ");
        String nim3 = input.nextLine();
        System.out.print("Jurusan: ");
        String jurusan3 = input.nextLine();
        System.out.print("Alamat: ");
        String alamat3 = input.nextLine();
        Mahasiswa mahasiswa3 = new Mahasiswa(nama3, nim3, jurusan3, alamat3);
        System.out.println();

        // Menampilkan data mahasiswa
        System.out.println("Data Mahasiswa Hogwarts:");
        mahasiswa1.tampilkanData();
        mahasiswa2.tampilkanData();
        mahasiswa3.tampilkanData();

        input.close();
    }
}
