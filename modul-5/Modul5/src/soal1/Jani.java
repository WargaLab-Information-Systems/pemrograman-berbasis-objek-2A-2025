package soal1;

public class Jani extends Manusia {
    public Jani(String hobi, String pekerjaan, String makanan) {
        super(hobi, pekerjaan, makanan);
    }

    @Override
    public void berbicara() {
        System.out.println("Jani berkata: Saya suka " + getHobi() + ".");
    }

    @Override
    public void bekerja() {
        System.out.println("Jani bekerja sebagai " + getPekerjaan() + ".");
    }

    @Override
    public void makan() {
        System.out.println("Jani suka makan " + getMakanan() + ".");
    }
}
