package MODUL_1;
import java.util.Scanner;

class Mahasiswa {
    String nama;
    String prodi;
    String alamat;
    int nim;
    
    
    public void Method_Tampilkan(Scanner input) {
        System.out.print("Masukkan nama: ");
        nama = input.nextLine();
               
        System.out.print("Masukkan nim: ");
        nim = input.nextInt();
        input.nextLine();

        System.out.print("Masukkan prodi: ");
        prodi = input.nextLine();
        
        System.out.print("Masukkan alamat: ");
        alamat = input.nextLine();
        
        System.out.println("===================");
        System.out.println("Nama: " + nama);
        System.out.println("nim: " + nim);
        System.out.println("prodi: " + prodi);
        System.out.println("alamat: " + alamat);
        System.out.println("===================");
        
    }
}

public class SOALNO2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Mahasiswa mhs1 = new Mahasiswa();
        Mahasiswa mhs2 = new Mahasiswa();
        Mahasiswa mhs3 = new Mahasiswa();
        
        
        mhs1.Method_Tampilkan(input);
        mhs2.Method_Tampilkan(input);
        mhs3.Method_Tampilkan(input);
    }
}

