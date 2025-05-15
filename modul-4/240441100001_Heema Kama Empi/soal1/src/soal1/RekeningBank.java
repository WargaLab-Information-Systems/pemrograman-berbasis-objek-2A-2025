/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal1;
/**
 *
 * @author wingd
 */
public class RekeningBank {
    private String noRekening;
    private String namaPemilik;
    private double saldo;

    public RekeningBank(String noRekening, String namaPemilik, double saldo) {
        this.noRekening = noRekening;
        this.namaPemilik = namaPemilik;
        this.saldo = saldo;
    }

    // Method menambah saldo (setoran)
    public void setor(double jumlah) {
        if (jumlah > 0) {
            saldo += jumlah;
            System.out.println("Setoran berhasil. Saldo baru: " + saldo);
        } else {
            System.out.println("Jumlah setoran harus lebih dari 0");
        }
    }

    // Method mengurangi saldo (penarikan)
    public void tarik(double jumlah) {
        if (jumlah > 0) {
            if (saldo >= jumlah) {
                saldo -= jumlah;
                System.out.println("Penarikan berhasil. Saldo baru: " + saldo);
            } else {
                System.out.println("Saldo tidak mencukupi");
            }
        } else {
            System.out.println("Jumlah penarikan harus lebih dari 0");
        }
    }

    // Getter
    public String getNoRekening() {
        return noRekening;
    }

    public String getNamaPemilik() {
        return namaPemilik;
    }

    public double getSaldo() {
        return saldo;
    }
    public void SetNoRekekning(String noRekening){
        this.noRekening = noRekening;
    }
    public void SetNamaPemilik(String namaPemilik){
        this.namaPemilik = namaPemilik;
    }
    public void SetSaldo(int saldo){
        this.saldo = saldo;
    }

    public void tampilkanInfo() {
        System.out.println("No Rekening: " + noRekening);
        System.out.println("Nama Pemilik: " + namaPemilik);
        System.out.println("Saldo: " + saldo);
        System.out.println("-----------------------------");
    }
}


