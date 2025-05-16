
package soalno3;
import java.util.ArrayList;

public class klinik {
    private ArrayList<pasien> daftarpasien = new ArrayList<>();
    
    
    public void tambahDaftarBuku(pasien pasienBaru){
        daftarpasien.add(pasienBaru);
    }
    
    public void DaftarBuku(){
        for(pasien pasien : daftarpasien){
            System.out.println("\nDAFTAR PASIEN");
            pasien.tampilkan();
        }
    }
}

