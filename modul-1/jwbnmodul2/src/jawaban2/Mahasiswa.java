/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jawaban2;

import java.util.Scanner;

class Mahasiswa {
    String nama, nim, jurusan, alamat;

    public Mahasiswa(String nama, String nim, String jurusan, String alamat) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.alamat = alamat;
    }

    public void tampilkanData() {
        System.out.println("Nama: " + nama + ", NIM: " + nim + ", Jurusan: " + jurusan + ", Alamat: " + alamat);
    }
}




