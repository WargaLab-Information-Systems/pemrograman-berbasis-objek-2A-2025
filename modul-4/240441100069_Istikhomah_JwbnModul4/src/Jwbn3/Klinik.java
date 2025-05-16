/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Jwbn3;

/**
 *
 * @author istikhomah
 */
public class Klinik {
   private Pasien[] daftarPasien = new Pasien[100];
   private int jumlahPasien = 0;
   
   public void tambahPasien(Pasien pasien){
       if (jumlahPasien < daftarPasien.length) {
           daftarPasien[jumlahPasien] = pasien;
           jumlahPasien++;
           System.out.println("Pasien berhasil ditambahkan!\n");    
       } else {
           System.out.println("Penyimpanan penuh, tidak bisa menambahkan Pasien lagi.");
       }
   }
   
   public void tampilkanDaftarPasien(){
       if (jumlahPasien == 0) {
           System.out.println("Belum ada pasien dalam Klinik");  
       } else {
           System.out.println("\n=== Daftar Pasien di Klinik ===");
           for (int i = 0; i < jumlahPasien; i++) {
               System.out.println("Nama         : " + daftarPasien[i].getNama());
               System.out.println("Umur         : " + daftarPasien[i].getUmur());
               System.out.println("Keluhan      : " + daftarPasien[i].getKeluhan());
               System.out.println("-----------------------------------");
           }
       }
   }
}
