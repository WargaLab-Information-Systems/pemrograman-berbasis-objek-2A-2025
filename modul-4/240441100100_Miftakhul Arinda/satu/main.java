/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package satu;

/**
 *
 * @author Miftakhul Arinda
 */
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        bank bank = new bank();
        int menu = -1;

        while (menu != 0) {
            System.out.println("\n--- MENU BANK ---");
            System.out.println("1. Tambah Rekening");
            System.out.println("2. Setor");
            System.out.println("3. Tarik");
            System.out.println("4. Tampilkan Semua Rekening");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            menu = scanner.nextInt();
            scanner.nextLine();

            if (menu == 1) {
                System.out.print("No Rekening: ");
                String noRek = scanner.nextLine();
                System.out.print("Nama Pemilik: ");
                String nama = scanner.nextLine();
                System.out.print("Saldo Awal: ");
                double saldo = scanner.nextDouble();
                scanner.nextLine();
                bank.tambahRekening(new rekeningBank(noRek, nama, saldo));
            } else if (menu == 2) {
                System.out.print("No Rekening: ");
                String noRek = scanner.nextLine();
                System.out.print("Jumlah Setor: ");
                double jumlah = scanner.nextDouble();
                scanner.nextLine();
                bank.setor(noRek, jumlah);
            } else if (menu == 3) {
                System.out.print("No Rekening: ");
                String noRek = scanner.nextLine();
                System.out.print("Jumlah Tarik: ");
                double jumlah = scanner.nextDouble();
                scanner.nextLine();
                bank.tarik(noRek, jumlah);
            } else if (menu == 4) {
                bank.tampilSemuaRekening();
            } else if (menu != 0) {
                System.out.println("Pilihan tidak valid.");
            }
        }

        scanner.close();
        System.out.println("Program Bank selesai.");
    }
}