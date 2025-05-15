package soal_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah pasien yang akan dicatat: ");
        int jumlah = input.nextInt();
        input.nextLine(); // Buang newline

        Klinik klinik = new Klinik(jumlah);

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nInput data pasien ke-" + (i+1));
            
            Pasien p = new Pasien();

            System.out.print("Nama    : ");
            p.setNama(input.nextLine());

            System.out.print("Umur    : ");
            p.setUmur(input.nextInt());
            input.nextLine(); // Buang newline

            System.out.print("Keluhan : ");
            p.setKeluhan(input.nextLine());

            klinik.tambahPasien(p);
        }

        klinik.tampilkanDaftarPasien();
        input.close();
    }
}
  