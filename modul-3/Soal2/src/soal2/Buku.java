/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal2;

/**
 *
 * @author wingd
 */
public class Buku {
    protected String judul;
    protected String penulis;
    
    Buku(String judul, String penulis){
        this.judul = judul;
        this.penulis = penulis;
    }
    
    public void info(){
        System.out.println("\nJudul : " + judul);
        System.out.println("Penulis : " + penulis);
    }
}
