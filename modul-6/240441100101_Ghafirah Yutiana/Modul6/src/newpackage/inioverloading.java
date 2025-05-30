/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

/**
 *
 * @author IT COMPUTER
 */
public class inioverloading {
    public static void main (String[] args){
        Kalkulator k = new Kalkulator();
        
        System.out.println("Tambah 2 int" + k.tambah (a:3, b:2));
        System.out.println("Tambah 3 int" + k.tambah (a:3, b:2, c:5));
        System.out.println("Tambah 3 double" + k.tambah (a:2.5, b:2.5));
    }
}
