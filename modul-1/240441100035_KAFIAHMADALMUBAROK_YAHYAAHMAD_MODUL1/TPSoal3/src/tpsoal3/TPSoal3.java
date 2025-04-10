/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tpsoal3;

import java.util.Scanner;

/**
 *
 * @author KAFI AHMAD
 */
// class kucing
class Kucing {
    String nama;
    String jenis;
    int umur;
    
    public Kucing(String nama,String jenis, int umur){
        this.nama = nama;
        this.jenis = jenis;
        this.umur = umur;
    }
    
    void bersuara(){
        System.out.println("suara kucing: meong!");
    }
    void datahewan() {
        System.out.println("Kucing " + this.jenis + " bernama " + this.nama);
        System.out.println("Umur: " + this.umur + " tahun");
        this.bersuara();
    }
}

// class anjing
class Anjing {
    String nama;
    String ras;
    int umur;
    
    public Anjing(String nama, String ras, int umur){
        this.nama = nama;
        this.umur = umur;
        this.ras = ras;
    }
 
    void bersuara(){
        System.out.println("suara anjing: guk guk!");
    }
    
    void datahewan() {
        System.out.println("Anjing " + this.ras + " bernama " + this.nama);
        System.out.println("Umur: " + this.umur + " tahun");
        this.bersuara();
    }
}

// class burung
class Burung {
    String nama;
    String jenis;
    int umur;
    
    public Burung(String nama, String jenis, int umur){
        this.jenis = jenis;
        this.nama = nama;
        this.umur = umur;
    }
    
    void bersuara(){
        System.out.println("suara Burung merpati: kukgeruk-kukgerukk!");
    }
    void datahewan() {
        System.out.println("Burung " + this.jenis + " bernama " + this.nama);
        System.out.println("Umur: " + this.umur + " tahun");
        this.bersuara();
    }
}

public class TPSoal3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // TODO code application logic here
    Scanner scanner = new Scanner(System.in);
    
    Kucing[] kucing = new Kucing[3];
    Anjing[] anjing = new Anjing[3];
    Burung[] burung = new Burung[3];
    
    System.out.println("=== INPUT DATA KUCING ===");
    for (int i = 0; i < 3; i++) {
        System.out.println("\nKucing ke-" + (i+1));
        System.out.print("Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Jenis: ");
        String jenis = scanner.nextLine();
        System.out.print("Umur (tahun): ");
        int umur = scanner.nextInt();
        scanner.nextLine(); 
            
        kucing[i] = new Kucing(nama, jenis, umur);
    }
        
    System.out.println("\n=== INPUT DATA ANJING ===");
    for (int i = 0; i < 3; i++) {
        System.out.println("\nAnjing ke-" + (i+1));
        System.out.print("Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Ras: ");
        String ras = scanner.nextLine();
        System.out.print("Umur (tahun): ");
        int umur = scanner.nextInt();
        scanner.nextLine(); 
            
        anjing[i] = new Anjing(nama, ras, umur);
    }
        
    System.out.println("\n=== INPUT DATA BURUNG ===");
    for (int i = 0; i < 3; i++) {
        System.out.println("\nBurung ke-" + (i+1));
        System.out.print("Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Jenis: ");
        String jenis = scanner.nextLine();
        System.out.print("Umur (tahun): ");
        int umur = scanner.nextInt();
        scanner.nextLine(); 
            
        burung[i] = new Burung(nama, jenis, umur);
    }   
    System.out.println("\n=== DATA SEMUA HEWAN ===");
        
    System.out.println("\n=== KUCING ===");
    for (int i = 0; i < 3; i++) {
        System.out.println("\nKucing ke-" + (i+1));
        kucing[i].datahewan();
        }
        
    System.out.println("\n=== ANJING ===");
    for (int i = 0; i < 3; i++) {
        System.out.println("\nAnjing ke-" + (i+1));
        anjing[i].datahewan();
        }
        
    System.out.println("\n=== BURUNG ===");
    for (int i = 0; i < 3; i++) {
        System.out.println("\nBurung ke-" + (i+1));
        burung[i].datahewan();
        }
        
        scanner.close();
    }     
}