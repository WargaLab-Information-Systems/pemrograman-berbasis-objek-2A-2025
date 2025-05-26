/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal1;

/**
 *
 * @author wingd
 */
public class Joko extends Manusia{
    @Override
    protected void berbicara(){
        System.out.println("'halo nama saya Joko'");
    }
    @Override
    protected void berkerja(){
        System.out.println("Joko bekerja di Paragon");
    }
    @Override
    protected void makan(){
        System.out.println("Joko sedang makan bakso");
    }
    public void tampilkanSemua(){
        berbicara();
        berkerja();
        makan();
    }
}
