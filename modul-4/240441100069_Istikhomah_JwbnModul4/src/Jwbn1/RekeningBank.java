/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Jwbn1;

/**
 *
 * @author istikhomah
 */
public class RekeningBank {
    private String noRek;
    private String namaPemilik;
    private double saldo;

    // Constructor
    public RekeningBank(String noRek, String namaPemilik, double saldoAwal) {
        this.noRek = noRek;
        this.namaPemilik = namaPemilik;
        this.saldo = saldoAwal;
    }

    // Getter untuk no rekening
    public String getNoRek() {
        return noRek;
    }

    // Setoran
    public void setor(double jumlah) {
        saldo += jumlah;
    }

    // Penarikan
    public void tarik(double jumlah) {
        if (saldo >= jumlah) {
            saldo -= jumlah;
        } else {
            System.out.println("Saldo tidak cukup untuk penarikan!");
        }
    }

    // Tampilkan info rekening
    public void tampilkanInfo() {
        System.out.println("No Rekening : " + noRek);
        System.out.println("Nama Pemilik: " + namaPemilik);
        System.out.println("Saldo       : Rp " + saldo);
        System.out.println("----------------------------");
    }
}

