/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal1;

/**
 *
 * @author wingd
 */
public class mataKuliah {
    String kode;
    String nama;
    int sks;
    
    mataKuliah(String kode, String nama, int sks){
        if (!isSKSValid(sks)) {
            System.err.println("SKS tidak valid untuk mata kuliah: " + nama);
        }
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
    }
    void tampilkan(){
        System.out.println( kode + " - " + nama + "(" + sks + "SKS)");
    }
     static boolean isSKSValid(int sks){
        return sks == 2 || sks == 3;
    }
}
