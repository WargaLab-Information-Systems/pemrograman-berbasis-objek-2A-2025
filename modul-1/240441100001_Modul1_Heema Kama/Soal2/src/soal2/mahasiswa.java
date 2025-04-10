/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal2;

public class mahasiswa {
    String name;
    String NIM;
    String Jurusan;
    String Alamat;
    
    mahasiswa (String name, String NIM, String Jurusan, String Alamat){
        this.name = name;
        this.NIM = NIM;
        this.Jurusan = Jurusan;
        this.Alamat = Alamat;
    }
    void MenampilkanInfo(){
        System.out.println(" ----- DATA MAHASISWA 2025 ----- ");
        System.out.println(" Nama    : " + name);
        System.out.println(" NIM     : " + NIM);
        System.out.println(" Jurusan : " + Jurusan);
        System.out.println(" Alamat  : " + Alamat);
    }
    
}
