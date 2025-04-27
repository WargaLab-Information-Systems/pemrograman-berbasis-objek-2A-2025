package javaapplication6;

class hewan {
    String nama;
    int umur;


    public hewan(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }


    public void info() {
        System.out.println("Nama Hewan: " + nama);
        System.out.println("Umur Hewan: " + umur + " tahun");
    }
}
class kucing extends hewan {


    public kucing(String nama, int umur) {
        super(nama, umur); 
    }


    
    @Override
    public void info() {
        super.info();
        System.out.println("Miaww!,miaww!,miaww!");
    }
}


class ayam extends hewan {


    public ayam(String nama, int umur) {
        super(nama, umur); 
       
    }


    @Override
    public void info() {
        super.info();
        System.out.println("cukkurukuk!");
    }
}
class sapi extends hewan {


    public sapi(String nama, int umur) {
        super(nama, umur); 
       
    }


    @Override
    public void info() {
        super.info();
        System.out.println("mouuuuuu!");
    }
}


public class NewClass1 {
    public static void main(String[] args) {
        hewan[] hewanArray = new hewan[3];


        hewanArray[0] = new kucing("Kucing", 3);
        hewanArray[1] = new ayam("Ayam", 2);
        hewanArray[2] = new sapi("Sapi", 4);


        for (hewan hewan : hewanArray) {
            hewan.info();
            System.out.println(" ");
        }
    }}