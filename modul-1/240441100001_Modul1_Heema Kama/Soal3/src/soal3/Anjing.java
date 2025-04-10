/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal3;

public class Anjing {
    String name;
    String Jenis;
    String umur;
    
    Anjing (String name, String Jenis, String umur){
        this.name = name;
        this.Jenis = Jenis;
        this.umur = umur;
    }
    
    void bermain(){
        System.out.println(name + " (Anjing " + Jenis + ", " + umur + ") sedang bermain di taman bersama majikan ");
    } 
}
