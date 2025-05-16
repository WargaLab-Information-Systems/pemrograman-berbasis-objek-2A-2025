/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Jwbn1;

/**
 *
 * @author istikhomah
 */
public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        // Tambah beberapa rekening
        bank.tambahRekening(new RekeningBank("00115566", "scoups", 1000000));
        bank.tambahRekening(new RekeningBank("00145566", "Mingyu", 500000));

        // Setor ke rekening Andi
        bank.setor("00115566", 200000);

        // Tarik dari rekening Budi
        bank.tarik("00145566", 100000);
        


        // Tampilkan semua data rekening
        bank.tampilkanSemuaRekening();
    }
}

