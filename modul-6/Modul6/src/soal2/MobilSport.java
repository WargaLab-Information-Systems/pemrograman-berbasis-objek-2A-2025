package soal2;
public class MobilSport extends Mobil {
    public MobilSport(String merk) {
        super(merk);
    }
    
    @Override
    public void nyalakan_mesin() {
        System.out.println("Mobil sport merk " + getMerk() + " dinyalakan dengan suara menggelegar!");
    }
    @Override
    public void matikan_mesin() {
        System.out.println("Mobil sport merk " + getMerk() + " dimatikan dengan halus.");
    }
}
