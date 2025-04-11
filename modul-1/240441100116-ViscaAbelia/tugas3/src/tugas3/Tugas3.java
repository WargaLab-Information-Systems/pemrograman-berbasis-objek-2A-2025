package tugas3;
import java.util.Scanner;
class sapi {
    String warna;
    String jenis;
    
    sapi(String jenis, String warna){
        this.jenis = jenis;
        this.warna = warna;
    }    
    void berjalan() {
        System.out.println("Sapi " + jenis + " sedang berjalan");
    }
    void berlari(){
        System.out.println("Sapi " + jenis + " sedang berlari");
    }
}

class burung {
    String jenis;
    String warna;
    
    burung(String jenis, String warna){
        this.jenis = jenis;
        this.warna = warna;
    }
    void terbang(){
        System.out.println("Burung " + jenis + " Sedang terbang");
    }
}

class ular {
    String jenis;
    String warna;
    
    ular (String jenis, String warna){
        this.jenis = jenis;
        this. warna = warna;
    }
    void melata(){
        System.out.println("Ular " + jenis + " sedang melata");
    }
}
public class Tugas3 {

    public static void main(String[] args) {
      Scanner input = new Scanner (System.in);
      System.out.print("Masukkan jumlah objek : ");
      int jumlah = input.nextInt();
      input.nextLine();
      
      sapi [] datasapi = new sapi[jumlah];
      for (int i = 0; i < jumlah; i++){
          System.out.print("Jenis Sapi : ");
          String jenis = input.nextLine();
          
          System.out.print("Warna Sapi : ");
          String warna = input.nextLine();
          System.out.println("");
          datasapi[i] = new sapi(jenis, warna);
      }
        System.out.println("--- Data Sapi ---");
      for (sapi s : datasapi){
          System.out.println("Sapi " + s.jenis);
          System.out.println("Warna " + s.warna);
          s.berjalan();
          s.berlari();
          System.out.println("");
      }

      System.out.print("Masukkan jumlah objek : ");
      int jml = input.nextInt();
      input.nextLine();
      
      burung [] databurung = new burung[jml];
      for (int i = 0; i < jml; i++){
          System.out.print("Jenis Burung : ");
          String jenis = input.nextLine();
          
          System.out.print("Warna Burung : ");
          String warna = input.nextLine();
          
          System.out.println("");
          databurung[i] = new burung(jenis, warna);
      }
        System.out.println("--- Data Burung ---");
      for (burung b : databurung){
          System.out.println("Burung " + b.jenis);
          System.out.println("Warna " + b.warna);
          b.terbang();
          System.out.println("");
    }

      System.out.print("Masukkan jumlah objek : ");
      int jmlh = input.nextInt();
      input.nextLine();
      
      ular [] dataular = new ular[jmlh];
      for (int i = 0; i < jmlh; i++){
          System.out.print("Jenis ular : ");
          String jenis = input.nextLine();
          
          System.out.print("Warna ular : ");
          String warna = input.nextLine();
          System.out.println("");
          dataular[i] = new ular(jenis, warna);
    }
        System.out.println("--- Data Ular ---");
      for (ular u : dataular){
          System.out.println("Ular " + u.jenis);
          System.out.println("Warna " + u.warna);
          u.melata();
          System.out.println("");
    }
    input.close();
}
}
