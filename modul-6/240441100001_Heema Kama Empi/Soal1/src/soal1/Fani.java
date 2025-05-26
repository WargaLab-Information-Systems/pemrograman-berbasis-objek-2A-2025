/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal1;

/**
 *
 * @author wingd
 */
public class Fani extends Manusia{
    @Override
    protected void berbicara(){
        System.out.println("'halo nama saya Fani'");
    }
    @Override
    protected void berkerja(){
        System.out.println("Fani bekerja di toko kosmetik");
    }
    @Override
    protected void makan(){
        System.out.println("Fani makan bubur di rumah");
    }
    public void tampilkanSemua(){
        berbicara();
        berkerja();
        makan();
    }
}
