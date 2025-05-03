/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal1;

/**
 *
 * @author wingd
 */
public class mahasiswaBeasiswa extends mahasiswa{
    protected String jenisBeasiswa;
    
    mahasiswaBeasiswa(String name, String NIM, String kelas, String jenisBeasiswa){
    super(name, NIM);
    this.jenisBeasiswa = jenisBeasiswa;
    }
    
    void infoBeasiswa(){
        infoMahasiswa();
        System.out.println("Jenis Beasiswa : " + jenisBeasiswa);
    }
}
