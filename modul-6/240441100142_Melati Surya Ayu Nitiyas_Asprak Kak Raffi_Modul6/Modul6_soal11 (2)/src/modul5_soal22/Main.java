
package modul5_soal22;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Mobil> daftarMobil = new ArrayList<>();

        System.out.print("Masukkan jumlah mobil yang ingin dibuat: ");
        int jumlah = scanner.nextInt();
        scanner.nextLine(); // membersihkan newline

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nPilih jenis mobil ke-" + (i + 1) + ":");
            System.out.println("1. Mobil Sport");
            System.out.println("2. Mobil Sedan");
            System.out.print("Masukkan pilihan (1-2): ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); 
            
            switch (pilihan) {
                case 1:
                    daftarMobil.add(new MobilSport());
                    break;
                case 2:
                    daftarMobil.add(new MobilSedan());
                    break;
                default:
                    System.out.println("Pilihan tidak valid, ulangi input untuk mobil ke-" + (i + 1));
                    i--; 
                    break;
            }
        }

        
        
        for (Mobil mobil : daftarMobil) {
            System.out.println("\n=== Aktivitas " + mobil.getClass().getSimpleName() + " ===");
            mobil.nyalakanMesin();
            mobil.matikanMesin();
        }

        scanner.close();
    }
}
