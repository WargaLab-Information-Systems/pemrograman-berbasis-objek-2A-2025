/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal2;
import java.util.Scanner;

public class Soal2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        perpustakaan perpus = new perpustakaan();
        
        System.out.println("Berapa banyak jumlah buku fiksi dan non-fiksi? ");
        int jumlahFiksi = input.nextInt();
        input.nextLine();
        
        int i = 0;
        while (i < jumlahFiksi){
            System.out.println("\nInput buku fiksi ke-" + (i + 1));
            System.out.print("Judul : ");
            String judul = input.nextLine();
            System.out.print("Penulis : ");
            String penulis = input.nextLine();
            System.out.print("Genre : ");
            String Genre = input.nextLine();
            
            perpus.tambahBukuFiksi(new bukuFiksi(judul, penulis, Genre));
            i++;
        }
        int j = 0;
        while (j < jumlahFiksi){
            System.out.println("\nInput buku non-fiksi ke-" + (i + 1));
            System.out.print("Judul : ");
            String judul = input.nextLine();
            System.out.print("Penulis : ");
            String penulis = input.nextLine();
            System.out.print("Topik : ");
            String topik = input.nextLine();
            
            perpus.tambahBukuNonFiksi(new bukuNonFiksi(judul, penulis, topik));
            j++;
        
    }
        perpus.tampilkanKoleksi();
    }
    
}
