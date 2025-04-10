package MODUL_1;
import java.util.Scanner;

class Kucing {
    String nama;
    String warna;
    int umur;

    public void setData(Scanner input) {
        System.out.print("Masukkan nama kucing: " );
        nama = input.nextLine();
        System.out.print("Masukkan warna kucing: ");
        warna = input.nextLine();
        System.out.print("Masukkan umur kucing: ");
        umur = input.nextInt();
        input.nextLine(); 
    }

    public void bersuara() {
        System.out.println(nama + " mengeong: Meow Meow!");
    }

    public void tampilkanInfo() {
        System.out.println("Kucing - Nama: " + nama + ", Warna: " + warna + ", Umur: " + umur + " tahun.");
    }
}

class Burung {
    String nama;
    String jenis;
    int panjangSayap;

    public void setData(Scanner input) {
        System.out.print("Masukkan nama burung: ");
        nama = input.nextLine();
        System.out.print("Masukkan jenis burung: ");
        jenis = input.nextLine();
        System.out.print("Masukkan panjang sayap burung (cm): ");
        panjangSayap = input.nextInt();
        input.nextLine();
    }

    public void berkicau() {
        System.out.println(nama + " berkicau: Cuit cuit!");
    }

    public void tampilkanInfo() {
        System.out.println("Burung - Nama: " + nama + ", Jenis: " + jenis + ", Panjang Sayap: " + panjangSayap + " cm.");
    }
}

class Ikan {
    String nama;
    String jenisAir;
    int panjang;

    public void setData(Scanner input) {
        System.out.print("Masukkan nama ikan: ");
        nama = input.nextLine();
        System.out.print("Jenis air (Tawar/Laut): ");
        jenisAir = input.nextLine();
        System.out.print("Masukkan panjang ikan (cm): ");
        panjang = input.nextInt();
        input.nextLine(); 
    }

    public void berenang() {
        System.out.println(nama + " sedang berenang di dalam air.");
    }

    public void tampilkanInfo() {
        System.out.println("Ikan - Nama: " + nama + ", Jenis Air: " + jenisAir + ", Panjang: " + panjang + " cm.");
    }
}

public class SOALNO3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Kucing[] kucingList = new Kucing[3]; // untuk membuat list
        Burung[] burungList = new Burung[3];
        Ikan[] ikanList = new Ikan[3];

        for (int i = 0; i < kucingList.length; i++) {
            System.out.println("=== Input Data Kucing ===");
            kucingList[i] = new Kucing(); // object
            kucingList[i].setData(input); // method
        }   

        for (int i = 0; i < burungList.length; i++) {
            System.out.println("\n=== Input Data Burung ===");
            burungList[i] = new Burung();
            burungList[i].setData(input);
        }

        for (int i = 0; i < ikanList.length; i++) {
            System.out.println("\n=== Input Data Ikan ===");
            ikanList[i] = new Ikan();
            ikanList[i].setData(input);
        }

        // Menampilkan hasil
        System.out.println("\n=== Data Kucing ===");
        for (Kucing kucing : kucingList) { //kucing yang ada di dalam list kucingList
            kucing.tampilkanInfo();
            kucing.bersuara();
        }

        System.out.println("\n=== Data Burung ===");
        for (Burung burung : burungList) {
            burung.tampilkanInfo();
            burung.berkicau();
        }

        System.out.println("\n=== Data Ikan ===");
        for (Ikan ikan : ikanList) {
            ikan.tampilkanInfo();
            ikan.berenang();
        }

        input.close();
    }
}
