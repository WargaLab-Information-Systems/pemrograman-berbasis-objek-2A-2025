/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Jwbn1;

/**
 *
 * @author istikhomah
 */
public class Bank {
    RekeningBank[] daftarRekening = new RekeningBank[10]; // Maksimal 10 rekening
    int jumlahRekening = 0;

    // Tambah rekening baru
    public void tambahRekening(RekeningBank rekening) {
        if (jumlahRekening < daftarRekening.length) {
            daftarRekening[jumlahRekening] = rekening;
            jumlahRekening++;
        } else {
            System.out.println("Data rekening penuh!");
        }
    }

    // Cari rekening berdasarkan no rekening
    public RekeningBank cariRekening(String noRek) {
        for (int i = 0; i < jumlahRekening; i++) {
            if (daftarRekening[i].getNoRek().equals(noRek)) {
                return daftarRekening[i];
            }
        }
        return null; // tidak ditemukan
    }

    // Setoran berdasarkan no rekening
    public void setor(String noRek, double jumlah) {
        RekeningBank rek = cariRekening(noRek);
        if (rek != null) {
            rek.setor(jumlah);
        } else {
            System.out.println("Rekening tidak ditemukan!");
        }
    }

    // Penarikan berdasarkan no rekening
    public void tarik(String noRek, double jumlah) {
        RekeningBank rek = cariRekening(noRek);
        if (rek != null) {
            rek.tarik(jumlah);
        } else {
            System.out.println("Rekening tidak ditemukan!");
        }
    }

    // Tampilkan semua data rekening
    public void tampilkanSemuaRekening() {
        System.out.println("=== Daftar Rekening Nasabah ===");
        for (int i = 0; i < jumlahRekening; i++) {
            daftarRekening[i].tampilkanInfo();
        }
    }
}

