/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jawaban1;

/**
 *
 * @author istikhomah
 */
public class Main {
     public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa("Jaehyun", "23486756", "Hubungan Internasional");
        m1.ambilMatkul("Kewarganegaraan", "Pancasila", "Luar Negeri", "gatau apalagi");

        Mahasiswa m2 = new Mahasiswa("Jennie", "9046765756", "Sistem Informasi");
        m2.ambilMatkul("Basis Data", "EBC", "PBW", "Agama");

        Mahasiswa m3 = new Mahasiswa("Echan", "2465746574", "Teknik Industri");
        m3.ambilMatkul("Algoritma", "Statistika", "K3", "Pengantar Industri");
        
        Mahasiswa m4 = new Mahasiswa("Carmen", "230441100001", "Akuntansi");
        m4.ambilMatkul("Pengantar Akuntansi", "Mentalitas", "Pancasila", "teknologi");
        
        Mahasiswa m5 = new Mahasiswa("Bambang", "2367567576", "Ekonomi Syariah");
        m5.ambilMatkul("PAI", "Hadist", "Akuntansi Syariah", "Statistika");
        
        Mahasiswa m6 = new Mahasiswa("Sikin", "2404411000457", "PGPAUD");
        m6.ambilMatkul("Bermain", "Statistika", "Gizi", "Kewarganegaraan");

        m1.tampil(1);
        m2.tampil(2);
        m3.tampil(3);
        m4.tampil(4);
        m5.tampil(5);
        m6.tampil(6);
    }
}

