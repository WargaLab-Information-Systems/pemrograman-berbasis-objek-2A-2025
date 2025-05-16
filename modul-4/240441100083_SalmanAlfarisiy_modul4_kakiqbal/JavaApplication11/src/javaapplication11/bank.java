
package javaapplication11;

import java.util.ArrayList;

public class bank {
    private final ArrayList<roko> daftarRekening = new ArrayList<>();


    public void tambahRekening(roko rekening) {
        daftarRekening.add(rekening);
    }

    public void tampilkanSemuaRekening() {
        System.out.println(" Daftar Rekening");
        for (roko b : daftarRekening) {
            b.tampilkan();
            System.out.println("------------------------");
        }
    }
}

