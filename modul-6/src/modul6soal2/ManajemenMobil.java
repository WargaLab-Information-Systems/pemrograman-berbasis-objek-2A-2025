package modul6soal2;

import java.util.ArrayList;

public class ManajemenMobil {
    private ArrayList<Mobil> daftarMobil = new ArrayList<>();

    public void tambahMobil(Mobil mobil) {
        daftarMobil.add(mobil);
    }

    public void operasikanSemuaMobil() {
        for (Mobil mobil : daftarMobil) {
            mobil.nyalakanMesin();
            mobil.matikanMesin();
            System.out.println();
        }
    }
}



