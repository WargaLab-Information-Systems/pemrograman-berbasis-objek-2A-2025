/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nomorsatu;

/**
 *
 * @author Miftakhul Arinda
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("DAFTAR MAHASISWA REGULER:");
        System.out.println("====================");
        
        MahasiswaReguler mhs1 = new MahasiswaReguler("Dian Nur", "21001", "Kelas A");
        MahasiswaReguler mhs2 = new MahasiswaReguler("Arta Ramadhani", "21002", "Kelas B");
        MahasiswaReguler mhs3 = new MahasiswaReguler("Miftakhul Arinda", "21003", "Kelas C");

        mhs1.infoReguler();
        mhs2.infoReguler();
        mhs3.infoReguler();
    
        System.out.println("DAFTAR MAHASISWA BEASISWA:");
        System.out.println("====================");
        
        MahasiswaBeasiswa mhs4 = new MahasiswaBeasiswa("Fika Vidya", "21004", "Beasiswa Indonesia Maju");
        MahasiswaBeasiswa mhs5 = new MahasiswaBeasiswa("Amanda Salsa", "21005", "Beasiswa KIP");
        MahasiswaBeasiswa mhs6 = new MahasiswaBeasiswa("Nur Sopiah", "21006", "Beasiswa Djarum");
  
        mhs4.infoBeasiswa();
        mhs5.infoBeasiswa();
        mhs6.infoBeasiswa();
    }
}