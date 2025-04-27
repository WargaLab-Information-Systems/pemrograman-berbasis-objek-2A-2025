package com.mycompany.modulduwa;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mahasiswa {
    public String nama;
    public String nim;
    public String prodi;
    public List<String> daftarmatkul = new ArrayList<>();
    public static int totalMahasiswa = 0;
    
    public Mahasiswa(Scanner scanner){
        System.out.println("============= Input data ===============");
        System.out.print("masukkan nama : ");
        this.nama = scanner.nextLine();
        
        System.out.print("masukkan nim :");
        this.nim = scanner.nextLine();
        while (!methodCekNim(this.nim)) {
            System.out.println("NIM tidak valid! Harus diawali '23' dan 10 digit.");
            System.out.print("Masukkan NIM lagi: ");
            this.nim = scanner.nextLine();
        }
        
        System.out.print("masukkan prodi:");
        this.prodi = scanner.nextLine();
        
        System.out.println("masukkan tambah daftar matkul:");
        int count = 0;
        while (count < 4) {
        System.out.print("Mata Kuliah ke-" + (count + 1) + ": "); //biar jadi string
        String m = scanner.nextLine();
        if (!m.trim().isEmpty()) { //menghapus spasi dan menyalahkan variabel kosong
            this.daftarmatkul.add(m);
            count++;
            } else {
            System.out.println(" Mata kuliah tidak boleh kosong.");
            }
        }    
        
        totalMahasiswa++;
    }
    
    public static boolean methodCekNim(String NIM) {
        return NIM.matches("^23\\d{8}$");
}
    public void tambahMatkul(Scanner input) {
        System.out.print("Masukkan Mata Kuliah baru: ");
        System.out.print("Masukkan Mata kuliah baru (skip bila gak ingin menambah)");
        String m = input.nextLine();
        if (m.isEmpty()){
            System.out.println("Tidak ada mata kuliah yang ditambahkan");
       }else{
            this.daftarmatkul.add(m);
            System.out.println("Matkul Berhasil ditambahkan");
        }
    
    }
    
    public void tampilkan(){
        System.out.println("========== Data Ditampilan ===========");
        System.out.println("nama :" + nama);
        System.out.println("nim :" + nim);
        System.out.println("Prodi :"  + prodi);
        System.out.println("Daftar Mata Kuliah : ");
        for (String m : daftarmatkul) 
            System.out.println("- " + m);
        System.out.println("=======================================");
    }
    public static void jumlahTotalMahasiswa() {
        System.out.println("\nTOTAL MAHASISWA YANG DI BUAT : " + totalMahasiswa);
    }
}
