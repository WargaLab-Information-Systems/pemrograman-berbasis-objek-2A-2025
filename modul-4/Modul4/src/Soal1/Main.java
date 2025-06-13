package Soal1;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank(5);

        RekeningBank r1 = new RekeningBank("001", "Titin", 500000);
        RekeningBank r2 = new RekeningBank("002", "Yani", 300000);
        RekeningBank r3 = new RekeningBank("003", "Citra", 0);  // Saldo awal valid

        // Tambahkan rekening terlebih dahulu ke bank
        bank.tambahRekening(r1);
        bank.tambahRekening(r2);
        bank.tambahRekening(r3);
        
        //Transaksi
        r1.setor(100000);          
        r2.tarik(50000);           
        r3.tarik(200000);          

        // Tampilkan hasil akhir
        System.out.println("== Daftar Rekening Nasabah ==");
        bank.tampilkanSemuaRekening();
    }
}
