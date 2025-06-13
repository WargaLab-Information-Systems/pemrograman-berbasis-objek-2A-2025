package soal1;
public class Joko extends Manusia {
    public Joko(String hobi, String pekerjaan, String makanan) {
        super(hobi, pekerjaan, makanan);
    }

    @Override
    public void berbicara() {
        System.out.println("Joko berkata: Saya suka " + getHobi() + ".");
    }

    @Override
    public void bekerja() {
        System.out.println("Joko bekerja sebagai " + getPekerjaan() + ".");
    }

    @Override
    public void makan() {
        System.out.println("Joko suka makan " + getMakanan() + ".");
    }
}

