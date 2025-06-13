package modul7_soal1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("=== Sistem Pembayaran ===");
            System.out.print("Masukkan jumlah pembayaran: ");
            double jumlah = scanner.nextDouble();
            
            int pilihan = 0;
            do {
                System.out.println("\nPilih metode pembayaran:");
                System.out.println("1. Tunai");
                System.out.println("2. Kartu Kredit");
                System.out.println("3. E-Wallet");
                System.out.println("0. Keluar");
                System.out.print("Masukkan pilihan: ");
                pilihan = scanner.nextInt();
                
                if (pilihan == 0) {
                    System.out.println("Terima kasih. Program selesai.");
                    break;
                }
                
                try {
                    Pembayaran pembayaran = MetodePembayaran.buatMetodePembayaran(pilihan);
                    pembayaran.bayar(jumlah);
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            } while (pilihan != 0);
        }
    }
}
