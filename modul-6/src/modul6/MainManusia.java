package modul6;
public class MainManusia {
    public static void main(String[] args) {
        Manusia[] orang = { new Joko(), new Beni(), new Fani(), new Jani() };

        for (Manusia m : orang) {
            m.berbicara();
            m.bekerja();
            m.makan();
            System.out.println();
        }
    }
}


