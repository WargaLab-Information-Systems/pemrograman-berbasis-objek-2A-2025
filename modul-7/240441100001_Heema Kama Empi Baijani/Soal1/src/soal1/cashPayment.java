/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal1;

/**
 *
 * @author Ray_mark
 */

//diskon 10% sesuai pembayaran "tunai"
public class cashPayment implements payment {
    @Override
    public void bayar(double amount){
        double discount = amount * 0.1;
        double total = amount - discount;
        System.out.println("Pembayaran Tunai: ");
        System.out.println("Diskon 10%: Rp " + discount);
        System.out.println("Total bayar: Rp " + total);
    }
}
