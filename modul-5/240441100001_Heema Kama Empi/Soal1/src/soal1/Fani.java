/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal1;

/**
 *
 * @author wingd
 */
public class Fani extends Manusia {
    @Override
    protected void berbicara(){
        System.out.println("Fani: 'gimana cara cepat jadi kaya'");
    }
    @Override
    protected void bekerja(){
        System.out.println("Fani memeriksa berkas kantor untuk diberikan kepada atasan");
    }
    @Override
    protected void makan(){
        System.out.println("Fani makan seadanya karena tepar bekerja\n");
    }
    
    public void tampilkanSemua(){
        berbicara();
        bekerja();
        makan();
    }
}
