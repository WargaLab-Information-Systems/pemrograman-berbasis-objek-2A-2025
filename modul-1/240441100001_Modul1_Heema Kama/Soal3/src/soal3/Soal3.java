/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal3;
import java.util.Scanner;

public class Soal3 {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      
     int i = 1;
     while(i <= 3){
         System.out.println(" ----- Masukkan data hewan ke-" + i + " ----- ");
         System.out.println("Nama : ");
         String name = scanner.nextLine();
         System.out.println("Jenis : ");
         String Jenis = scanner.nextLine();
         System.out.println("umur : ");
         String umur = scanner.nextLine();
         
         Anjing anjing1 = new Anjing(name, Jenis, umur);
         anjing1.bermain();
         i++;
     }
    i = 1;
     while(i <= 3){
         System.out.println(" ----- Masukkan data hewan ke-" + i + " ----- ");
         System.out.println("Nama : ");
         String name = scanner.nextLine();
         System.out.println("Jenis : ");
         String Jenis = scanner.nextLine();
   
         
         kuraKura kuraKura1 = new kuraKura(name, Jenis);
         kuraKura1.berendam();
         i++;
     }
     i = 1;
     while(i <= 3){
         System.out.println(" ----- Masukkan data hewan ke-" + i + " ----- ");
         System.out.println("Nama : ");
         String name = scanner.nextLine();
         System.out.println("Jenis : ");
         String Jenis = scanner.nextLine();
         System.out.println("Habitat : ");
         String habitat = scanner.nextLine();
   
         
         burung burung1 = new burung(name, Jenis, habitat);
         burung1.makan();
         i++;
     }
     
    }
    
}
