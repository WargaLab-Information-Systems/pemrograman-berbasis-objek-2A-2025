/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal1;

/**
 *
 * @author wingd
 */
public class Soal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Joko joko = new Joko();
        Beni beni = new Beni();
        Fani fani = new Fani();
        Jani jani = new Jani();
        
        System.out.printf("%" + (40 + "----- Kegiatan Joko -----".length()/2) + "s%n", "----- Kegiatan Joko -----\n");
        joko.tampilkanSemua();
        
        System.out.printf("%" + (40 + "----- Kegiatan Beni -----".length()/2) + "s%n", "----- Kegiatan Beni -----\n");
        fani.tampilkanSemua();
        
        System.out.printf("%" + (40 + "----- Kegiatan Fani -----".length()/2) + "s%n", "----- Kegiatan Fani -----\n");
        beni.tampilkanSemua();
        
        System.out.printf("%" + (40 + "----- Kegiatan Jani -----".length()/2) + "s%n", "----- Kegiatan Jani -----\n");
        jani.tampilkanSemua();
        
        
    }
    
}
