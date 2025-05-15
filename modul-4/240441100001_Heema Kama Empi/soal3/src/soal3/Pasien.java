/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal3;

/**
 *
 * @author wingd
 */
public class Pasien {
    private String nama;
    private int umur;
    private String keluhan;
    
    public Pasien(String nama, int umur, String keluhan) {
        this.nama = nama;
        this.umur = umur;
        this.keluhan = keluhan;
    }
    
    // Method getter untuk mengakses atribut privat
    public String getNama() {
        return nama;
    }
    
    public int getUmur() {
        return umur;
    }
    
    public String getKeluhan() {
        return keluhan;
    }
    public void SetNama(String nama){
        this.nama = nama;
    }
    public void SetUmur(int umur){
        this.umur = umur;
    }
    public void SetKeluhan(String keluhan){
        this.keluhan = keluhan;
    }
    
}
