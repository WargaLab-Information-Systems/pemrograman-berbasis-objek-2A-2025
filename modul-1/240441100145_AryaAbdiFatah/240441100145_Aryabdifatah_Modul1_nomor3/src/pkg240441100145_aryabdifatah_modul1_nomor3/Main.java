
package pkg240441100145_aryabdifatah_modul1_nomor3;

class Kucing {
    String nama;
    int umur;


    Kucing(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }


    void suara() {
        System.out.println(nama + " meong.");
    }


    void makan() {
        System.out.println(nama + " sedang makan.");
    }


    void tidur() {
        System.out.println(nama + " sedang tidur.");
    }
}
class Anjing {
    String nama;
    int umur;


    Anjing(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }


    void suara() {
        System.out.println(nama + " menggonggong.");
    }


    void makan() {
        System.out.println(nama + " sedang makan.");
    }


    void tidur() {
        System.out.println(nama + " sedang tidur.");
    }
}
class Burung {
    String nama;
    int umur;


    Burung(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }


    void suara() {
        System.out.println(nama + " berkicau.");
    }

    void makan() {
        System.out.println(nama + " sedang makan.");
    }


    void tidur() {
        System.out.println(nama + " sedang tidur.");
    }
}
public class Main {
    public static void main(String[] args) {

        Kucing[] kucing = new Kucing[1];
        Anjing[] anjing = new Anjing[1];
        Burung[] burung = new Burung[1];


        kucing[0] = new Kucing("Sumbul", 2);
        anjing[0] = new Anjing("Gugug", 3);
        burung[0] = new Burung("Parrot", 1);


        for (Kucing k : kucing) {
            System.out.println("Nama Hewan: " + k.nama);
            System.out.println("Umur Hewan: " + k.umur + " tahun");
            k.suara();
            k.makan();
            k.tidur();

        }


        for (Anjing a : anjing) {
            System.out.println("Nama Hewan: " + a.nama);
            System.out.println("Umur Hewan: " + a.umur + " tahun");
            a.suara();
            a.makan();
            a.tidur();

        }


        for (Burung b : burung) {
            System.out.println("Nama Hewan: " + b.nama);
            System.out.println("Umur Hewan: " + b.umur + " tahun");
            b.suara();
            b.makan();
            b.tidur();

        }
    }
}

