
package javaapplication11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\nbuatrekening");
        roko rekening1 = new roko(input);
        
        System.out.println("-------------------------------");
        rekening1.tampilkan();
        System.out.println("-------------------------------");

        rekening1.tambahsaldo(input);

        System.out.println("\nsaldo terbaru");
        rekening1.tampilkan();
        System.out.println("");

        rekening1.tariksaldo(input);

        System.out.println("\nsaldo terbaru");
        rekening1.tampilkan();
        System.out.println("");
        
        bank Bank = new bank();
        Bank.tambahRekening(rekening1);


        System.out.print("Mau bikin rekening baru? (ya/tidak): ");
        String inpJawaban = input.nextLine().toLowerCase();
        
        if (jawaban.equals(inpJawaban = "y")) {
            System.out.println("\nBuat Rekening Baru");
            roko rekeningBaru = new roko(input);

            rekeningBaru.tambahsaldo(input);
            System.out.println("\nUpdate saldo");
            rekeningBaru.tampilkan();

            rekeningBaru.tariksaldo(input);
            System.out.println("\nUpdate saldo");
            rekeningBaru.tampilkan();

            Bank.tambahRekening(rekeningBaru);
            System.out.println("");

            System.out.println("Rekening baru berhasil dibuat");
        } else {
            System.out.println("Tidak membuat rekening baru");
        }   
        System.out.println("Terimakasih atas kepercayaan anda");
        Bank.tampilkanSemuaRekening();

     
    }
}