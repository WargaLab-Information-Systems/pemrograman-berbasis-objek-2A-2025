
package nomer1;

abstract class Manusia {
    abstract void berbicara();
    abstract void bekerja();
    abstract void makan();
}
class Joko extends Manusia {
    @Override
    void berbicara() {
        System.out.println("Joko berkata: guys, ayoo main volly gabut banget nih dikost!");
    }
    @Override
    void bekerja() {
        System.out.println("Joko bekerja sebagai aktor dan model");
    }
    @Override
    void makan() {
        System.out.println("Joko sedang makan nasi padang");
    }
}
class Beni extends Manusia {
    @Override
    void berbicara() {
        System.out.println("Beni berkata: cape banget hari ini");
    }
    @Override
    void bekerja() {
        System.out.println("Beni bekerja sebagai kpop dan model");
    }
    @Override
    void makan() {
        System.out.println("Beni makan salad sehat.");
    }
}
class Fani extends Manusia {
    @Override
    void berbicara() {
        System.out.println("Fani berkata: Selamat pagi!");
    }
    @Override
    void bekerja() {
        System.out.println("Fani bekerja sebagai desainer grafis.");
    }
    @Override
    void makan() {
        System.out.println("Fani makan buah durian.");
    }
}
class Jani extends Manusia {
    @Override
    void berbicara() {
        System.out.println("Jani berkata: Hai guys!");
    }
    @Override
    void bekerja() {
        System.out.println("Jani bekerja sebagai penyanyi.");
    }
    @Override
    void makan() {
        System.out.println("Jani makan burger.");
    }
}