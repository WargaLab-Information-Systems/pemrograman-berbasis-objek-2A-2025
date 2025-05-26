/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal1;

/**
 *
 * @author wingd
 */
public class Joko extends Manusia {
    @Override
    protected void berbicara(){
        System.out.println("joko: 'hai apa kabar semuanyaaa'");
    }
    @Override
    protected void bekerja(){
        System.out.println("joko sedang bekerja sebagai UI/UX designer sungguh melelahkan");
    }
    @Override
    protected void makan(){
        System.out.println("joko lagi makan bakso enak juga\n");
    }
    
    public void tampilkanSemua(){
        berbicara();
        bekerja();
        makan();
    }
}
