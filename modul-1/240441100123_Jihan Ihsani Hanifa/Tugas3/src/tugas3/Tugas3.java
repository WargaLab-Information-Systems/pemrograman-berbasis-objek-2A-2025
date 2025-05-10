package tugas3;

import java.util.Scanner;

class Kucing {
    String nama;
    int usia;
    String warna;
    
    public Kucing(String nama, int usia, String warna) {
        this.nama = nama;
        this.usia = usia;
        this.warna = warna;
    }
    public void bersuara() {
        System.out.println(nama + " mengeong: Meow~ Meow~");
    }
    public void tampilkanInfo() {
        System.out.println("Kucing - Nama: " + nama + ", Usia: " + usia + " tahun, Warna: " + warna);
    }
    
}

class Anjing {
    String nama;
    int usia;
    String ras;
    
    public Anjing(String nama, int usia, String ras) {
        this.nama = nama;
        this.usia = usia;
        this.ras = ras;
    }
    public void bersuara() {
        System.out.println(nama + " menggonggong: Woof! Woof!");
    }
    public void tampilkanInfo() {
        System.out.println("Anjing - Nama: " + nama + ", usia:" + usia + " tahun, Ras: " + ras);
    }
    
}


class Burung {
    String nama;
    int usia;
    String jenis;
    
    public Burung(String nama, int usia, String jenis) {
        this.nama = nama;
        this.usia = usia;
        this.jenis = jenis;
}
    public void bersuara() {
        System.out.println(nama + " berkicau: Cuit~ Cuit~");
    }
    public void tampilkanInfo() {
        System.out.println("Burung - Nama: " + nama + ", Usia: " + usia + " tahun, Jenis: " + jenis);
    }
    
}
public class Tugas3 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Kucing[] kucingArray = new Kucing[3];
        Anjing[] anjingArray = new Anjing[3];
        Burung[] burungArray = new Burung[3];
        
        for (int i = 0; i < 3;  i++) {
        System.out.println("\nMasukkan data kucing ke-" + (i + 1));
        System.out.print("Nama: ");
        String nama = input.nextLine();
        System.out.print("Usia: ");
        int usia = input.nextInt();
        input.nextLine();
        System.out.print("Warna: ");
        String warna = input.nextLine();
        kucingArray[i] = new Kucing(nama, usia, warna);
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("\nMasukkan data anjing ke-" + (i + 1));
            System.out.print("Nama: ");
            String nama = input.nextLine();
            System.out.print("Usia: ");
            int usia = input.nextInt();
            input.nextLine();
            System.out.print("Ras: ");
            String ras = input.nextLine();
            anjingArray[i] = new Anjing(nama, usia, ras);
        }
        
        for (int i = 0; i < 3; i++) {
            System.out.println("\nMasukkan data burung ke-" + (i + 1));
            System.out.print("Nama: ");
            String nama = input.nextLine();
            System.out.print("Usia: ");
            int usia = input.nextInt();
            input.nextLine();
            System.out.print("Jenis: ");
            String jenis= input.nextLine();
            burungArray[i] = new Burung(nama, usia, jenis);
        }
            System.out.println("\n=== Data Hewan ===");
            for (Kucing kucing : kucingArray) {
                kucing.tampilkanInfo();
                kucing.bersuara();
                
                System.out.println("----------------------");
            }
            for (Anjing anjing : anjingArray) {
                anjing.tampilkanInfo();
                anjing.bersuara();
                
                System.out.println("----------------------");
            }
            for (Burung burung : burungArray) {
                burung.tampilkanInfo();
                burung.bersuara();
                System.out.println("----------------------");
            }
            input.close();
        
        }
    
    
}
