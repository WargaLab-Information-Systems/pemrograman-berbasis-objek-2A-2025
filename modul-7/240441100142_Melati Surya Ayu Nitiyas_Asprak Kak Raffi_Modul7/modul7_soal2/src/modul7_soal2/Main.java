package modul7_soal2;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("=== Sistem Pemesanan Kendaraan ===");
            
            while (true) {
                System.out.println("\nMenu:");
                System.out.println("1. Pesan Mobil");
                System.out.println("2. Pesan Motor");
                System.out.println("3. Pesan Sepeda");
                System.out.println("0. Keluar");
                System.out.print("Pilih kendaraan: ");
                
                int pilihan;
                // Tangani input non-angka
                if (scanner.hasNextInt()) {
                    pilihan = scanner.nextInt();
                } else {
                    System.out.println("Input tidak valid, masukkan angka.");
                    scanner.next(); // buang input yang salah
                    continue;
                }
                
                if (pilihan == 0) {
                    System.out.println("Terima kasih. Program selesai.");
                    break;
                }
                
                try {
                    Kendaraan kendaraan = PabrikKendaraan.ambilKendaraan(pilihan);
                    
                    System.out.print("Masukkan usia Anda: ");
                    int usia = scanner.nextInt();
                    
                    System.out.print("Masukkan lama pemesanan (hari): ");
                    int durasi = scanner.nextInt();
                    
                    kendaraan.pesan(usia, durasi);
                    
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                } catch (Exception e) {
                    System.out.println("Terjadi kesalahan: " + e.getMessage());
                    scanner.nextLine(); // membersihkan buffer input
                }
            }
        }
    }
}
