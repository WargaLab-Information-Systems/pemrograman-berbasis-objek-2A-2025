/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul2;

/**
 *  
 * @author KAFI AHMAD
 */
class Kampus {
    String nama; 
    String alamat;
    static int jumlahMhs = 0;

    Kampus(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }

    void tampil() {
        System.out.println("Kampus: " + nama + ", Alamat: " + alamat);
    }

    void tambahMhs() { jumlahMhs++; }

    static boolean validasiNama(String nama) {
        return nama.chars().allMatch(Character::isLetter);
    }
}

