/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal1;
import java.util.Scanner;
/**
 *
 * @author Ray_mark
 */
public class Soal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       payment Payment;
       
         while (true) {
            System.out.print("\nMasukkan jumlah pembayaran: Rp");
            double amount = scanner.nextDouble();

            System.out.println("\nPilih metode pembayaran:");
            System.out.println("1. Tunai");
            System.out.println("2. Kartu Kredit");
            System.out.println("3. E-Wallet");
            System.out.println("0. Keluar");

            System.out.print("Pilihan Anda: ");
            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("Terima kasih! Program selesai.");
                break;
            }

            switch (choice) {
                case 1:
                    Payment = new cashPayment();
                    break;
                case 2:
                    Payment = new cardPayment();
                    break;
                case 3:
                    Payment = new Ewallet();
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    continue;
            }

            Payment.bayar(amount);
        }
    }
}
