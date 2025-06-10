package soal2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\n---< Sistem Booking Kendaraan >---");
            System.out.println("Pilih kendaraan:");
            System.out.println("1. Mobil");
            System.out.println("2. Motor");
            System.out.println("3. Sepeda");
            System.out.print("Pilih opsi: ");
            int opsi = input.nextInt();
            input.nextLine();

            Booking booking;
            String jenis;
            if (opsi == 1) {
                booking = new Mobil();
                jenis = "Mobil";
            } else if (opsi == 2) {
                booking = new Motor();
                jenis = "Motor";
            } else if (opsi == 3) {
                booking = new Sepeda();
                jenis = "Sepeda";
            } else {
                System.out.println("Opsi tidak valid.");
                continue;
            }

            System.out.print("Masukkan nama Anda: ");
            String nama = input.nextLine();

            System.out.print("Masukkan usia Anda: ");
            int usia = input.nextInt();
            input.nextLine();

            System.out.print("Berapa lama sewa (dalam hari)? ");
            int hariSewa = input.nextInt();
            input.nextLine();
            
            boolean berhasil = booking.prosesBooking(nama, usia);
            if (!berhasil) {
                System.out.println("Booking gagal, coba lagi.");
                continue;
            }

            double total = booking.hitungBiaya(hariSewa);

            System.out.println("\n---< Ringkasan Booking >---");
            System.out.println("Nama: " + nama);
            System.out.println("Usia: " + usia);
            System.out.println("Jenis : " + jenis);
            System.out.println("Durasi Sewa: " + hariSewa + " hari");
            if (opsi != 3){
                System.out.println("Total Biaya (termasuk asuransi): Rp. " + total);
            }else{
                System.out.println("Total Biaya : Rp. " + total);
            }

            System.out.print("\nIngin booking lagi? (y/n): ");
            String lagi = input.nextLine();
            if (!lagi.equalsIgnoreCase("y")) {
                break;
            }
        }

        System.out.println("Terima kasih telah menggunakan layanan booking.");
    }
}
