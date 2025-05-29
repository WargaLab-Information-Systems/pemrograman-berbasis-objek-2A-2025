/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal2;

/**
 *
 * @author Miftakhul Arinda
 */
import java.util.Scanner;

public class MobilDinamis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManajemenMobil manajemen = new ManajemenMobil();

        boolean lanjut = true;

        while (lanjut) {
            System.out.println("\nPilih jenis mobil yang ingin ditambahkan:");
            System.out.println("1. Mobil Sport");
            System.out.println("2. Mobil Sedan");
            System.out.print("Pilihan (1/2): ");
            String pilihan = scanner.nextLine();

            if (pilihan.equals("1")) {
                manajemen.tambahMobil(new MobilSport());
                System.out.println("Mobil Sport ditambahkan.");
            } else if (pilihan.equals("2")) {
                manajemen.tambahMobil(new MobilSedan());
                System.out.println("Mobil Sedan ditambahkan.");
            } else {
                System.out.println("Pilihan tidak valid.");
                continue;
            }

            System.out.print("Apakah ingin menambahkan mobil lagi? (y/n): ");
            String jawaban = scanner.nextLine();
            if (!jawaban.equalsIgnoreCase("y")) {
                lanjut = false;
            }
        }

        System.out.println("\nMenjalankan semua mobil yang telah ditambahkan:");
        manajemen.operasikanSemuaMobil();
        scanner.close();
    }
}
