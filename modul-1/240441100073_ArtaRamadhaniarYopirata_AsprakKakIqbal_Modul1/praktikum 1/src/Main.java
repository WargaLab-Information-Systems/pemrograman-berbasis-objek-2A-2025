public class Main {
    public static void main(String[] args) {
        Manusia m1 = new Manusia("Arta", 18, "Surabaya");
        Manusia m2 = new Manusia("Bibiy", 17, "Tegal");
        Manusia m3 = new Manusia("Dashhara", 19, "Medan");
        Manusia m4 = new Manusia("Digo", 21, "Bekasi");
        Manusia m5 = new Manusia("Eka", 22, "Trengalek");

        m1.berjalan();
        m2.berlari();
        m3.berjalan();
        m4.berlari();
        m5.berjalan();
    }
}