/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal2;

/**
 *
 * @author Miftakhul Arinda
 */
abstract class Mobil {
    abstract void nyalakanMesin();
    abstract void matikanMesin();
}

class MobilSport extends Mobil {
    @Override
    void nyalakanMesin() {
        System.out.println("Mobil sport dinyalakan dengan suara menggelegar!");
    }

    @Override
    void matikanMesin() {
        System.out.println("Mobil sport dimatikan dengan halus.");
    }
}

class MobilSedan extends Mobil {
    @Override
    void nyalakanMesin() {
        System.out.println("Mobil sedan dinyalakan secara halus.");
    }

    @Override
    void matikanMesin() {
        System.out.println("Mobil sedan dimatikan dengan aman.");
    }
}
