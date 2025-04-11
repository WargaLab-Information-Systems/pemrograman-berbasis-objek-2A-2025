package manusia;

class Human{
    String nama;
    int umur;
    String alamat;
   
    Human(String nama, int umur, String alamat){
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
    }
    
    void berjalan(){
        System.out.println(" hai aku " + nama + " umur " + umur + " asal " + alamat +  " aku sedang berjalan. ");
    }
    
    void berlari(){
        System.out.println(" hai aku " + nama + " umur " + umur + " asal " + alamat  + " aku sedang berlari. ");
    }
    
}

public class Manusia {

    public static void main(String[] args) {
       
   
       Human human1 = new Human("Gisel", 18, "Medan");
       Human human2 = new Human("ancika", 17, "Bogor");
       Human human3 = new Human("Melia", 19, "Bandung");
       Human human4 = new Human("Moana", 16, "Jakarta");
       Human human5 = new Human("sirly", 20, "Surabaya");
       
       human1.berlari();
       human2.berjalan();
       human3.berjalan();
       human4.berjalan();
       human5.berlari();
       
    }
    
}
