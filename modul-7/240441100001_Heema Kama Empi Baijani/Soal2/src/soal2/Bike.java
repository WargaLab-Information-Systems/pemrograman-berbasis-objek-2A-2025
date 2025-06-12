/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal2;

/**
 *
 * @author Ray_mark
 */
public class Bike implements Booking, costCalculator{
    
    @Override
    public void book(String name, int age, int days) {
        if (age < 12) {
            System.out.println("Gagal booking sepeda: usia minimal 12 tahun.");
            return;
        }
        double cost = calculateCost(days);
        System.out.println(name + " berhasil booking sepeda selama " + days + " hari.");
        System.out.println("Total biaya: Rp" + cost);
    }

    @Override
    public double calculateCost(int days) {
        return days * 50000;
    }
}
