/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal3;
import java.util.ArrayList;
/**
 *
 * @author wingd
 */
public class Klinik {
    private ArrayList<Pasien> daftarPasien;
    
    public Klinik() {
        daftarPasien = new ArrayList<>();
    }
    
    // Method menambahkan pasien baru
    public void tambahPasien(Pasien pasien) {
        daftarPasien.add(pasien);
        System.out.println("Pasien " + pasien.getNama() + " berhasil ditambahkan.");
    }
    
    // menampilkan semua pasien
    public void tampilkanSemuaPasien() {
        if (daftarPasien.isEmpty()) {
            System.out.println("Belum ada pasien terdaftar.");
        } else {
            System.out.println("\nDaftar Pasien Klinik:");
            System.out.println("=======================");
            for (Pasien pasien : daftarPasien) {
                System.out.println("Nama: " + pasien.getNama());
                System.out.println("Umur: " + pasien.getUmur());
                System.out.println("Keluhan: " + pasien.getKeluhan());
                System.out.println("-----------------------");
            }
        }
    }
    
    // Method mendapatkan jumlah pasien
    public int getJumlahPasien() {
        return daftarPasien.size();
    }
}
