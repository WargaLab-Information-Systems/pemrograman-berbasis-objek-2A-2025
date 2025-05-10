package soalno3;

class Kucing {
    void suara() {
        System.out.println("Kucing: Miaw!");
    }
}

class Anjing {
    void suara() {
        System.out.println("Anjing: Guk Guk!");
    }
}

class Burung {
    void suara() {
        System.out.println("Burung: Cuit!");
    }
}

public class HewanMain {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Putaran ke-" + i);

            Kucing k = new Kucing();
            k.suara();

            Anjing a = new Anjing();
            a.suara();

            Burung b = new Burung();
            b.suara();

            System.out.println();
        }
    }
}