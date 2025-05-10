/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Miftakhul Arinda
 */
public class Mahasiswa {
    String nama;
    String nim;
    
    //constructor
    Mahasiswa(String InputNama, String InputNim){
        this.nama = InputNama; // inisialisasi 
        this.nim = InputNim; // inisialisasi 
        //System.out.println("INI CONSTRUCTOR");
    }
    
    void tampilkanInfo (){
        System.out.println("Nama ="+nama);
        System.out.println("NIM ="+nim);
        
    }
}
