package soalno1;


// kelas
class Manusia {
    String nama;
    int umur;
    String alamat;
    
    // konstruktor
    Manusia(String nama, int umur, String alamat) {
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
    }
    
    // method
    void berjalan() {
        System.out.println(nama + " sedang berjalan.");
    }
    
    // method
    void berlari() {
        System.out.println(nama + " sedang berlari.");
    }
    
    // method menampilkan informasi
    void tampilManusia() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("Alamat: " + alamat);
    }
}

//kelas utama
public class ManusiaBang {
    public static void main(String[] args) {
      
        // objek manusia
        Manusia manusia1 = new Manusia("Samsudin", 25, "Bekasi");
        Manusia manusia2 = new Manusia("Yanto", 30, "Bogor");
        Manusia manusia3 = new Manusia("Budiono", 22, "Surabaya");
        Manusia manusia4 = new Manusia("Sisi", 18, "Medan");
        Manusia manusia5 = new Manusia("Nindi", 20, "Palembang");
        Manusia manusia6 = new Manusia("Jihar", 23,"Madura");
        
        // panggil bg
        manusia1.tampilManusia();
        manusia1.berjalan();
        manusia1.berlari();
        System.out.println();
        
        manusia2.tampilManusia();
        manusia2.berjalan();
        manusia2.berlari();
        System.out.println();
        
        manusia3.tampilManusia();
        manusia3.berjalan();
        manusia3.berlari();
        System.out.println();
        
        manusia4.tampilManusia();
        manusia4.berjalan();
        manusia4.berlari();
        System.out.println();
        
        manusia5.tampilManusia();
        manusia5.berjalan();
        manusia5.berlari();
        
        manusia6.tampilManusia();
        manusia6.berjalan();
        manusia6.berlari();
        
       
    }
}
