package hewan;

class Hewan {
    String nama;
    int umur;

    Hewan(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    void makan() {
        System.out.println(nama + " sedang makan.");
    }

    void tidur() {
        System.out.println(nama + " sedang tidur.");
    }

    void suara() {
        System.out.println(nama + " bersuara.");
    }

    void tampilkanInfo() {
        System.out.println("Nama Hewan: " + nama);
        System.out.println("Umur Hewan: " + umur + " tahun");
    }
}

class Kucing extends Hewan {
    Kucing(String nama, int umur) {
        super(nama, umur);
    }

    @Override
    void suara() {
        System.out.println(nama + " meong.");
    }
    
    @Override
    void tidur(){
        System.out.println("Coba");
    }
}

class Anjing extends Hewan {
    Anjing(String nama, int umur) {
        super(nama, umur);
    }

    @Override
    void suara() {
        System.out.println(nama + " menggonggong.");
    }
}

class Burung extends Hewan {
    Burung(String nama, int umur) {
        super(nama, umur);
    }

    @Override
    void suara() {
        System.out.println(nama + " berkicau.");
    }
}

public class Main {
    public static void main(String[] args) {
        Hewan[] hewan = {
            new Kucing("Sumbul", 2),
            new Anjing("Gugug", 3),
            new Burung("Parrot", 1)
        };

        for (Hewan h : hewan) {
            h.tampilkanInfo();
            h.suara();
            h.makan();
            h.tidur();
            System.out.println();
        }
        
        Kucing kucing = new Kucing("nama",12);
        kucing.tidur();
    }
}
