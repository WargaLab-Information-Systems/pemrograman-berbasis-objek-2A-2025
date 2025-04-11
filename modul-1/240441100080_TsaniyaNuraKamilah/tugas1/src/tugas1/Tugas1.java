
package tugas1;
class manusia {
    String nama;
    int umur;
    String alamat;
    
    void berjalan(){
        System.out.println(nama +" umur " +umur +" berasal dari "+ alamat+" sedang berjalan ");
    }
    void berlari(){
        System.out.println(nama +" umur " +umur +" berasal dari "+ alamat+" sedang berlari ");
    }
}
public class Tugas1 {

    public static void main(String[] args) {
        manusia mnsa1 = new manusia();
        mnsa1.nama ="nia";
        mnsa1.umur =17;
        mnsa1.alamat = "banyuangi";
        
        manusia mnsa2 = new manusia();
        mnsa2.nama ="tisa";
        mnsa2.umur =20;
        mnsa2.alamat ="sumenep";
        
        manusia mnsa3 = new manusia();
        mnsa3.nama ="ica";
        mnsa3.umur = 18;
        mnsa3.alamat ="maluku";
        
        manusia mnsa4 = new manusia();
        mnsa4.nama ="bima";
        mnsa4.umur =19;
        mnsa4.alamat ="pamekasan";
        
        manusia mnsa5 = new manusia();
        mnsa5.nama ="arief";
        mnsa5.umur =20;
        mnsa5.alamat ="aceh";
        
        manusia mnsa6 = new manusia ();
        mnsa6.nama ="diva";
        mnsa6.umur =29;
        mnsa6.alamat ="bangkalan";
        mnsa1.berlari();
        mnsa3.berjalan();
        mnsa6.berjalan();
        mnsa6.berlari();
    }
}
