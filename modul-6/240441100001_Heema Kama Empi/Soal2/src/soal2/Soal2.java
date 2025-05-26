/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal2;
import java.util.Scanner;
/**
 *
 * @author wingd
 */
public class Soal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManajemenMobil manajemen = new ManajemenMobil();
        int pilihan;

        System.out.println("Pilih jenis mobil:");
        System.out.println("1. Mobil Sport");
        System.out.println("2. Mobil Sedan");
        System.out.println("0. Selesai dan operasikan semua mobil");
//
        while (true) {
            System.out.print("Masukkan pilihan (1/2/0): ");
            pilihan = scanner.nextInt();

            if (pilihan == 0) {
                break;
            }

            switch (pilihan) {
                case 1:
                    manajemen.tambahMobil(new MobilSport());
                    break;
                case 2:
                    manajemen.tambahMobil(new MobilSedan());
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }

        System.out.println("\n=== Proses Pengoperasian Semua Mobil ===");
        manajemen.Operasikan_semua_mobil();

    }
}

