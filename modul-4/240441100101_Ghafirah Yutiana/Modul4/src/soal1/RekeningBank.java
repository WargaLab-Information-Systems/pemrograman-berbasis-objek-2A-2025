package soal1;

    // Class RekeningBank untuk menyimpan data rekening nasabah
public class RekeningBank {
    private String noRek;
    private String namaPemilik;
    private double saldo;

    public RekeningBank(String noRek, String namaPemilik, double saldo) {
        this.noRek = noRek;
        this.namaPemilik = namaPemilik;
        this.saldo = saldo;
    }

    // Getter untuk noRek
    public String getNoRek() {
        return noRek;
    }

    // Getter untuk namaPemilik
    public String getNamaPemilik() {
        return namaPemilik;
    }

    // Getter untuk saldo
    public double getSaldo() {
        return saldo;
    }

    // Method untuk setor saldo
    public void setor(double jumlah) {
        if (jumlah > 0) {
            saldo += jumlah;
            System.out.println("Setoran sebesar " + jumlah + " berhasil.");
        } else {
            System.out.println("Jumlah setoran tidak valid.");
        }
    }

    // Method untuk tarik saldo
    public void tarik(double jumlah) {
        if (jumlah > 0 && jumlah <= saldo) {
            saldo -= jumlah;
            System.out.println("Penarikan sebesar " + jumlah + " berhasil.");
        } else {
            System.out.println("Penarikan gagal. Saldo tidak cukup atau jumlah tidak valid.");
        }
    }

    // Method menampilkan info rekening
    public void tampilkanInfo() {
        System.out.println("No Rekening: " + noRek);
        System.out.println("Nama Pemilik: " + namaPemilik);
        System.out.println("Saldo: Rp " + saldo);
        System.out.println("---------------------------");
    }
}

    
  