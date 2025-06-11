package modul5;

// Abstract class AlatMusik
abstract class AlatMusik {
    abstract void mainkan();
    abstract void suara();
}

// Subclass Gitar
class Gitar extends AlatMusik {
    void mainkan() {
        System.out.println("Gitar dimainkan dengan cara dipetik.");
    }

    void suara() {
        System.out.println("Gitar menghasilkan suara merdu dan melodi.");
    }
}

// Subclass Drum
class Drum extends AlatMusik {
    void mainkan() {
        System.out.println("Drum dimainkan dengan cara dipukul.");
    }

    void suara() {
        System.out.println("Drum menghasilkan suara ritmis dan keras.");
    }
}

public class Soalno3 {
    public static void main(String[] args) {
        Gitar gitar = new Gitar();
        Drum drum = new Drum();

        // Pemanggilan method
        gitar.mainkan();
        gitar.suara();
        System.out.println();

        drum.mainkan();
        drum.suara();
    }
}

