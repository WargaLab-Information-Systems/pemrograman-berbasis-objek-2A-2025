/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan;

/**
 *
 * @author wingd
 */
public class Hewan {
    int kecepatan=0;
    int gir=0;
    
    void ubahgir(int tambah){
        gir = gir + tambah;
        System.out.println("gir:" + gir);
    }
    void tambahcepat(int tambahkancepat){
        kecepatan = kecepatan + tambahkancepat;
         System.out.println("kecepatan:" + kecepatan);
    }
}
