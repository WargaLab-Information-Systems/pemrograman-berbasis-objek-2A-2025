/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal1;

/**
 *
 * @author wingd
 */
public class Beni extends Manusia {
    @Override
    protected void berbicara(){
        System.out.println("'halo nama saya Beni");
    }
    @Override
    protected void berkerja(){
        System.out.println("Beni bekerja di pabrik kopi");
    }
    @Override
    protected void makan(){
        System.out.println("Beni makan di kantin pabrik");
    }
    public void tampilkanSemua(){
        berbicara();
        berkerja();
        makan();
    }
}
