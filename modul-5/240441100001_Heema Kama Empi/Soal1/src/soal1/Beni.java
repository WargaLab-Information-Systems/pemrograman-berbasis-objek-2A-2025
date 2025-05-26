/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal1;

/**
 *
 * @author wingd
 */
public class Beni extends Manusia{
    @Override
    protected void berbicara(){
        System.out.println("Beni: 'aduhai banyaknya beban hidup ini wak'");
    }
    @Override
    protected void bekerja(){
        System.out.println("Beni sedang mengajar di Sekolah Menengah Atas");
    }
    @Override
    protected void makan(){
        System.out.println("Beni lagi mau makan gado-gado dekat sekolah\n");
    }
    
    public void tampilkanSemua(){
        berbicara();
        bekerja();
        makan();
    }
}

