/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal1;
public class manusia {
    String name;
    int umur;
    String alamat;
    
    manusia(String name, int umur, String alamat){
        this.name = name;
        this.umur = umur;
        this.alamat = alamat;
    }
    void berlari(){
        System.out.println( " nama : " + name + " ( umur : " + umur + " alamat : "+ alamat + ") Dia sedang berlari di lapangan");
    }
    void berjalan(){
        System.out.println(" nama : " + name +" ( umur : " + umur + " alamat : " + alamat + ") Dia sedang berjalan di jalan");
    }
}
