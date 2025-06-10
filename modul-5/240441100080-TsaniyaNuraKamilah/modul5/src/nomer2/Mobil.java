
package nomer2;

abstract class Mobil {
    abstract void nyalakan_mesin();
    abstract void matikan_mesin();
}

class MobilSport extends Mobil {
    @Override
    void nyalakan_mesin() {
        System.out.println("Mobil sport dinyalakan dengan suara menggelegar!");
    }
    @Override
    void matikan_mesin() {
        System.out.println("Mobil sport dimatikan dengan halus.");
    }
}

class MobilSedan extends Mobil {
    @Override
    void nyalakan_mesin() {
        System.out.println("Mobil sedan dinyalakan secara halus.");
    }

    @Override
    void matikan_mesin() {
        System.out.println("Mobil sedan dimatikan dengan aman.");
    }
}


