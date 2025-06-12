/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal2;

/**
 *
 * @author Ray_mark
 */
public class Soal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Booking mobil = new Car();
        Booking motor = new Motor();
        Booking sepeda = new Bike();

        System.out.println("Simulasi Booking Kendaraan:\n");

        mobil.book("ara", 16, 2);
        motor.book("haha", 23, 4);    
        sepeda.book("lala", 23, 2);
    }
  }
    
