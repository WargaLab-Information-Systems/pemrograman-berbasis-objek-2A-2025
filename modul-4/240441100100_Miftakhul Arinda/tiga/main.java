/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiga;

/**
 *
 * @author Miftakhul Arinda
 */
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        klinik klinik = new klinik();
        int menu = -1;

        while (menu != 0) {
            System.out.println("\n--- MENU KLINIK ---");
            System.out.println("1. Tambah Pasien");
            System.out.println("2. Tampilkan Semua Pasien");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            menu = scanner.nextInt();
            scanner.nextLine();

            if (menu == 1) {
                System.out.print("Nama Pasien: ");
                String nama = scanner.nextLine();
                System.out.print("Umur: ");
                int umur = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Keluhan: ");
                String keluhan = scanner.nextLine();
                klinik.tambahPasien(new pasien(nama, umur, keluhan));
            } else if (menu == 2) {
                klinik.tampilkanSemuaPasien();
            } else if (menu != 0) {
                System.out.println("Pilihan tidak valid.");
            }
        }

        scanner.close();
        System.out.println("Program Klinik selesai.");
    }
}
