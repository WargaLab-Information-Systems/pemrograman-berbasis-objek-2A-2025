/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal2;

/**
 *
 * @author Ray_mark
 */
public class Car implements Booking, Insurance, costCalculator{
    
    @Override
    public void book(String name, int age, int days) {
        if (age < 18) {
            System.out.println("Gagal booking mobil: usia minimal 18 tahun.");
            return;
        }
        double cost = calculateCost(days);
        System.out.println(name + " berhasil booking mobil selama " + days + " hari.");
        System.out.println("Total biaya: Rp" + cost);
        addInsurance();
    }

    @Override
    public double calculateCost(int days) {
        return days * 300000;
    }

    @Override
    public void addInsurance() {
        System.out.println("Asuransi mobil ditambahkan: Rp100.000");
    }
}
