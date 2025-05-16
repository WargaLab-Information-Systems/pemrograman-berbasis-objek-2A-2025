/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiga;

/**
 *
 * @author Miftakhul Arinda
 */
public class klinik {
    private pasien[] daftarPasien = new pasien[100];
    private int jumlahPasien = 0;

    public void tambahPasien(pasien p) {
        if (jumlahPasien < daftarPasien.length) {
            daftarPasien[jumlahPasien++] = p;
        }
    }

    public void tampilkanSemuaPasien() {
        for (int i = 0; i < jumlahPasien; i++) {
            daftarPasien[i].tampilInfo();
        }
    }
}
