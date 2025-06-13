package Soal2;

import java.util.Scanner;

public class MainBooking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookingContext konteks = new BookingContext();

        System.out.print("Masukkan usia pengguna: ");
        int usia = scanner.nextInt();
        scanner.nextLine(); // membersihkan buffer input

        System.out.println("Pilih kendaraan yang ingin dipesan:");
        System.out.println("1. Mobil");
        System.out.println("2. Motor");
        System.out.println("3. Sepeda");
        System.out.print("Masukkan pilihan (1-3): ");
        int pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:
                konteks.setKendaraan(new Mobil());
                break;
            case 2:
                konteks.setKendaraan(new Motor());
                break;
            case 3:
                konteks.setKendaraan(new Sepeda());
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                scanner.close();
                return;
        }

        if (konteks.prosesBooking(usia)) {
            System.out.println("Booking berhasil.");
            konteks.tampilkanBiaya();
        } else {
            System.out.println("Booking gagal.");
        }

        scanner.close();
    }
}
