package com.mycompany.modulduwa;
import java.util.Scanner;

public class Kampus {   
    public String namaKampus;
    public String alamatKampus;
    public int totalMahasiswa;


    public Kampus(Scanner input) {
        System.out.print("Masukkan nama kampus (tidak boleh mengandung angka): ");
        String inputNama = input.nextLine();

        
        while (!isNamaKampusValid(inputNama)) {
            System.out.println(" Nama kampus tidak valid (tidak boleh ada angka).");
            System.out.print("Masukkan nama kampus lagi: ");
            inputNama = input.nextLine();
        }
        this.namaKampus = inputNama;

        System.out.print("Masukkan alamat kampus: ");
        this.alamatKampus = input.nextLine();

        System.out.print("Masukkan jumlah total mahasiswa: ");
        while (!input.hasNextInt()) {
            System.out.println(" Jumlah mahasiswa harus berupa angka.");
            System.out.print("Masukkan jumlah total mahasiswa lagi: ");
            input.next(); // buang input yang salah
        }
        this.totalMahasiswa = input.nextInt();
        input.nextLine(); // membersihkan newline
    }

    
    public void tampilkanInfoKampus() {
        System.out.println("====== Informasi Kampus ======");
        System.out.println("Nama Kampus     : " + namaKampus);
        System.out.println("Alamat Kampus   : " + alamatKampus);
        System.out.println("Total Mahasiswa : " + totalMahasiswa);
    }

   
    public static boolean isNamaKampusValid(String nama) {
        return nama != null && !nama.matches(".*\\d.*");
    }
}


