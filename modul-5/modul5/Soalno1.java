
package modul5;
// Abstract class Manusia superclass
abstract class Manusia {
    abstract void berbicara();
    abstract void bekerja();
    abstract void makan();
}

// Subclass Joko
class Joko extends Manusia {
    @Override
    void berbicara() {
        System.out.println("Joko berkata: Halo, saya Joko.");
    }

    @Override
    void bekerja() {
        System.out.println("Joko bekerja sebagai petani.");
    }

    @Override
    void makan() {
        System.out.println("Joko makan dengan lahap.");
    }
}

// Subclass Beni
class Beni extends Manusia {
    @Override
    void berbicara() {
        System.out.println("Beni berkata: Hai, saya Beni.");
    }

    @Override
    void bekerja() {
        System.out.println("Beni bekerja sebagai programmer.");
    }

    @Override
    void makan() {
        System.out.println("Beni makan sambil menonton anime.");
    }
}

// Subclass Fani
class Fani extends Manusia {
    @Override
    void berbicara() {
        System.out.println("Fani berkata: Haii, aku Fani.");
    }

    @Override
    void bekerja() {
        System.out.println("Fani bekerja sebagai desainer grafis.");
    }

    @Override
    void makan() {
        System.out.println("Fani makan makanan sehat.");
    }
}

// Subclass Jani
class Jani extends Manusia {
    @Override
    void berbicara() {
        System.out.println("Jani berkata: Halo semua, saya Jani.");
    }

    @Override
    void bekerja() {
        System.out.println("Jani bekerja sebagai musisi.");
    }

    @Override
    void makan() {
        System.out.println("Jani makan sambil mendengarkan musik.");
    }
}

public class Soalno1 {
    public static void main(String[] args) {
        Joko joko = new Joko();
        Beni beni = new Beni();
        Fani fani = new Fani();
        Jani jani = new Jani();

        // Pemanggilan tanpa list atau perulangan
        joko.berbicara(); joko.bekerja(); joko.makan();
        System.out.println();

        beni.berbicara(); beni.bekerja(); beni.makan();
        System.out.println();

        fani.berbicara(); fani.bekerja(); fani.makan();
        System.out.println();

        jani.berbicara(); jani.bekerja(); jani.makan();
        System.out.println();
    }
}
