/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Jwbn3;

/**
 *
 * @author istikhomah
 */
public class Pasien {
    private String nama;
    private int umur;
    private String keluhan;
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setUmur(int umur) {
        this.umur = umur;
    }
    public void setKeluhan(String keluhan) {
        this.keluhan = keluhan;
    }
    
    public String getNama(){
        return nama;
    }
    public int getUmur(){
        return umur;
    }
    public String getKeluhan(){
        return keluhan;
    }
}
