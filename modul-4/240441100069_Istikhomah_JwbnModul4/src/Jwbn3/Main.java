/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Jwbn3;

/**
 *
 * @author istikhomah
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Klinik klinik = new Klinik();
        
        System.out.print("Berapa jumlah pasien yang ingin ditambahkan? ");
        int jumlah = input.nextInt();
        input.nextLine();
        
        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nData Pasien ke-" + (i + 1));
            System.out.print("Nama        : ");
            String nama = input.nextLine();
            System.out.print("umur        : ");
            int umur = input.nextInt();
            input.nextLine();
            System.out.print("Keluhan     : ");
            String keluhan = input.nextLine();
           
            // buat objek Pasien dan mengisi setter
            Pasien pasien = new Pasien();
            pasien.setNama(nama);
            pasien.setUmur(umur);
            pasien.setKeluhan(keluhan);
            
            //tambah ke klinik
            klinik.tambahPasien(pasien);     
        }
        //menampilkan semua pasien
        klinik.tampilkanDaftarPasien();
    }           
}
