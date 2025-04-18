/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul2;

/**
 *
 * @author KAFI AHMAD
 */
class Matakuliah {
    String kode; 
    String nama;
    int sks;

    Matakuliah(String kode, String nama, int sks) {
        this.kode = kode; 
        this.nama = nama; 
        this.sks = sks;
    }

    static boolean validasiSKS(int sks) {
        return sks == 2 || sks == 3;
    }
}
