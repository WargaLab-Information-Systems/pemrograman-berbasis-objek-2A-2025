/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hewan_122;

class kucing {
    String nama;
    String warna;
    int umur;

    //constructure
    kucing (String nama, String warna, int umur){
        this.nama = nama;
        this.warna = warna;
        this.umur = umur;
    }

    //method
    void suara() {
        System.out.println(nama + " mengeong : Meong!");
    }

    void panggil() {
        System.out.println("Kucing ini bernama " + nama + ", warna " + warna + ", umur " + umur + " tahun.");
    }
}

class kelinci {
    String nama;
    String jenis;
    int umur;

    //constructure
    kelinci (String nama, String jenis, int umur){
        this.nama = nama;
        this.jenis = jenis;
        this.umur = umur;
    }

    //method
    void melompat() {
        System.out.println(nama + " kelinci yang berumur " + umur + " tahun," + " merupakan jenis kelinci " + jenis + " terkenal dengan cara melompatnya yang sangat lincah.");
    }

    void makan() {
        System.out.println(nama + " adalah Kelinci yang suka makan wortel.");
    }
}

class kuda {
    String nama;
    String jenis;
    int umur;

    //constructure
    kuda (String nama, String jenis, int umur){
        this.nama = nama;
        this.jenis = jenis;
        this.umur = umur;
    }

    //method
    void berlari() {
        System.out.println(nama + " ialah kuda berumur " + umur + " tahun," + " berjenis  " + jenis + " dan berlari dengan sangat kencang di padang rumput.");
    }

    void suara() {
        System.out.println(nama + " bersuara : Hiiihaaa!");
    }
}

public class Hewan_122 {

    public static void main(String[] args) {
        String[] namaKucing = {"Sisy", "Oyen", "Tom"};
        String[] namaKelinci = {"Cemot", "Worty", "Bubu"};
        String[] namaKuda = {"Larinyo", "Trotro", "Gagah"};
        
        System.out.println("===== Daftar Kucing ku =====");
        for (int i = 0; i < 3; i++){
            kucing kc = new kucing(namaKucing[i], (i % 2 == 0) ? "putih" : "oren", 2 + i);
            kc.panggil();
            kc.suara();
            System.out.println();
        }
        
        System.out.println("===== Daftar Kelinci ku =====");
        for (int i = 0; i < 3; i++){
            kelinci kL = new kelinci(namaKelinci[i], (i % 2 == 0) ? "anggora" : "lokal", 1 + i);
            kL.makan();
            kL.melompat();
            System.out.println();
        }
        
        System.out.println("===== Daftar Kuda ku =====");
        for (int i = 0; i < 3; i++){
            kuda kd = new kuda(namaKuda[i], (i % 2 == 0) ? "kuda balap" : "kuda poni", 1 + i);
            kd.berlari();
            kd.suara();
            System.out.println();
        }
        
    }
    
}
