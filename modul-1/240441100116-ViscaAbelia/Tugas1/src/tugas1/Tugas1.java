package tugas1;
class manusia {
    String nama;
    int umur;
    String alamat;
     
    void berjalan(){
        System.out.println(nama + " umur " + umur + " th " + " yang berasal dari " + alamat + " sedang berjalan");
    }
    void berlari(){
        System.out.println(nama + " umur " + umur + " th " + " yang berasal dari " + alamat + " sedang berlari");
    }
}
public class Tugas1 {
    public static void main(String[] args) {
        manusia mns1 = new manusia();
        manusia mns2 = new manusia();
        manusia mns3 = new manusia();
        manusia mns4 = new manusia();
        manusia mns5 = new manusia();
        
        mns1.nama = "Visca";
        mns1.umur = 18;
        mns1.alamat = "Bangkalan";
        
        mns2.nama = "Rosa";
        mns2.umur = 17;
        mns2.alamat = "Bangkalan";
        
        mns3.nama = "Nini";
        mns3.umur = 19;
        mns3.alamat = "Bangkalan";
        
        mns4.nama = "Eni";
        mns4.umur = 18;
        mns4.alamat = "Bangkalan";
        
        mns5.nama = "April";
        mns5.umur = 17;
        mns5.alamat = "Bangkalan";
        
        mns1.berjalan();
        mns2.berlari();
        mns3.berjalan();
        mns4.berlari();
        mns5.berjalan();
    }
    
}
