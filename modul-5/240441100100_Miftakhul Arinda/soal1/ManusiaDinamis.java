/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal1;

/**
 *
 * @author Miftakhul Arinda
 */
import java.util.Scanner;

public class ManusiaDinamis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean lanjut = true;

        while (lanjut) {
            System.out.println("\nPilih orang:");
            System.out.println("1. Joko");
            System.out.println("2. Beni");
            System.out.println("3. Fani");
            System.out.println("4. Jani");
            System.out.print("Pilihan (1-4): ");
            int pilihan = Integer.parseInt(scanner.nextLine());

            Manusia manusia = null;

            if (pilihan == 1) {
                manusia = new Joko();
            } else if (pilihan == 2) {
                manusia = new Beni();
            } else if (pilihan == 3) {
                manusia = new Fani();
            } else if (pilihan == 4) {
                manusia = new Jani();
            } else {
                System.out.println("Pilihan tidak valid.");
                continue; 
            }

            manusia.berbicara();
            manusia.bekerja();
            manusia.makan();

            System.out.println("\nApakah ingin memilih lagi? (y/n): ");
            String jawaban = scanner.nextLine();
            if (!jawaban.equalsIgnoreCase("y")) {
                lanjut = false;
            }
        }

        System.out.println("Terima kasih!");
        scanner.close();
    }
}
