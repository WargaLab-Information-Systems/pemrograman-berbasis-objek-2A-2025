/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soalnomer2;
import java.util.Scanner;
import java.math.BigInteger;

class Mahasiswa {
    String nama;
    String jurusan;
    String alamat;
    BigInteger nim;
}
public class soalnomer2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Mahasiswa pelaku1 = new Mahasiswa();
        
        System.out.print("masukkan nama :");
        pelaku1.nama= scanner.nextLine();
        System.out.print("masukkan jurusan :");
        pelaku1.jurusan = scanner.nextLine();
        System.out.print("masukkan alamat :");
        pelaku1.alamat= scanner.nextLine();
        System.out.print("masukkan nim :");
        pelaku1.nim=new BigInteger(scanner.nextLine()) ;
        
        System.out.println("nama :" + pelaku1.nama);
        System.out.println("jurusan :" + pelaku1.jurusan);
        System.out.println("alamat:" + pelaku1.alamat);
        System.out.println("nim:" + pelaku1.nim);
    } 
    
}
