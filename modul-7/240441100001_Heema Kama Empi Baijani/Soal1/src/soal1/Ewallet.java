/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal1;

/**
 *
 * @author Ray_mark
 */
public class Ewallet implements payment{
    @Override
    public void bayar(double amount){
        double fee = 2000;
        double total = amount + fee;
        System.out.println("Pembayaran Ewallet: ");
        System.out.println("Biaya admin Rp " + fee);
        System.out.println("Total bayar: Rp " + total);
    }
}
