package tugaspraktikum3;
import java.util.Scanner;

class Burung {
    String nama;
    String warna;
    int umur;

    public void setData(Scanner input) {
        System.out.println("Masukkan nama burung: ");
        nama = input.nextLine();
        System.out.println("Masukkan warna burung: ");
        warna = input.nextLine();
        System.out.println("Masukkan umur burung: ");
        umur = input.nextInt();
        input.nextLine();
    }
    
    public void berkicau() {
        System.out.println(nama + " Berkicau: kiw kiw");
    }
    
    public void tampilkanInfo(){
        System.out.println("Burung: " + nama + ", Warna: " + warna + 
                ". Umur: " + umur + " tahun.");
    }
}

class Ikan {
    String nama;
    String jenis;
    double berat;
    
    public void setData(Scanner input){
        System.out.println("Masukkan nama ikan: ");
        nama = input.nextLine();
        System.out.println("Masukkan jenis ikan: ");
        jenis = input.nextLine();
        System.out.println("Masukkan berapa berat ikan: ");
        berat = input.nextDouble();
        input.nextLine();
    }
    
    public void renang(){
        System.out.println(nama + " Sedang berenang.");
    }
    
    public void tampilkanInfo(){
        System.out.println("Ikan - Nama: " + nama + ", Jenis Ikan: " + jenis + 
                ", Berat: " + berat + "Kg.");
    }
}
    
class Harimau {
    String nama;
    String asal;
    int berat;
    
    public void setData(Scanner input){
        System.out.println("Masukkan nama harimau: ");
        nama = input.nextLine();
        System.out.println("Masukkan asal harimau: ");
        asal = input.nextLine();
        System.out.println("Masukkan berat harimau: ");
        berat = input.nextInt();
        input.nextLine();
    }
    
    public void berburu(){
        System.out.println(nama + " Sedang berburu mangsa.");
    }
    
    public void tampilkanInfo(){
        System.out.println("Harimau - Nama: " + nama + ", Asal: " + asal + 
                ", berat" + berat + "Kg.");
    }
}

public class TugasPraktikum3{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        // Membuat objek untuk looping
        Burung[] burungList = new Burung[3];
        Ikan[] ikanList = new Ikan[3];
        Harimau[] harimauList = new Harimau[3];
        
        System.out.println("<--- Input Data Burung --->");
        for (int i = 0; i < burungList.length; i++){
            burungList[i] = new Burung();
            burungList[i].setData(input);
        }
        
        System.out.println("<--- Input Data Ikan --->");
        for (int i = 0; i < ikanList.length; i++){
            ikanList[i] = new Ikan();
            ikanList[i].setData(input);
        }
        
        System.out.println("<--- Input Data Harimau --->");
        for (int i = 0; i < harimauList.length; i++){
            harimauList[i] = new Harimau();
            harimauList[i].setData(input);
        }
        
        // Menampilkan hasil
        System.out.println("<--- Data Burung --->");
        for (Burung burung : burungList){
            burung.tampilkanInfo();
            burung.berkicau();
        }
        
        System.out.println("<--- Data Ikan --->");
        for (Ikan ikan : ikanList){
            ikan.tampilkanInfo();
            ikan.renang();
        }
        
        System.out.println("<--- Data Harimau --->");
        for (Harimau harimau : harimauList){
            harimau.tampilkanInfo();
            harimau.berburu();
        }
        input.close();
    }
}
