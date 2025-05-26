/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal1;
import java.util.Scanner;
/**
 *
 * @author wingd
 */
public class Soal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan = 0;

        System.out.println("Pilih karakter:");
        System.out.println("1. Joko");
        System.out.println("2. Beni");
        System.out.println("3. Fani");
        System.out.println("4. Jani");
        System.out.println("0. Keluar");

        while (true) {
            System.out.print("Masukkan pilihan (1-4), atau 0 untuk keluar: ");
            pilihan = scanner.nextInt();

            if (pilihan == 0) {
                System.out.println("Program selesai.");
                break;
            }

            Manusia manusia;

            switch (pilihan) {
                case 1:
                    manusia = new Joko();
                    break;
                case 2:
                    manusia = new Beni();
                    break;
                case 3:
                    manusia = new Fani();
                    break;
                case 4:
                    manusia = new Jani();
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    continue;
            }

            // Menjalankan aksi
            manusia.berbicara();
            manusia.berkerja();
            manusia.makan();
            System.out.println("-----");
        }

    }
}
