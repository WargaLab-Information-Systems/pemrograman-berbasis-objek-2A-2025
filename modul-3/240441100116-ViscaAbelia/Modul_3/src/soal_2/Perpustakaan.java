package soal_2;
import java.util.ArrayList;
public class Perpustakaan {
    ArrayList<BukuFiksi> KolBukuFiksi;
    ArrayList<BukuNonFiksi> KolBukuNonFiksi;
    
    Perpustakaan(){
        KolBukuFiksi = new ArrayList<>();
        KolBukuNonFiksi = new ArrayList<>();
    }
    
    public void tambahBukuFiksi(BukuFiksi Buku){
        KolBukuFiksi.add(Buku);
        System.out.println("Buku Fiksi berhasil ditambah");
    }
    void tambahBukuNonFiksi(BukuNonFiksi Buku){
        KolBukuNonFiksi.add(Buku);
        System.out.println("Buku Non Fiksi berhasil ditambah");
    }
    void tampilkanKoleksi(){
        System.out.println("=== Buku Fiksi ===");
        for (BukuFiksi bf : KolBukuFiksi){
            bf.infoFiksi();
            System.out.println("");
        }
        System.out.println("=== Buku Non Fiksi ===");
        for (BukuNonFiksi bnf : KolBukuNonFiksi){
            bnf.infoNonFiksi();
            System.out.println("");
        }
    }
}
