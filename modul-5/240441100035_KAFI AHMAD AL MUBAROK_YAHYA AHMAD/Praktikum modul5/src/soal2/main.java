/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal2;

/**
 *
 * @author KAFI AHMAD
 */
public class  main {
    public static void main(String[]args){
        
        MobilSport sport = new MobilSport();
        System.out.println("== MobilSport ==");
        sport.nyalakan_mesin();
        sport.matikan_mesin();
        
        MobilSedan sedan = new MobilSedan();
        System.out.println("== MobilSedan ==");
        sedan.nyalakan_mesin();
        sedan.matikan_mesin();
    }
}
