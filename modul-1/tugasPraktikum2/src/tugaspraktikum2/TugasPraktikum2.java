package tugaspraktikum2;
import java.util.Scanner;

class Mahasiswa{
    String nama;
    String nim;
    String prodi;
    String alamat;
    
    public Mahasiswa(String nama, String nim, String prodi, String alamat){
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.alamat = alamat;
    }
    
    public void tampilkanMhs(){
        System.out.println("Nama :" + nama);
        System.out.println("NIM :" + nim);
        System.out.println("Jurusan :" + prodi);
        System.out.println("Alamat :" + alamat);
        System.out.println("---------------");
    }
}

public class TugasPraktikum2 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner (System.in)) {
            
            // Mahasiswa 1
            System.out.print("Masukkan nama Anda: ");
            String nama1 = input.nextLine();
            
            System.out.print("Masukkan NIM Anda: ");
            String nim1 = input.nextLine();
            
            System.out.print("Masukkan prodi Anda: ");
            String prodi1 = input.nextLine();
            
            System.out.print("Masukkan alamat Anda: ");
            String alamat1 = input.nextLine();
            Mahasiswa mahasiswa1 = new Mahasiswa(nama1, nim1, prodi1, alamat1);
            System.out.println();
            
            // Mahasiswa 2
            System.out.print("Masukkan nama Anda: ");
            String nama2 = input.nextLine();
            
            System.out.print("Masukkan NIM Anda: ");
            String nim2 = input.nextLine();
            
            
            System.out.print("Masukkan prodi Anda: ");
            String prodi2 = input.nextLine();
            
            System.out.print("Masukkan alamat Anda: ");
            String alamat2 = input.nextLine();
            Mahasiswa mahasiswa2 = new Mahasiswa(nama2, nim2, prodi2, alamat2);
            System.out.println();
            
            // Mahasiswa 3
            System.out.print("Masukkan nama Anda: ");
            String nama3 = input.nextLine();
            
            System.out.print("Masukkan NIM Anda: ");
            String nim3 = input.nextLine();
            
            System.out.print("Masukkan prodi Anda: ");
            String prodi3 = input.nextLine();
            
            System.out.print("Masukkan alamat Anda: ");
            String alamat3 = input.nextLine();
            Mahasiswa mahasiswa3 = new Mahasiswa(nama3, nim3, prodi3, alamat3);            
            System.out.println();
            
            System.out.println("<--- Data Mahasiswa --->");
            mahasiswa1.tampilkanMhs();
            mahasiswa2.tampilkanMhs();
            mahasiswa3.tampilkanMhs();
        }
    }
}