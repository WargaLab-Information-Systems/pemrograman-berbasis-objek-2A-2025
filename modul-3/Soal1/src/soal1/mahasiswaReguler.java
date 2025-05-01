/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal1;

/**
 *
 * @author wingd
 */
public class mahasiswaReguler extends mahasiswa {
    protected String kelas;
    
    mahasiswaReguler (String name, String NIM, String kelas){
        super(name, NIM);
        this.kelas = kelas;
    }
    void infoReguler(){
        infoMahasiswa();
        System.out.println("Kelas : " + kelas);
    }
}
