/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jawaban1;

/**
 *
 * @author istikhomah
 */
public class Main {
    public static void main(String[] args) {
        // Membuat 5 objek manusia 
        Manusia orang1 = new Manusia("Sikin", 19, "Sabah, Malaysia");
        Manusia orang2 = new Manusia("Tina", 20, "Lahad Datu, Malaysia");
        Manusia orang3 = new Manusia("Isti", 19, "Buduran, Sidoarjo");
        Manusia orang4 = new Manusia("Dimas", 18, "Pamekasan");
        Manusia orang5 = new Manusia("Dian", 18, "Pamekasan");
        Manusia orang6 = new Manusia("Istikhomah", 18, "Surabaya");

        // Memanggil method 
        orang1.tampilkanInfo();
        orang1.berjalan();
        orang1.berlari();
        System.out.println();

        orang2.tampilkanInfo();
        orang2.berjalan();
        orang2.berlari();
        System.out.println();

        orang3.tampilkanInfo();
        orang3.berjalan();
        orang3.berlari();
        System.out.println();

        orang4.tampilkanInfo();
        orang4.berjalan();
        orang4.berlari();
        System.out.println();

        orang5.tampilkanInfo();
        orang5.berjalan();
        orang5.berlari();
        System.out.println();
        
        orang6.tampilkanInfo();
        orang6.berjalan();
        orang6.berlari();
        System.out.println();
    }
}
