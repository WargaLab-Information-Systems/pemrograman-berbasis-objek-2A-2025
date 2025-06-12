/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal1;

/**
 *
 * @author Ray_mark
 */
public class cardPayment implements payment{
    @Override
    public void bayar(double amount){
        double fee = amount * 0.03;
        double total = amount + fee;
        System.out.println("Pembayaran Kartu credit: ");
        System.out.println("Biaya tambahan 3%: Rp " + fee);
        System.out.println("Total bayar: Rp " + total);
    }
}
