package soal2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah mobil: ");
        int jumlahMobil = input.nextInt();
        input.nextLine(); // Membersihkan buffer

        Mobil[] mobilArray = new Mobil[jumlahMobil];

        for (int i = 0; i < jumlahMobil; i++) {
            System.out.print("Pilih jenis mobil ke-" + (i+1) + "(sport/sedan): ");
            String jenis = input.nextLine().trim().toLowerCase();
            if (jenis.equals("sport")) {
                mobilArray[i] = new MobilSport();
            } else if (jenis.equals("sedan")) {
                mobilArray[i] = new MobilSedan();
            } else {
                System.out.println("Pilihan tidak valid!");
                i--; // Ulangi input untuk indeks yang sama
            }
        }

        System.out.println("\n--- Aktivitas Mobil ---");
        for (Mobil mobil : mobilArray) {
            mobil.nyalakan_mesin();
            mobil.matikan_mesin();
            System.out.println(); // Spasi antar mobil
        }
        input.close();
    }
}
