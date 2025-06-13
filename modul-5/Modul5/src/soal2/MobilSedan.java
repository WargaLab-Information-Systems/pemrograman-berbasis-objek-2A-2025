package soal2;
public class MobilSedan extends Mobil {
    public MobilSedan(String merk) {
        super(merk);
    }
    @Override
    public void nyalakan_mesin() {
        System.out.println("Mobil sedan Merk " + getMerk()+" dinyalakan secara halus.");
    }
    @Override
    public void matikan_mesin() {
        System.out.println("Mobil sedan Merk " + getMerk()+" dimatikan dengan aman.");
    }
}
