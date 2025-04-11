package tugas2;
import java.util.Scanner;
class mahasiswa {
    String nama;
    int nim;
    String prodi;
    String alamat;
    
    mahasiswa(String nama, int nim, String prodi, String alamat){
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.alamat = alamat;
    }
    void tampilkanmahasiswa(){
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Prodi : " + prodi);
        System.out.println("Alamat : " + alamat);
    }
}
public class Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah data yang akan ditambahkan : ");
        int jumlah = input.nextInt();
        input.nextLine();
        
        mahasiswa[] datamahasiswa = new mahasiswa[jumlah];
        for (int i = 0; i < jumlah; i++ ){    
        System.out.print("Masukkan nama : ");
        String nama = input.nextLine();

        System.out.print("Masukkan NIM : ");
        int nim = input.nextInt();
        input.nextLine();
        
        System.out.print("Masukkan Prodi : ");
        String prodi = input.nextLine();
        
        System.out.print("Masukkan Alamat : ");
        String alamat = input.nextLine();
        
        System.out.println("");
        
        datamahasiswa[i] = new mahasiswa(nama, nim, prodi, alamat);
        }
        
        System.out.println("");
        System.out.println("Data Mahasiswa");
        for (mahasiswa mhs : datamahasiswa){
            mhs.tampilkanmahasiswa();
            System.out.println("");
        }
        
        
        
    }
    
}
