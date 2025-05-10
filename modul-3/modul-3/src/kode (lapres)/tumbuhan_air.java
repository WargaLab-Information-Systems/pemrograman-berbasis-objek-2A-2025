/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kodemodul;

/**
 *
 * @author Miftakhul Arinda
 */
//membuat class yang terhubung dengan class tumbuhan sebagai superclassnya
public class tumbuhan_air extends Tumbuhan {
    //menggunakan metode override menulis ulang method induk
    public void tempat_hidup(){
        System.out.println("hidup di air");
    }
    //menggunakan metode override menulis ulang method induk
    public void jenis_buah(){
        System.out.println("tidak memiliki buah");
    }
}

