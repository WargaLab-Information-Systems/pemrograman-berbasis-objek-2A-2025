/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul.pkg3.pkg2;
import java.util.Scanner;
//import java.util.ArrayList;
/**
 *
 * @author KAFI AHMAD
 */
public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Perpustakaan perpustakaan = new Perpustakaan();
        
        while (true) {
            System.out.println("-MENU PERPUSTAKAAN-");
            System.out.println("1. Tambah Buku Fiksi");
            System.out.println("2. Tambah Buku Non-Fiksi");
            System.out.println("3. Tampilkan Koleksi Buku");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            
            int pilihan = input.nextInt();
            input.nextLine();
            
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan judul buku fiksi: ");
                    String judulFiksi = input.nextLine();
                    System.out.print("Masukkan penulis: ");
                    String penulisFiksi = input.nextLine();
                    System.out.print("Masukkan genre: ");
                    String genre = input.nextLine();
                    
                    BukuFiksi bukuFiksi = new BukuFiksi(judulFiksi, penulisFiksi, genre);
                    perpustakaan.tambahBukuFiksi(bukuFiksi);
                    break;
                    
                case 2:
                    System.out.print("Masukkan judul buku non-fiksi: ");
                    String judulNonFiksi = input.nextLine();
                    System.out.print("Masukkan penulis: ");
                    String penulisNonFiksi = input.nextLine();
                    System.out.print("Masukkan topik: ");
                    String topik = input.nextLine();
                    
                    BukuNonFiksi bukuNonFiksi = new BukuNonFiksi(judulNonFiksi, penulisNonFiksi, topik);
                    perpustakaan.tambahBukuNonFiksi(bukuNonFiksi);
                    break;
                    
                case 3:
                    perpustakaan.tampilkanKoleksi();
                    break;
                    
                case 4:
                    System.out.println("Terima kasih telah menggunakan sistem perpustakaan!");
                    input.close();
                    System.exit(0);
                    
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
}
