/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal1;

/**
 *
 * @author wingd
 */
public class Soal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bank bank = new Bank();


        // Menambahkan beberapa rekening
        bank.tambahRekening(new RekeningBank("123456", "John Doe", 1000000));
        bank.tambahRekening(new RekeningBank("654321", "Jane Smith", 2000000));
        bank.tambahRekening(new RekeningBank("987654", "Bob Johnson", 500000));

        // Melakukan beberapa transaksi
        bank.lakukanSetoran("123456", 500000);
        bank.lakukanPenarikan("654321", 1000000);
        bank.lakukanPenarikan("987654", 600000); // Ini akan gagal karena saldo tidak cukup

        // Menampilkan semua rekening
        bank.tampilkanSemuaRekening();
    }
    
}
