package soal2;

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