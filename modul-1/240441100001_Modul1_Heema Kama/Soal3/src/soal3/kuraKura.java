/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal3;

public class kuraKura {
    String name;
    String Jenis;
    
    kuraKura (String name, String Jenis){
        this.name = name;
        this.Jenis = Jenis;
    }
    
    void berendam(){
        System.out.println(name + "(kura-kura, " + Jenis + ") sedang berendam di kolam ikan karena panas ");
    }
}
