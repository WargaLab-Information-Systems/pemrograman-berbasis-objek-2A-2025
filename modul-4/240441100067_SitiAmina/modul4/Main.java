/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul4;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank(5); 

        bank.tambahRekening(new RekeningBank("00000012345", "Alivia", 1000000));
        bank.tambahRekening(new RekeningBank("00000045672", "Amina", 5000000));
        bank.tambahRekening(new RekeningBank("00000067583", "Novi", 0));

        bank.setor("00000012345", 250000);
        bank.tarik("00000045672", 300000);
        bank.tarik("00000067583", 1000000); 

        System.out.println("\nData Semua Rekening:");
        bank.tampilkanSemuaRekening();
    }
}


