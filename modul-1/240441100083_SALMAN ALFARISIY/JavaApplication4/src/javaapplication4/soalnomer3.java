/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication4;

class Burung {
    String jenis;
    String warna;
    String suara;
    
    Burung(String jenis, String warna, String suara) {
        this.jenis = jenis;
        this.warna = warna;
        this.suara = suara;
        
    }
    public void tampilkanInfo() {
        
        System.out.println("jenis: " + jenis + " warna: " + warna +" suara: " + suara);
    }

    public void warna() {
        System.out.println("warna: " + warna);
    }
    public void suara() {
        System.out.println("suara: " + suara);
    }
}

class Kucing {
    String ras;
    String warna;
    String suara;
    
    Kucing(String ras, String warna, String suara) {
        this.ras = ras;
        this.warna = warna;
        this.suara = suara;
        
    }
    public void tampilkanInfo() {
        
        System.out.println("ras: " + ras + " warna: " + warna +" suara: " + suara);
    }

    public void warna() {
        System.out.println("Warna: " + warna);
    }
    public void suara() {
        System.out.println("suara: " + suara);
    }
}

class Ular {
    String jenis;
    String genus;
    String bisa;
    
    Ular(String jenis, String genus, String bisa) {
        this.jenis = jenis;
        this.genus = genus;
        this.bisa = bisa;
        
    }
    public void tampilkanInfo() {
        
        System.out.println("jenis: " + jenis + " genus: " + genus +" bisa: " + bisa);
    }
    public void genus() {
        System.out.println("Warna: " + genus);
    }
    public void berbisa() {
        System.out.println("bisa: " + bisa);
    }
}

public class soalnomer3 {
    public static void main(String[] args) {
        Burung[] burungArray = new Burung[3];
        Kucing[] KucingArray = new Kucing[3];
        Ular[] UlarArray = new Ular[3];

        String[] jenisBurung = {"jalak", "murai", "Parkit"};
        String[] warnaBurung = {"Putih", "Hitam", "Biru"};
        String[] suaraBurung = {"citcit", "suit", "cret"};
        
        String[] rasKucing = {"munchkin", "bsh", "kampung"};
        String[] warnaKucing = {"abu-abu", "oren", "calico"};
        String[] suaraKucing = {"rorrr", "meoww", "ngeoong"};
        
        String[] jenisUlar = {"kobra jawa", "black mamba", "viper hijau"};
        String[] genusUlar = {" Naja sputatrix ", "Dendroaspis polylepis", "Trimeresurus albolabris"};
        String[] bisaUlar = {"middle venom", "hight venom", "middle venom"};
        

        for (int i = 0; i < burungArray.length; i++) {
            burungArray[i] = new Burung(jenisBurung[i], warnaBurung[i], suaraBurung[i]);
        }
        for (int i = 0; i < KucingArray.length; i++) {
            KucingArray[i] = new Kucing(rasKucing[i], warnaKucing[i], suaraKucing[i]);
        }
         for (int i = 0; i < UlarArray.length; i++) {
            UlarArray[i] = new Ular(jenisUlar[i], genusUlar[i], bisaUlar[i]);
        }

        for (Burung burung : burungArray) {
            burung.tampilkanInfo();
        }
        for (Kucing Kucing : KucingArray) {
            Kucing.tampilkanInfo();
        }
        for (Ular Ular : UlarArray) {
            Ular.tampilkanInfo();
        }
    }  
}

