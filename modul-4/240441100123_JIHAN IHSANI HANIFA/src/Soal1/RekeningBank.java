package Soal1;
import java.util.ArrayList;

class RekeningBank {
    private String noRekening;
    private String namaPemilik;
    private double saldo;

    public RekeningBank(String noRekening, String namaPemilik, double saldoAwal) {
        this.noRekening = noRekening;
        this.namaPemilik = namaPemilik;
        this.saldo = saldoAwal;
    }

    public String getNoRekening() {
        return noRekening;
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
            System.out.println("Setor berhasil. Saldo sekarang: Rp " + saldo);
        } else {
            System.out.println("Jumlah setor tidak valid.");
        }
    }

    public void tarik(double jumlah) {
        if (jumlah > 0 && jumlah <= saldo) {
            saldo -= jumlah;
            System.out.println("Penarikan berhasil. Saldo sekarang: Rp " + saldo);
        } else {
            System.out.println("Jumlah penarikan tidak valid atau saldo tidak cukup.");
        }
    }

    public void tampilInfo() {
        System.out.println("No Rekening: " + noRekening);
        System.out.println("Nama Pemilik: " + namaPemilik);
        System.out.println("Saldo       : Rp " + saldo);
        System.out.println("-------------------------");
    }
}

class Bank {
    private ArrayList<RekeningBank> rekeningList;

    Bank() {
        rekeningList = new ArrayList<>();
    }

    public void tambahRekening(String noRekening, String namaPemilik, double saldoAwal) {
        RekeningBank r = new RekeningBank(noRekening, namaPemilik, saldoAwal);
        rekeningList.add(r);
        System.out.println("Rekening berhasil ditambahkan.");
    }

    public RekeningBank cariRekening(String noRekening) {
        for (RekeningBank r : rekeningList) {
            if (r.getNoRekening().equals(noRekening)) {
                return r;
            }
        }
        return null;
    }

    public void setor(String noRekening, double jumlah) {
        RekeningBank r = cariRekening(noRekening);
        if (r != null) {
            r.setor(jumlah);
        } else {
            System.out.println("Rekening tidak ditemukan.");
        }
    }

    public void tarik(String noRekening, double jumlah) {
        RekeningBank r = cariRekening(noRekening);
        if (r != null) {
            r.tarik(jumlah);
        } else {
            System.out.println("Rekening tidak ditemukan.");
        }
    }

    public void tampilSemuaRekening() {
        if (rekeningList.isEmpty()) {
            System.out.println("Belum ada rekening.");
        } else {
            for (RekeningBank r : rekeningList) {
                r.tampilInfo();
            }
        }
    }
}
