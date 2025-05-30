package soal1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Manusia[] manusiaArray = {
            new Joko(),
            new Beni(),
            new Fani(),
            new Jani()
        };

        while (true) {
            System.out.println("\nPilih manusia yang ingin ditampilkan (masukkan angka 1-4):");
            System.out.println("1. Joko");
            System.out.println("2. Beni");
            System.out.println("3. Fani");
            System.out.println("4. Jani");
            System.out.println("0. Keluar");
            System.out.print("Pilihan Anda: ");

            int pilihan = scanner.nextInt();

            if (pilihan == 0) {
                System.out.println("Terima kasih, program selesai.");
                break;
            } else if (pilihan >= 1 && pilihan <= 4) {
                Manusia m = manusiaArray[pilihan - 1];
                System.out.println("\n--- Aktivitas " + m.getClass().getSimpleName() + " ---");
                m.berbicara();
                m.bekerja();
                m.makan();
            } else {
                System.out.println("Pilihan tidak valid!");
            }
        }
        scanner.close();
    }
}
