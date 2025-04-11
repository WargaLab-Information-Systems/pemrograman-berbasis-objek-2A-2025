package soalnomor3;

class Serigala {
    String nama;
    String warna;
    int umur;

    // constructor
    Serigala(String nama, String warna, int umur){
        this.nama = nama;
        this.warna = warna;
        this.umur = umur;
    }

    // method
    void suara(){
        System.out.println(nama + " mengaung: auuu auuuu!");
    }

    void panggil(){
        System.out.println("Serigala bernama " + nama + ", warna " + warna + ", umur " + umur + " tahun.");
    }
}

class Kucing {
    String nama;
    String jenis;
    int umur;

    // constructor
    Kucing(String nama, String jenis, int umur){
        this.nama = nama;
        this.jenis = jenis;
        this.umur = umur;
    }

    // method
    void kelucuan(){
        System.out.println(nama + " kucing yang berumur " + umur + " tahun, merupakan jenis kucing " + jenis + " terkenal dengan kelucuannya.");
    }

    void makan(){
        System.out.println("Kucing berjenis " + jenis + " sangat lucu. Umur " + umur + " tahun.");
    }
}

class Kuda {
    String nama;
    String jenis;
    int umur;

    // constructor
    Kuda(String nama, String jenis, int umur){
        this.nama = nama;
        this.jenis = jenis;
        this.umur = umur;
    }

    // method
    void berlari(){
        System.out.println("Kuda bernama " + nama + " berumur " + umur + " tahun, berjenis " + jenis + ", dan berlari dengan kencang di lahan yang luas.");
    }

    void suara(){
        System.out.println("Hiaa Huaa Huaa Huaaa!");
    }
}

public class soalnomor3 {
    public static void main(String[] args){
        String[] namaSerigala = {"Asep", "Juna", "Jono"};
        String[] namaKucing = {"Bubu", "Oto", "Mimi"};
        String[] namaKuda = {"Parlan", "Rogy", "Raul"};

        System.out.println("<<<<< Daftar Serigalaku >>>>>");
        for (int i = 0; i < 3; i++){
            Serigala kc = new Serigala(namaSerigala[i], (i % 2 == 0) ? "Putih" : "Oren", 2 + i);
            kc.panggil();
            kc.suara();
            System.out.println();
        }

        System.out.println("<<<<< Daftar Kucingku >>>>>");
        for (int i = 0; i < 3; i++){
            Kucing kl = new Kucing(namaKucing[i], (i % 2 == 0) ? "Anggora" : "Persia", 1 + i);
            kl.makan();
            kl.kelucuan();
            System.out.println();
        }

        System.out.println("<<<<< Daftar Kudaku >>>>>");
        for (int i = 0; i < 3; i++){
            Kuda kd = new Kuda(namaKuda[i], (i % 2 == 0) ? "Kuda Hiak-Hiak" : "Kuda Karung", 1 + i);
            kd.berlari();
            kd.suara();
            System.out.println();
        }
    }
}
