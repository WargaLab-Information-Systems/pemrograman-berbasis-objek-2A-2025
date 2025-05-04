package tugaspraktikum;
class manusia{
    String nama;
    String alamat;
    int umur;
    
    void berjalan(){
        System.out.println("Nama : " + nama);
        System.out.println("Umur : " + umur);
        System.out.println("Alamat : " + alamat);
        System.out.println("Dia " + nama + " sedang berjalan" );
    }
    
    void berlari(){
        System.out.println("Nama : " + nama);
        System.out.println("Umur : " + umur);
        System.out.println("Alamat : " + alamat);
        System.out.println("Dia " + nama + " sedang berlari");
    }
}

public class TugasPraktikum {
    public static void main(String[] args) {
        // TODO code application logic here
        manusia man1 = new manusia();
        manusia man2 = new manusia();
        manusia man3 = new manusia();
        manusia man4 = new manusia();
        manusia man5 = new manusia();
        
        man1.nama = "Jihar";
        man1.umur = 20;
        man1.alamat = "Gresik";
        
        man2.nama = "Vivi";
        man2.umur = 20;
        man2.alamat = "Jember";
        
        man3.nama = "Reva";
        man3.umur = 19;
        man3.alamat = "Jombang";
        
        man4.nama = "Dhani";
        man4.umur = 19;
        man4.alamat = "Lamongan";
        
        man5.nama = "Revan";
        man5.umur = 18;
        man5.alamat = "Kediri";
        
        man1.berjalan();
        man2.berlari();
        man3.berjalan();
        man4.berlari();
        man5.berjalan();
    }
    
}
