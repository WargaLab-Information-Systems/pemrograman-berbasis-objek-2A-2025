package soal1;

// Class Main untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank(5); // kapasitas maksimal 5 rekening

        // Menambahkan rekening baru
        bank.tambahRekening(new RekeningBank("12345", "Daif", 1000000));
        bank.tambahRekening(new RekeningBank("67890", "Fifi", 500000));
        bank.tambahRekening(new RekeningBank("11223", "Dafi", 2000000));

        // Menampilkan semua rekening
        bank.tampilkanSemuaRekening();

        // Melakukan setoran dan penarikan
        bank.setor("12345", 500000);
        bank.tarik("67890", 200000);
        bank.tarik("11223", 2500000); // gagal karena saldo tidak cukup

        // Menampilkan data rekening setelah transaksi
        bank.tampilkanSemuaRekening();
    }
}
