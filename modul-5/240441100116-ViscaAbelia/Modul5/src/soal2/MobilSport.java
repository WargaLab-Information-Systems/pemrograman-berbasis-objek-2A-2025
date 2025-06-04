package soal2;

public class MobilSport extends Mobil{
    @Override
    public void nyalakan_mesin(){
        System.out.println("Mobil Sport diyalakan dengan suara menggelegar!");
    }
    @Override
    public void matikan_mesin(){
        System.out.println("Mobil Sport dimatikan dengan halus!");
    }
}