/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package satu;

/**
 *
 * @author Miftakhul Arinda
 */
public class bank {
    private rekeningBank[] daftarRekening = new rekeningBank[100];
    private int jumlahRekening = 0;

    public void tambahRekening(rekeningBank r) {
        if (jumlahRekening < daftarRekening.length) {
            daftarRekening[jumlahRekening++] = r;
        }
    }

    public rekeningBank cariRekening(String noRek) {
        for (int i = 0; i < jumlahRekening; i++) {
            if (daftarRekening[i].getNoRekening().equals(noRek)) {
                return daftarRekening[i];
            }
        }
        return null;
    }

    public void setor(String noRek, double jumlah) {
        rekeningBank r = cariRekening(noRek);
        if (r != null) {
            r.setor(jumlah);
        }
    }

    public void tarik(String noRek, double jumlah) {
        rekeningBank r = cariRekening(noRek);
        if (r != null) {
            r.tarik(jumlah);
        }
    }

    public void tampilSemuaRekening() {
        for (int i = 0; i < jumlahRekening; i++) {
            daftarRekening[i].tampilInfo();
        }
    }
}
