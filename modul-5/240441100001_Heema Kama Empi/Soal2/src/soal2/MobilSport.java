/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal2;

/**
 *
 * @author wingd
 */
public class MobilSport extends Mobil {
    @Override
    protected void nyalakan_mesin(){
        System.out.println("Mobil sport dinyalakan suaranya nyaring wowww");
    }
    @Override
    protected void matikan_mesin(){
        System.out.println("Mobil sport dimatikan dulu bang");
    }
    public void info(){
        nyalakan_mesin();
        matikan_mesin();
    }
}
