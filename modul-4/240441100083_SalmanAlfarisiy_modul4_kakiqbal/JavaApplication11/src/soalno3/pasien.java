
package soalno3;
import java.util.Scanner;

public class pasien {
    private String nama;
    private String keluhan;
    private int umur;
    
    public String getnama(){
        return nama;
    }
    
    public String getkeluhan(){
        return keluhan;
    }
    
    public int getumur(){
        return umur;
    }
    
    public void inputpasien(Scanner input){
        System.out.print("siapa nama anda : ");
        this.nama = input.nextLine();
        System.out.print("apa keluhan anda : ");
        this.keluhan = input.nextLine();
        System.out.print("berapaumur anda : ");
        this.umur = input.nextInt();
        input.nextLine();
    }
    public void tampilkan(){
        System.out.println("nama : " + nama);
        System.out.println("keluhan : " + keluhan);
        System.out.println("umur :  " + umur);
    }
    
}
