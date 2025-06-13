package soal1;

public class Beni extends Manusia {
    public Beni(String hobi, String pekerjaan, String makanan) {
        super(hobi, pekerjaan, makanan);
    }

    @Override
    public void berbicara() {
        System.out.println("Beni berkata: Saya suka " + getHobi() + ".");
    }

    @Override
    public void bekerja() {
        System.out.println("Beni bekerja sebagai " + getPekerjaan() + ".");
    }

    @Override
    public void makan() {
        System.out.println("Beni suka makan " + getMakanan() + ".");
    }
}
