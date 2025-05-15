/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal1;
import java.util.ArrayList;
/**
 *
 * @author wingd
 */
public class Bank {
     private ArrayList<RekeningBank> daftarRekening;

    public Bank() {
        this.daftarRekening = new ArrayList<>();
    }

    // menambahkan rekening baru
    public void tambahRekening(RekeningBank rekening) {
        this.daftarRekening.add(rekening);
        System.out.println("Rekening berhasil ditambahkan");
    }

    //mencari rekening berdasarkan nomor rekening
    public RekeningBank cariRekening(String noRekening) {
        for (RekeningBank rekening : this.daftarRekening) {
            if (rekening.getNoRekening().equals(noRekening)) {
                return rekening;
            }   
        }
        return null;
    }

    //melakukan setoran
    public void lakukanSetoran(String noRekening, double jumlah) {
        RekeningBank rekening = cariRekening(noRekening);
        if (rekening != null) {
            rekening.setor(jumlah);
        } else {
            System.out.println("Rekening tidak ditemukan");
        }
    }

    //melakukan penarikan
    public void lakukanPenarikan(String noRekening, double jumlah) {
        RekeningBank rekening = cariRekening(noRekening);
        if (rekening != null) {
            rekening.tarik(jumlah);
        } else {
            System.out.println("Rekening tidak ditemukan");
        }
    }

    public void tampilkanSemuaRekening() {
        System.out.println("\nDaftar Semua Rekening:");
        for (RekeningBank rekening : daftarRekening) {
            rekening.tampilkanInfo();
        }
    }
}

