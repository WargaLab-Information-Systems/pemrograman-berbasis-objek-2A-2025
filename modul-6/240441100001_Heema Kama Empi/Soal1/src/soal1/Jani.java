/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal1;

/**
 *
 * @author wingd
 */
public class Jani extends Manusia{
    @Override
    protected void berbicara(){
        System.out.println("'halo nama saya Jani'");
    }
    @Override
    protected void berkerja(){
        System.out.println("Jani bekerja di AlfaIndo");
    }
    @Override
    protected void makan(){
        System.out.println("Jani makan di pinggir jalan");
    }
    public void tampilkanSemua(){
        berbicara();
        berkerja();
        makan();
    }
}
