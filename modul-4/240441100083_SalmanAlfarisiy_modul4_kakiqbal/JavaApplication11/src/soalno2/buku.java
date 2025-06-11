
package soalno2;
import java.util.Scanner;

public class buku {
    private String judul;
    private String penulis;
    private int jumlahhalaman;
    
    public String getjudul(){
        return judul;
    }
    
    public String getpenulis(){
        return penulis;
    }
    
    public int getjumlahhalaman(){
        return jumlahhalaman;
    }
    
    public void inputbuku(Scanner input){
        System.out.print("masukkan judul buku: ");
        this.judul = input.nextLine();
        System.out.print("masukkan penulis buku: ");
        this.penulis = input.nextLine();
        System.out.print("masukkan jumlah halaman buku: ");
        this.jumlahhalaman = input.nextInt();
        input.nextLine();
    }
    public void tampilkan(){
        System.out.println("judul buku: " + judul);
        System.out.println("penulis buku: " + penulis);
        System.out.println("jumlah halaman pada buku:  " + jumlahhalaman);
    }
    
}
