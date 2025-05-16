
package soalno2;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class buku {
    public String judul;
    public String penulis;
    
    
    public buku (String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;   
    }
    
    public void inputbuku(Scanner input) {
        System.out.print("masukkan judul buku : ");
        this.judul = input.nextLine();
        System.out.print("masukkan penulis buku : ");
        this.penulis = input.nextLine();
    }
    
    public void bukuInfo() {
        System.out.println("judul: " + judul);
        System.out.println("penulis: " + penulis);
    }
}

class bukufiksi extends buku {
    public String genre;
    
    public bukufiksi(String judul, String penulis, String genre) {
        super(judul, penulis);
        this.genre = genre;
    }
    public void inputfiksi(Scanner input) {
        super.inputbuku(input);  
        System.out.print("masukkan genre buku fiksi: ");
        this.genre = input.nextLine();
        
    }
    public void tampilReguler() {
        super.bukuInfo();
        System.out.println("genre: " +genre );
    }
    
}


class nonfiksi extends buku {
    public String topik;
    
    public nonfiksi(String judul, String penulis, String topik) {
        super(judul, penulis);
        this.topik = topik;
    }
    public void inputnonfiksi(Scanner input) {
        super.inputbuku(input);
        System.out.print("masukkan topik buku nonfiksi: ");
        this.topik = input.nextLine();
    }
    public void tampilnonfiksi() {
        super.bukuInfo();
        System.out.println("buku nonfiksi: " + topik);
    }
}


class perpustakaan {
    public List<bukufiksi> daftarfiksi = new ArrayList<>();
    public List<nonfiksi> daftarnonfiksi = new ArrayList<>();
    
    public void inputfiksi(Scanner input) {
        bukufiksi fiksi = new bukufiksi("", "", "");
        fiksi.inputfiksi(input);
        this.daftarfiksi.add(fiksi);
    }
    
    public void inputnonfiksi(Scanner input) {
        nonfiksi non = new nonfiksi("", "", "");
        non.inputnonfiksi(input);
        this.daftarnonfiksi.add(non);
    }
    public void tampilkankoleksi() {
        System.out.println("\n-- buku fiksi --");
        for (bukufiksi buku : daftarfiksi) {
            buku.tampilReguler();
            System.out.println("");
        }
        
        System.out.println("\n-- buku nonfiksi --");
        for (nonfiksi buku1 : daftarnonfiksi) {
            buku1.tampilnonfiksi();
            System.out.println("");
            
        }
                
    }
}
public class Main {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            perpustakaan perpus= new perpustakaan();
            perpus.inputfiksi(input);
            
            perpus.inputnonfiksi(input);
            perpus.tampilkankoleksi();
        }
    }
}

 