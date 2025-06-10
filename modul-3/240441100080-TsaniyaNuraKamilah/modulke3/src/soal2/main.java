
package soal2;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        perpustakaan perpus = new perpustakaan();
        boolean running = true;

        while (running) {
            System.out.println("\n===== MENU PERPUSTAKAAN =====");
            System.out.println("1. Tambah Buku Fiksi");
            System.out.println("2. Tambah Buku Non-Fiksi");
            System.out.println("3. Tampilkan Koleksi Buku Fiksi");
            System.out.println("4. Tampilkan Koleksi Buku Non-Fiksi");
            System.out.println("5. Tampilkan Semua Koleksi");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu (1-6): ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // membersihkan enter

            if (pilihan == 1){
                System.out.print("Judul: ");
                String judul = scanner.nextLine();
                System.out.print("Penulis: ");
                String penulis = scanner.nextLine();
                System.out.print("Genre: ");
                String genre = scanner.nextLine();

                bukufiksi fiksi = new bukufiksi(judul, penulis, genre);
                perpus.tambahbukufiksi(fiksi);

            } else if (pilihan == 2) {
                System.out.print("Judul: ");
                String judul = scanner.nextLine();
                System.out.print("Penulis: ");
                String penulis = scanner.nextLine();
                System.out.print("Topik: ");
                String topik = scanner.nextLine();

                bukunonfiksi nonfiksi = new bukunonfiksi(judul, penulis, topik);
                perpus.tambahBukuNonFiksi(nonfiksi);

            } else if (pilihan == 3) {
                System.out.println("--- Koleksi Buku Fiksi ---");
                perpus.tampilkanKoleksiBF();

            } else if (pilihan == 4) {
                System.out.println("--- Koleksi Buku Non-Fiksi ---");
                perpus.tampilkanKoleksiBNF();
            
            } else if (pilihan == 5) {
                System.out.println("--- Semua Koleksi ---");
                perpus.tampilkanKoleksiBF();
                perpus.tampilkanKoleksiBNF();

            } else if (pilihan == 6) {
                running = false;
                System.out.println("Program selesai.");

            } else {
                System.out.println("Pilihan tidak valid. Silakan pilih 1-5.");
            }
        }

        scanner.close();
    }
}
  