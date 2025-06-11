/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul4;

/**
 *
 * @author HP
 */
class RekeningBank {
    private String noRekening;
    private String nasabah;
    private double saldo;

    public RekeningBank(String noRekening, String nasabah, double saldoAwal) {
        this.noRekening = noRekening;
        this.nasabah = nasabah;
        this.saldo = saldoAwal;
    }

    public String getNoRekening() {
        return noRekening;
    }

    public String getNamaPemilik() {
        return nasabah;
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
        if (jumlah > 0 && jumlah <= saldo) {
            saldo -= jumlah;
            return true;
        }
        return false;
    }

    public void info() {
        System.out.println("No Rekening: " + noRekening);
        System.out.println("Nama Pemilik: " + nasabah);
        System.out.println("Saldo: Rp" + saldo);
        System.out.println("------------------------");
    }
}

public class Bank {
    private RekeningBank[] daftarRekening;
    private int jumlahRekening;

    public Bank(int kapasitas) {
        daftarRekening = new RekeningBank[kapasitas];
        jumlahRekening = 0;
    }

    public void tambahRekening(RekeningBank rekening) {
        if (jumlahRekening < daftarRekening.length) {
            daftarRekening[jumlahRekening] = rekening;
            jumlahRekening++;
        } else {
            System.out.println("Kapasitas penuh");
        }
    }

    public RekeningBank cariRekening(String noRek) {
        for (int i = 0; i < jumlahRekening; i++) {
            if (daftarRekening[i].getNoRekening().equals(noRek)) {
                return daftarRekening[i];
            }
        }
        return null;
    }

    public void setor(String noRek, double jumlah) {
        RekeningBank r = cariRekening(noRek);
        if (r != null) {
            r.setor(jumlah);
            System.out.println("Setor berhasil");
        } else {
            System.out.println("Belum buat rekening kau");
        }
    }

    public void tarik(String noRek, double jumlah) {
        RekeningBank r = cariRekening(noRek);
        if (r != null) {
            if (r.tarik(jumlah)) {
                System.out.println("Tarik tunai berhasil");
            } else {
                System.out.println("Saldomu kuranglah");
            }
        } else {
            System.out.println("Belum buat rekening kau");
        }
    }

    public void tampilkanSemuaRekening() {
        for (int i = 0; i < jumlahRekening; i++) {
            daftarRekening[i].info();
        }
    }
}
