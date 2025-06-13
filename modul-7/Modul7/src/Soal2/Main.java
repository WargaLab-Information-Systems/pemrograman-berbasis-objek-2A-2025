package Soal2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean ulang = true;

        System.out.println("=== SISTEM BOOKING KENDARAAN BANG JAKA ===");

        while (ulang) {
            System.out.print("\nMasukkan nama Anda: ");
            String namaUser = scanner.nextLine();

            System.out.print("Masukkan usia Anda: ");
            int usia = scanner.nextInt();
            scanner.nextLine(); // membersihkan newline

            if (usia <= 0) {
                System.out.println("Usia tidak valid.");
                continue; // kembali ke input ulang
            }

            // Tampilkan menu sesuai usia
            System.out.println("\nPilih jenis kendaraan yang ingin dibooking:");
            if (usia <= 17) {
                System.out.println("1. Sepeda");
            } else if (usia >= 18 && usia < 21) {
                System.out.println("1. Motor");
                System.out.println("2. Sepeda");
            } else { // usia >= 21
                System.out.println("1. Mobil");
                System.out.println("2. Motor");
                System.out.println("3. Sepeda");
            }

            System.out.print("Pilihan Anda: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // membersihkan newline

            Kendaraan kendaraan = null;

            // Proses pilihan sesuai batasan usia
            if (usia <= 17) {
                if (pilihan == 1) {
                    kendaraan = new Sepeda("Polygon Cascade", 50000);
                } else {
                    System.out.println("Pilihan tidak valid untuk usia Anda.");
                    continue;
                }
            } else if (usia > 17 && usia < 21) {
                if (pilihan == 1) {
                    kendaraan = new Motor("Yamaha NMax", 150000);
                } else if (pilihan == 2) {
                    kendaraan = new Sepeda("Polygon Cascade", 50000);
                } else {
                    System.out.println("Pilihan tidak valid untuk usia Anda.");
                    continue;
                }
            } else { 
                if (pilihan == 1) {
                    kendaraan = new Mobil("Toyota Avanza", 300000);
                } else if (pilihan == 2) {
                    kendaraan = new Motor("Yamaha NMax", 150000);
                } else if (pilihan == 3) {
                    kendaraan = new Sepeda("Polygon Cascade", 50000);
                } else {
                    System.out.println("Pilihan tidak valid.");
                    continue;
                }
            }

            // Tampilkan info kendaraan
            System.out.println();
            kendaraan.tampilkanInfo();

            // Proses booking
            System.out.print("Masukkan durasi booking (dalam hari): ");
            int durasi = scanner.nextInt();
            scanner.nextLine(); // membersihkan newline

            Booking booking = (Booking) kendaraan;
            booking.prosesBooking(durasi);
            double biayaTotal = booking.hitungBiaya(durasi);

            System.out.println("Total biaya: Rp" + biayaTotal);

            // Apakah ingin ulang
            System.out.print("\nApakah Anda ingin melakukan booking lagi? (y/n): ");
            String jawab = scanner.nextLine();

            if (!jawab.equalsIgnoreCase("y")) {
                ulang = false;
                System.out.println("Terima kasih telah menggunakan layanan booking kendaraan.");
            }
        }

        scanner.close();
    }
}
