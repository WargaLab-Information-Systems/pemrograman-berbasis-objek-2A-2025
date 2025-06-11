package modul5;

// Abstract class Mobil
abstract class Mobil {
    abstract void nyalakan_mesin();
    abstract void matikan_mesin();
}

// Subclass MobilSport
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

// Subclass MobilSedan
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

public class Soalno2 {
    public static void main(String[] args) {
        MobilSport sport = new MobilSport();
        MobilSedan sedan = new MobilSedan();

        // Pemanggilan langsung tanpa list atau manajemen bersama
        sport.nyalakan_mesin();
        sport.matikan_mesin();
        System.out.println();

        sedan.nyalakan_mesin();
        sedan.matikan_mesin();
        System.out.println();
    }
}