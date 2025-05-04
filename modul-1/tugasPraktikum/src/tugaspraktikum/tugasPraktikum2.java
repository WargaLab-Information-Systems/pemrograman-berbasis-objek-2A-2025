package tugaspraktikum;
import java.util.Scanner;

public class tugasPraktikum2 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner (System.in)) {
            System.out.print("Masukkan nama Anda: ");
            String nama = input.nextLine();
            
            System.out.print("Masukkan NIM Anda: ");
            int nim = input.nextInt();
            input.nextLine();
            
            System.out.print("Masukkan prodi Anda: ");
            String prodi = input.nextLine();
            
            System.out.print("Masukkan alamat Anda: ");
            String alamat = input.nextLine();
            
            System.out.println("Nama  : " + nama);
            System.out.println("NIM  : " + nim);
            System.out.println("Prodi  : " + prodi);
            System.out.println("Alamat  : " + alamat);
        }
    }
}
