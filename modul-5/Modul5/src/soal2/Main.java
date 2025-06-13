package soal2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Pilih mobil: Sport atau Sedan");
        System.out.print("Masukkan Jenis Mobil: ");
        String nama = input.nextLine().trim();

        System.out.print("Masukkan merk: ");
        String merk = input.nextLine();

        System.out.println("\n=== Informasi Mobil ===");

        if (nama.equalsIgnoreCase("sport")) {
            MobilSport m1 = new MobilSport(merk);
            m1.nyalakan_mesin();
            m1.matikan_mesin();
        } else if (nama.equalsIgnoreCase("sedan")) {
            MobilSedan m2 = new MobilSedan(merk);
            m2.nyalakan_mesin();
            m2.matikan_mesin();
        } else {
            System.out.println("Karakter tidak dikenali.");
        }

        input.close();
    }
}