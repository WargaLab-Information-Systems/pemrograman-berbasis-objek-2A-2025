package Soal1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Bank bank = new Bank();  

        int pilihan;
        do {
            System.out.println("\n=== MENU BANK ===");
            System.out.println("1. Tambah Rekening");
            System.out.println("2. Setor Uang");
            System.out.println("3. Tarik Uang");
            System.out.println("4. Lihat Semua Rekening");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilihan = input.nextInt();
            input.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("No Rekening: ");
                    String noRek = input.nextLine();
                    System.out.print("Nama Pemilik: ");
                    String nama = input.nextLine();
                    System.out.print("Saldo Awal: ");
                    double saldo = input.nextDouble();
                    bank.tambahRekening(noRek, nama, saldo);
                    break;
                case 2:
                    System.out.print("Masukkan No Rekening: ");
                    String noSetor = input.nextLine();
                    System.out.print("Jumlah Setor: ");
                    double jSetor = input.nextDouble();
                    bank.setor(noSetor, jSetor);
                    break;
                case 3:
                    System.out.print("Masukkan No Rekening: ");
                    String noTarik = input.nextLine();
                    System.out.print("Jumlah Tarik: ");
                    double jTarik = input.nextDouble();
                    bank.tarik(noTarik, jTarik);
                    break;
                case 4:
                    bank.tampilSemuaRekening();
                    break;
                case 5:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 5);

        input.close();
    }
}
