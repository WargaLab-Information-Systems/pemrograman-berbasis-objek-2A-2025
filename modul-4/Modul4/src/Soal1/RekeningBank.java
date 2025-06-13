package Soal1;
public class RekeningBank {
    private String noRek;
    private String namaPemilik;
    private double saldo;

    public RekeningBank(String noRek, String namaPemilik, double saldo) {
        setNoRek(noRek);
        setNamaPemilik(namaPemilik);
        setSaldo(saldo);
    }

    public String getNoRek() {
        return noRek;
    }

    public void setNoRek(String noRek) {
        if (noRek != null && !noRek.trim().isEmpty()) {
            this.noRek = noRek;
        } else {
            System.out.println("Nomor rekening tidak boleh kosong!");
        }
    }

    public String getNamaPemilik() {
        return namaPemilik;
    }

    public void setNamaPemilik(String namaPemilik) {
        if (namaPemilik != null && !namaPemilik.trim().isEmpty()) {
            this.namaPemilik = namaPemilik;
        } else {
            System.out.println("Nama pemilik tidak boleh kosong!");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Saldo tidak boleh negatif!");
        }
    }

    public void setor(double jumlah) {
        if (jumlah > 0) {
            saldo += jumlah;
        } else {
            System.out.println("Jumlah setor harus positif!");
        }
    }

    public void tarik(double jumlah) {
        if (jumlah > 0 && jumlah <= saldo) {
            saldo -= jumlah;
        } else {
            System.out.println("Penarikan gagal! Jumlah tidak valid atau saldo tidak mencukupi.");
        }
    }
}
