package soal2;

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
