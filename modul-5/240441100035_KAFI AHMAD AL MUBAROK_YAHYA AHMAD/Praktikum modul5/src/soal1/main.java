/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal1;

/**
 *
 * @author KAFI AHMAD
 */
public class main {
    public static void main(String[]args){
        Joko joko = new Joko();
        Beni beni = new Beni();
        Fani fani = new Fani();
        Jani jani = new Jani();
        
        System.out.println("== Joko ==");
        joko.berbicara();
        joko.bekerja();
        joko.makan();
        
        System.out.println("== Beni ==");
        beni.berbicara();
        beni.bekerja();
        beni.makan();
        
        System.out.println("== Fani ==");
        fani.berbicara();
        fani.bekerja();
        fani.makan();
        
        System.out.println("== Jani ==");
        jani.berbicara();
        jani.bekerja();
        jani.makan();
    }
}
