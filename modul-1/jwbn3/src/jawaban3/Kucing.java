/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jawaban3;

// Class Kucing
class Kucing {
    String nama;
    String warna;
    
    Kucing(String nama, String warna) {
        this.nama = nama;
        this.warna = warna;
    }

    void bersuara() {
        System.out.println(nama + " (kucing) berwarna " + warna + " mengeong: miao miao !");
    }
}

