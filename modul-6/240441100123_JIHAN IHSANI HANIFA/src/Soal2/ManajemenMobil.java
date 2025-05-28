package Soal2;

import java.util.ArrayList;

public class ManajemenMobil {
    private ArrayList<Mobil> daftarMobil;

    public ManajemenMobil() {
        daftarMobil = new ArrayList<>();
    }

    public void tambahMobil(Mobil mobil) {
        daftarMobil.add(mobil);
    }

    public void operasikanSemuaMobil() {
        if (daftarMobil.isEmpty()) {
            System.out.println("Belum ada mobil yang ditambahkan.");
        } else {
            System.out.println("\n--- MENGOPERASIKAN SEMUA MOBIL ---");
            for (Mobil mobil : daftarMobil) {
                mobil.nyalakanMesin();
                mobil.matikanMesin();
                System.out.println("----------------------------");
            }
        }
    }
}
