package nomorsatu;
        
import java.util.Scanner;

class Manusia {
    String nama;
    int umur;
    String alamat;
    
    Manusia(String nama, int umur, String alamat) {
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
    }
    void berjalan() {
    System.out.println(nama + " sedang berjalan");
    }
    void berlari() {
        System.out.println(nama + " sedang berlari");
    }
}
            
public class Nomorsatu {
    public static void main(String[] args) {
        Manusia mns1 = new Manusia("Adib", 20, "Surabaya");
        Manusia mns2 = new Manusia("Fika", 20, "Gresik");
        Manusia mns3 = new Manusia("Arinda", 17, "Mojokerto");
        Manusia mns4 = new Manusia("Khof", 16, "Pasuruan");
        Manusia mns5 = new Manusia("Dila", 17, "Sidoarjo");
        Manusia mns6 = new Manusia("Shofi", 19, "Malang");
        
        mns1.berjalan();
        mns2.berlari();
        mns3.berjalan();
        mns4.berlari();
        mns5.berjalan();
        mns6.berlari();
    }
}
