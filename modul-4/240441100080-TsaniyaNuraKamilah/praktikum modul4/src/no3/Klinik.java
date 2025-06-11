
package no3;

public class Klinik {
    private Pasien[] daftarPasien = new Pasien[100];
    private int jumlah = 0;

    public void tambahPasien(Pasien p) {
        daftarPasien[jumlah++] = p;
    }

    public void tampilkanSemuaPasien() {
        for (int i = 0; i < jumlah; i++) {
            daftarPasien[i].tampilkanInfo();
        }
    }
}
