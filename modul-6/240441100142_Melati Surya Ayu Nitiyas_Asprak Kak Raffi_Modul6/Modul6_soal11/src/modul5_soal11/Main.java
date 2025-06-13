
package modul5_soal11;

import java.util.ArrayList;
import java.util.Scanner;

// Main class
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Manusia> daftarManusia = new ArrayList<>();

        int jumlah = 0;
        do {
            System.out.println("Masukkan jumlah manusia yang ingin dibuat (1-4):");
            if (scanner.hasNextInt()) {
                jumlah = scanner.nextInt();
                scanner.nextLine(); 
                if (jumlah < 1 || jumlah > 4) {
                    System.out.println("Jumlah harus antara 1 sampai 4. Silakan coba lagi.");
                }
            } else {
                System.out.println("Input tidak valid. Masukkan angka antara 1 sampai 4.");
                scanner.nextLine();
            }
        } while (jumlah < 1 || jumlah > 4);

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nPilih tipe manusia ke-" + (i + 1) + ":");
            System.out.println("1. Joko");
            System.out.println("2. Beni");
            System.out.println("3. Fani");
            System.out.println("4. Jani");
            System.out.print("Masukkan pilihan (1-4): ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); 

            switch (pilihan) {
                case 1:
                    daftarManusia.add(new Joko());
                    break;
                case 2:
                    daftarManusia.add(new Beni());
                    break;
                case 3:
                    daftarManusia.add(new Fani());
                    break;
                case 4:
                    daftarManusia.add(new Jani());
                    break;
                default:
                    System.out.println("Pilihan tidak valid, manusia ke-" + (i + 1) + " tidak dibuat.");
                    i--; 
                    break;
            }
        }

        
        for (Manusia m : daftarManusia) {
            System.out.println("\n=== Aktivitas " + m.getClass().getSimpleName() + " ===");
            m.berbicara();
            m.bekerja();
            m.makan();
        }

        scanner.close();
    }
}

