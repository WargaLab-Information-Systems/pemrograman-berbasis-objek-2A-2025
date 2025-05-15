package soal3;
import java.util.ArrayList;
public class Klinik {
    ArrayList<Pasien> daftarPasien;
    
    Klinik(){
        daftarPasien = new ArrayList<>();
    }
    
    public void tambahPasien(Pasien p){
        daftarPasien.add(p);
    }
    public void tampilkanPasien(){
        for (Pasien p : daftarPasien){
            System.out.println("Nama : " + p.getNama());
            System.out.println("Umur : " + p.getUmur());
            System.out.println("Keluhan : " + p.getKeluhan());
            System.out.println("");
        }
    }
}
