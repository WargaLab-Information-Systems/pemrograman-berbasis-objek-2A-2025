package soal3;
class Babi {
    String nama;
    int umur;
    String warna;

    public Babi(String nama, int umur, String warna) {
        this.nama = nama;
        this.umur = umur;
        this.warna = warna;
    }

    void bersuara() {
        System.out.println(nama + " Bersuara: Ngok Ngok!");
    }
}

class Anjing {
    String nama;
    int umur;
    String ras;

    public Anjing(String nama, int umur, String ras) {
        this.nama = nama;
        this.umur = umur;
        this.ras = ras;
    }

    void bersuara() {
        System.out.println(nama + " menggonggong: Guk Guk!");
    }
}

class Burung {
    String nama;
    int umur;
    String jenis;

    public Burung(String nama, int umur, String jenis) {
        this.nama = nama;
        this.umur = umur;
        this.jenis = jenis;
    }

    void bersuara() {
        System.out.println(nama + " berkicau: Cit Cit!");
    }
}

public class Main {
    public static void main(String[] args) {
        // Array untuk menyimpan objek
        Babi[] babiArray = new Babi[3];
        Anjing[] anjingArray = new Anjing[3];
        Burung[] burungArray = new Burung[3];

        // Mengisi array menggunakan looping
        for (int i = 0; i < 3; i++) {
            babiArray[i] = new Babi("Babi" + (i + 1), i + 1, "Putih");
            anjingArray[i] = new Anjing("Anjing" + (i + 1), i + 2, "Bulldog");
            burungArray[i] = new Burung("Burung" + (i + 1), i + 1, "Kenari");
        }

        // Memanggil method bersuara untuk setiap objek
        for (int i = 0; i < 3; i++) {
            babiArray[i].bersuara();
            anjingArray[i].bersuara();
            burungArray[i].bersuara();
        }
    }
}

