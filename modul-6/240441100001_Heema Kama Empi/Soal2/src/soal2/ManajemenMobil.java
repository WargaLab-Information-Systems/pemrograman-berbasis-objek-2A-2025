/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal2;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author wingd
 */
public class ManajemenMobil {
    private List<Mobil> daftarMobil = new ArrayList<>();
    
    void tambahMobil(Mobil m){
        daftarMobil.add(m);
    }
    void Operasikan_semua_mobil(){
        for (Mobil m : daftarMobil){
            m.nyalakan_mesin();
            m.matikan_mesin();
        }
    }
}
