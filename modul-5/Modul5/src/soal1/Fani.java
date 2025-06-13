package soal1;

public class Fani extends Manusia {
    public Fani(String hobi, String pekerjaan, String makanan) {
        super(hobi, pekerjaan, makanan);
    }

    @Override
    public void berbicara() {
        System.out.println("Fani berkata: Saya suka " + getHobi() + ".");
    }

    @Override
    public void bekerja() {
        System.out.println("Fani bekerja sebagai " + getPekerjaan() + ".");
    }

    @Override
    public void makan() {
        System.out.println("Fani suka makan " + getMakanan() + ".");
    }
}
