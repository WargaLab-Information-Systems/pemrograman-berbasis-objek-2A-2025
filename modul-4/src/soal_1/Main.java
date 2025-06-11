/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal_1;

import java.util.Scanner;
public class Main {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah rekening yang akan dibuat: ");
        int jumlah = input.nextInt();
        input.nextLine();

        Bank bank = new Bank(jumlah);

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nInput data rekening ke-" + (i + 1));
            RekeningBank rekening = new RekeningBank();

            System.out.print("No Rekening     : ");
            rekening.setNoRek(input.nextLine());

            System.out.print("Nama Pemilik    : ");
            rekening.setNamaPemilik(input.nextLine());

            System.out.print("Saldo Awal      : ");
            rekening.setSaldo(input.nextDouble());
            input.nextLine();

            bank.tambahRekening(rekening);
        }

        boolean lanjut = true;
        while (lanjut) {
            System.out.println("\n=== Menu Transaksi ===");
            System.out.println("1. Setor");
            System.out.println("2. Tarik");
            System.out.println("3. Tampilkan semua rekening");
            System.out.println("4. Keluar");
            System.out.print("Pilihan: ");
            int pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan no rekening: ");
                    String norekSetor = input.nextLine();
                    RekeningBank rekSetor = bank.cariRekening(norekSetor);
                    if (rekSetor != null) {
                        System.out.print("Jumlah setor: ");
                        double jmlSetor = input.nextDouble();
                        input.nextLine();
                        rekSetor.setor(jmlSetor);
                        System.out.println("Setoran berhasil.");
                    } else {
                        System.out.println("Rekening tidak ditemukan.");
                    }
                    break;
                case 2:
                    System.out.print("Masukkan no rekening: ");
                    String norekTarik = input.nextLine();
                    RekeningBank rekTarik = bank.cariRekening(norekTarik);
                    if (rekTarik != null) {
                        System.out.print("Jumlah tarik: ");
                        double jmlTarik = input.nextDouble();
                        input.nextLine();
                        if (rekTarik.tarik(jmlTarik)) {
                            System.out.println("Penarikan berhasil.");
                        } else {
                            System.out.println("Saldo tidak mencukupi atau jumlah tidak valid.");
                        }
                    } else {
                        System.out.println("Rekening tidak ditemukan.");
                    }
                    break;
                case 3:
                    bank.tampilkanSemuaRekening();
                    break;
                case 4:
                    lanjut = false;
                    System.out.println("Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }

        input.close();
    }
}