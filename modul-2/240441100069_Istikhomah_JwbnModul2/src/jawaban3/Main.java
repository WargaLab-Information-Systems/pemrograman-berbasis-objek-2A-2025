/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jawaban3;

/**
 *
 * @author istikhomah
 */
public class Main {
    public static void main(String[] args) {
        Kampus k1 = new Kampus("Universitas Gadjah Mada", "Jalan Gadjah Mada, No.637567, Yogyakarta", 20000);
        

        // Cara benar memanggil method static dari class Kampus
        Kampus.tampilInfoKampus(k1);

        System.out.println();

        k1.tampilDetail();
        System.out.println();
    }
}

