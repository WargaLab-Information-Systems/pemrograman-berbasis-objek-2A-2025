
package no1;
import java.util.Scanner;
public class main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Bank bank = new Bank();

        while (true) {
            System.out.println("\n=== MENU BANK ===");
            System.out.println("1. Tambah Rekening");
            System.out.println("2. Setor");
            System.out.println("3. Tarik");
            System.out.println("4. Tampilkan Semua Rekening");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            int pilihan = input.nextInt();
            input.nextLine(); // flush newline

            if (pilihan == 1) {
                System.out.print("No Rekening: ");
                String no = input.nextLine();
                System.out.print("Nama Pemilik: ");
                String nama = input.nextLine();
                System.out.print("Saldo Awal: ");
                double saldo = input.nextDouble();
                bank.tambahRekening(new RekeningBank(no, nama, saldo));
            } else if (pilihan == 2) {
                System.out.print("No Rekening: ");
                String norekSetor = input.nextLine();
                RekeningBank rekSetor = bank.cariRekening(norekSetor);
                if (rekSetor != null) {
                    System.out.print("Jumlah Setor: ");
                    double jml = input.nextDouble();
                    rekSetor.setor(jml);
                } else {
                    System.out.println("Rekening tidak ditemukan!");
                }
            } else if (pilihan == 3) {
                System.out.print("No Rekening: ");
                String norekTarik = input.nextLine();
                RekeningBank rekTarik = bank.cariRekening(norekTarik);
                if (rekTarik != null) {
                    System.out.print("Jumlah Tarik: ");
                    double jml = input.nextDouble();
                    rekTarik.tarik(jml);
                } else {
                    System.out.println("Rekening tidak ditemukan!");
                }
            } else if (pilihan == 4) {
                bank.tampilkanSemuaRekening();
            } else if (pilihan == 5) {
                System.out.println("Terima kasih!");
                break;
            } else {
                System.out.println("Pilihan tidak valid.");
            }
        }
    }
}