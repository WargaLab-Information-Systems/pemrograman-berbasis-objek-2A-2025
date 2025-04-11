package soal03;
import java.util.Scanner;

public class main {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        
        kucing[] kucingArray = new kucing[3];
        anjing[] anjingArray = new anjing[3];
        burung[] burungArray = new burung[3];
        
        for (int i = 0; i < 3;  i++) {
        System.out.println("Masukkan data kucing ke-" + (i + 1));
        System.out.print("Nama: ");
        String nama = input.nextLine();
        System.out.print("Usia: ");
        int usia = input.nextInt();
        input.nextLine();
        System.out.print("Warna: ");
        String warna = input.nextLine();
        kucingArray[i] = new kucing(nama, usia, warna);
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan data anjing ke-" + (i + 1));
            System.out.print("Nama: ");
            String nama = input.nextLine();
            System.out.print("Usia: ");
            int usia = input.nextInt();
            input.nextLine();
            System.out.print("Ras: ");
            String ras = input.nextLine();
            anjingArray[i] = new anjing(nama, usia, ras);
        }
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan data burung ke-" + (i + 1));
            System.out.print("Nama: ");
            String nama = input.nextLine();
            System.out.print("Usia: ");
            int usia = input.nextInt();
            input.nextLine();
            System.out.print("Jenis: ");
            String jenis= input.nextLine();
            burungArray[i] = new burung(nama, usia, jenis);
        }
            System.out.println("\n=== Data Hewan ===");
            for (kucing kucing : kucingArray) {
                kucing.tampilkanInfo();
                kucing.bersuara();
                
                System.out.println("----------------------");
            }
            for (anjing anjing : anjingArray) {
                anjing.tampilkanInfo();
                anjing.bersuara();
                
                System.out.println("----------------------");
            }
            for (burung burung : burungArray) {
                burung.tampilkanInfo();
                burung.bersuara();
                System.out.println("----------------------");
            }
            input.close();
        
        }
    }
