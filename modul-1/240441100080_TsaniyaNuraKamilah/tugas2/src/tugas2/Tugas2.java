
package tugas2;
import java.util.Scanner;
class mahasiswa {
    String nama;
    int nim;
    String jurusan;
    String alamat;
   mahasiswa(String nama,int nim,String jurusan,String alamat) {
       this.nama = nama;
       this.nim = nim;
       this.jurusan = jurusan;
       this.alamat = alamat;
   }
   void tampilkandata(){
       System.out.print(" nama : "+ nama);
       System.out.print(" nim : "+ nim);
       System.out.print(" jurusan : "+ jurusan);
       System.out.print(" alamat : "+ alamat);
   }
}
public class Tugas2 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print(" Masukkan jlmh: ");
        int jmlh= input.nextInt();
        input.nextLine();
        mahasiswa[] mhslist = new mahasiswa[jmlh];
        for (int i = 0; i < jmlh; i++) {
            System.out.print(" Masukkan nama: ");
            String nama = input.nextLine();
            System.out.print(" Masukkan nim: ");
            int nim = input.nextInt();
            input.nextLine();
            System.out.print(" Masukkan jurusan: ");
            String jurusan = input.nextLine();
            System.out.print(" Masukkan alamat: ");
            String alamat = input.nextLine();
            mhslist[i] = new mahasiswa(nama,nim,jurusan,alamat);
        }
        System.out.println("");
        System.out.println("Data Mahasiswa");
        for(mahasiswa mhs: mhslist){
            mhs.tampilkandata();
            System.out.println("");
        }
        input.close();
    }
}
