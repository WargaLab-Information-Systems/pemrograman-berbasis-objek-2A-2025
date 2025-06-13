package soal1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Pilih karakter: Joko, Beni, Fani, atau Jani");
        System.out.print("Masukkan nama karakter: ");
        String nama = input.nextLine().trim();

        System.out.print("Masukkan hobi: ");
        String hobi = input.nextLine();

        System.out.print("Masukkan pekerjaan: ");
        String pekerjaan = input.nextLine();

        System.out.print("Masukkan makanan favorit: ");
        String makanan = input.nextLine();

        System.out.println("\n=== Informasi Karakter ===");

        if (nama.equalsIgnoreCase("joko")) {
            Joko joko = new Joko(hobi, pekerjaan, makanan);
            joko.berbicara();
            joko.bekerja();
            joko.makan();
        } else if (nama.equalsIgnoreCase("beni")) {
            Beni beni = new Beni(hobi, pekerjaan, makanan);
            beni.berbicara();
            beni.bekerja();
            beni.makan();
        } else if (nama.equalsIgnoreCase("fani")) {
            Fani fani = new Fani(hobi, pekerjaan, makanan);
            fani.berbicara();
            fani.bekerja();
            fani.makan();
        } else if (nama.equalsIgnoreCase("jani")) {
            Jani jani = new Jani(hobi, pekerjaan, makanan);
            jani.berbicara();
            jani.bekerja();
            jani.makan();
        } else {
            System.out.println("Karakter tidak dikenali.");
        }

        input.close();
    }
}
