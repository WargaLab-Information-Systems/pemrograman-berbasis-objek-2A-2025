package Soal2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== SISTEM BOOKING KENDARAAN ===");
        System.out.println("1. Mobil");
        System.out.println("2. Motor");
        System.out.println("3. Sepeda");
        System.out.print("Pilih kendaraan (1-3): ");
        int pilihan = input.nextInt();

        System.out.print("Masukkan usia Anda: ");
        int usia = input.nextInt();

        Booking kendaraan;

        switch (pilihan) {
            case 1:
                kendaraan = new Mobil();
                break;
            case 2:
                kendaraan = new Motor();
                break;
            case 3:
                kendaraan = new Sepeda();
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                input.close();
                return;
        }

        kendaraan.prosesBooking(usia);
        input.close();
    }
}
