
package soal2;
import java.util.ArrayList;
public class perpustakaan {
    ArrayList<bukufiksi> kolekbukufiksi;
    ArrayList<bukunonfiksi> kolekbukunonfiksi;
    
    perpustakaan(){
        kolekbukufiksi = new ArrayList<>();
        kolekbukunonfiksi = new ArrayList<>();
    }
    
    void tambahbukufiksi(bukufiksi buku){
        kolekbukufiksi.add(buku);
        System.out.println("Buku Fiksi berhasil ditambah ");
    }
    void tambahBukuNonFiksi(bukunonfiksi buku){
        kolekbukunonfiksi.add(buku);
        System.out.println("Buku Non Fiksi berhasil ditambah ");
    }
    
    void tampilkanKoleksiBF(){
        for (bukufiksi bf : kolekbukufiksi){
            bf.infofiksi();
        }
    }
    void tampilkanKoleksiBNF(){
        for (bukunonfiksi bnf : kolekbukunonfiksi){
            bnf.infononfiksi();
        }
    }
    void tampilkanSemuaKoleksi(){
        for (bukunonfiksi bnf : kolekbukunonfiksi){
            bnf.infononfiksi();
        }
        for (bukufiksi bf : kolekbukufiksi){
            bf.infofiksi();
        }
    }
}