package soal1;
// class
    class Manusia{
        String nama; 
        int umur; 
        String alamat; 
        
        // konstruktor
        public Manusia(String nama, int umur, String alamat){
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
        }
        
        // method tampilkan
        public void tampilkanManusia() {
        System.out.println("Nama   : " + nama);
        System.out.println("Umur   : " + umur + " tahun");
        System.out.println("Alamat : " + alamat);
        System.out.println("----------------------");
        }
        
        // metod berjalan
        public void berjalan(){
        System.out.println(nama + "Sedang Berjalan");
        }
        
        // metod berlari
        public void berlari(){
        System.out.println(nama + "Sedang Berlari");
        }
        
    }
public class Soal1 {
public static void main(String[] args) {
    // objek
    Manusia manusia1 = new Manusia("Budi", 19, "Surabaya");
    Manusia manusia2 = new Manusia("Bagas", 21, "Sidoarjo");
    Manusia manusia3 = new Manusia("Ren", 18, "Gresik");
    Manusia manusia4 = new Manusia("Agus", 23, "Malang");
    Manusia manusia5 = new Manusia("Davina", 19, "Bandung");
    Manusia manusia6 = new Manusia("Udin", 25, "Jogja");
    Manusia manusia7 = new Manusia("Azizul", 18, "Gresik");
    
    // menampilkan
    manusia1.tampilkanManusia();
    manusia2.tampilkanManusia();
    manusia3.tampilkanManusia();
    manusia4.tampilkanManusia();
    manusia5.tampilkanManusia();
    manusia6.tampilkanManusia();
    manusia7.tampilkanManusia();
    
    // berjalan dan berlari
    manusia1.berjalan();
    manusia3.berlari();
    }
    
}
