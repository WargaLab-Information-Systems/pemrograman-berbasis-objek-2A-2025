/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal2;

/**
 *
 * @author Miftakhul Arinda
 */
import java.util.ArrayList;
import java.util.List;

class ManajemenMobil {
    private List<Mobil> daftarMobil;

    public ManajemenMobil() {
        daftarMobil = new ArrayList<>();
    }

    public void tambahMobil(Mobil mobil) {
        daftarMobil.add(mobil);
    }

    public void operasikanSemuaMobil() {
        for (Mobil mobil : daftarMobil) {
            mobil.nyalakanMesin();
            mobil.matikanMesin();
        }
    }
}

