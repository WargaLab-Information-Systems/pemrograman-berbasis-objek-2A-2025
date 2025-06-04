package soal2;
import java.util.ArrayList;
public class ManajemenMobil {
    ArrayList<Mobil> daftarMobil;
    
    ManajemenMobil(){
        daftarMobil = new ArrayList<>();
    }
    
    public void tambahMobil(Mobil mb){
        daftarMobil.add(mb);
    }
    
    public void operasikanSemuaMobil(){
        for (Mobil mb : daftarMobil){
            mb.nyalakan_mesin();
            mb.matikan_mesin();
            System.out.println("");
        }
    }
}
