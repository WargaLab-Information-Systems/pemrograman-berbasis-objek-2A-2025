/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal3;
import java.util.Scanner;
/**
 *
 * @author wingd
 */
public class Soal3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        Klinik klinik = new Klinik();
        
        System.out.println("DATA PASIEN KLINIK");
        System.out.println("==============================");
        
        boolean isRunning = true;
        
        while (isRunning) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Pasien");
            System.out.println("2. Tampilkan Semua Pasien");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu (1-3): ");
            
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline
            
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama pasien: ");
                    String nama = scanner.nextLine();
                    
                    System.out.print("Masukkan umur pasien: ");
                    int umur = scanner.nextInt();
                    scanner.nextLine(); // Membersihkan newline
                    
                    System.out.print("Masukkan keluhan pasien: ");
                    String keluhan = scanner.nextLine();
                    
                    Pasien pasienBaru = new Pasien(nama, umur, keluhan);
                    klinik.tambahPasien(pasienBaru);
                    break;
                    
                case 2:
                    klinik.tampilkanSemuaPasien();
                    break;
                    
                case 3:
                    isRunning = false;
                    System.out.println("Terima kasih telah menggunakan sistem kami.");
                    break;
                    
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
    }
    
