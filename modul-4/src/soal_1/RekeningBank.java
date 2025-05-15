package soal_1;

public class RekeningBank {
    private String noRek;
    private String namaPemilik;
    private double saldo;//biar bisa nginputi bnyk

    public RekeningBank() {}

    public void setNoRek(String noRek) {
        this.noRek = noRek;
    }

    public void setNamaPemilik(String namaPemilik) {
        this.namaPemilik = namaPemilik;
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Saldo awal tidak boleh negatif.");
            this.saldo = 0;
        }
    }

    public String getNoRek() {
        return noRek;
    }

    public String getNamaPemilik() {
        return namaPemilik;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setor(double jumlah) {
        if (jumlah > 0) {
            saldo += jumlah;
        }
    }

    public boolean tarik(double jumlah) {
        if (jumlah > 0 && saldo >= jumlah) {
            saldo -= jumlah;
            return true;
        } else {
            return false;
        }
    }
}