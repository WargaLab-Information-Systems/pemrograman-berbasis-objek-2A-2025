/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal2;

/**
 *
 * @author wingd
 */
public class Soal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MobilSport sport = new MobilSport();
        System.out.printf("%" + (40 + "----- Mobil Sport -----".length()/2) + "s%n", "----- Mobil Sport -----\n");
        sport.info();
        //
        MobilSedan sedan = new MobilSedan();
        System.out.printf("%" + (40 + "----- Mobil Sedan -----".length()/2) + "s%n", "----- Mobil Sedan -----\n");
        sedan.info();
    }
    
}
