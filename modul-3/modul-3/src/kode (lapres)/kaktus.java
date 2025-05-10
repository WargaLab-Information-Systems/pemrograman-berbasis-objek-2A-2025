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
public class kaktus extends Tumbuhan {
    //menggunakan metode override menulis ulang method induk
    public void daun(){
        System.out.println("tidak memiliki daun");
    }
}
