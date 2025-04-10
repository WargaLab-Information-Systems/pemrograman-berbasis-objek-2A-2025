/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal2;
import java.util.Scanner;

public class Soal2 {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      
      System.out.println(" ----- Masukkan Data Mahasiswa 2025 Pertama ----- ");
      System.out.println(" Nama :");
      String name1 = scanner.nextLine();
      System.out.println(" NIM :");
      String NIM1 = scanner.nextLine();
      System.out.println(" Jurusan : ");
      String Jurusan1 = scanner.nextLine();
      System.out.println(" Alamat : ");
      String Alamat1 = scanner.nextLine();
      mahasiswa mahasiswa1 = new mahasiswa (name1, NIM1, Jurusan1, Alamat1);
      
      System.out.println(" ----- Masukkan Data Mahasiswa 2025 Kedua ----- ");
      System.out.println(" Nama :");
      String name2 = scanner.nextLine();
      System.out.println(" NIM :");
      String NIM2 = scanner.nextLine();
      System.out.println(" Jurusan : ");
      String Jurusan2 = scanner.nextLine();
      System.out.println(" Alamat : ");
      String Alamat2 = scanner.nextLine();
      mahasiswa mahasiswa2 = new mahasiswa (name2, NIM2, Jurusan2, Alamat2);
      
      System.out.println(" ----- Masukkan Data Mahasiswa 2025 Ketiga ----- ");
      System.out.println(" Nama :");
      String name3 = scanner.nextLine();
      System.out.println(" NIM :");
      String NIM3 = scanner.nextLine();
      System.out.println(" Jurusan : ");
      String Jurusan3 = scanner.nextLine();
      System.out.println(" Alamat : ");
      String Alamat3 = scanner.nextLine();
      mahasiswa mahasiswa3 = new mahasiswa (name3, NIM3, Jurusan3, Alamat3);
      
      mahasiswa1.MenampilkanInfo();
      mahasiswa2.MenampilkanInfo();
      mahasiswa3.MenampilkanInfo();
      
    }
    
}
