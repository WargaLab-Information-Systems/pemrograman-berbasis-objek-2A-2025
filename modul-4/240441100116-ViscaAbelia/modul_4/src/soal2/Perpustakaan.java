package soal2;
import java.util.ArrayList;
public class Perpustakaan {
    ArrayList<Buku> daftarBuku;
    
    Perpustakaan(){
        daftarBuku = new ArrayList<>();
    }
    
    public void tambahBuku(Buku b){
        daftarBuku.add(b);
    }
    public void tampilkanBuku(){
        for (Buku b : daftarBuku){
            System.out.println("Judul : " + b.getJudul());
            System.out.println("Judul : " + b.getPenulis());
            System.out.println("Judul : " + b.getJumlahHalaman());
            System.out.println("");
        }
    }
}
