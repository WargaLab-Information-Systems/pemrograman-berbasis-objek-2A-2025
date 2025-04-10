/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal3;

public class burung {
    String name;
    String Jenis;
    String habitat;
    
    burung(String name, String Jenis, String habitat){
        this.name = name;
        this.Jenis = Jenis;
        this.habitat = habitat;
    }
    
    void makan(){
        System.out.println(name + " (Burung " + Jenis + " di habitat " + habitat + ") sedang makan ");
    }
}
