/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas3;

public class Main {
    public static void main(String[] args) {
        Klinik klinik = new Klinik(8); 

        klinik.tambahPasien(new Pasien("Alfia", 20, "Demam"));
        klinik.tambahPasien(new Pasien("Novi", 23, "Sakit Kepala"));
        klinik.tambahPasien(new Pasien("Alivia", 25, "Sakit hati"));

        System.out.println("\nDaftar Pasien di Klinik:");
        klinik.tampilkanDaftarPasien();
    }
}

