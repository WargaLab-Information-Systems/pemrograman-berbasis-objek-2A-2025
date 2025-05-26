/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal2;

/**
 *
 * @author wingd
 */
public class MobilSedan extends Mobil {
    protected void nyalakan_mesin(){
    System.out.println("Mobil sedan dinyalakan pelan-pelan habis di service");
    }
    @Override
    protected void matikan_mesin(){
        System.out.println("Mobil sedan dimatikan");
    }
    public void info(){
        nyalakan_mesin();
        matikan_mesin();
    }
}
