package tugas1;
class Manusia {
    String nama;
    int umur;
    String alamat;
    
    public Manusia(String nama, int umur, String alamat) {
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
    }
    
    public void tampilkanInfo() {
        System.out.println("\nNama:" + nama);
        System.out.println("Umur :" + umur);
        System.out.println("Alamat : " + alamat);
        
    }
    public void berjalan() {
        System.out.println(nama + " " + umur + " tahun " + alamat + " sedang berjalan.");
    }
    public void berlari() {
        System.out.println(nama + " " + umur + " tahun " + alamat + " sedang berlari.");
    }
}
public class Tugas1 {

    public static void main(String[] args) {
        Manusia orang1 = new Manusia("Andi", 24, "Jakarta");
        Manusia orang2 = new Manusia("Rahma", 20, "Bandung");
        Manusia orang3 = new Manusia("Mohan", 18, "Ambon");
        Manusia orang4 = new Manusia("Adi", 28, "Yogyakarta");
        Manusia orang5 = new Manusia("Eka", 35, "Surabaya");
        
        orang1.berjalan();
        orang2.berlari();
        orang3.berjalan();
        orang4.berlari();
        orang5.berjalan();

    }
       
}
