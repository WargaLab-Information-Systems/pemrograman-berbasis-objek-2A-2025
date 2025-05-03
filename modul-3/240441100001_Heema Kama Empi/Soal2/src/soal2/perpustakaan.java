/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal2;
import java.util.ArrayList;
/**
 *
 * @author wingd
 */
public class perpustakaan {
    private ArrayList<bukuFiksi> koleksiFiksi = new ArrayList<>();
    private ArrayList<bukuNonFiksi> koleksiNonFiksi = new ArrayList<>();
    
    void tambahBukuFiksi(bukuFiksi buku){
        koleksiFiksi.add(buku);
    }
    void tambahBukuNonFiksi(bukuNonFiksi buku){
        koleksiNonFiksi.add(buku);
    }
    void tampilkanKoleksi(){
        System.out.println("\n--- Koleksi Buku Fiksi ---");
        for (bukuFiksi b : koleksiFiksi){
            b.info();
        }
        System.out.println("\n--- Koleksi Buku Non-Fiksi ---");
        for (bukuNonFiksi b : koleksiNonFiksi){
            b.info();
        }
    }
}
