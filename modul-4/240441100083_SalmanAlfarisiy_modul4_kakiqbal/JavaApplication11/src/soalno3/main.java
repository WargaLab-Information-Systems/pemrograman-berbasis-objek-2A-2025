/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soalno3;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        pasien pasien1 = new pasien ();  
        klinik k1 = new klinik ();
        pasien1.inputpasien(input);
        pasien1.tampilkan();
        
        System.out.print("tambahkan pasien baru (ya/tidak): ");
        String jawaban = input.nextLine().toLowerCase();
        if (jawaban.equals("ya")) {
            System.out.println("\n pasien baru");
            pasien pasienbaru = new pasien();

            pasienbaru.inputpasien(input);
            System.out.println("\n pasien baru");
            pasienbaru.tampilkan();

            System.out.println("buku baru berhasil ditambahkan");
        } else {
            System.out.println("Tidak membuat rekening baru");
        } 
        
        
        
    }
}
