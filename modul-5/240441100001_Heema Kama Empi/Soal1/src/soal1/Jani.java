/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal1;

/**
 *
 * @author wingd
 */
public class Jani extends Manusia {
    @Override
    protected void berbicara(){
        System.out.println("Jani: 'me and who yah'");
    }
    @Override
    protected void bekerja(){
        System.out.println("Jani menghitung laporan keuangan di kantor ia bekerja");
    }
    @Override
    protected void makan(){
        System.out.println("Jani makan steak di restoran terenak setelah ia bekerja\n");
    }
    
    public void tampilkanSemua(){
        berbicara();
        bekerja();
        makan();
    }
}
