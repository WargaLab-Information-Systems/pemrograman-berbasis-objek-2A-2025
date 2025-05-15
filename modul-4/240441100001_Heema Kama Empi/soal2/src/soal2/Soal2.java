/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal2;
import java.util.Scanner;
/**
 *
 * @author wingd
 */
public class Soal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Perpustakaan perpustakaan = new Perpustakaan();
        
        System.out.println("=== APLIKASI PERPUSTAKAAN ===");

        while (true) {
            // Menampilkan menu
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Buku Baru");
            System.out.println("2. Lihat Daftar Buku");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu (1-3): ");
            
            String pilihan = scanner.nextLine();
            
            switch (pilihan) {
                case "1":
                    // Input data buku
                    System.out.println("\nMASUKKAN DATA BUKU BARU");
                    System.out.print("Judul: ");
                    String judul = scanner.nextLine();
                    
                    System.out.print("Penulis: ");
                    String penulis = scanner.nextLine();
                    
                    System.out.print("Jumlah Halaman: ");
                    int halaman = 0;
                    try {
                        halaman = Integer.parseInt(scanner.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Input jumlah halaman tidak valid. Harap masukkan angka.");
                        continue;
                    }
                    
                    // Membuat objek buku dan menambahkannya ke perpustakaan
                    Buku bukuBaru = new Buku(judul, penulis, halaman);
                    perpustakaan.tambahBuku(bukuBaru);
                    break;
                    
                case "2":
                    // Menampilkan semua buku
                    perpustakaan.tampilkanSemuaBuku();
                    break;
                    
                case "3":
                    // Keluar dari program
                    System.out.println("\nTerima kasih telah menggunakan aplikasi perpustakaan.");
                    System.exit(0);
                    break;
                    
                default:
                    System.out.println("\nPilihan tidak valid. Silakan pilih 1-3.");
            }
        }
    }
    }
    

