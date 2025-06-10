
package nomer1;

public class main {
    
    public static void main(String[] args) {
        Joko joko = new Joko();
        Beni beni = new Beni();
        Fani fani = new Fani();
        Jani jani = new Jani();

        joko.berbicara();
        joko.bekerja();
        joko.makan();
        System.out.println();

        beni.berbicara();
        beni.bekerja();
        beni.makan();
        System.out.println();

        fani.berbicara();
        fani.bekerja();
        fani.makan();
        System.out.println();

        jani.berbicara();
        jani.bekerja();
        jani.makan();
    }
}