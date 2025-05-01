/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal1;

/**
 *
 * @author wingd
 */
public class mahasiswa {
   protected String name;
   protected String NIM;
    
    mahasiswa (String name, String NIM){
        this.name = name;
        this.NIM = NIM;
    }
    void infoMahasiswa(){
        System.out.println("\nNama : " + name);
        System.out.println("NIM : " + NIM);
    }
}
