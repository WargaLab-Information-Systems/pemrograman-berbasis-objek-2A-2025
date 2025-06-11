
package soalno2;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        buku buku1 = new buku ();  
        perpustakaan perpus = new perpustakaan ();
        buku1.inputbuku(input);
        buku1.tampilkan();
        
        System.out.print("mau tambah buku baru (ya/tidak): ");
        String jawaban = input.nextLine().toLowerCase();
        if (jawaban.equals("ya")) {
            System.out.println("=== Buat daftar buku Baru ===");
            buku bukuBaru = new buku();

            bukuBaru.inputbuku(input);
            System.out.println("==== Update daftar buku ====");
            bukuBaru.tampilkan();

            System.out.println("buku baru berhasil ditambahkan");
        } else {
            System.out.println("Tidak membuat rekening baru");
        } 
        
        
        
    }
}
