
package tugas3;
import java.util.Scanner;
class kelinci{
    String jenis;
    String warnabulu;
    kelinci(String jenis,String warnabulu){
        this.jenis = jenis;
        this.warnabulu = warnabulu;
    }
    void melompat(){
        System.out.println("kelinci" + jenis + " Sedang Melompat-lompat ");
    }
}
class beruang{
    String jenis;
    String warnabulu;
    beruang(String jenis,String warnabulu){
        this.jenis = jenis;
        this.warnabulu = warnabulu;
    }
    void mengaum(){
        System.out.println("beruang" + jenis + " Mengaum dengan keras ");
    }
}
class burung{
    String jenis;
    String warnabulu;
    burung(String jenis,String warnabulu){
        this.jenis = jenis;
        this.warnabulu = warnabulu;
    }
    void terbang(){
        System.out.println("burung" + jenis + " Sedang Terbang");
    }
}
public class Tugas3 {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print(" Masukkan jlmh: ");
        int jmlh= input.nextInt();
        input.nextLine();
        kelinci[] datakelinci = new kelinci[jmlh];
        for (int i = 0; i < jmlh; i++) {
            System.out.print(" Masukkan jenis: ");
            String jenis = input.nextLine();
            System.out.print(" Masukkan warnabulu: ");
            String warnabulu = input.nextLine();
            datakelinci[i] = new kelinci(jenis,warnabulu);
        }
        beruang[] databeruang = new beruang[jmlh];
        for (int i = 0; i < jmlh; i++) {
            System.out.print(" Masukkan jenis: ");
            String jenis = input.nextLine();
            System.out.print(" Masukkan warnabulu: ");
            String warnabulu = input.nextLine();
            databeruang [i] = new beruang(jenis,warnabulu);
        }
        burung[] databurung = new burung[jmlh];
        for (int i = 0; i < jmlh; i++) {
            System.out.print(" Masukkan jenis: ");
            String jenis = input.nextLine();
            System.out.print(" Masukkan warnabulu: ");
            String warnabulu = input.nextLine();
            databurung [i] = new burung(jenis,warnabulu);
        }
        System.out.println("data kelinci");
        for(kelinci klc: datakelinci){
        System.out.println(" kelinci " + klc.jenis);
        System.out.println(" kelinci " + klc.warnabulu);
        klc.melompat();
        System.out.println("");
        }
        System.out.println("data beruang");
        for(beruang bear: databeruang){
        System.out.println (" beruang " + bear.jenis);
        System.out.println(" beruang " + bear.warnabulu);
        bear.mengaum();
        System.out.println("");
        }
        System.out.println("data burung");
        for(burung brg: databurung){
        System.out.println(" burung " + brg.jenis);
        System.out.println(" burung " + brg.warnabulu);
        brg.terbang();
        System.out.println("");
        }
        input.close();
    }
}
