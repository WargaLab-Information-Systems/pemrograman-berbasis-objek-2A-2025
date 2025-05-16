/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package satu;

/**
 *
 * @author Miftakhul Arinda
 */
public class rekeningBank {
    private String noRekening;
    private String namaPemilik;
    private double saldo;

    public rekeningBank(String noRekening, String namaPemilik, double saldo) {
        this.noRekening = noRekening;
        this.namaPemilik = namaPemilik;
        this.saldo = saldo;
    }

    public String getNoRekening() {
        return noRekening;
    }

    public String getNamaPemilik() {
        return namaPemilik;
    }

    public void setNamaPemilik(String namaPemilik) {
        this.namaPemilik = namaPemilik;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setor(double jumlah) {
        if (jumlah > 0) {
            this.saldo += jumlah;
        } else {
            
        }
    }
    

    public void tarik(double jumlah) {
        if (jumlah > 0 && jumlah <= this.saldo) {
            this.saldo -= jumlah;
        }
    }

    public void tampilInfo() {
        System.out.println("No Rek: " + noRekening + ", Nama: " + namaPemilik + ", Saldo: Rp" + saldo);
    }
}
