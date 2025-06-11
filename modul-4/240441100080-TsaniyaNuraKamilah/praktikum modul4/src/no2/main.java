
package no2;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        perpustakaan p = new perpustakaan();

        while (true) {
            System.out.println("\n=== MENU PERPUSTAKAAN ===");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Tampilkan Semua Buku");
            System.out.println("3. Keluar");
            System.out.print("Pilih: ");
            int pilihan = input.nextInt();
            input.nextLine();

            if (pilihan == 1) {
                System.out.print("Judul: ");
                String judul = input.nextLine();
                System.out.print("Penulis: ");
                String penulis = input.nextLine();
                System.out.print("Jumlah Halaman: ");
                int halaman = input.nextInt();
                p.tambahBuku(new Buku(judul, penulis, halaman));
            } else if (pilihan == 2) {
                p.tampilkanSemuaBuku();
            } else if (pilihan == 3) {
                System.out.println("Keluar dari perpustakaan.");
                break;
            } else {
                System.out.println("Pilihan tidak valid.");
            }
        }
    }
}
