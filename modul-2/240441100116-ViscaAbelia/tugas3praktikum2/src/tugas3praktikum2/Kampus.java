package tugas3praktikum2;

public class Kampus {
    String nama;
    String alamat;
    int totalmhs;
    
    Kampus(String nama, String alamat, int totalmhs){
        if (validasiNama(nama)){
            this.nama = nama;
            this.alamat = alamat;
            this.totalmhs = totalmhs;            
        }
    }

   public static boolean  validasiNama(String nama){
       return !nama.matches(".*\\d.*");
   }
   
   void tampilkandata(){
       System.out.println("Nama Kampus : " + nama);
       System.out.println("Alamat Kampus : " + alamat);
       System.out.println("Total Mahasiswa : " + totalmhs);
       System.out.println("Validasi Kampus : " + Kampus.validasiNama(nama));
   }
}
