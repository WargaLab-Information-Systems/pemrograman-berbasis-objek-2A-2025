
package no3;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Klinik klinik = new Klinik();

        while (true) {
            System.out.println("\n=== MENU KLINIK ===");
            System.out.println("1. Tambah Pasien");
            System.out.println("2. Tampilkan Semua Pasien");
            System.out.println("3. Keluar");
            System.out.print("Pilih: ");
            int pilihan = input.nextInt();
            input.nextLine();

            if (pilihan == 1) {
                System.out.print("Nama: ");
                String nama = input.nextLine();
                System.out.print("Umur: ");
                int umur = input.nextInt();
                input.nextLine();
                System.out.print("Keluhan: ");
                String keluhan = input.nextLine();
                klinik.tambahPasien(new Pasien(nama, umur, keluhan));
            } else if (pilihan == 2) {
                klinik.tampilkanSemuaPasien();
            } else if (pilihan == 3) {
                System.out.println("Keluar dari sistem klinik.");
                break;
            } else {
                System.out.println("Pilihan tidak valid.");
            }
        }
    }
}